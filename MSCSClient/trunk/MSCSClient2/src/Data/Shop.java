package Data;
import java.util.ArrayList;
import java.io.Serializable;


public class Shop implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Admin admin=new Admin("123","123");
	private ArrayList<Worker>workerList=new ArrayList<Worker>();
	private ArrayList<VIP>vipList=new ArrayList<VIP>();
	private ArrayList<Sale>saleList=new ArrayList<Sale>();
	private ArrayList<Item>itemList=new ArrayList<Item>();
	private ArrayList<Gift>giftList=new ArrayList<Gift>();
	private ArrayList<Policy>policyList=new ArrayList<Policy>();
	
	
	public Admin getAdmin(){
		return admin;
	}
	public ArrayList<Worker>getWorkerList(){
		return workerList;
	}
	public ArrayList<VIP>getVipList(){
		return vipList;
	}
	public ArrayList<Sale>getSaleList(){
		return saleList;
	}
	public ArrayList<Item>getItemList(){
		return itemList;
	}
	public ArrayList<Gift>giftList(){
		return giftList;
	}
	public ArrayList<Policy>getPlicyList(){
		return policyList;
	}
}
