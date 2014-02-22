package data;


/**
 * @author Administrator
 *
 */
public class VIPRecord extends Record {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String telephone;
	
	private int total_point;
	
	private int valid_point;
	
	
	/**
	 * 
	 */
	public VIPRecord(){
		
	}
	
	
	/**
	 * @param ID
	 * @param name
	 * @param telNum
	 * @param total_point
	 * @param valid_point
	 */
	public VIPRecord(String ID,String name,String telNum,int total_point,int valid_point){
		this.set(ID, name, telNum, total_point, valid_point);
	}
	
	
	/**
	 * @param ID
	 * @param name
	 * @param telNum
	 * @param point
	 * @param valid_point
	 */
	public void set(String ID,String name,String telNum,int point,int valid_point){
		this.ID=ID;
		this.name=name;
		this.telephone=telNum;
		this.total_point=point;
		this.valid_point=valid_point;
	}
	
	
	/**
	 * @return String
	 */
	public String getName(){
		return name;
	}
	
	
	/**
	 * @param name
	 */
	public void setName(String name){
		this.name=name;
	}
	
	
	/**
	 * @return String
	 */
	public String getTelephone(){
		return telephone;
	}
	
	
	/**
	 * @param telephone
	 */
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	
	
	
	/**
	 * @return int
	 */
	public int getTotalPoint(){
		return total_point;
	}
	
	
	/**
	 * @param total_point
	 */
	public void setTotalPoint(int total_point){
		this.total_point=total_point;
	}
	
	
	
	/**
	 * @return int 
	 */
	public int getValidPoint(){
		return valid_point;
	}
	
	
	
	/**
	 * @param valid_point
	 */
	public void setValidPoint(int valid_point){
		this.valid_point=valid_point;
	}
	
	
	
	public boolean usePoint(String point){
		try{
			int use_point=Integer.parseInt(point);
			int last_point=valid_point-use_point;
			if(last_point<0){
				return false;
			}
			valid_point=last_point;
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
