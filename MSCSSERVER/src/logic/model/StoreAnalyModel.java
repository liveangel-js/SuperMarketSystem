package logic.model;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.GoodsStock;
import logic.interfaces.StoreAnalyInterface;

public class StoreAnalyModel{
	
	private GoodsStock goods_stock;
	
	public StoreAnalyModel(){
		goods_stock = getData();
	}
	
	private GoodsStock getData(){
		
		if((GoodsStock)DataReader.read(Data.STRORAGE)==null){
			GoodsStock temp =  new GoodsStock();
			writeData();
			System.out.println("new StockData");
			return temp;
		}else{
			return (GoodsStock)DataReader.read(Data.STRORAGE);
		}
	}
	public void writeData(){
//		DataWriter writer = new DataWriter();

		DataWriter.write(goods_stock, Data.STRORAGE);
	}
	public Object[][] getTable(){
		return goods_stock.getTable();
	}

}
