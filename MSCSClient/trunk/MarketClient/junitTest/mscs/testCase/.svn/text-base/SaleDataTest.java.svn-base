package mscs.testCase;


import static org.junit.Assert.*;

import mscs.businessLogic.SaleController;
import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;
import mscs.view.ApplicationRunner;
import mscs.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//整套流程的测试
public class SaleDataTest {
	View v;
	@Before
	public void setUp() throws Exception {
		v.TestMode = 1;
		v = new View(new ApplicationRunner());
		v.setSaleControl(new SaleController());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadMemberDataByID() {
		MemberRecord mr = v.getUserInfo(1);
		assertEquals("luhui",mr.getUname());
	}
	
	@Test
	public void testReadCommodityDataByID(){
		CommodityRecord cr = v.getGoodInfo(1);
		assertEquals("cup",cr.getDescri());
	}
	
}
