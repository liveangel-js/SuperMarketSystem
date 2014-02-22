package logic.model;
import java.util.ArrayList;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.Goods;
import data.GoodsData;
import data.ItemData;
import data.ItemRecord;
import data.promotion.ItemGiftData;
import data.promotion.ItemGiftRecord;


/**
 * @author Administrator
 *
 */
public class ItemGiftModel {
	
	private GoodsData goods;
	
	private ItemGiftData itemGiftData;
	
	private ItemGiftRecord itemGiftRecord;
	
	
	/**
	 * 
	 */
	public void start() {
		goods=(GoodsData) DataReader.read(Data.GOODS);
		itemGiftData=(ItemGiftData) DataReader.read(Data.ITEMGIFTS);
	}

	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean setItemID(String ID) {
		itemGiftRecord=new ItemGiftRecord();
		itemGiftRecord.setID(itemGiftData.getNextID());
		Goods good=goods.getGoodsByID(ID);
		if(good!=null){
			itemGiftRecord.setItemID(ID);
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
	 * @param ID
	 * @return boolean
	 */
	public boolean setGiftID(String ID) {
		Goods good=goods.getGoodsByID(ID);
		if(good!=null){
			itemGiftRecord.setGiftID(ID);
			return true;
		}
		return false;
	}

	
	/**
	 * @param ID
	 * @return String
	 */
	public String getGiftInfo(String ID) {
		Goods good=goods.getGoodsByID(ID);
		if(good!=null){
			String info=good.getID()+","+good.getName()+","+good.getPrice();
			return info;
		}
		return null;
	}

	
	
	/**
	 * @param num
	 * @param start
	 * @param end
	 * @return
	 */
	public boolean setGift(String num, String start, String end) {
		boolean ok=itemGiftRecord.set(num, start, end)&&itemGiftData.add(itemGiftRecord);
		if(ok){
			DataWriter.write(itemGiftData, Data.ITEMGIFTS);
		}
		return ok;
	}

	
	
	/**
	 * @param record_id
	 * @return boolean
	 */
	public boolean removeGift(String record_id) {
		boolean ok=itemGiftData.remove(record_id);
		if(ok){
			DataWriter.write(itemGiftData, Data.ITEMGIFTS);
		}
		return ok;
	}

	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList() {
		return itemGiftData.getPromotionList();
	}

	
	/**
	 * 
	 */
	public void complete() {
		DataWriter.write(itemGiftData, Data.ITEMGIFTS);
	}
}
