package logic.interfaces;
import java.util.ArrayList;


/**
 * @author Administrator
 *
 */
public interface SaleInterface {
	
	
	/**
	 * 
	 */
	public void startSale();
	
	
    /**
     * @param ID
     * @return boolean
     */
    public boolean setVIP(String ID);
    
    
    /**
     * @return boolean
     */
    public boolean isVIP();

    
    /**
     * @return String 
     */
    public String getVIPPoint();
    
    
    /**
     * @param num
     * @return boolean
     */
    public boolean useVIPPoint(String num);
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean addItem(String ID,String num);
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean removeItem(String ID,String num);
    
    
    /**
     * 
     */
    public boolean completeAddItem();
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getItemListInfo();
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getGiftListInfo(); 
    
    
    /**
     * @return String 
     */
    public String getTotalPrice();
    
    
    /**
     * @param money_num
     * @return boolean
     */
    public boolean pay(String money_num);
    
    
    /**
     * @return String
     */
    public String getPayBack();
    
    
    /**
     * 
     */
    public void printBill();
    
    
    /**
     * 
     */
    public void completeSale();
    
    
    public String getSpecialPrice();
}
