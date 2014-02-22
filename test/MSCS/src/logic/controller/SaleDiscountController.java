package logic.controller;
import java.util.ArrayList;
import logic.interfaces.SaleDiscountInterface;
import logic.model.SaleDiscountModel;


/**
 * @author Administrator
 *
 */
public class SaleDiscountController implements SaleDiscountInterface {
	
	private SaleDiscountModel model;
	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		model=new SaleDiscountModel();
		model.start();
	}

	@Override
	public boolean addDiscount(String price, String discount, String srart,
			String end) {
		// TODO Auto-generated method stub
		return model.addDiscount(price, discount, srart, end);
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
