package data.promotion;
import java.util.ArrayList;
import data.Data;
import data.ItemRecord;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class ItemDiscountData extends Data {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ItemDiscountRecord> list=new ArrayList<ItemDiscountRecord>();
	
	
	/**
	 * 
	 */
	public ItemDiscountData(){
		list=new ArrayList<ItemDiscountRecord>();
	}
	

	/**
	 * @param record
	 * @return boolean
	 */
	public boolean add(ItemDiscountRecord record){
		for(int i=0;i<list.size();i++){
			if(list.get(i).isInterrupted(record)){
				return false;
			}
		}
		list.add(Integer.parseInt(record.getID()), record);
		return true;
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean remove(String ID){
		ItemDiscountRecord record=getRecordByID(ID);
		if(record==null){
			return false;
		}
		list.remove(record);
		return true;
	}
	
	
	/**
	 * @param ID
	 * @return ItemDiscountRecord
	 */
	public ItemDiscountRecord getRecordByID(String ID){
		for(int i=0;i<list.size();i++){
			ItemDiscountRecord record=list.get(i);
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
	 * @param itemData
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getPromotionList(){
		ArrayList<String> infos=new ArrayList<String>();
		if(list==null){
			return infos;
		}
		for(int i=0;i<list.size();i++){
			ItemDiscountRecord discount=list.get(i);
			String info=discount.getInfo();
			infos.add(info);
		}
		return infos;
	}
	
	
	public void dealSale(SaleRecord sale){
		for(int i=0;i<list.size();i++){
			
		}
	}
	
	public void dealItem(ItemRecord item){
		if(list==null){
			return;
		}
		for(int i=0;i<list.size();i++){
			ItemDiscountRecord discount=list.get(i);
			discount.dealItem(item);
		}
	}
}