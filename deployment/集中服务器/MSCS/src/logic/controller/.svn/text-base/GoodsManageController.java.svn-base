package logic.controller;

import logic.interfaces.GoodsManageInterface;
import logic.model.GoodsManageModel;

public class GoodsManageController extends Controller implements GoodsManageInterface{
	private GoodsManageModel goods_model = new GoodsManageModel();

	@Override
	public Object[][] getTable() {
		// TODO Auto-generated method stub
		
		return goods_model.getTable();
	}

	@Override
	public void writeData() {
		// TODO Auto-generated method stub
		goods_model.writeData();
	}

	@Override
	public boolean addData(String s) {
		// TODO Auto-generated method stub
		return goods_model.addData(s);
	}

	@Override
	public boolean deleteData(String ID) {
		// TODO Auto-generated method stub
		return goods_model.deleteData(ID);
	}

	@Override
	public boolean checkInputID(String s) {
		// TODO Auto-generated method stub
		try{
			long id = Long.parseLong(s);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}
	public boolean checkInputPrice(String s){
		try{
			Double price = Double.parseDouble(s);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}

}
