package logic.model;
import java.util.ArrayList;
import data.*;
import data.promotion.ItemDiscountData;
import data.promotion.ItemDiscountRecord;


/**
 * @author Administrator
 *
 */
public class ItemDiscountModel {
	
	private GoodsData goods;
	
	private ItemDiscountData discounts;
	
	private ItemDiscountRecord discount;
	
	
	/**
	 * 
	 */
	public void start() {
		goods=(GoodsData) DataReader.read(Data.GOODS);
		discounts=(ItemDiscountData) DataReader.read(Data.ITEMDISCOUNTS);
	}


	/**
	 * @param ID
	 * @return boolean
	 */ 
	public boolean setID(String ID) {
		discount=new ItemDiscountRecord();
		discount.setID(discounts.getNextID());
		Goods good=goods.getGoodsByID(ID);
		if(good!=null){
			discount.setItemID(ID);
			return true;
		}
		return false;
	}
	
	
	/**
	 * @param ID
	 * @return String
	 */
	public String getItemInfo(String ID) {
		Goods good=goods.getGoodsByID(ID);
		if(good!=null){
			String info=good.getGoodsInfo();
			return info;
		}
		return null;
	}
	
	
	/**
	 * @param special_price
	 * @param start_time
	 * @param end_time
	 * @return boolean
	 */
	public boolean setDiscount(String special_price, String start_time,	String end_time) {
		try{
		    boolean ok=discount.set(special_price, start_time, end_time);
		    ok&=discounts.add(discount);
		    if(ok){
		        DataWriter.write(discounts, Data.ITEMDISCOUNTS);
		    }
		    return ok;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	
	/**
	 * @param discount_id
	 * @return boolean
	 */
	public boolean removeDiscount(String discount_id) {
		boolean ok=discounts.remove(discount_id);
		if(ok){
			DataWriter.write(discounts, Data.ITEMDISCOUNTS);
		}
		return ok;
	}
	
	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList() {
		return discounts.getPromotionList();
	}

	
	/**
	 * 
	 */
	public void complete() {
		DataWriter.write(discounts, Data.ITEMDISCOUNTS);
	}
}
