package Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;


public class Sale implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private Calendar time;
	private Shop shop;
	private Worker cashier;
	private VIP vip;
	private ArrayList<Item>itemList;
	private double totalPrice;
	private double specialPrice;
	private double pay;
	private double payback;
	
	
	public Sale(){
		itemList=new ArrayList<Item>();
	}
	public int getID(){
		return ID;
	}
	public void setID(int ID){
		this.ID=ID;
	}
	public Calendar getTime(){
		return time;
	}
	public void setTime(Calendar time){
		this.time=time;
	}
	public Shop getShop(){
		return shop;
	}
	public void setShop(Shop shop){
		this.shop=shop;
	}
	public Worker getCashier(){
		return cashier;
	}
	public void setCashier(Worker cashier){
		this.cashier=cashier;
	}
	public VIP getVIP(){
		return vip;
	}
	public void setVIP(VIP vip) {
		this.vip=vip;
	}
	public void removeItemList(ArrayList<Item> itemList){
		for(int i=0;i<itemList.size();i++){
			itemList.remove(i);
		}
	}
	public  ArrayList<Item> getItemList(){
		return itemList;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice){
		this.totalPrice=totalPrice;
	}
	public double getPay(){
		return pay;
	}
	public void setPay(double pay){
		this.pay=pay;
	}
	public double getPayback(){
		return payback;
	}
	public void setPayback(double payback){
		this.payback=payback;
	}
	public double getSpecialPrice(){
		return specialPrice;
	}
	public void setSpecialPrice(double specialPrice){
		this.specialPrice=specialPrice;
	}
}
