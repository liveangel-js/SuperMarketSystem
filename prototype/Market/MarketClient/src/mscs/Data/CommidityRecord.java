package mscs.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommidityRecord extends Record{
    private String descri;
    private double price;
    private double specPrice;
    private Date specStart;
    private Date specEnd;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public CommidityRecord(int id,String desc,double p,double sp,String s,String e){
        this.id = id;
        descri = desc;
        price = p;
        specPrice = sp;
        try {
            specStart = dateFormat.parse(s);
            specEnd = dateFormat.parse(e);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public int getGid() {
        return this.id;
    }

    public void setGid(int gid) {
        this.id = gid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getSpecStart() {
        return specStart;
    }

    public void setSpecStart(Date sepcStart) {
        this.specStart = sepcStart;
    }

    public Date getSpecEnd() {
        return specEnd;
    }

    public void setSpecEnd(Date specEnd) {
        this.specEnd = specEnd;
    }

    public double getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(double specPrice) {
        this.specPrice = specPrice;
    }
}
