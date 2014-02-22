package server.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadServerData implements ReadDataInterface{
	
	
	//读取文件中的每一行商品信息，放入ArrayList中
	public ArrayList<String> ReadItem(){
		BufferedReader reader = null;
		ArrayList<String> list = new ArrayList<String>();
		
		try{
		  reader = new BufferedReader(new FileReader(file));		  
		  String tempString = null;
          while ((tempString = reader.readLine()) != null) {
        	     list.add(tempString);
          }
          reader.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	} 
    
	//通过ID从文件查找商品信息
	public ItemData getDataByID(int itemID){
		ItemData itemData=new ItemData();
		//通过ReadItem()方法获取文件每一行
		ArrayList<String> list=ReadItem();
		int tempIndex=0;
		for(int i=0;i<list.size();i++)
		{
			//查找文件中每一行第一个逗号前的id是否和itemID相同，相同则把这一行存入itemData
			   if(list.get(i).substring(0, list.get(i).indexOf(',')).equals(itemID+"")){
				    itemData.setItemID(itemID);
				    
				    tempIndex=list.get(i).indexOf(',')+1;
				    itemData.setItemName(list.get(i).substring(tempIndex, list.get(i).indexOf(',',tempIndex)));
				    
				    tempIndex=list.get(i).indexOf(',',tempIndex)+1;
				    if(list.get(i).indexOf(',',tempIndex)>0)
				         itemData.setPrice(Integer.parseInt(list.get(i).substring(tempIndex, list.get(i).indexOf(',',tempIndex))));
				    else itemData.setPrice(Integer.parseInt(list.get(i).substring(tempIndex)));
				    
				    tempIndex=list.get(i).indexOf(',',tempIndex)+1;
				    if(list.get(i).indexOf(',',tempIndex)>0)
				         itemData.setPriceForSale(Integer.parseInt(list.get(i).substring(tempIndex, list.get(i).indexOf(',',tempIndex))));
				    
				    tempIndex=list.get(i).indexOf(',',tempIndex)+1;
				    if(list.get(i).indexOf(',',tempIndex)>0)
				         itemData.setSaleStartDate(list.get(i).substring(tempIndex, list.get(i).indexOf(',',tempIndex)));
				    
				    tempIndex=list.get(i).indexOf(',',tempIndex)+1;
				    if(list.get(i).indexOf(',',tempIndex)>0)
				         itemData.setSaleEndDate(list.get(i).substring(tempIndex));
                    break;
			    }    				   
		 }
		return itemData;
	}
    
}
