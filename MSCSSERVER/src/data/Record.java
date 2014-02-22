package data;
import java.io.Serializable;


/**
 * @author Administrator
 *
 */
public abstract class Record implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String  ID;
	
	
	/**
	 * @return int 
	 */
	public String getID(){
		return ID;
	}
	
	
	/**
	 * @param ID
	 */
	public boolean setID(String ID){
		this.ID=ID;
		return true;
	}
}
