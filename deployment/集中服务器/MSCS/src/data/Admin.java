package data;

import data.promotion.ItemDiscountData;
import data.promotion.ItemGiftData;
import data.promotion.SaleDiscountData;
import data.promotion.SaleGiftData;


/**
 * @author Administrator
 *
 */
public class Admin extends Data{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	
	/**
	 * 
	 */
	public Admin(){

	}
	
	
	/**
	 * @param name
	 * @param password
	 */
	public Admin(String name,String password){
		this();
		this.set(name, password);
	}
	
	
	/**
	 * @param username
	 * @param password
	 */
	public void set(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	
	/**
	 * @return String 
	 */
	public String getUsername(){
		return username;
	}
	
	
	/**
	 * @param username
	 */
	public void setUserName(String username){
		this.username=username;
	}
	
	
	/**
	 * @return String 
	 */
	public String getPassword(){
		return password;
	}
	
	
	/**
	 * @param password
	 */
	public void setPassword(String password){
		this.password=password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		DataWriter.write(new ItemDiscountData(), Data.ITEMDISCOUNTS);
		DataWriter.write(new ItemGiftData(), Data.ITEMGIFTS);
		DataWriter.write(new SaleDiscountData(), Data.SALEDISCOUNTS);
		DataWriter.write(new SaleGiftData(), Data.SALEGIFTS);
		DataWriter.write(new SaleData(), Data.SALES);
		DataWriter.write(new ReturnData(), Data.RETURNS);
	}
}
