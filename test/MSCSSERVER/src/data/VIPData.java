package data;

import java.util.ArrayList;

public class VIPData extends Data{
	private static final long serialVersionUID = 1L;
	private int vipNum =0;
	ArrayList<VIPRecord> vipList=new ArrayList<VIPRecord>();
	public VIPData(){
		
	}
	public int getvipNum(){
		Shop temp = (Shop)DataReader.read(Data.SHOPNUMBER);
		
		return (temp.getShopNumber()*1000)+vipNum;
	}
	public void addNum(){
		vipNum++;
	}
	public void addVip(VIPRecord record){
		vipList.add(record);
	}
	public VIPRecord getVipByID(String ID){
		if(vipList.size()==0) return null;
		for(int i=0;i<vipList.size();i++){
			if(vipList.get(i).getID().equals(ID)) return vipList.get(i);
		}
		return null;
	}
	public boolean removeVip(String ID){
		for(int i=0;i<vipList.size();i++){
			if(vipList.get(i).getID().equals(ID)){
				vipList.remove(i);return true;
			}
		}
		
		return false;
		
	}
	public Object[][] getTable(){
		Object[][] object = new Object[vipList.size()][3];
		for(int i=0;i<vipList.size();i++){
			object[i] = vipList.get(i).toString().split(",");
		}
		
		return object;
		
	}

}
