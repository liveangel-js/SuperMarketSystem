package data;


/**
 * @author Administrator
 *
 */
public class ItemRecord extends Record {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private double price;
	
	private double special_price;
	
	private int number;

	private double total_price;
	
	
	/**
	 * 
	 */
	public ItemRecord(){
		
	}

	
	public ItemRecord(Goods good){
		ID=good.getID();
		name=good.getName();
		price=good.getPrice();
		special_price=good.getPrice();
		calculateTotalPrice();
	}
	
	
	public ItemRecord(ItemRecord item){
		ID=item.ID;
		name=item.name;
		price=item.price;
		special_price=item.special_price;
		number=item.number;
		total_price=item.total_price;
	}
	
	public void setSpecialPrice(double special_price){
		this.special_price=special_price;
	}
	
	
	/**
	 * @return int
	 */
	public int getNum(){
		return number;
	}
	
	
	/**
	 * @param number
	 * @return boolean
	 */
	public boolean setNum(int number){
		if(number<=0){
			return false;
		}
		this.number=number;
		this.calculateTotalPrice();
		return true;
	}
	
	
	/**
	 * @param number
	 * @return boolean
	 */
	public boolean setNum(String number){
		try{
			return setNum(Integer.parseInt(number));
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * @return double
	 */
	public double getTotalPrice(){
		this.calculateTotalPrice();
		return total_price;
	}
		
	
	/**
	 * @return double
	 */
	public void calculateTotalPrice(){
		total_price=number*special_price;
	}
	
	
	/**
	 * @return String
	 */
	public String getItemInfo(){
		String info=ID+","+name+","+price+","+special_price+","+number+","+total_price;
		return info;
	}
	
	
	/**
	 * @return String
	 */
	public String getGiftInfo(){
		String info=ID+","+name+","+number;
		return info;
	}	
	
//	public ItemRecord(String ID,String name,double price,double special,int num,double total){
//		this.ID=ID;
//		this.name=name;
//		this.price=price;
//		this.special_price=special;
//		this.number=num;
//		this.total_price=total;
//	}
}
