package Data;

import java.io.Serializable;

public class VIP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String name;
	private String telNumber;
	private int totalPoint;
	private int availablePoint;
	public VIP(){
		
	}
	
	public VIP(int ID,String name,String telNumber,int totalPoint,int availablePoint){
		this.ID=ID;
		this.name=name;
		this.telNumber=telNumber;
		this.totalPoint=totalPoint;
		this.availablePoint=availablePoint;
	}
	public int getID(){
		return ID;
	}
	public void setID(int ID){
		this.ID=ID;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getTelNum(){
		return telNumber;
	}
	public void setTelNum(String telNumber){
		this.telNumber=telNumber;
	}
	public int getTotalPoint(){
		return totalPoint;
	}
	public void setTotalPoint(int totalPoint){
		this.totalPoint=totalPoint;
	}
	public int getAvailablePoint(){
		return availablePoint;
	}
	public void setAvailablePoint(int availablePoint){
		this.availablePoint=availablePoint;
	}
}
