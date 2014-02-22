package net.handler;


public class HandlerFactory {
	
	public static final String SALE="SALE";
	
	public static final String RETURN="RETURN";
	
	public static final String LOGIN="LOGIN";
	

	
	
	public static HandlerInterface createHandler(String command){
		if(command.equals(SALE)){
			return new SaleHandler();
		}
		if(command.equals(RETURN)){
			return new ReturnHandler();
		}
		if(command.equals(LOGIN)){
			return new LoginHandler();
		}
		return null;
	}
}
