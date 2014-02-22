package logic.interfaces;

public interface WorkerManageInterface {
	public void writeData(String []s);
	public Object[][] getTable();
	public String getWorkerByID(String ID);
	public boolean deleteWorker(String ID);
	public void changePosition(String ID,String position);
	public void changePassword(String ID,String newCode);

}
