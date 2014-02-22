package server.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteServerData implements WriteDataInterface{
	
	//按行写入商品数据
	public void writeData(ItemData itemData){
		BufferedWriter writer = null;
		
		String writeInString=itemData.getItemID()+","+itemData.getItemName()+","
		+itemData.getPrice()+","+itemData.getPriceForSale()+","+itemData.getSaleStartDate()+","
		+itemData.getSaleEndDate();
		
		try{
		  writer = new BufferedWriter(new FileWriter(file,true));
		  writer.newLine();
          writer.write(writeInString);
          writer.close();
		}
		catch(Exception e){	
			e.printStackTrace();
		}
	}
	
}
