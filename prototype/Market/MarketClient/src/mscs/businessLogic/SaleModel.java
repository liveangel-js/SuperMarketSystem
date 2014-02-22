package mscs.businessLogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import mscs.Data.CommidityData;
import mscs.Data.CommidityRecord;
import mscs.Data.MemberData;
import mscs.Data.MemberRecord;

public class SaleModel {
	
	private ArrayList<SaleItem> saleList = new ArrayList<SaleItem>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private MemberData mdata;
    private CommidityData cdata;
	
	public SaleModel(){
		mdata = new MemberData();
        cdata = new CommidityData();
	}
	
	public MemberRecord getUserInfo(int UID){
    	MemberRecord mr = (MemberRecord) mdata.readDataByID(UID);
    	return mr;
    }
    
    public CommidityRecord getGoodInfo(int GID){
        CommidityRecord cr = (CommidityRecord) cdata.readDataByID(GID);
        return cr;
    }
    
    public void addItem(int id,String name,double price,int num){
        SaleItem s = new SaleItem(id,name,price,num);
        saleList.add(s);
    }
    public void removeItem(String gid){
        int GID = Integer.parseInt(gid);
        for(SaleItem s:saleList){
            if(s.getSid()==GID){
                saleList.remove(s);
                break;
            }
        }
    }
    
    public boolean checkSpecTime(String sTime,String eTime){
        Date s = null;
        Date e = null;
        try {
            s = dateFormat.parse(sTime);
            e = dateFormat.parse(eTime);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        Date n = new Date();
        if(n.after(s) && n.before(e) || n.equals(s) || n.equals(e)){
            System.out.println("特价时间");
            return true;
        }
        return false;
    }
    
    public double buy(){
        double sum = 0;
        for(SaleItem s : saleList){
            sum += s.getSprice() * s.getSnum();
        }
        return sum;
    }
    
    public void startUpdate(){
    	cdata.startUpdate();
    }
}
