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
	
	public static final String ADMIN="����/����Ա.dat";
	
	public static final String WORKERS="����/Ա����Ϣ.dat";
	
	public static final String VIPS="����/��Ա��Ϣ.dat";

	public static final String GOODS="����/��Ʒ�б�.dat";
	
	public static final String STRORAGE="����/�����Ϣ.dat";
	
	public static final String SALES="����/������Ϣ.dat";
	
	public static final String RETURNS="����/�˻���Ϣ.dat";

	public static final String SALEDISCOUNTS="����/�ܶ��ؼ�.dat";
	
	public static final String SALEGIFTS="����/�ܶ�����.dat";
	
	public static final String ITEMDISCOUNTS="����/��Ʒ�ؼ�.dat";
	
	public static final String ITEMGIFTS="����/��Ʒ����.dat";
	
	public static final String SHOP="����/������Ϣ.dat";
	
	public static final String SHOPNUMBER="����/���̺�.dat";
	
	
	
	
	public static void main(String args[]){
//		//GoodsData
//		GoodsData goods=new GoodsData();
//		for(int i=10000;i<10100;i++){
//			Goods good=new Goods(i+"", "Ь��", i+100);
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

