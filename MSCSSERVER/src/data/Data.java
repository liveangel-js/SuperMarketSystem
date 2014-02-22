package data;
import java.io.Serializable;

import data.promotion.ItemDiscountData;
import data.promotion.ItemGiftData;
import data.promotion.SaleDiscountData;
import data.promotion.SaleGiftData;


/**
 * @author Administrator
 *
 */
public abstract class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String ADMIN="数据/管理员.dat";
	
	public static final String WORKERS="数据/员工信息.dat";
	
	public static final String VIPS="数据/会员信息.dat";

	public static final String GOODS="数据/商品列表.dat";
	
	public static final String STRORAGE="数据/库存信息.dat";
	
	public static final String SALES="数据/销售信息.dat";
	
	public static final String RETURNS="数据/退货信息.dat";

	public static final String SALEDISCOUNTS="数据/总额特价.dat";
	
	public static final String SALEGIFTS="数据/总额赠送.dat";
	
	public static final String ITEMDISCOUNTS="数据/商品特价.dat";
	
	public static final String ITEMGIFTS="数据/商品赠送.dat";
	
	public static final String SHOP="数据/店铺信息.dat";
	
	public static final String SHOPNUMBER="数据/店铺号.dat";
	
	
	
	
	public static void main(String args[]){
//		//GoodsData
//		GoodsData goods=new GoodsData();
//		for(int i=10000;i<10100;i++){
//			Goods good=new Goods(i+"", "鞋子", i+100);
//			goods.addGoods(good);
//		}
//		DataWriter.write(goods,Data.GOODS);
//		
//		
//		DataWriter.write(new ItemDiscountData(), Data.ITEMDISCOUNTS);
//		
//		
//		DataWriter.write(new SaleDiscountData(), Data.SALEDISCOUNTS);
//		
//		DataWriter.write(new ItemGiftData(), Data.ITEMGIFTS);
//		
//		DataWriter.write(new SaleGiftData(), Data.SALEGIFTS);
		
		DataWriter.write(new ItemGiftData(), Data.ITEMGIFTS);
	}
}

