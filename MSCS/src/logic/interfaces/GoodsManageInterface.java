package logic.interfaces;

public interface GoodsManageInterface {
	public Object[][] getTable();
	public void writeData();
	public boolean addData(String s);
	public boolean deleteData(String ID);
	public boolean checkInputID(String s);
	public boolean checkInputPrice(String s);

}
