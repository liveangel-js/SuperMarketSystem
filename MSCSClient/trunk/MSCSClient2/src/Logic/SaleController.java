package Logic;
import Data.*;


public class SaleController extends Controller {
	private static Sale sale;
	
	
	public static void startSale(){
		sale=new Sale();
		sale.setCashier(getCashier());
	}
	
	
	public static boolean setVIP(String ID){
		VIP vip=getVIPByID(ID);
		if(vip==null){
			return false;
		}
		sale.setVIP(vip);
		return true;
	}
	
	
	public static String getValidPoint(){
		return sale.getVIP().getAvailablePoint()+"";
	}
	
	
	public static boolean addItem(String ID,String Num){
		Item item=getItemByID(ID);
		if(item==null){
			return false;
		}
		try{
			int num=Integer.parseInt(Num);
			if(num>item.getNum()){
				return false;
			}
			item.setNum(item.getNum()-num);
			sale.getItemList().add(new Item(item.getID(), item.getName(), item.getPrice(), num, item.getPrice(), item.getSpecialPrice()*num));
			return true;	
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
	public static void completeSale(){
		//sale.setID(getShop().getSaleList().size());
	}
	public static String[] getItemListInfo(){
		String[] itemListInfo=new String[sale.getItemList().size()];
		for(int i=0;i<sale.getItemList().size();i++){
			Item item=sale.getItemList().get(i);
			itemListInfo[i]=item.getID()+","+item.getName()+","+item.getPrice()+","+item.getNum()+","+item.getSpecialPrice()+","+item.getTotalPrice();
		}
		return itemListInfo;
	}
	public static String getPrice(){
		double price=0;
		for(Item item:sale.getItemList()){
			price+=item.getTotalPrice();
		}
		return price+"";
	}
	public static int getItemNum(){
		return sale.getItemList().size();
	}

}
