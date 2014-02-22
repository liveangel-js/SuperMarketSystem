package logic.model;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.GoodsData;
import data.Shop;
import data.VIPData;
import data.VIPRecord;

public class VipManageModel {
	private VIPData vip_data;
	private int tempNum;
	public VipManageModel(){
		vip_data = getData();
		tempNum = vip_data.getvipNum();
		System.out.println(tempNum);
	}
	public int getNum(){
		int temp = tempNum;
		
		return temp;
	}
	public void addNewNum(){
		tempNum++;
	}
	public boolean deleteVip(String ID){
		return vip_data.removeVip(ID);
		
	}
	private VIPData getData(){
		if((VIPData)DataReader.read(Data.VIPS)==null){
			VIPData temp =  new VIPData();
			writeData();
			System.out.println("new VIPDATA");
			return temp;
		}else{
			return (VIPData)DataReader.read(Data.VIPS);
		}
	}
//	public void addVip(String s){
//		vip_data.addVip(record)
//	}
	public void writeData(){
		DataWriter.write(vip_data, Data.VIPS);
	}
	public void addVip(String []s){
		if(s==null) return;
		for(int i=0;i<s.length;i++){
			System.out.println("VIP大小"+s.length);
			addVip(s[i]);
			vip_data.addNum();
			System.out.println(vip_data.getvipNum());
		}
	}
//	public void writeData(String []s){
//		DataWriter.write(vip_data, Data.VIPS);
//		
//	}
	public void addVip(String s){
		System.out.println(s);
		String [] temp = s.split(",");
		VIPRecord tempVip = new VIPRecord(temp[0], temp[1], temp[2], temp[3], Long.parseLong(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), 0);
		vip_data.addVip(tempVip);
		
	}
	public Object[][] getVipTable(){
		return vip_data.getTable();
	}

}
