package mscs.fakeBusinessLogic;

import mscs.businessLogic.ISaleModel;
import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;

public class TestControllerModel implements ISaleModel{

	@Override
	public boolean addItem(int id, String name, double price, int num) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double buy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkSpecTime(String sTime, String eTime) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommodityRecord getGoodInfo(int GID) {
		// TODO Auto-generated method stub
		return new CommodityRecord(1,"testcontroller",1,1,"2001-1-1","2001-1-1");
	}

	@Override
	public MemberRecord getUserInfo(int UID) {
		// TODO Auto-generated method stub
		return new MemberRecord("testcontroller",1);
	}

	@Override
	public boolean removeItem(String gid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean startUpdate() {
		// TODO Auto-generated method stub
		return true;
	}

}
