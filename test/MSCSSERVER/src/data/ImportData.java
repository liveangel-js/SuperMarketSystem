package data;

import java.util.ArrayList;

public class ImportData extends Data {
	private static final long serialVersionUID = 1L;
	ArrayList<StockItem> goodsList=new ArrayList<StockItem>();
	
	public ImportData(){
		
	}
	public void addGoods(StockItem goods){
		goodsList.add(goods);
	}

}
