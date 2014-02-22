package mscs.testCase;


import static org.junit.Assert.*;

import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;
import mscs.fakeBusinessLogic.TestViewControler;
import mscs.view.ApplicationRunner;
import mscs.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ViewTest {

	View v;
	@Before
	public void setUp() throws Exception {
		v.TestMode = 1;
		v = new View(new ApplicationRunner());
		//使用一个假的controller来测试view层接口
		v.setSaleControl(new TestViewControler());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserInfo() {
		MemberRecord mr = v.getUserInfo(1);
		assertEquals("testview",mr.getUname());
	}

	@Test
	public void testGetGoodInfo() {
		CommodityRecord cr = v.getGoodInfo(1);
		assertEquals("testview",cr.getDescri());
	}

	@Test
	public void testGetTotalPrice() {
		double a = v.getTotalPrice();
		assertEquals(a,0,0);
	}

	@Test
	public void testAddItem() {
		boolean a = v.addItem(1, "test", 1, 1);
		assertEquals(a,true);
	}

}
