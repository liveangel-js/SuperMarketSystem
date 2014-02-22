package data.promotion;

import data.Data;

import data.DataReader;
import data.VIPData;
import data.VIPRecord;
import view.ItemDiscountPanel;
public class testChange {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDiscountItem ();
		AddDiscountSale ();
		AddGiftItem ();
		AddGiftSale ();
		
	}
	public static void AddDiscountItem (){
		ItemDiscountPanel i=new ItemDiscountPanel();
		i.text_ID.setText("10000");
		i.btn_Sure.doClick();
		i.text_specialPrice.setText("0.5");
		i.text_itemBegin.setText("8888-1-1");
		i.text_itemEnd.setText("9999-1-1");
		i.text_promotionID.setText("11");
		i.btn_add.doClick();
		ItemDiscountData itemDiscountData=(ItemDiscountData)DataReader.read(Data.ITEMDISCOUNTS);
		ItemDiscountRecord itemDiscountRecord=itemDiscountData.getRecordByID("10000");
	    System.out.println(itemDiscountRecord.getInfo());
	}
	
	public static void AddGiftItem (){
		ItemGiftData itemGiftData=(ItemGiftData)DataReader.read(Data.ITEMGIFTS);
		ItemGiftRecord itemGiftRecord=itemGiftData.getRecordByID("10000");
	    System.out.println(itemGiftRecord.getInfo());
	}
	
	public static void AddDiscountSale (){
		SaleDiscountData saleDiscountData=(SaleDiscountData)DataReader.read(Data.SALEDISCOUNTS);
		SaleDiscountRecord saleDiscountRecord=saleDiscountData.getRecordByID("11");
	    System.out.println(saleDiscountRecord.getInfo());
	}
	
	public static void AddGiftSale (){
		SaleGiftData saleGiftData=(SaleGiftData)DataReader.read(Data.SALEGIFTS);
		SaleGiftRecord saleGiftRecord=saleGiftData.getRecordByID("11");
	    System.out.println(saleGiftRecord.getInfo());
	}
}

