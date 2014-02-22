package server.logic;
import java.util.ArrayList;

import server.Thread.TransThread;
import server.data.ItemData;
import server.data.ReadServerData;
import server.data.UpdateServerData;
import server.data.WriteServerData;

public class MainServerBusinessLogic {
	ItemData itemData;
	WriteServerData writeServerData;
	ReadServerData readServerData;
    UpdateServerData updateServerData;
	
	//根据商品ID查找商品信息（不包括特价信息）
	public String searchItem(int itemID){
		readServerData=new ReadServerData();
		itemData=readServerData.getDataByID(itemID);		
		return itemData.getItemID()+"                 "+itemData.getItemName()+"      "+itemData.getPrice();
	}
	
	//搜索所有商品特价信息
	public ArrayList<String> searchSale(){
		readServerData=new ReadServerData();
		ArrayList<String> itemList=readServerData.ReadItem();
		ArrayList<String> tempList=new ArrayList<String>();
		
		//排除不含特价的信息
		for(int i=0;i<itemList.size();i++){
		    int temp=itemList.get(i).indexOf(',');
  	        temp=itemList.get(i).indexOf(',',temp+1);
  	        temp=itemList.get(i).indexOf(',',temp+1);
  	        if(temp>0)
  	        	tempList.add(itemList.get(i));
		}
		return tempList;
	}
	
	//写入商品信息
	public void writeItem(int itemID,int priceForSale,String saleStartDate,String saleEndDate){
		readServerData=new ReadServerData();
		writeServerData=new WriteServerData();
		itemData=readServerData.getDataByID(itemID);
		itemData.setPriceForSale(priceForSale);
		itemData.setSaleStartDate(saleStartDate);
		itemData.setSaleEndDate(saleEndDate);
		writeServerData.writeData(itemData);
	}
	
    //传输商业策略给客户端
	public void update(){
		//updateServerData.update();
		this.updateServerData = new UpdateServerData();
		Thread t = new TransThread(this.updateServerData);
		t.start();
	}
}
