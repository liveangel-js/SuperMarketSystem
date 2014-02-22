package data;
import java.io.*;
import java.util.*;


/**
 * @author Administrator
 *
 */
public class SaleRecord extends Record  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String bill="sale_bill";

	private Calendar time;
	
	private String shop_id;
	
	private String cashier_id;
	
	private String vip_id;
	
	private ItemData itemData;
	
	private ItemData giftData;
	
	private double total_price;
	
	private double special_price;
	
	private int point;
	
	private double pay;
	
	private double payback;
	
	
	/**
	 * 
	 */
	public SaleRecord(String shop, String cashier){
		time=Calendar.getInstance();
		shop_id=shop;
		cashier_id=cashier;
		itemData=new ItemData();
		giftData=new ItemData();
		point=0;
	}
	
	
	/**
	 * @return Calendar
	 */
	public Calendar getTime(){
		return time;
	}
	
	
	/**
	 * @return String
	 */ 
	public String getShopID(){
		return shop_id;
	}
	
	
	/**
	 * @return String
	 */
	public String getVipID(){
		return vip_id;
	}
	
	
	/**
	 * @param vip_id
	 */
	public void setVipID(String vip_id) {
		this.vip_id=vip_id;
	}

	
	/**
	 * @return double
	 */
	public double getTotalPrice(){
		itemData.getTotalPrice();
		return total_price;
	}
	
	
	/**
	 * @param total_price
	 */
	public void setTotalPrice(double total_price){
		this.total_price=total_price;
	}
	
	
	/**
	 * @return double
	 */
	public double getSpecialPrice(){
		special_price=itemData.getTotalPrice();
		return special_price;
	}
	
	
	/**
	 * @param special_price
	 */
	public void setSpecialPrice(double special_price){
		this.special_price=special_price;
	}
	

	/**
	 * @return int
	 */
	public int getPoint(){
		return point;
	}
	
	
	/**
	 * @param point
	 */
	public void setPoint(int point){
		this.point=point;
	}
	
	
	/** 
	 * @return double
	 */
	public double getPay(){
		return pay;
	}
	
	
	/**
	 * @param pay
	 */
	public void setPay(double pay){
		this.pay=pay;
	}
	
	
	/**
	 * @return double
	 */
	public double getPayback(){
		return payback;
	}
	
	
	/**
	 * @param payback
	 */
	public void setPayback(double payback){
		this.payback=payback;
	}

	
	public void addItem(ItemRecord item){
		itemData.addRecord(item);
	}
	
	public void addGift(ItemRecord gift){
		giftData.addRecord(gift);
	}
	
	
	
	public boolean removeItem(String ID,String num){
		return itemData.removeRecord(ID, num);
	}
	
	
	public boolean isVIP(){
		return vip_id!=null;
	}
	
	
	/**
	 * 
	 */
	public void printBill(){
		try {
			File file = new File("账单/销售账单/"+ID+".txt");
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			String string_time=time.get(Calendar.YEAR)+"-"+time.get(Calendar.MONTH)+"-"+time.get(Calendar.DAY_OF_MONTH)+" "+time.get(Calendar.HOUR_OF_DAY)+":"+time.get(Calendar.MINUTE)+":"+time.get(Calendar.SECOND);
			writer.write("时间："+string_time+"\n");
			String string_shop="店铺号:"+shop_id+"\n";
			writer.write(string_shop);
			String string_cashier="收银员编号:"+cashier_id+"\n";
			writer.write(string_cashier);
			String string_sale_id="账单编号:"+ID+"\n";
			writer.write(string_sale_id);
			String string_vip="VIP:"+vip_id+"\n";
			writer.write(string_vip);
			String string_price="总价："+special_price+"\n";
			writer.write(string_price);
			writer.write("商品列表：\n");
			writer.write("标识\t\t\t名称\t\t\t价格\t\t\t特价\t\t\t数量\t\t\t总价\t\t\n");
			ArrayList<String> itemInfo=itemData.getItemListInfo();
			if(itemInfo!=null){
				for(int i=0;i<itemInfo.size();i++){
					String info[]=itemInfo.get(i).split(",");
					for(int j=0;j<info.length;j++){
						writer.write(info[j]+"\t\t");
					}
					writer.write("\n");
				}
			}
			writer.write("赠品列表：\n");
			writer.write("标识\t\t\t名称\t\t\t数量\t\t\t\n");
			ArrayList<String> giftInfo=giftData.getGiftListInfo();
			if(giftInfo!=null){
				for(int i=0;i<giftInfo.size();i++){
					String info[]=giftInfo.get(i).split(",");
					for(int j=0;j<info.length;j++){
						writer.write(info[i]+"\t");
					}
					writer.write("\n");
				}
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public boolean hasItem() {
		return itemData.hasItem();
	}


	public ArrayList<String> getItemListSaleInfo() {
		return itemData.getItemListInfo();
	}


	public ArrayList<String> getGiftListInfo() {
		return giftData.getGiftListInfo();
	}


	public boolean pay(String money_num) {
		try{
			pay=Double.parseDouble(money_num);
			payback=pay-(special_price-point/50.0);
			if(payback<0){
				return false;
			}
			return true;
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	public ItemRecord getItemByID(String ID){
		return itemData.getRecordByID(ID);
	}
	
	public ItemRecord getGiftByID(String ID){
		return giftData.getRecordByID(ID);
	}
	
	public static void main(String args[]){
		new SaleRecord("1", "1").printBill();
	}
	public ItemData getItems(){
		return itemData;
	}
	
	public ItemData getGifts(){
		return giftData;
	}
	
}
