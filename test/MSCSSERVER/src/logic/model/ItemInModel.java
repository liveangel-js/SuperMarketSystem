package logic.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.Goods;
import data.GoodsData;
import data.GoodsStock;
import data.ImportData;
import data.StockItem;

public class ItemInModel {
	private GoodsData goods_data;
	private GoodsStock goods_stock;
	
	public ItemInModel(){
		goods_data = getData();
		goods_stock = getStock();
	}
	
	public GoodsData getData(){
		
		if((GoodsData)DataReader.read(Data.GOODS)==null){
			GoodsData temp =  new GoodsData();
			writeData();
//			System.out.println("new GoodsData");
			return temp;
		}else{
			return (GoodsData)DataReader.read(Data.GOODS);
		}
		
	}
	public GoodsStock getStock(){
//		DataReader reader = new DataReader();
		if((GoodsStock)DataReader.read(Data.STRORAGE)==null){
			GoodsStock temp =  new GoodsStock();
			writeData();
			System.out.println("new StockData");
			return temp;
		}else{
			return (GoodsStock)DataReader.read(Data.STRORAGE);
		}
	}
//	public boolean isIDExist(String s){
//		Goods goods = goods_data.getGoodsByID(s);
//		if(goods==null){
//			return false;
//		}else{
//			return true;
//		}
//	}
		
	public boolean addStockItem(String s){
		String []temp = s.split(",");
		Goods goods = goods_data.getGoodsByID(temp[0]);
		if(goods==null){
			return false;
		}else{
			StockItem item = new StockItem(temp[0], goods.getName(), goods.getPrice(), Double.parseDouble(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4]);
			goods_stock.addGoods(item);
			
//			writeData();
			return true;
		}
	}
	public String getItemInfoByID(String s){
		Goods goods = goods_data.getGoodsByID(s);
		if(goods==null){
			return null;
		}else{
			return goods.getGoodsInfo();
		}
	}
//	public boolean removeStockItem(String s){
//		return true;
//	}
	public void writeStockData(String []s){
		int length = s.length;
		for(int i=0;i<length;i++){
			addStockItem(s[i]);
		}
		System.out.println("入库成功");
		writeData();
		
	}
	public void writeImportData(String []s){
		int length = s.length;
		ImportData importData = new ImportData();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH'分'");
		for(int i=0;i<length;i++){
			String []temp = s[i].split(",");
			Goods goods = goods_data.getGoodsByID(temp[0]);
			
				StockItem item = new StockItem(temp[0], goods.getName(), goods.getPrice(), Double.parseDouble(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4]);
				importData.addGoods(item);
//				writeData();
//				return true;
			}
//		DataWriter writer = new DataWriter();
		String url = "数据/入库记录/import-"+dateFormat.format(new Date())+".dat";
		DataWriter.write(importData, url);
		System.out.println("入库信息记录成功");
			
	}
	
	public void writeData(){
//		DataWriter writer = new DataWriter();

		DataWriter.write(goods_stock, Data.STRORAGE);
	}
	public Object[][] getGoodsTable(){
		if(goods_data ==null){
			return new Object [][] { {null, null, null}};
		}
		return goods_data.getTable();
	}
//	public Object[][] getStockTable(){
//		if(goods_stock ==null){
//			return new Object [][] { {null, null, null,null,null,null}};
//		}
//		return goods_stock.getTable();
//	}

}
