package data;

import java.io.Serializable;

public class VIPRecord extends Record implements Serializable{
	private static final long serialVersionUID = 1L;
//	enum Sex{MALE,FEMALE};
	private String name;
	private String birthDate;
	private String sex;
	private long telephone;
	private int valid_point;
	private int total_point;
//	private int shopNumber;
	
//	public VIPRecord(){
//		
//	}
	public VIPRecord(String ID,String name,String birthDate,String sex,long telephone,int valid_point,int total_point,int shopNumber){
		this.ID=ID;
		this.name=name;
		this.birthDate=birthDate;
		this.sex=sex;
		this.telephone=telephone;
		this.valid_point=valid_point;
		this.total_point=total_point;
//		this.shopNumber = shopNumber;
		
	}
	
//	public void setvalid_point(int valid_point) {
//		this.valid_point = valid_point;
//	}
	
	
//	public void settotal_point(int total_point) {
//		this.total_point = total_point;
//	}
	@Override
	public String toString() {
		return ID+","+name+","+birthDate+","+sex+","+telephone+","+valid_point+","+total_point;
	}
//	public int getShopNumber() {
//		return shopNumber;
//	}
//	public void setShopNumber(int shopNumber) {
//		this.shopNumber = shopNumber;
//	}
	public int getValid_point() {
		return valid_point;
	}
	public void setValid_point(int valid_point) {
		this.valid_point = valid_point;
	}
	public int getTotal_point() {
		return total_point;
	}
	public void setTotal_point(int total_point) {
		this.total_point = total_point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	
	
	

}
