package logic.controller;

import logic.interfaces.ItemInInterface;
import logic.model.ItemInModel;

public class ItemInController extends Controller implements ItemInInterface{
	ItemInModel itemInModel = new ItemInModel();
	
//	public boolean addStockItem(String s){
//		
//		return itemInModel.addStockItem(s);
//	}
	public String getItemInfoByID(String s){
		return itemInModel.getItemInfoByID(s);
	}
	public Object[][] getGoodsTable(){
		return itemInModel.getGoodsTable();
	}
	public void writeData(String []s){
		itemInModel.writeStockData(s);
		itemInModel.writeImportData(s);
		
	}
	@Override
	public boolean checkInput(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
