/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.businessLogic;

/**
 *
 * @author luhui
 */
public class SaleItem {
    private int sid;
    private String sname;
    private double sprice;
    private int snum;
    
    public SaleItem(){
        
    }
    
    public SaleItem(int id,String name,double price,int num){
        sid = id;
        sname = name;
        sprice = price;
        snum = num;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }
    
    
}
