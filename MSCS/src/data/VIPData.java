package data;

import java.util.ArrayList;


public class VIPData extends Data{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<VIPRecord> vipList=new ArrayList<VIPRecord>();
	
	
	/**
	 * 
	 */
	public VIPData(){
		
	}
	
	
	/**
	 * @param ID
	 * @return VIPRecord
	 */
	public VIPRecord getVIPByID(String ID){
		for(int i=0;i<vipList.size();i++){
			VIPRecord vip=vipList.get(i);
			if(vip.getID().equals(ID))
				return vip;
		}
		return null;
	}
	
	
	/**
	 * @param vip
	 */
	public void addVIP(VIPRecord vip){
		vipList.add(vip);
	}
	
	
	/**
	 * @param vip
	 * @return boolean
	 */
	public boolean removeVIP(VIPRecord vip){
		return vipList.remove(vip);
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean removeVIP(String ID){
		VIPRecord vip=this.getVIPByID(ID);
		if(vip!=null){
			vipList.remove(vip);
			return true;
		}
		return false;
	}
}
