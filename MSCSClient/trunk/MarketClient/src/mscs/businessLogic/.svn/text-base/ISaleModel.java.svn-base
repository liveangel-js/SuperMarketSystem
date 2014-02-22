package mscs.businessLogic;

import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;

public interface ISaleModel {
	MemberRecord getUserInfo(int UID);
	CommodityRecord getGoodInfo(int GID);
	boolean addItem(int id,String name,double price,int num);
	boolean removeItem(String gid);
	double buy();
	boolean startUpdate();
	boolean checkSpecTime(String sTime,String eTime);
}
