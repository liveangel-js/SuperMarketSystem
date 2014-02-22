package logic.interfaces;

public interface ItemInInterface {
	public String getItemInfoByID(String s);
	public Object[][] getGoodsTable();
	public void writeData(String []s);
//	public boolean checkInputID(String s);
	public boolean checkInput(String s);

}
