package logic.controller;

import logic.interfaces.VipManageInterface;
import logic.model.VipManageModel;

public class VipManageController extends Controller implements VipManageInterface {
	VipManageModel vipManageModel = new VipManageModel();

	@Override
	public Object[][] getVipTable() {
		// TODO Auto-generated method stub
		return vipManageModel.getVipTable();
	}

	@Override
	public void writeData(String[] s) {
		// TODO Auto-generated method stub
		vipManageModel.addVip(s);
		vipManageModel.writeData();
		
	}
	public void addNewVipNum(){
		vipManageModel.addNewNum();
		
	}

	@Override
	public int getNewVipNum() {
		// TODO Auto-generated method stub
		return vipManageModel.getNum();
		
	}

	@Override
	public boolean deleteVip(String ID) {
		// TODO Auto-generated method stub
		return vipManageModel.deleteVip(ID);
	}

}
