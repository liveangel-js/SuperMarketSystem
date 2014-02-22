package logic.controller;

import logic.interfaces.ItemOutInterface;
import logic.model.ItemOutModel;

public class ItemOutController extends Controller implements ItemOutInterface{
	private ItemOutModel itemOutModel = new ItemOutModel();
	
	public String getStockItemInfoByID(String s){
		if(itemOutModel.getStockItemByID(s)==null){
			return null;
		}else{
			return itemOutModel.getStockItemByID(s).getStockItemInfo();
		}
		
	}
	
	public void writeStockData(String []s){
		itemOutModel.writeStockData(s);
	}

}
