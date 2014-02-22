package data;
import java.util.ArrayList;


public class SaleData extends Data {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<SaleRecord>saleList=new ArrayList<SaleRecord>();
	
	
	/**
	 * 
	 */
	public SaleData(){
		
	}
	
	
	/**
	 * @param ID
	 * @return SaleRecord
	 */
	public SaleRecord getSaleRecordByID(String ID){
		for(int i=0;i<saleList.size();i++){
			SaleRecord sale=saleList.get(i);
			if(sale.getID().equals(ID))
				return sale;
		}
		return null;
	}
	
	
	/**
	 * @param sale
	 */
	public void addSaleRecord(SaleRecord sale){
		saleList.add(sale);
	}
	
	
	/**
	 * @param sale
	 */
	public void removeSaleRecord(SaleRecord sale){
		saleList.remove(sale);
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean removeSaleRecord(String ID){
		SaleRecord sale=this.getSaleRecordByID(ID);
		if(sale==null){
			return false;
		}
		else{
			saleList.remove(sale);
			return true;
		}
	}
}
