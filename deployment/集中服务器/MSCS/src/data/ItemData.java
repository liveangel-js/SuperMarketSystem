package data;
import java.util.*;


/**
 * @author Administrator
 *
 */
public class ItemData extends Data{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<ItemRecord> list=new ArrayList<ItemRecord>();
	
	
	/**
	 * 
	 */
	public ItemData(){
		list=new ArrayList<ItemRecord>();
	}
	
	
	/**
	 * @param ID
	 * @return ItemRecord
	 */
	public ItemRecord getRecordByID(String ID) {
		if(list==null){
			return null;
		}
		for(int i=0;i<list.size();i++){
			ItemRecord record=list.get(i);
			if(record.getID().equals(ID))
				return record;
		}
		return null;
	}
	
	
	/**
	 * @param record
	 */
	public void addRecord(ItemRecord record){
		String ID=record.getID();
		ItemRecord record_in=getRecordByID(ID);
		if(record_in==null){
			list.add(record);
		}
		else{
			record_in.setNum(record_in.getNum()+record.getNum());
			record_in.calculateTotalPrice();
		}
	}
    
    
    /**
     * @param ID
     * @param num
     * @return boolean
     */
    public boolean removeRecord(String ID,String num){
    	try{
        	ItemRecord record=getRecordByID(ID);
        	if(record==null){
        		return false;
        	}
        	int number=Integer.parseInt(num);
        	number=record.getNum()-number;
        	if(number<0){
        		return false;
        	}
        	if(number==0){
        		list.remove(record);
        	}
        	else{
        		record.setNum(number);
        		record.calculateTotalPrice();
        	}
        	return true;
    	}catch(NumberFormatException e){
    		e.printStackTrace();
    		return false;
    	}
    }
    
    
    /**
     * @return boolean
     */
    public boolean hasItem(){
    	return (list!=null)&&(list.size()!=0);
    }
    
    
    /**
     * @return double
     */
    public double getTotalPrice(){
    	double price=0;
    	if(list==null){
    		return 0;
    	}
    	for(int i=0;i<list.size();i++){
    		ItemRecord item=list.get(i);
    		item.calculateTotalPrice();
    		price+=item.getTotalPrice();
    	}
    	return price;
    }
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getItemListInfo(){
    	ArrayList<String> item_list_info=new ArrayList<String>();
    	if(list==null){
    		return null;
    	}
    	for(int i=0;i<list.size();i++){
    		ItemRecord item=list.get(i);
    		item_list_info.add(item.getItemInfo());
    	}
    	return item_list_info;
    }   
    
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getGiftListInfo(){
    	ArrayList<String> item_list_info=new ArrayList<String>();
    	if(list==null){
    		return null;
    	}
    	for(int i=0;i<list.size();i++){
    		ItemRecord item=list.get(i);
    		item_list_info.add(item.getGiftInfo());
    	}
    	return item_list_info;
    }
    public ArrayList<ItemRecord> getItemList(){
    	return list;
    }
}
