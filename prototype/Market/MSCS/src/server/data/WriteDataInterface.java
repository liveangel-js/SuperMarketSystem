package server.data;

import java.io.File;

public interface WriteDataInterface {
	File file=new File("商品特价信息.txt");
	
	public void writeData(ItemData itemData);
}
