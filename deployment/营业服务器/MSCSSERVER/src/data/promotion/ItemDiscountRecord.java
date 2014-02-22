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
public class ItemDiscountRecord extends Promotion {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String item_id;
	
	private double special_price;
	
	
	/**
	 * 
	 */
	public ItemDiscountRecord(){
		
	}
	
	
	/**
	 * @param discount
	 * @return boolean
	 */
	public boolean isInterrupted(ItemDiscountRecord discount){
		return item_id.equals(discount.getItemID())&&isCrossed(discount);
	}
	
	
	@Override
	public String getInfo(){
		// TODO Auto-generated method stub
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods good=goods.getGoodsByID(item_id);
		String info=ID+","+good.getGoodsInfo()+","+special_price+","+getStartTime()+","+getEndTime();
		return info;
	}
	
	
	@Override
	public void dealSale(SaleRecord sale) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * @return String
	 */
	public String getItemID(){
		return item_id;
	}
	
	
	/**
	 * @param ID
	 */
	public void setItemID(String ID){
		item_id=ID;
	}
	
	
	/**
	 * @param price
	 * @param special_price
	 * @param start
	 * @param end
	 * @return boolean
	 */
	public boolean set(String special_price,String start,String end){
		try{
			this.special_price=Double.parseDouble(special_price);
			if(this.special_price<=0){
				return false;
			}
			return setTime(start, end);
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}


	/**
	 * @param item
	 */
	public void dealItem(ItemRecord item){
		if(isDuringTime()&&item.getID().equals(item_id)){
			item.setSpecialPrice(special_price);
			item.calculateTotalPrice();
		}
	}
}
