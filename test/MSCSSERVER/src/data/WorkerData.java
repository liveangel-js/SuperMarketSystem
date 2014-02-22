package data;
import java.util.ArrayList;


/**
 * @author Administrator
 *
 */
public class WorkerData extends Data {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<WorkerRecord> workList=new ArrayList<WorkerRecord>();
	
	/**
	 * 
	 */
	public WorkerData(){
		
	}
	
	
	/**
	 * @param ID
	 * @return WorkerRecord
	 */
	public WorkerRecord getWorkerByID(String ID){
		for(int i=0;i<workList.size();i++){
			WorkerRecord worker=workList.get(i);
			if(worker.getID().equals(ID)){
				return worker;
			}
		}
        return null;
	}
	public String getWorkerInfoByID(String ID){
		WorkerRecord temp = getWorkerByID(ID);
		if(temp ==null){
			return null;
		}else{
			return temp.getInfo();
		}
	}

	
	/**
	 * @param worker
	 */
	public void addWorker(String s){
		String [] temp = s.split(",");
		WorkerRecord worker = new WorkerRecord(temp[0], temp[1], temp[2], temp[3]);
		workList.add(worker);
	}
	public void addWorker(WorkerRecord worker){
		workList.add(worker);
	}
	
	
	/**
	 * @param worker
	 */
	public void removeWorker(WorkerRecord worker){
		workList.remove(worker);
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean removeWorker(String ID){
		WorkerRecord worker=this.getWorkerByID(ID);
		if(worker==null){
			return false;
		}
		else{
			workList.remove(worker);
			return true;
		}
	}
	public void changePosition(String ID,String po){
		WorkerRecord temp = getWorkerByID(ID);
		temp.setPosition(po);
		
	}
	public void changePassword(String ID,String newCode){
		WorkerRecord temp = getWorkerByID(ID);
		temp.setPassword(newCode);
	}
	public Object[][] getTable(){
		Object[][] object = new Object[workList.size()][3];
		for(int i=0;i<object.length;i++){
			object[i] = workList.get(i).getInfo().split(",");
		}
		return object;
	}
}
