package logic.interfaces;

import java.util.ArrayList;

public interface SaleGiftInterface {
	
	public void start();
	
	public boolean setPrice(String price);
	
	public boolean setGiftID(String ID);
	
	public String getGiftInfo(String ID);
	
	public boolean setGift(String num,String start,String end);
	
	public boolean removeGift(String record_id);
	
	public ArrayList<String> getPromotionList();
	
	public void complete();
}
