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

	
	/**
	 * @param worker
	 */
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
}
