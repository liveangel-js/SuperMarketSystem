package data;

import java.util.ArrayList;

public class GoodsStock extends Data{
	private static final long serialVersionUID = 1L;
	ArrayList<StockItem> goodsList=new ArrayList<StockItem>();
	
	public GoodsStock(){
		
	}
	public StockItem getGoodsByID(String ID) {
		if(goodsList.size()==0) return null;
		for(int i=0;i<goodsList.size();i++){
			StockItem goods=goodsList.get(i);
			if(goods.getID().equals(ID))
				return goods;
		}
		return null;
	}
	
	public boolean remove(StockItem s){
		return goodsList.remove(s);
	}
	public boolean modify(StockItem s,int num){
		int temp = goodsList.indexOf(s);
		if(temp==-1){
			return false;
		}
		goodsList.get(temp).setNumber(num);
		return true;
		
	}
	
	public void addGoods(StockItem goods){
		goodsList.add(goods);
	}
	
	public boolean remove(String ID){
		if(goodsList.size()==0) return false;
		return goodsList.remove(getGoodsByID(ID));
		
	}
	public Object[][] getTable(){
		
		Object[][] object = new Object[goodsList.size()][6];
		for(int i=0;i<goodsList.size();i++){
			
			object[i] = goodsList.get(i).getStockItemInfo().split(",");
			System.out.println(object[i][0]+"/"+object[i][1]);
		}
		
		return object;
	}
	

}
