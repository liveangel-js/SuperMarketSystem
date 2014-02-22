package logic.model;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.VIPData;
import data.WorkerData;

public class WorkerManageModel {
	private WorkerData worker_data;
	public WorkerManageModel(){
		worker_data = getData();
	}
	private WorkerData getData(){
		if((WorkerData)DataReader.read(Data.WORKERS)==null){
			WorkerData temp =  new WorkerData();
			writeData();
			System.out.println("new VIPDATA");
			return temp;
		}else{
			return (WorkerData)DataReader.read(Data.WORKERS);
		}
	}
	public void writeData(){
//		DataWriter writer = new DataWriter();

		DataWriter.write(worker_data, Data.WORKERS);
	}
	public void addWorker(String []s){
		for(int i=0;i<s.length;i++){
			worker_data.addWorker(s[i]);
		}
		writeData();
	}
	public Object[][] getTable(){
		return worker_data.getTable();
	}
	public String getWorkerByID(String ID){
		return worker_data.getWorkerInfoByID(ID);
	}
	public boolean deleteWorker(String ID){
		return worker_data.removeWorker(ID);
	}
	public void changePosition(String ID,String po){
		worker_data.changePosition(ID, po);
	}
	public void changePassword(String ID,String newCode){
		worker_data.changePassword(ID, newCode);
	}

}

