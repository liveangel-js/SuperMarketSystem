package logic.model;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.Goods;
import data.GoodsData;

public class GoodsManageModel {
	private GoodsData goods_data;
	
	public GoodsManageModel(){
		
		goods_data = getData();
	
	}
	public GoodsData getData(){
		if((GoodsData)DataReader.read(Data.GOODS)==null){
			GoodsData temp =  new GoodsData();
			writeData();
			System.out.println("new GoodsData");
			return temp;
		}else{
			return (GoodsData)DataReader.read(Data.GOODS);
		}
	}
	public void writeData(){
	
		DataWriter.write(goods_data, Data.GOODS);
	}
	public boolean addData(String s){
		String []temp = s.split(",");
		Goods goods = goods_data.getGoodsByID(temp[0]);
		
		if(goods!=null){
			return false;
		}else{
			Goods tempdata = new Goods(temp[0],temp[1], Double.parseDouble(temp[2]));
			goods_data.addGoods(tempdata);
			writeData();
			return true;
		}
		
	}
	public boolean deleteData(String ID){
		Boolean temp = goods_data.remove(ID);
		if(temp){writeData();}
		else{
			
		}
		return temp;
		
	}
	public Object[][] getTable(){
		if(goods_data ==null){
			return new Object [][] { {null, null, null}};
		}
		return goods_data.getTable();
	}

}
