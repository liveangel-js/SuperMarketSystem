package data;

import java.awt.List;
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
	
	public int getItemNumByID(String ID){
		int number=0;
		for(int i=0;i<returnItemData.size();i++){
			ItemRecord item=returnItemData.get(i).getItemByID(ID);
			if(item!=null){
				number+=item.getNum();
			}
		}
		return number;
	}
	
	
	
	public ReturnData getReturnsBySaleID(String ID){
		ReturnData returns=new ReturnData();
		for(int i=0;i<returnItemData.size();i++){
			returnItemData.get(i).getSaleID().equals(ID);
			returns.addReturnItemRecord(returnItemData.get(i));
		}
		return returns;
	}
	
	public ArrayList<String>getItemInfo(){
		ArrayList<String>infos=new ArrayList<String>();
		for(int i=0;i<returnItemData.size();i++){
			infos.addAll(returnItemData.get(i).getItemListInfo());
		}
		return infos;
	}
	
	public ArrayList<String>getGiftInfo(){
		ArrayList<String>infos=new ArrayList<String>();
		for(int i=0;i<returnItemData.size();i++){
			infos.addAll(returnItemData.get(i).getGiftListInfo());
		}
		return infos;
	}
}
