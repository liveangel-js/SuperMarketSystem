package data;
import java.io.Serializable;
import data.VIPData;



/**
 * @author Administrator
 *
 */
public class ShopRecord extends Record implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private ItemData itemData;
	
	private SaleData saleData;
	
	private ReturnData returnData;
	
	private VIPData vipData;
	
	private WorkerData workerData;
	
	
	/**
	 * 
	 */
	public ShopRecord(){
		
	}
	
	
	/**
	 * @return ItemData
	 */
	public ItemData getItemData(){
		return itemData;
	}
	
	
	/**
	 * @param itemData
	 */
	public void setItemData(ItemData itemData){
		this.itemData=itemData;
	}
	
	
	/**
	 * @return SaleData
	 */
	public SaleData getSaleData(){
		return saleData;
	}
	
	
	/**
	 * @param saleData
	 */
	public void setSaleData(SaleData saleData){
		this.saleData=saleData;
	}
	
	
	/**
	 * @return ReturnItemData
	 */
	public ReturnData getReturnItemData(){
		return returnData;
	}
	
	
	/**
	 * @param returnItemData
	 */
	public void setreturnItemData(ReturnData returnData){
		this.returnData=returnData;
	}
	
	
	/**
	 * @return VIPData
	 */
	public VIPData getVIPData(){
		return vipData;
	}
	
	
	/**
	 * @param vipData
	 */
	public void setVIPData(VIPData vipData){
		this.vipData=vipData;
	}
	
	
	/**
	 * @return WorkerData
	 */
	public WorkerData getWorkerData(){
		return workerData;
	}
	
	
	/**
	 * @param workerData
	 */
	public void setWorkerData(WorkerData workerData){
		this.workerData=workerData;
	}
}
