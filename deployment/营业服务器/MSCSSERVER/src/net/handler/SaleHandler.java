package net.handler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import data.*;
import data.promotion.*;
import net.Command;


/**
 * @author Administrator
 *
 */
public class SaleHandler implements HandlerInterface{
	
	public static final String GETITEMBYID="GETITEMBYID";
	
	public static final String GETVIPBYID="GETVIPBYID";
	
	public static final String DEALSALE="DEALSALE";
	
	public static final String COMPLETESALE="COMPLETESALE";
	

	@Override
	public void handle(Command command) {
		// TODO Auto-generated method stub
		if(command.getMethod().equals(GETVIPBYID)){
			Object result=getVIPByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(GETITEMBYID)){
			Object result=getItemByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(DEALSALE)){
			Object result=dealSale(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(COMPLETESALE)){
			Object result=completeSale(command.getPara());
			command.setResult(result);
			return;
		}
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object getVIPByID(Object[] para){
        System.out.println("查找VIP");
		String ID=(String) para[0];
		System.out.println(ID);
		VIPData vips=(VIPData) DataReader.read(Data.VIPS);
		if(vips==null){
			return null;
		}
		System.out.println(vips.getVipByID(ID));
		return vips.getVipByID(ID);
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object getItemByID(Object[] para){
		System.out.println("查找商品");
		String ID=(String) para[0];
		String num=(String) para[1];
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods good=goods.getGoodsByID(ID);
		if(good==null){
			System.out.println("商品不存在11！");
			return null;
		}
		ItemRecord item=new ItemRecord(good);
		System.out.println(item);
		item.setNum(num);
		ItemDiscountData discount=(ItemDiscountData) DataReader.read(Data.ITEMDISCOUNTS);
		discount.dealItem(item);
		return item;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object dealSale(Object[] para){
		SaleRecord sale=(SaleRecord) para[0];
		SimpleDateFormat   sdf   =   new   SimpleDateFormat( "yyMMddHHmmss"); 
		String   time   =   sdf.format(sale.getTime().getTime()); 
		Shop temp = (Shop)DataReader.read(Data.SHOPNUMBER);
		sale.setID(temp.getShopNumber()+time);
		sale.setShopID(temp.getShopNumber()+"");
		SaleDiscountData sale_discount= (SaleDiscountData) DataReader.read(Data.SALEDISCOUNTS);
		sale_discount.dealSale(sale);
		ItemGiftData item_gift=(ItemGiftData) DataReader.read(Data.ITEMGIFTS);
		item_gift.dealSale(sale);
		SaleGiftData sale_gift=(SaleGiftData) DataReader.read(Data.SALEGIFTS);
		sale_gift.dealSale(sale);
		return sale;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object completeSale(Object[] para){
		SaleRecord sale=(SaleRecord) para[0];
		String ID=sale.getVipID();
		if(ID!=null){
			VIPData vips=(VIPData) DataReader.read(Data.VIPS);
			VIPRecord vip=vips.getVipByID(ID);
			vip.setTotal_point((int) (vip.getTotal_point()+sale.getSpecialPrice()-sale.getPoint()/50.0));
			vip.setValid_point((int) (vip.getValid_point()-sale.getPoint()+sale.getSpecialPrice()-sale.getPoint()/50.0));
			DataWriter.write(vips,Data.VIPS);
		}
		SaleData sales=(SaleData) DataReader.read(Data.SALES);
		sales.addSaleRecord(sale);
		DataWriter.write(sales, Data.SALES);
		GoodsStock stocks=(GoodsStock) DataReader.read(Data.STRORAGE);
		ArrayList<ItemRecord>list=sale.getItems().getItemList();
		for(int i=0;i<list.size();i++){
			StockItem item=stocks.getGoodsByID(list.get(i).getID());
			item.setNumber(item.getStockNumber()-list.get(i).getNum());
		}
		list=sale.getGifts().getItemList();
		for(int i=0;i<list.size();i++){
			StockItem item=stocks.getGoodsByID(list.get(i).getID());
			item.setNumber(item.getStockNumber()-list.get(i).getNum());
		}
		DataWriter.write(stocks, Data.STRORAGE);
		return null;
	}
	
	
	public static void main(String args[]){
		DataWriter.write(new SaleData(), Data.SALES);
	}
}
