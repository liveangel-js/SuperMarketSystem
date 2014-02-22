package logic.interfaces;

public interface VipManageInterface {
	public int getNewVipNum();
	public void addNewVipNum();
	public Object[][] getVipTable();
	public void writeData(String []s);
	public boolean deleteVip(String ID);
}
