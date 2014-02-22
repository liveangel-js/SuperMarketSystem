package Logic;

import Data.*;


public class Controller {
	private static Shop shop=new Shop();
	private static Worker cashier;
	private VIP vip;
    private Item item;

	public static Worker getCashier(){
		return cashier;
	}
	public static Shop getShop(){
		return shop;
	}
	
	public VIP getVipdata() {
		return vip;
	}

	public void setVipdata(VIP vip) {
		this.vip = vip;
	}

	public Item getItemdata() {
		return item;
	}

	public void setItemdata(Item item) {
		this.item = item;
	}

	
	
	public static VIP getVIPByID(int ID){
		for(VIP vip:shop.getVipList()){
			if(vip.getID()==ID){
				return vip;
			}
		}
		return null;
	}
	public static VIP getVIPByID(String ID){
		try{
			return getVIPByID(Integer.parseInt(ID));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public static Item getItemByID(int ID){
		for(Item item:shop.getItemList()){
			if(item.getID()==ID){
				return item;
			}
		}
		return null;
	}
	public static Item getItemByID(String ID){
		try{
			return getItemByID(Integer.parseInt(ID));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public static Sale getSaleByID(int ID){
		for(Sale sale:shop.getSaleList()){
			if(sale.getID()==ID){
				return sale;
			}
		}
		return null;
	}
	public static Sale getSaleByID(String ID){
		try{
			return getSaleByID(Integer.parseInt(ID));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public static Object[] getItemInfoByID(int ID){
		Item item=getItemByID(ID);
		if(item==null){
			return null;
		}
		Object itemInfo[]={item.getID(),item.getName(),item.getPrice(),item.getSpecialPrice(),item.getNum(),item.getTotalPrice()};
		return itemInfo;
	}
	public static Object[] getItemInfoByID(String ID){
		Item item=getItemByID(ID);
		if(item==null){
			return null;
		}
		Object itemInfo[]={item.getID(),item.getName(),item.getPrice(),item.getSpecialPrice(),item.getNum(),item.getTotalPrice()};
		return itemInfo;
	}
}
