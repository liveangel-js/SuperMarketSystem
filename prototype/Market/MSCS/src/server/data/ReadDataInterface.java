package server.data;

import java.io.File;
import java.util.ArrayList;

public interface ReadDataInterface {
	File file=new File("商品特价信息.txt");
	
	public ItemData getDataByID(int itemID);
	public ArrayList<String> ReadItem();
}
