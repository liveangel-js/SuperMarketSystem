package logic.model;
import java.util.ArrayList;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.promotion.SaleDiscountData;
import data.promotion.SaleDiscountRecord;


/**
 * @author Administrator
 *
 */
public class SaleDiscountModel {
	
	private SaleDiscountData saleDiscountData;
	
	
	/**
	 * 
	 */
	public void start() {
		saleDiscountData=(SaleDiscountData) DataReader.read(Data.SALEDISCOUNTS);
	}

	
	/**
	 * @param price
	 * @param discount
	 * @param start
	 * @param end
	 * @return boolean
	 */
	public boolean addDiscount(String price, String discount, String start,String end) {
		boolean ok=true;
		SaleDiscountRecord record=new SaleDiscountRecord();
		record.setID(saleDiscountData.getNextID());
		ok&=record.set(price, discount, start, end);
		ok&=saleDiscountData.add(record);
		if(ok){
			DataWriter.write(saleDiscountData, Data.SALEDISCOUNTS);
		}
		return ok;
	}

	
	/**
	 * @param discount_id
	 * @return boolean
	 */
	public boolean removeDiscount(String discount_id) {
		boolean ok=saleDiscountData.remove(discount_id);
		if(ok){
			DataWriter.write(saleDiscountData, Data.SALEDISCOUNTS);
		}
		return ok;
	}

	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList() {
		return saleDiscountData.getPromotionList();
	}

	
	/**
	 * 
	 */
	public void complete() {
		DataWriter.write(saleDiscountData, Data.SALEDISCOUNTS);
	}
}
