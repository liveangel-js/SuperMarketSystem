package net.handler;


public class HandlerFactory {
	
	public static final String UPDATE="UPDATE";
	
	
	public static HandlerInterface createHandler(String command){
		if(command.equals(UPDATE)){
			return new UpdateHanndler();
		}
		return null;
	}
}
