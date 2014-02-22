package server.data;

//商品数据的实体类
public class ItemData {
     int itemID;
     String itemName;
     int price;
     int priceForSale;
	 String saleStartDate;
     String saleEndDate;
     
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPriceForSale() {
		return priceForSale;
	}
	public void setPriceForSale(int priceForSale) {
		this.priceForSale = priceForSale;
	}
	public String getSaleStartDate() {
		return saleStartDate;
	}
	public void setSaleStartDate(String saleStartDate) {
		this.saleStartDate = saleStartDate;
	}
	public String getSaleEndDate() {
		return saleEndDate;
	}
	public void setSaleEndDate(String saleEndDate) {
		this.saleEndDate = saleEndDate;
	}
}
