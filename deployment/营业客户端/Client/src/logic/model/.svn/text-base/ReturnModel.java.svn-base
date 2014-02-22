package logic.model;
import java.util.ArrayList;
import java.util.Calendar;

import logic.controller.Controller;

import net.Command;
import net.Connection;
import data.ItemRecord;
import data.ReturnData;
import data.ReturnRecord;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class ReturnModel {
	
	private ReturnRecord returnRecord;
	
	private SaleRecord sale;
	
	private ReturnData returns;
	

	
	
	/**
	 * 
	 */
	public void startReturnItem(){
		
	}
	
	
    /**
     * @param ID
     * @return boolean
     */
    public boolean setSaleID(String ID){
    	returnRecord=new ReturnRecord();
    	returnRecord.setTime(Calendar.getInstance());
    	returnRecord.setCashierID(Controller.cashier_id);

    	sale=null;
    	returns=null;
    	Object []para={ID};
    	Command command=new Command("RETURN","GETSALERECORDBYID",para);
    	Connection.out(command);
    	command=Connection.in();
    	sale= (SaleRecord) command.getResult();
    	if(sale!=null){
    		returnRecord.setSaleID(ID);
        	command=new Command("RETURN","GETRETURNDATABYID",para);
        	Connection.out(command);
        	command=Connection.in();
        	returns=(ReturnData) command.getResult();
        	if(returns==null)returns=new ReturnData();
    		return true;
    	}
    	return false;
    }
    
    
    /**
     * @return boolean
     */
    public boolean isVIP(){
    	return sale.getVipID()!=null;
    }

    
    /**
     * @return String 
     */
    public String getVIPPoint(){
    	return null;
    }
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean returnItem(String ID,String num){
    	try{
    		int number=Integer.parseInt(num);
        	ItemRecord item=sale.getItemByID(ID);
        	if(item==null)return false;
        	int returnedNum=returns.getItemNumByID(ID);
        	int last=item.getNum()-returnedNum-number;
        	if(returnRecord.getItemByID(ID)!=null){
        		last-=returnRecord.getItemByID(ID).getNum();
        	}
        	if(last<0){
        		return false;
        	}
        	ItemRecord returnItem=new ItemRecord(item);
        	returnItem.setNum(number);
        	returnRecord.addItem(returnItem);
        	return true;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    }
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean removeItem(String ID,String num){
    	return returnRecord.removeItem(ID, num);
    }
    
    
    /**
     * 
     */
    public boolean completeReturnItem(){
    	if(!returnRecord.hasItem()){
    		return false;
    	}
    	Object para[]={returnRecord};
    	Command command=new Command("RETURN", "DEALSALE", para);
    	Connection.out(command);
    	command=Connection.in();
    	returnRecord=(ReturnRecord) command.getResult();
    	if((returnRecord.getMoneyReturn()+1)<1e-7){
    		return false;
    	}
    	return true;
    }
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getSaleItemListInfo(){
    	return sale.getItemListSaleInfo();
    }
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getSaleGiftListInfo(){
    	return sale.getGiftListInfo();
    }
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnedItemListInfo(){
    	return returns.getItemInfo();
    }
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnedGiftListInfo(){
    	return returns.getGiftInfo();
    }
    
    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnItemListInfo(){
    	return returnRecord.getItemListInfo();
    }
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getReturnGiftListInfo(){
    	return returnRecord.getGiftListInfo();
    }
    
    
    /**
     * @return String 
     */
    public String getMoneyReturn(){
    	return returnRecord.getMoneyReturn()+"";
    }

    
    /**
     * 
     */
    public void printBill(){
    	returnRecord.printBill();
    }
    
    
    /**
     * 
     */
    public void completeReturn(){
    	printBill();
    	Object para[]={returnRecord};
    	Command command=new Command("RETURN", "COMPLETERETURN", para);
    	Connection.out(command);
    	command=Connection.in();
    }
}
