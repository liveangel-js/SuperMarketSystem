package data.promotion;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public class SaleDiscountRecord extends Promotion {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double price;
	
	private double discount;
	
	
	
	/**
	 * 
	 */
	public SaleDiscountRecord(){
		
	}
	

	/**
	 * @param discount
	 * @return boolean
	 */
	public boolean isInterrupted(SaleDiscountRecord discount){
		return price==discount.price&&isCrossed(discount);
	}
	
	
	@Override
	public String getInfo(){
		// TODO Auto-generated method stub
		String info=ID+","+price+","+discount+","+getStartTime()+","+getEndTime();
		return info;
	}
	
	
	@Override
	public void dealSale(SaleRecord sale) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * @param price
	 * @param discount
	 * @param start
	 * @param end
	 * @return boolean
	 */
	public boolean set(String price,String discount,String start,String end){
		try{
			this.price=Double.parseDouble(price);
			this.discount=Double.parseDouble(discount);
			if(this.price<=0||this.discount<=0||this.discount>10){
				return false;
			}
			return setTime(start, end);
		}catch(NumberFormatException e){
			e.printStackTrace();
			return false;
		}
	}
}
