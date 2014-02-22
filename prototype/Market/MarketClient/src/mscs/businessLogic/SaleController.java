/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.businessLogic;

import mscs.Data.CommidityRecord;
import mscs.Data.MemberRecord;

/**
 *
 * @author luhui
 */
public class SaleController {
    
	private SaleModel sm;
	
    public SaleController(){
    	sm = new SaleModel();
    }
    
    public MemberRecord getUserInfo(int UID){
    	return sm.getUserInfo(UID);
    }
    
    public CommidityRecord getGoodInfo(int GID){
        return sm.getGoodInfo(GID);
    }
    
    public void addItem(int id,String name,double price,int num){
        sm.addItem(id, name, price, num);
    }
    public void removeItem(String gid){
        sm.removeItem(gid);
    }
    
    public boolean checkSpecTime(String sTime,String eTime){
        return sm.checkSpecTime(sTime, eTime);
    }
    
    public double buy(){
        return sm.buy();
    }
    
    public void startUpdate(){
    	sm.startUpdate();
    }
}
