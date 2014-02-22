package data.promotion;
import java.util.ArrayList;
import data.Data;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class SaleDiscountData extends Data{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<SaleDiscountRecord> list=new ArrayList<SaleDiscountRecord>();
	
	
	/**
	 * @param record
	 * @return boolean
	 */
	public boolean add(SaleDiscountRecord record){
		for(int i=0;i<list.size();i++){
			if(list.get(i).isInterrupted(record)){
				System.out.println("在期间内有相同额度的特价\n");
				return false;
			}
		}
		list.add(record);
		return true;
	}
	
	
	/**
	 * @param id
	 * @return boolean
	 */
	public boolean remove(String  id){
		SaleDiscountRecord record=getRecordByID(id);
		if(record==null){
			return false;
		}
		list.remove(record);
		return true;
	}
	
	
	/**
	 * @param ID 
	 * @return SaleDiscountRecord
	 */
	public SaleDiscountRecord getRecordByID(String ID){
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
		double price=0;
		SaleDiscountRecord discount=null;
		for(int i=0;i<list.size();i++){
			if(sale.getTotalPrice()>=list.get(i).getPrice()&&list.get(i).getPrice()>=price&&list.get(i).isDuringTime()){
				discount=list.get(i);
			}
		}
		if(discount!=null){
			discount.dealSale(sale);
		}
	}
}
