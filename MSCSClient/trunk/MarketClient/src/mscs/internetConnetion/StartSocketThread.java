/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.internetConnetion;

import mscs.businessLogic.ISaleController;
import mscs.businessLogic.SaleController;

/**
 *
 * @author luhui
 */
public class StartSocketThread extends Thread{  
	ISaleController sc ;
    public StartSocketThread(ISaleController s){
    	sc = s;
    }
    
    @Override
    public void run(){
        sc.startUpdate();
    }
}
