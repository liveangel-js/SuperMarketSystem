package Data;
import java.util.Calendar;
import java.io.Serializable;


public class Policy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Calendar startTime;
	private Calendar endTime;
	
	
	public Policy(Calendar startTime,Calendar endTime){
		this.set(startTime, endTime);
	}
	public void set(Calendar startTime,Calendar endTime){
		this.startTime=startTime;
		this.endTime=endTime;
	}
	public Calendar getStartTime(){
		return startTime;
	}
	public void setStratTime(Calendar startTime){
		this.startTime=startTime;
	}
	public Calendar getEndTime(){
		return endTime;
	}
	public void setEndTime(Calendar endTime){
		this.endTime=endTime;
	}
}
