package Data;

import java.io.Serializable;

public class Worker implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String name;
	private String username;
	private String password;
	private String position;
	static String GENERALMANAGER="总经理";
	static String BRANCHMANAGER="分店经理";
	static String CASHIER="收银员";
	

	public Worker(int ID,String name,String username,String password,String position ){
		this.set(ID, name, username, password, position);
	}
	public void set(int ID,String name,String username,String password,String position){
		this.ID=ID;
		this.name=name;
		this.username=username;
		this.password=password;
		this.position=position;
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
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position=position;
	}
}
