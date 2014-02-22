package data;


/**
 * @author Administrator
 *
 */
public class Admin extends Data{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	
	/**
	 * 
	 */
	public Admin(){

	}
	
	
	/**
	 * @param name
	 * @param password
	 */
	public Admin(String name,String password){
		this();
		this.set(name, password);
	}
	
	
	/**
	 * @param username
	 * @param password
	 */
	public void set(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	
	/**
	 * @return String 
	 */
	public String getUsername(){
		return username;
	}
	
	
	/**
	 * @param username
	 */
	public void setUserName(String username){
		this.username=username;
	}
	
	
	/**
	 * @return String 
	 */
	public String getPassword(){
		return password;
	}
	
	
	/**
	 * @param password
	 */
	public void setPassword(String password){
		this.password=password;
	}
}
