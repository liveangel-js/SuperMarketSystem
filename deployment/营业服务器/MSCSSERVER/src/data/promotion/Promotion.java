package data.promotion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import data.Record;
import data.SaleRecord;


/**
 * @author Administrator
 *
 */
public abstract class Promotion extends Record {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Calendar start_time;
	
	Calendar end_time;
	
	
	/**
	 * @return String
	 */
	public String getStartTime(){
		SimpleDateFormat   sdf   =   new   SimpleDateFormat( "yyyy-MM-dd"); 
		String   time   =   sdf.format(start_time.getTime()); 
		return time;
	}
	
	
	/**
	 * @return String
	 */
	public String getEndTime(){
		SimpleDateFormat   sdf   =   new   SimpleDateFormat( "yyyy-MM-dd"); 
		String   time   =   sdf.format(end_time.getTime()); 
		return time;
	}
	
	
	/**
	 * @param time
	 * @return boolean
	 */
	public boolean setStartTime(String time){
		try{
			String t[]=time.split("-");
			start_time=Calendar.getInstance();
			start_time.set(Calendar.YEAR,Integer.parseInt(t[0]));
			start_time.set(Calendar.MONTH,Integer.parseInt(t[1])-1);
			start_time.set(Calendar.DAY_OF_MONTH,Integer.parseInt(t[2]));
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * @param time
	 * @return boolean
	 */
	public boolean setEndTime(String time){
		try{
			String t[]=time.split("-");
			end_time=Calendar.getInstance();
			end_time.set(Calendar.YEAR,Integer.parseInt(t[0]));
			System.out.print(Integer.parseInt(t[0])+"\n");
			end_time.set(Calendar.MONTH,Integer.parseInt(t[1])-1);
			System.out.print(Integer.parseInt(t[1])-1+"\n");
			end_time.set(Calendar.DAY_OF_MONTH,Integer.parseInt(t[2]));
			System.out.print(Integer.parseInt(t[2])+"\n");
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}	
	}
	
	
	/**
	 * @param start
	 * @param end
	 * @return
	 */
	public boolean setTime(String start,String end){
		try{
			start_time=Calendar.getInstance();
			end_time=Calendar.getInstance();
			SimpleDateFormat sdf=new   SimpleDateFormat( "yyyy-MM-dd"); 
			Date date =sdf.parse(start);
			start_time.setTime(date);
			date=sdf.parse(end);
			end_time.setTime(date);
			return start_time.before(end_time)&&end_time.after(Calendar.getInstance());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * @return boolean
	 */
	public boolean isDuringTime(){
		Calendar time=Calendar.getInstance();
		return this.isDuringTime(time);
	}
	
	
	/**
	 * @param time
	 * @return boolean
	 */
	public boolean isDuringTime(Calendar time){
	    return (time.after(start_time)&&time.before(end_time));
	}
	
	
	/**
	 * @return boolean
	 */
	public boolean isOutofDate(){
		return end_time.before(Calendar.getInstance());
	}
	
	
	/**
	 * @param promotion
	 * @return boolean
	 */
	public boolean isCrossed(Promotion promotion){
		return start_time.before(promotion.end_time)&&end_time.after(promotion.start_time);
	}
	
	
	/**
	 * @param sale
	 */
	public abstract void dealSale(SaleRecord sale);	
	
	
	/**
	 * @return String
	 */
	public abstract String getInfo();
	
	
	
	public static void main(String args[]){
		Calendar   calendar   =   Calendar.getInstance(); 
		SimpleDateFormat   sdf   =   new   SimpleDateFormat( "yyyy-MM-dd  HH:mm:ss"); 
		String   today   =   sdf.format(calendar.getTime()); 
		try {
			Date   theDate   =   sdf.parse("1112-12-01 11:12:12");
			calendar.setTime(theDate);
			today   =   sdf.format(calendar.getTime()); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(today);
		System.out.println(today);

	}
	
	
	
	
}
