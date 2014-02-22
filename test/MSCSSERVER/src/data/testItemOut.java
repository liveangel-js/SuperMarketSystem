package data;

public class testItemOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestItemOut ();
	}
 
	
	public static void TestItemOut (){
		GoodsStock goodsStock=(GoodsStock)DataReader.read(Data.STRORAGE);
		StockItem stockItem=goodsStock.getGoodsByID("10000");
		System.out.println(stockItem.getStockItemInfo());
		
		StockItem stockItem2=goodsStock.getGoodsByID("10002");
		System.out.println(stockItem2.getStockItemInfo());
	}
	
	
	}

