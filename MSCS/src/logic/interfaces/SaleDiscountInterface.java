package logic.interfaces;

import java.util.ArrayList;

public interface SaleDiscountInterface {
	
	public void start();
	
	public boolean addDiscount(String price,String discount,String srart,String end);
	
	public boolean removeDiscount(String discount_id);
	
	public ArrayList<String> getPromotionList();
	
	public void complete();

}
