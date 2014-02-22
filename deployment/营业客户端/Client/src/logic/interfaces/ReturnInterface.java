package logic.interfaces;
import java.util.ArrayList;


public interface ReturnInterface {
	
	
	
	/**
	 * 
	 */
	public void startReturnItem();
	
	
    /**
     * @param ID
     * @return boolean
     */
    public boolean setSaleID(String ID);
    
    
    /**
     * @return boolean
     */
    public boolean isVIP();

    
    /**
     * @return String 
     */
    public String getVIPPoint();
   
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean returnItem(String ID,String num);
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean removeItem(String ID,String num);
    
    
    
    
    /**
     * 
     */
    public boolean completeReturnItem();
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getSaleItemListInfo();
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getSaleGiftListInfo(); 
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnedItemListInfo();
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnedGiftListInfo(); 
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnItemListInfo();
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnGiftListInfo(); 
    
    
    /**
     * @return String 
     */
    public String getMoneyReturn();


    /**
     * 
     */
    public void printBill();
    
    
    /**
     * 
     */
    public void completeReturn();
}
