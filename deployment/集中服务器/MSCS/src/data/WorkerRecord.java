package data;


/**
 * @author Administrator
 *
 */
public class WorkerRecord extends Record {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String GENERALMANAGER ="总店经理";

	public static final String STOREMANAGER ="分店经理";

	public static final String CASHIER ="收银员";

	private String name;

	private String password;

	private String position;


	/**
	 * 
	 */
	public WorkerRecord() {

	}

	
	/**
	 * @param ID
	 * @param name
	 * @param password
	 * @param position
	 */
	public WorkerRecord(String ID, String name, String password, String position) {
		this.set(ID, name, password, position);
	}


	/**
	 * @param ID
	 * @param name
	 * @param password
	 * @param position
	 */
	public void set(String ID, String name, String password, String position) {
		this.ID = ID;
		this.name = name;
		this.password = password;
		this.position = position;
	}

	
	/**
	 * @return String
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return String
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return int 
	 */
	public String getPosition() {
		return position;
	}

	
	/**
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	/**
	 * @return String 
	 */
	public String  getInfo(){
		String info=ID+","+name+","+password+","+position;
		return info;
	}
}
