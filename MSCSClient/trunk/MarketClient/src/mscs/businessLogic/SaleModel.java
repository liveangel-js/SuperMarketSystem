package mscs.businessLogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import mscs.data.CommodityData;
import mscs.data.CommodityRecord;
import mscs.data.MemberData;
import mscs.data.MemberRecord;

public class SaleModel implements ISaleModel{
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
    private MemberData mdata;
    private CommodityData cdata;
	
	private ArrayList<SaleItem> saleList = new ArrayList<SaleItem>();
	
    public ArrayList<SaleItem> getSaleList() {
		return saleList;
	}

	public void setSaleList(ArrayList<SaleItem> saleList) {
		this.saleList = saleList;
	}

	
    
    public MemberData getMdata() {
		return mdata;
	}

	public void setMdata(MemberData mdata) {
		this.mdata = mdata;
	}

	public CommodityData getCdata() {
		return cdata;
	}

	public void setCdata(CommodityData cdata) {
		this.cdata = cdata;
	}

	public SaleModel(){
		mdata = new MemberData();
        cdata = new CommodityData();
	}
	
	public MemberRecord getUserInfo(int UID){
    	MemberRecord mr = (MemberRecord) mdata.readDataByID(UID);
    	return mr;
    }
    
    public CommodityRecord getGoodInfo(int GID){
        CommodityRecord cr = (CommodityRecord) cdata.readDataByID(GID);
        return cr;
    }
    
    public boolean addItem(int id,String name,double price,int num){
    	try{
	        SaleItem s = new SaleItem(id,name,price,num);
	        saleList.add(s);
	        return true;
    	}catch(Exception e){
    		return false;
    	}
    }
    public boolean removeItem(String gid){
    	try{
	        int GID = Integer.parseInt(gid);
	        for(SaleItem s:saleList){
	            if(s.getSid()==GID){
	                saleList.remove(s);
	                break;
	            }
	        }
	        return true;
    	}catch(Exception e){
    		return false;
    	}
    }
    
    public boolean removeAllItems(){
    	try{
    		saleList.clear();
    		return true;
    	}catch(Exception e){
    		return false;
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
    
    public boolean startUpdate(){
    	try{
    		cdata.startUpdate();
    		return true;
    	}catch(Exception e){
    		return false;
    	}
    }
}
