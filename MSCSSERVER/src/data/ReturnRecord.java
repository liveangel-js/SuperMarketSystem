package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author Administrator
 *
 */
public class ReturnRecord extends Record{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Calendar time;
	
	private String shop_id;
	
	private String cashier_id;
	
	private String sale_id;
	
	private ItemData itemData=new ItemData();
	
	private ItemData giftData=new ItemData();
	
	private double money_return;
	
	
	/**
	 * 
	 */
	public ReturnRecord(){
		time=Calendar.getInstance();
	}
	
	
	/**
	 * @return Calendar
	 */
	public Calendar getTime(){
		return time;
	}
	
	
	/**
	 * 
	 */
	public void setTime(Calendar time){
		this.time=time;
	}
	
	
	/**
	 * @return String
	 */ 
	public String getShopID(){
		return shop_id;
	}
	
	
	/**
	 * @param shop_id
	 */
	public void setShopID(String shop_id){
		this.shop_id=shop_id;
	}
	
	
	/**
	 * @return String
	 */
	public String getCashierID(){
		return cashier_id;
	}
	
	
	/**
	 * @param cashier_id
	 */
	public void setCashierID(String cashier_id){
		this.cashier_id=cashier_id;
	}
	
	
	/**
	 * @return String
	 */
	public String getSaleID(){
		return sale_id;
	}
	
	
	/**
	 * @param cashier_id
	 */
	public void setSaleID(String sale_id){
		this.sale_id=sale_id;
	}
	
	
	/**
	 * @return ItemData
	 */
	public ItemData getItemData(){
		return itemData;
	}
	
	
	/**
	 * @param itemData
	 */
	public void setItemData(ItemData itemData){
		this.itemData=itemData;
	}
	

	/**
	 * @return ItemData
	 */
	public ItemData getGiftData(){
		return giftData;
	}
	
	
	/**
	 * @param giftData
	 */
	public void setGiftData(ItemData giftData){
		this.giftData=giftData;
	}
	
	
	/**
	 * @return double
	 */
	public double getMoneyReturn(){
		return money_return;
	}
	
	
	/**
	 * @param money_return
	 */
	public void setMoneyReturn(double money_return){
		this.money_return=money_return;
	}
	
	
	public boolean removeItem(String ID,String num){
		return itemData.removeRecord(ID,num);
	}
	
	public void addItem(ItemRecord item){
		itemData.addRecord(item);
	}
	
	
	public ArrayList<String> getItemListInfo() {
		return itemData.getItemListInfo();
	}
	public ArrayList<String> getGiftListInfo() {
		return giftData.getGiftListInfo();
	}
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public void printBill(){
		try {
			String string_time=time.get(Calendar.YEAR)+"-"+time.get(Calendar.MONTH)+"-"+time.get(Calendar.DAY_OF_MONTH)+" "+time.get(Calendar.HOUR_OF_DAY)+"-"+time.get(Calendar.MINUTE)+"-"+time.get(Calendar.SECOND)+".txt";
			File file = new File("bills/"+string_time);
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			String string_shop="店铺号:"+shop_id+"\n";
			writer.write(string_shop);
			String string_cashier="收银员编号:"+cashier_id+"\n";
			writer.write(string_cashier);
			String string_sale_id="账单编号:"+sale_id+"\n";
			writer.write(string_sale_id);
			String string_return_id="退单编号:"+ID+"\n";
			writer.write(string_return_id);
			writer.write("退货商品列表：\n");
			writer.write("标识\t名称\t价格\t特价\t数量\t总价\t：\n");
			ArrayList<String> itemInfo=itemData.getItemListInfo();
			if(itemInfo!=null){
				for(int i=0;i<itemInfo.size();i++){
					String info[]=itemInfo.get(i).split(",");
					for(int j=0;j<info.length;j++){
						writer.write(info[i]+"\t");
					}
					writer.write("\n");
				}
			}
			writer.write("退货赠品列表：\n");
			writer.write("标识\t名称\t数量\t：\n");
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
}
