package logic.controller;

import logic.interfaces.StoreAnalyInterface;
import logic.model.StoreAnalyModel;

public class StoreAnalyController  implements StoreAnalyInterface{
	StoreAnalyModel storeAnalyModel = new StoreAnalyModel();
	
	public Object[][] getTable(){
		Object[][] s = storeAnalyModel.getTable();

		return s;
	}

}
