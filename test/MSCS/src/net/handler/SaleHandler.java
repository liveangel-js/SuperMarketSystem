package net.handler;
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
		VIPData vips=(VIPData) DataReader.read(Data.VIPS);
		if(vips==null){
			return null;
		}
		return vips.getVIPByID(ID);
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object getItemByID(Object[] para){
		String ID=(String) para[0];
		String num=(String) para[1];
		GoodsData goods=(GoodsData) DataReader.read(Data.GOODS);
		Goods good=goods.getGoodsByID(ID);
		if(good==null){
			return null;
		}
		ItemRecord item=new ItemRecord(good);
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
		//未完成
		//SaleRecord sale=(SaleRecord) para[0];
		return null;
	}
}
