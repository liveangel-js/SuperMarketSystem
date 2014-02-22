package mscs.testCase;


import static org.junit.Assert.*;

import mscs.businessLogic.SaleController;
import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;
import mscs.fakeBusinessLogic.TestControllerModel;
import mscs.fakeBusinessLogic.TestViewControler;
import mscs.view.ApplicationRunner;
import mscs.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaleControllerTest {
	View v;
	@Before
	public void setUp() throws Exception {
		v.TestMode = 1;
		v = new View(new ApplicationRunner());
		v.setSaleControl(new SaleController());
		
		//使用一个假的Model来测试controller层接口
		((SaleController)v.getSaleControl()).setSm(new TestControllerModel());
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserInfo() {
		MemberRecord mr = v.getUserInfo(1);
		assertEquals(mr.getUname(),"testcontroller");
	}

	@Test
	public void testGetGoodInfo() {
		CommodityRecord cr = v.getGoodInfo(1);
		assertEquals(cr.getDescri(),"testcontroller");
	}

	@Test
	public void testAddItem() {
		boolean a = v.addItem(1, "test", 1, 1);
		
		assertEquals(a,true);
	}


	@Test
	public void testBuy() {
		int a = (int)v.getTotalPrice();
		assertEquals(a,0);
	}

}
