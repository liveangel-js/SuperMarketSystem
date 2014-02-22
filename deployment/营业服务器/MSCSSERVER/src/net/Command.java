package net;

import java.io.Serializable;


/**
 * @author Administrator
 *
 */
public class Command implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String command;
	
	private String method; 
	
    private Object para[];
	
	private Object result;
	
	
	/**
	 * @param command
	 * @param method
	 * @param para
	 */
	public Command(String command,String method,Object para[]){
		this.command=command;
		this.method=method;
		this.para=para;
	}
	
	
	/**
	 * @return String
	 */
	public String getCommand() {
		return command;
	}
	
	
	/**
	 * @param command
	 */
	public void setCommand(String command) {
		this.command = command;
	}
	
	
	/**
	 * @return String
	 */
	public String getMethod(){
		return method;
	}
	
	
	/**
	 * @param method
	 */
	public void setMethod(String method){
		this.method=method;
	}
	
	
	/**
	 * @return Object[]
	 */
	public Object[] getPara() {
		return para;
	}
	
	
	/**
	 * @param para
	 */
	public void setPara(Object[] para) {
		this.para = para;
	}
	
	
	/**
	 * @return Object
	 */
	public Object getResult() {
		return result;
	}
	
	
	/**
	 * @param result
	 */
	public void setResult(Object result) {
		this.result = result;
	}
	
	
	public String toString(){
		return command;
	}
}
