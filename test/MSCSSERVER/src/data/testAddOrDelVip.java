package data;

public class testAddOrDelVip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAddVip ();
		TestDelVip ();
	}
	public static void TestAddVip (){
		/*VIPData vip=(VIPData)DataReader.read(Data.VIPS);
		VIPRecord vipRecord1=vip.getVipByID("1011");
        System.out.println(vipRecord1);
     
        VIPRecord vipRecord2=vip.getVipByID("1012");
        System.out.println(vipRecord2.toString());
		*/
		
	}
	public static void TestDelVip (){
		VIPData vip=(VIPData)DataReader.read(Data.VIPS);
		VIPRecord vipRecord1=vip.getVipByID("1011");
        System.out.println(vipRecord1);
        VIPRecord vipRecord2=vip.getVipByID("1012");
        System.out.println(vipRecord2.toString());
	
		
	}
}
