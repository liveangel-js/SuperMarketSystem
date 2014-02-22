package data.promotion;
import java.util.ArrayList;
import data.Data;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class SaleGiftData extends Data {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<SaleGiftRecord>list=new ArrayList<SaleGiftRecord>();
	
	
	/**
	 * 
	 */
	public SaleGiftData(){
		
	}
	
	
	/**
	 * @param record
	 * @return boolean
	 */
	public boolean add(SaleGiftRecord record){
		for(int i=0;i<list.size();i++){
			if(list.get(i).isInterrupted(record)){
				return false;
			}
		}
		list.add(record);
		return true;
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean remove(String ID){
		SaleGiftRecord record=getRecordByID(ID);
		if(record==null){
			return false;
		}
		list.remove(record);
		return true;
	}
	
	
	/**
	 * @param ID
	 * @return SaleGiftRecord
	 */
	public SaleGiftRecord getRecordByID(String ID){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(ID)){
				return list.get(i);
			}
		}
		return null;
	}
	
	
	/**
	 * @return String
	 */
	public String getNextID(){
		for(int i=0;i<list.size();i++){
			if(!list.get(i).getID().equals(i+"")){
				return i+"";
			}
		}
		return list.size()+"";
	}
	
	
	/**
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList() {
		ArrayList<String> infos=new ArrayList<String>();
		for(int i=0;i<list.size();i++){
			infos.add(list.get(i).getInfo());
		}
		return infos;
	}
	
	public void dealSale(SaleRecord sale){
		
	}
	
//	public void setSaleRecord(SaleRecord saleRecord){
//		for(int i=0;i<saleGiftList.size();i++){
//			SaleGiftRecord saleGiftRecord=saleGiftList.get(i);
//		}
//	}
}
