package fakeLogic;
import Logic.Controller;
import Data.Item;

import Data.VIP;
public class TestController extends Controller{

	
	public static VIP getVIPByID(int ID){
		return new VIP(2, "vip2", "159962211111", 1000, 500);
	}
	
	
	public static Item getItemByID(int ID){
		
	return new Item(2, "item2", 11.5, 10, 9.5,95);
			
		
	}
	

	
	public static Object[] getItemInfoByID(int ID){
		
		Object itemInfo[]={2,"item2", 11.5,9.5,10,95};
		return itemInfo;
	}
}