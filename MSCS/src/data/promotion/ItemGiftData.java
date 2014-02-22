package data.promotion;
import java.util.ArrayList;
import data.Data;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class ItemGiftData extends Data{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private ArrayList<ItemGiftRecord>list=new ArrayList<ItemGiftRecord>();
	
	
	/**
	 * @param record
	 * @return boolean
	 */
	public boolean add(ItemGiftRecord record){
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
		ItemGiftRecord record=getRecordByID(ID);
		if(record==null){
			return false;
		}
		list.remove(record);
		return true;
	}
	
	
	/**
	 * @param ID
	 * @return ItemGiftRecord
	 */
	public ItemGiftRecord getRecordByID(String ID){
		for(int i=0;i<list.size();i++){
			ItemGiftRecord record=list.get(i);
			if(record.getID().equals(ID)){
				return record;
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
}
