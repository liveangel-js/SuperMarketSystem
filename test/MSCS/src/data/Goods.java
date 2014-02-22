package data;

public class Goods extends Record{

	private static final long serialVersionUID = 1L;
	
	private static final int IDLENGTH=5;
	
	private String name;
	
	private double price;
	
	
	public Goods(String ID,String name,double price){
		this.ID=ID;
		this.name=name;
		this.price=price;
	}
	
	
	public String getName(){
		return name;
	}
	
	
	public double getPrice(){
		return price;
	}
	
	
	public String getGoodsInfo(){
		return ID+","+name+","+price;
	}
	
	public String getGiftInfo(){
		return ID+","+name;
	}
	/**
	 * @param ID
	 * @return boolean 
	 */
	public boolean setID(String ID){
		if(ID.length()!=IDLENGTH){
			return false;
		}
		this.ID=ID;
		return true;
	}
}
