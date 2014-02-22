package net.handler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.GoodsStock;
import data.ItemRecord;
import data.ReturnData;
import data.ReturnRecord;
import data.SaleData;
import data.SaleRecord;
import data.Shop;
import data.StockItem;
import data.VIPData;
import data.VIPRecord;
import data.promotion.ItemGiftData;
import net.Command;

public class ReturnHandler implements HandlerInterface{

	public static final String GETSALERECORDBYID="GETSALERECORDBYID";
	
	public static final String GETRETURNDATABYID="GETRETURNDATABYID";
	
	public static final String DEALSALE="DEALSALE";
	
	public static final String COMPLETERETURN="COMPLETERETURN";
	

	@Override
	public void handle(Command command) {
		// TODO Auto-generated method stub
		if(command.getMethod().equals(GETSALERECORDBYID)){
			Object result=getSaleRecordByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(GETRETURNDATABYID)){
			Object result=getReturnDataByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(DEALSALE)){
			Object result=dealRuturn(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(COMPLETERETURN)){
			Object result=completeReturn(command.getPara());
			command.setResult(result);
			return;
		}
	}



	private Object getReturnDataByID(Object[] para) {
		// TODO Auto-generated method stub
		String ID=(String) para[0];
		ReturnData returns=(ReturnData) DataReader.read(Data.RETURNS);
		ReturnData returns2=returns.getReturnsBySaleID(ID);
		return returns2;
	}



	/**
	 * @param para
	 * @return Object
	 */
	public Object getSaleRecordByID(Object []para){
		String ID=(String) para[0];
		SaleData sales=(SaleData) DataReader.read(Data.SALES);
		SaleRecord sale=sales.getSaleRecordByID(ID);
		return sale;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object dealRuturn(Object []para){

		ReturnRecord returnRecord=(ReturnRecord) para[0];
		SimpleDateFormat   sdf   =   new   SimpleDateFormat( "yyMMddHHmmss"); 
		String   time   =   sdf.format(returnRecord.getTime().getTime()); 
		Shop temp = (Shop)DataReader.read(Data.SHOPNUMBER);
		returnRecord.setID(temp.getShopNumber()+time);
		returnRecord.setShopID(temp.getShopNumber()+"");
		ItemGiftData itemGift=(ItemGiftData) DataReader.read(Data.ITEMGIFTS);
		itemGift.dealReturn(returnRecord);
		SaleData sales=(SaleData) DataReader.read(Data.SALES);
		SaleRecord sale=sales.getSaleRecordByID(returnRecord.getSaleID());
		double discount=sale.getSpecialPrice()/sale.getTotalPrice();
		returnRecord.setMoneyReturn(discount*returnRecord.getItemData().getTotalPrice());
		VIPData vips=(VIPData) DataReader.read(Data.VIPS);
		if(sale.getVipID()!=null){
			VIPRecord vip=vips.getVipByID(sale.getVipID());
			if(vip.getValid_point()<returnRecord.getMoneyReturn()){
				returnRecord.setMoneyReturn(-1);
			}
		}
		return returnRecord;
	}
	

	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object completeReturn(Object []para){
		ReturnRecord returnRecord=(ReturnRecord) para[0];
		VIPData vips=(VIPData) DataReader.read(Data.VIPS);
		SaleData sales=(SaleData) DataReader.read(Data.SALES);
		SaleRecord sale=sales.getSaleRecordByID(returnRecord.getSaleID());
		if(sale.getVipID()!=null){
			VIPRecord vip=vips.getVipByID(sale.getVipID());
			int point=(int) (vip.getValid_point()-returnRecord.getMoneyReturn());
			vip.setValid_point(point);
			point=(int) (vip.getTotal_point()-returnRecord.getMoneyReturn());
			vip.setTotal_point(point);
			DataWriter.write(vips, Data.VIPS);
		}
		
		
		ReturnData returns=(ReturnData) DataReader.read(Data.RETURNS);
		returns.addReturnItemRecord(returnRecord);
		DataWriter.write(returns, Data.RETURNS);
		GoodsStock stocks=(GoodsStock) DataReader.read(Data.STRORAGE);
		ArrayList<ItemRecord>list=returnRecord.getItemData().getItemList();
		for(int i=0;i<list.size();i++){
			StockItem item=stocks.getGoodsByID(list.get(i).getID());
			item.setNumber(item.getStockNumber()-list.get(i).getNum());
		}
		list=returnRecord.getGiftData().getItemList();
		for(int i=0;i<list.size();i++){
			StockItem item=stocks.getGoodsByID(list.get(i).getID());
			item.setNumber(item.getStockNumber()-list.get(i).getNum());
		}
		DataWriter.write(stocks, Data.STRORAGE);
		return null;
	}
	
	
	public static void main(String args[]){
		DataWriter.write(new ReturnData(), Data.RETURNS);
	}
}
