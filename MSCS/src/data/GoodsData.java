package data;

import java.util.ArrayList;

public class GoodsData extends Data{
	private static final long serialVersionUID = 1L;
	ArrayList<Goods> goodsList=new ArrayList<Goods>();
	
	public GoodsData(){
		
	}
	public Goods getGoodsByID(String ID) {
		if(goodsList.size()==0) return null;
		for(int i=0;i<goodsList.size();i++){
			Goods goodsRecord=goodsList.get(i);
			if(goodsRecord.getID().equals(ID))
				return goodsRecord;
		}
		return null;
	}
	public String getGoodsInfoByID(String ID){
		if(this.getGoodsByID(ID)==null) return null;
		String info=this.getGoodsByID(ID).getGoodsInfo();
		return info;
	}
	public void addGoods(Goods goodsRecord){
		goodsList.add(goodsRecord);
	}
	public boolean remove(Goods goodsRecord){
		if(goodsList.size()==0) return false;
		return goodsList.remove(goodsRecord);
	}
	public boolean remove(String ID){
		if(goodsList.size()==0) return false;
		return goodsList.remove(getGoodsByID(ID));
	}
	public Object[][] getTable(){
		
		Object[][] object = new Object[goodsList.size()+1][3];
		for(int i=0;i<goodsList.size();i++){
			object[i] = goodsList.get(i).getGoodsInfo().split(",");
		}
		
		return object;
	}
	public static void main(String args[]){
		GoodsData s = new GoodsData();
		DataWriter.write(s, Data.GOODS);
	}

}
