package data;

import java.util.ArrayList;

public class ReturnData extends Data {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ReturnRecord>returnItemData=new ArrayList<ReturnRecord>();
	
	
	/**
	 * 
	 */
	public ReturnData(){
		
	}
	
	
	/**
	 * @param ID
	 * @return ReturnItemRecord
	 */
	public ReturnRecord getReturnItemRecordByID(String ID){
		for(int i=0;i<returnItemData.size();i++){
			ReturnRecord returnRecord=returnItemData.get(i);
			if(returnRecord.getID().equals(ID))
				return returnRecord;
		}
		return null;
	}
	
	/**
	 * @param returnRecord
	 */
	public void addReturnItemRecord(ReturnRecord returnRecord){
		returnItemData.add(returnRecord);
	}
	
	
	/**
	 * @param returnRecord
	 */
	public void removeReturnItemRecord(ReturnRecord returnRecord){
		returnItemData.remove(returnRecord);
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean removeReturnItemRecord(String ID){
		ReturnRecord returnRecord=this.getReturnItemRecordByID(ID);
		if(returnRecord==null){
			return false;
		}
		else{
			returnItemData.remove(returnRecord);
			return true;
		}
	}
	
	public ItemRecord getItemByID(String ID){
		return null;
	}
	
	
	public ArrayList<String>getItemInfo(){
		return null;
	}
	
	public ArrayList<String>getGiftInfo(){
		return null;
	}
}
