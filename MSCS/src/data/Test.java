package data;

public class Test {
	public static void main(String args[]){
		GoodsData g = (GoodsData)DataReader.read(Data.GOODS);
		System.out.println(g.getGoodsInfoByID("10100"));
	}

}
