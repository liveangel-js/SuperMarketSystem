package logic.interfaces;
import java.util.ArrayList;

public interface ItemDiscountInterface {
	
	public void start();
	
	public boolean setID(String ID);
	
	public String getItemInfo(String ID);
	
	public boolean setDiscount(String special_price,String start_time,String end_time);
	
	public boolean removeDiscount(String discount_id);
	
	public ArrayList<String> getPromotionList();
	
	public void complete();

}