package net.handler;
import net.Command;

public class ReturnHandler implements HandlerInterface{

	public static final String GETSALERECORDBYID="GETSALERECORDBYID";
	
	public static final String GETRETURNDATABYID="GETRETURNDATABYID";
	
	public static final String GETRETURNMONEY="GETRETURNMONEY";
	
	public static final String GETRETURNGIFTS="DEALSALE";
	
	public static final String COMPLETERETURN="COMPLETERETURN";
	

	@Override
	public void handle(Command command) {
		// TODO Auto-generated method stub
		if(command.getMethod().equals(GETSALERECORDBYID)){
			Object result=getSaleRecordByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(GETRETURNDATABYID)){
			Object result=getReturnDataByID(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(GETRETURNMONEY)){
			Object result=getReturnMony(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(GETRETURNGIFTS)){
			Object result=getReturnGifts(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(COMPLETERETURN)){
			Object result=completeReturn(command.getPara());
			command.setResult(result);
			return;
		}
	}



	private Object getReturnDataByID(Object[] para) {
		// TODO Auto-generated method stub
		return null;
	}



	/**
	 * @param para
	 * @return Object
	 */
	public Object getSaleRecordByID(Object []para){
		//未完成
		return false;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object getReturnMony(Object []para){
		//未完成
		return null;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object getReturnGifts(Object []para){
		//未完成
		return null;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object completeReturn(Object []para){
		//未完成
		return null;
	}
}
