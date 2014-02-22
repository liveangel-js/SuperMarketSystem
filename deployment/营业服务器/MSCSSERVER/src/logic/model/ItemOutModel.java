package logic.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.ExportData;
import data.ExportRecord;
import data.Goods;
import data.GoodsData;
import data.GoodsStock;
import data.ImportData;
import data.StockItem;

public class ItemOutModel {
	private GoodsData goods_data;
	private GoodsStock goods_stock;
	
	public ItemOutModel(){
		goods_data = getData();
		goods_stock = getStock();
	}

	public GoodsData getData(){
//		DataReader reader = new DataReader();
		if((GoodsData)DataReader.read(Data.GOODS)==null){
			GoodsData temp =  new GoodsData();
			writeData();
			System.out.println("new GoodsData");
			return temp;
		}else{
			return (GoodsData)DataReader.read(Data.GOODS);
		}
		
	}
	public GoodsStock getStock(){
//		DataReader reader = new DataReader();
		if((GoodsStock)DataReader.read(Data.STRORAGE)==null){
			GoodsStock temp =  new GoodsStock();
//			writeData();
			System.out.println("new StockData");
			return temp;
		}else{
			return (GoodsStock)DataReader.read(Data.STRORAGE);
		}
	}
	public String getGoodsInfoByID(String s){
		Goods goods = goods_data.getGoodsByID(s);
		if(goods==null){
			return null;
		}else{
			return goods.getGoodsInfo();
		}
	}
	public String getItemInfoByID(String s){
		StockItem goods = goods_stock.getGoodsByID(s);
		if(goods==null){
			return null;
		}else{
			return goods.getStockItemInfo();
		}
	}
	public StockItem getStockItemByID(String s){
		StockItem goods = goods_stock.getGoodsByID(s);
		if(goods==null){
			return null;
		}else{
			return goods;
		}
	}
	
	public void writeStockData(String []s){
		ExportData exportData = new ExportData();
		int length = s.length;
		String tempID = null;
		int tempNum =0;
		String tempReason =null;
		ExportRecord tempExportRecord = null;
		for(int i=0;i<length;i++){
			tempID = s[i].split(",")[0];
			tempNum = Integer.parseInt(s[i].split(",")[3]);
			tempReason = s[i].split(",")[4];
			tempExportRecord = exportStockItem(tempID,tempNum,tempReason);
			exportData.addExport(tempExportRecord);
		}
		System.out.println("出库成功");
		writeData();
		writeExportData(exportData);
		
	}
	public ExportRecord exportStockItem(String ID,int num,String reason){
		StockItem temp = getStockItemByID(ID);
		if(temp==null){
			return null;
		}
		int stockNum = temp.getStockNumber();
		stockNum = stockNum-num;
		if(stockNum<1){
			ExportRecord s = new ExportRecord(ID, getItemInfoByID(ID).split(",")[1], Double.parseDouble(getItemInfoByID(ID).split(",")[2]), stockNum, reason);
			
			goods_stock.remove(temp);
			return s;
		}else{
			ExportRecord s = new ExportRecord(ID, getItemInfoByID(ID).split(",")[1], Double.parseDouble(getItemInfoByID(ID).split(",")[2]), num, reason);
			goods_stock.modify(temp,stockNum);
			return s;
		}
		
		
		
		
	}
	public void writeExportData(ExportData ed){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH'分'");
		
//		DataWriter writer = new DataWriter();
		String url = "数据/出库记录/export-"+dateFormat.format(new Date())+".dat";
		DataWriter.write(ed, url);
		System.out.println("出库信息记录成功");
	}
	public void writeData(){
//		DataWriter writer = new DataWriter();

		DataWriter.write(goods_stock, Data.STRORAGE);
	}
	

}
