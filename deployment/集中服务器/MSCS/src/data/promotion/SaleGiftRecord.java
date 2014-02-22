package data.promotion;
import data.Data;
import data.DataReader;
import data.Goods;
import data.GoodsData;
import data.ItemRecord;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class SaleGiftRecord extends Promotion {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double price;
	
	private String gift_id;
	
	private int gift_num;

	
	
	/**
	 * 
	 */
	public SaleGiftRecord(){
		
	}
	
	
	/**
	 * @param discount
	 * @return boolean
	 */
	public boolean isInterrupted(SaleGiftRecord discount){
		return price==discount.price&&gift_id.equals(discount.gift_id)&&start_time.before(discount.end_time)&&end_time.after(discount.start_time);
	}
	
	
	@Override
	public String getInfo(){
		// TODO Auto-generated method stub
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods good=goods.getGoodsByID(gift_id);
		String info=ID+","+price+","+good.getGoodsInfo()+","+gift_num+","+getStartTime()+","+getEndTime();
		return info;
	}
	
	
	@Override
	public void dealSale(SaleRecord sale) {
		// TODO Auto-generated method stub
		if(sale.getSpecialPrice()>=price&&isDuringTime()){
			GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
			Goods good=goods.getGoodsByID(gift_id);
			ItemRecord gift=new ItemRecord(good);
			gift.setNum(gift_num);
			sale.addGift(gift);
		}
	}
	public double getPrice(){
		return price;
	}
	
	/**
	 * @param price
	 * @return boolean
	 */
	public boolean setPrice(String price){
		try{
			this.price=Double.parseDouble(price);
			if(this.price<=0){
				return false;
			}
			return true;
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	public void setGiftID(String ID){
		gift_id=ID;
	}
	
	
	/**
	 * @param num
	 * @param start
	 * @param end
	 * @return boolean
	 */
	public boolean set(String num,String start,String end){
		try{
			gift_num=Integer.parseInt(num);
			if(gift_num<=0){
				return false;
			}
			return setTime(start, end);
		}catch(NumberFormatException e){
		    e.printStackTrace();
			return false;
		}
	}
}
