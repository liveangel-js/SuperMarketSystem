/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.businessLogic;

import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;

/**
 *
 * @author luhui
 */
public class SaleController implements ISaleController{
    
	private ISaleModel sm;
	
    public ISaleModel getSm() {
		return sm;
	}

	public void setSm(ISaleModel sm) {
		this.sm = sm;
	}

	public SaleController(){
    	sm = new SaleModel();
    }
    
    public MemberRecord getUserInfo(int UID){
    	return sm.getUserInfo(UID);
    }
    
    public CommodityRecord getGoodInfo(int GID){
        return sm.getGoodInfo(GID);
    }
    
    public boolean addItem(int id,String name,double price,int num){
    	try{
    		return sm.addItem(id, name, price, num);
    	}catch(Exception e){
    		return false;
    	}
    }
    public boolean removeItem(String gid){
    	try{		
    		return sm.removeItem(gid);
    	}catch(Exception e){
    		return false;
    	}     
    }
    
    public boolean checkSpecTime(String sTime,String eTime){
        return sm.checkSpecTime(sTime, eTime);
    }
    
    public double buy(){
        return sm.buy();
    }
    
    public boolean startUpdate(){
    	try{		
    		return sm.startUpdate();
    	}catch(Exception e){
    		return false;
    	}
    	
    }
}
