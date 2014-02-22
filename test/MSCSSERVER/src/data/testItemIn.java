package data;

public class testItemIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestItemIn ();
	}
 
	
	public static void TestItemIn (){
		GoodsStock goodsStock=(GoodsStock)DataReader.read(Data.STRORAGE);
		StockItem stockItem1=goodsStock.getGoodsByID("10000");
		System.out.println(stockItem1.getStockItemInfo());
		StockItem stockItem2=goodsStock.getGoodsByID("10002");
		System.out.println(stockItem2.getStockItemInfo());
		
	}
	
}
