package data;

public class testAddOrDelData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAddData ();
		TestDelData ();
	}
	public static void TestAddData (){
		GoodsData data=(GoodsData)DataReader.read(Data.GOODS);
		System.out.println(data.getGoodsInfoByID("123"));
		
		}
	public static void TestDelData (){
		GoodsData data=(GoodsData)DataReader.read(Data.GOODS);
		
		System.out.println(data.getGoodsInfoByID("10000"));
		
	}
	

}
