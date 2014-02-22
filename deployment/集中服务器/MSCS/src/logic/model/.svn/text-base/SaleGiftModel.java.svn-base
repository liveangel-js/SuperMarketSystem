package logic.model;
import java.util.ArrayList;
import data.*;
import data.promotion.SaleGiftData;
import data.promotion.SaleGiftRecord;


/**
 * @author Administrator
 *
 */
public class SaleGiftModel {
	
	private GoodsData goods;
	
	private SaleGiftData saleGiftData;
	
	private SaleGiftRecord record;
	
	
	/**
	 * 
	 */
	public void start() {
		goods=(GoodsData) DataReader.read(Data.GOODS);
		saleGiftData=(SaleGiftData) DataReader.read(Data.SALEGIFTS);
	}

	
	/**
	 * @param price
	 * @return boolean
	 */
	public boolean setPrice(String price) {
		record=new SaleGiftRecord();
		record.setID(saleGiftData.getNextID());
		return record.setPrice(price);
	}

	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean setGiftID(String ID) {
		Goods gift=goods.getGoodsByID(ID);
		if(gift==null){
			return false;
		}
		record.setGiftID(ID);
		return true;
	}

	
	/**
	 * @param ID
	 * @return boolean
	 */
	public String getGiftInfo(String ID) {
		Goods gift=goods.getGoodsByID(ID);
		if(gift==null){
			return null;
		}
		return gift.getID()+","+gift.getName()+","+gift.getPrice();
	}

	
	/**
	 * @param num
	 * @param start
	 * @param end
	 * @return boolean
	 */
	public boolean setGift(String num, String start, String end) {
		boolean ok= record.set(num, start, end)&&saleGiftData.add(record);
		if(ok){
			DataWriter.write(saleGiftData, Data.SALEGIFTS);
		}
		return ok;
	}

	
	/**
	 * @param record_id
	 * @return boolean
	 */
	public boolean removeGift(String record_id) {
		boolean ok=saleGiftData.remove(record_id);
		if(ok){
			DataWriter.write(saleGiftData, Data.SALEGIFTS);
	    }
		return ok;
	}

	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList() {
		return saleGiftData.getPromotionList();
	}

	
	public void complete() {
		DataWriter.write(saleGiftData, Data.SALEGIFTS);
	}
}
