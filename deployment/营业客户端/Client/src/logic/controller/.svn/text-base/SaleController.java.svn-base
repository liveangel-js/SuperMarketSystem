package logic.controller;
import java.util.ArrayList;

import contrib.net.xoetrope.editor.color.ModelColor;
import logic.interfaces.SaleInterface;
import logic.model.SaleModel;


public class SaleController extends Controller implements SaleInterface {
	
	private  SaleModel sale_model=new SaleModel();

	
	@Override
	public void startSale() {
		// TODO Auto-generated method stub
		sale_model.startSale();
	}

	
	@Override
	public boolean setVIP(String ID) {
		// TODO Auto-generated method stub
		return sale_model.setVIP(ID);
	}

	
	@Override
	public boolean isVIP() {
		// TODO Auto-generated method stub
		return sale_model.isVIP();
	}
	
	
	@Override
	public String getVIPPoint() {
		// TODO Auto-generated method stub
		return sale_model.getVIPPoint();
	}

	
	@Override
	public boolean useVIPPoint(String num) {
		// TODO Auto-generated method stub
		return sale_model.useVIPPoint(num);
	}

	
	@Override
	public boolean addItem(String ID, String num) {
		// TODO Auto-generated method stub
		return sale_model.addItem(ID, num);
	}

	
	@Override
	public boolean removeItem(String ID, String num) {
		// TODO Auto-generated method stub
		return sale_model.removeItem(ID, num);
	}
	
	
	@Override
	public boolean completeAddItem() {
		// TODO Auto-generated method stub
		return sale_model.completeAddItem();
	}
	
	
	@Override
	public ArrayList<String> getItemListInfo() {
		// TODO Auto-generated method stub
		return sale_model.getItemListInfo();
	}

	
	@Override
	public ArrayList<String> getGiftListInfo() {
		// TODO Auto-generated method stub
		System.out.println("产看赠品列表");
		return sale_model.getGiftListInfo();
	}
	
	
	@Override
	public String getTotalPrice() {
		// TODO Auto-generated method stub
		return sale_model.getTotalPrice();
	}

	@Override
	public boolean pay(String money_num) {
		// TODO Auto-generated method stub
		return sale_model.pay(money_num);
	}

	
	@Override
	public String getPayBack() {
		// TODO Auto-generated method stub
		return sale_model.getPayBack();
	}

	@Override
	public void printBill() {
		// TODO Auto-generated method stub
		sale_model.printBill();
	}

	
	@Override
	public void completeSale() {
		// TODO Auto-generated method stub
		sale_model.completeSale();
	}


	@Override
	public String getSpecialPrice() {
		// TODO Auto-generated method stub
		return sale_model.getSpecialPrice();
	}
}
