package data.promotion;
import data.Data;
import data.DataReader;
import data.Goods;
import data.GoodsData;
import data.ItemData;
import data.ItemRecord;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class ItemGiftRecord extends Promotion{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String item_id;
	
	private String gift_id;
	
	private int number;
	
	
	/**
	 * 
	 */
	public ItemGiftRecord(){
		
	}

	
	/**
	 * @param discount
	 * @return boolean
	 */
	public boolean isInterrupted(ItemGiftRecord discount){
		return item_id.equals(discount.item_id)&&gift_id.equals(discount.gift_id)&&isCrossed(discount);
	}
	
	
	@Override
	public String getInfo(){
		// TODO Auto-generated method stub
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods item=goods.getGoodsByID(item_id);
		Goods gift=goods.getGoodsByID(gift_id);
		return ID+","+item.getGoodsInfo()+","+gift.getGiftInfo()+","+number+","+getStartTime()+","+getEndTime();
	}
	
	
	@Override
	public void dealSale(SaleRecord sale) {
		// TODO Auto-generated method stub
		ItemRecord item=sale.getItemByID(item_id);
		if(item==null){
			return;
		}
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods good=goods.getGoodsByID(gift_id);
		ItemRecord gift=new ItemRecord(good);
		gift.setNum(number*item.getNum());
		sale.addGift(gift);
	}
	
//	public ItemRecord getGifts(ItemData items){
//		ItemRecord item=items.getRecordByID(item_id);
//		if(item==null){
//			return null;
//		}
//		GoodsData goods=(GoodsData) DataReader.read(Data.GOODDATA);
//		GoodsRecord good=goods.getGoodsByID(gift_id);
//		ItemRecord gift=new ItemRecord(good);
//		gift.setNum(number*item.getNum());
//		return gift;
//	}

	/**
	 * @param ID
	 */
	public void setItemID(String ID){
		item_id=ID;
	}
	
	
	/**
	 * @param ID
	 */
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
		return setNumber(num)&&setTime(start, end);
	}
	
	
	/**
	 * @param num
	 * @return boolean
	 */
	public boolean setNumber(String num){
		try{
			number=Integer.parseInt(num);
			if(number<=0){
				return false;
			}
			return true;
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
}
