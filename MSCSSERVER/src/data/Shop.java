package data;

public class Shop extends Data{
//	public static int  shopNumber = 1;
	
	private int shopNumber = 1;
	public void setShopNumber(int i){
		this.shopNumber=i;
	}
	public int getShopNumber(){
		return shopNumber;
	}
	
	
	public static void main(String args[]){
		Shop s = new Shop();
		DataWriter.write(s, Data.SHOPNUMBER);
		
	}

}
