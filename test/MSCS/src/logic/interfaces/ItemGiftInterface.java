package logic.interfaces;

import java.util.ArrayList;

public interface ItemGiftInterface {

	public void start();
	
	public boolean setItemID(String ID);
	
	public String getItemInfo(String ID);
	
	public boolean setGiftID(String ID);
	
	public String getGiftInfo(String ID);
	
	public boolean setGift(String num,String start,String end);
	
	public boolean removeGift(String record_id);
	
	public ArrayList<String> getPromotionList();
	
	public void complete();
}
