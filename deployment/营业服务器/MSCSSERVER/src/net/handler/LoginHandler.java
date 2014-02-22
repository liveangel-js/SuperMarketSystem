package net.handler;
import data.Data;
import data.DataReader;
import data.WorkerData;
import data.WorkerRecord;
import net.Command;


public class LoginHandler implements HandlerInterface{
	
	public static final String CASHIER="CASHIER";

	
	@Override
	public void handle(Command command) {
		// TODO Auto-generated method stub
		if(command.getMethod().equals(CASHIER)){
			Object result=login(command);
			command.setResult(result);
			return;
		}
	}
	
	
	public Object login(Command command) {
		// TODO Auto-generated method stub
		Object para[]=command.getPara();
		String ID=(String) para[0];
		String password=(String) para[1];

		WorkerData workers = (WorkerData)DataReader.read(Data.WORKERS);
		WorkerRecord worker=workers.getWorkerByID(ID);
		System.out.println(ID+","+password);
		System.out.println(worker);
		if(worker!=null&&worker.getPassword().equals(password)){
			return true;
		}
		return false;
	}

}
