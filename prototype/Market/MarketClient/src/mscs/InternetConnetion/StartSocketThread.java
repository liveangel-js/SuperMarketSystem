/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.InternetConnetion;

import mscs.businessLogic.SaleController;

/**
 *
 * @author luhui
 */
public class StartSocketThread extends Thread{  
	SaleController sc ;
    public StartSocketThread(SaleController s){
    	sc = s;
    }
    
    @Override
    public void run(){
        sc.startUpdate();
    }
}
