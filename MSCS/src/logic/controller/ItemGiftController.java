package logic.controller;
import java.util.ArrayList;
import logic.interfaces.ItemGiftInterface;
import logic.model.ItemGiftModel;


public class ItemGiftController implements ItemGiftInterface {
	
	private ItemGiftModel model;

	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		model=new ItemGiftModel();
		model.start();
	}

	@Override
	public boolean setItemID(String ID) {
		// TODO Auto-generated method stub
		return model.setItemID(ID);
	}

	@Override
	public String getItemInfo(String ID) {
		// TODO Auto-generated method stub
		return model.getItemInfo(ID);
	}

	@Override
	public boolean setGiftID(String ID) {
		// TODO Auto-generated method stub
		return model.setGiftID(ID);
	}

	@Override
	public String getGiftInfo(String ID) {
		// TODO Auto-generated method stub
		return model.getGiftInfo(ID);
	}

	@Override
	public boolean setGift(String num, String start, String end) {
		// TODO Auto-generated method stub
		return model.setGift(num, start, end);
	}

	@Override
	public boolean removeGift(String record_id) {
		// TODO Auto-generated method stub
		return model.removeGift(record_id);
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
