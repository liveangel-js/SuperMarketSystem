package logic.model;
import java.util.ArrayList;
import net.*;
import logic.controller.Controller;
import data.*;


/**
 * @author Administrator
 *
 */
public class SaleModel {
	
	private SaleRecord sale_record;
	
	private VIPRecord vip;
	
	
	/**
	 * 
	 */
	public void startSale() {
		System.out.println("开始销售\n");
	}

	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean setVIP(String ID){
		sale_record=new SaleRecord(Controller.shop_id,Controller.cashier_id);
		Object []para={ID};
		Command command=new Command("SALE", "GETVIPBYID", para);
		Connection.out(command);
		command=Connection.in();
		vip=(VIPRecord)command.getResult();
		if(vip!=null){
			sale_record.setVipID(ID);
			return true;
		}
		System.out.println("VIP输入错误");
		return false;
	}
	
	
	/**
	 * @return boolean
	 */
	public boolean isVIP(){
		return vip!=null;
	}
	
	
	/**
	 * @return String
	 */
	public String getVIPPoint() {
		return vip.getValid_point()+"";
	}
	
	
	/**
	 * @param num
	 * @return boolean
	 */
	public boolean useVIPPoint(String num){
		try{
			int point=Integer.parseInt(num);
			int last=vip.getValid_point()-point;
			if(last<0){
				System.out.println("积分不足");
				return false;
			}
			double should_pay=sale_record.getSpecialPrice()-point/50.0;
			if(should_pay<0){
				System.out.println("积分使用过多");
				return false;
			}
			sale_record.setPoint(point);
			return true;
		}catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * @param ID
	 * @param num
	 * @return boolean
	 */
	public boolean addItem(String ID, String num) {
		
		Object []para={ID,num};
		Command command=new Command("SALE", "GETITEMBYID", para);
		Connection.out(command);
		command=Connection.in();
		ItemRecord item=(ItemRecord)command.getResult();
		System.out.println(item);
		if(item==null){
			System.out.println("商品标识不存在222");
			return false;
		}
		sale_record.addItem(item);
		System.out.println("商品标识存在");
		return true;
	}

	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getGiftListInfo() {
		System.out.println(sale_record.getGiftListInfo()+"bbb");
		return sale_record.getGiftListInfo();
	}


	/**
	 * @param ID
	 * @param num
	 * @return boolean
	 */
	public boolean removeItem(String ID, String num) {
		return sale_record.removeItem(ID,num);
	}

	
	/**
	 * 
	 */
	public boolean completeAddItem() {
		if(!sale_record.hasItem()){
			System.out.println("未购买任何物品");
			return false;
		}
		Object []para={sale_record};
		Command command=new Command("SALE", "DEALSALE", para);
		Connection.out(command);
		command=Connection.in();
		sale_record=(SaleRecord) command.getResult();
		//System.out.println(sale_record.getGiftListInfo());
		return true;
	}
	
	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getItemListInfo() {
		System.out.println(sale_record.getGiftListInfo()+"aaa");
		return sale_record.getItemListSaleInfo();
	}

	
	/**
	 * @return String
	 */
	public String getTotalPrice() {
		return sale_record.getTotalPrice()+"";
	}
	
	/**
	 * @return String
	 */
	public String getSpecialPrice(){
		return sale_record.getSpecialPrice()+"";
	}

	
	/**
	 * @param money_num
	 * @return boolean
	 */
	public boolean pay(String money_num) {
		boolean ok=sale_record.pay(money_num);
		if(ok){
			completeSale();
		}
		return ok;
	}

	
	/**
	 * @return String
	 */
	public String getPayBack() {
		return sale_record.getPayback()+"";
	}	
	
	
	/**
	 * 
	 */
	public void printBill() {
		System.out.println("打印发票\n");
		sale_record.printBill();
	}
	
	
	/**
	 * 
	 */
	public void completeSale(){
		System.out.println("完成销售");
		Object []para={sale_record};
		Command command=new Command("SALE", "COMPLETESALE", para);
		Connection.out(command);
		command=Connection.in();
	}	
}
