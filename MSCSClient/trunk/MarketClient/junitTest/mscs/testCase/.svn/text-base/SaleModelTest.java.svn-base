package mscs.testCase;


import static org.junit.Assert.*;

import mscs.businessLogic.SaleController;
import mscs.businessLogic.SaleModel;
import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;
import mscs.fakeData.TestModelComData;
import mscs.fakeData.TestModelUserData;
import mscs.view.ApplicationRunner;
import mscs.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaleModelTest {
	View v;
	SaleModel model;
	@Before
	public void setUp() throws Exception {
		v.TestMode = 1;
		v = new View(new ApplicationRunner());
		v.setSaleControl(new SaleController());
		model = (SaleModel) ((SaleController)v.getSaleControl()).getSm();
		
		//设置假的Data层来测试Model层接口
		model.setCdata(new TestModelComData());
		model.setMdata(new TestModelUserData());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserInfo() {
		MemberRecord mr = v.getUserInfo(1);
		assertEquals("Tom",mr.getUname());
	}

	@Test
	public void testGetGoodInfo() {
		CommodityRecord cr = v.getGoodInfo(1);
		assertEquals("test",cr.getDescri());
	}

	@Test
	public void testAddItem() {
		assertEquals(true,v.addItem(1, "good", 11, 1));
	}

	@Test
	public void testBuy() {
		model.removeAllItems();
		v.addItem(1, "good", 11, 1);
		v.addItem(2, "good2", 12, 1);
		v.addItem(3, "good3", 13, 1);
		assertEquals(36,v.getTotalPrice(),0);
	}

}
