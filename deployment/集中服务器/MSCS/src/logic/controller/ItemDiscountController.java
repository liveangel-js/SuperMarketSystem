package logic.controller;

import java.util.ArrayList;

import logic.interfaces.ItemDiscountInterface;
import logic.model.ItemDiscountModel;

public class ItemDiscountController implements ItemDiscountInterface {
	
	private ItemDiscountModel model;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		model=new ItemDiscountModel();
		model.start();
	}

	@Override
	public boolean setID(String ID) {
		// TODO Auto-generated method stub
		return model.setID(ID);
	}
	
	@Override
	public String getItemInfo(String ID) {
		// TODO Auto-generated method stub
		return model.getItemInfo(ID);
	}
	
	@Override
	public boolean setDiscount(String special_price, String start_time,
			String end_time) {
		// TODO Auto-generated method stub
		return model.setDiscount(special_price, start_time, end_time);
	}
	
	@Override
	public boolean removeDiscount(String discount_id) {
		// TODO Auto-generated method stub
		return model.removeDiscount(discount_id);
	}

	@Override
	public ArrayList<String> getPromotionList() {
		// TODO Auto-generated method stub
		return model.getPromotionList();
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		model.complete();
	}
}
