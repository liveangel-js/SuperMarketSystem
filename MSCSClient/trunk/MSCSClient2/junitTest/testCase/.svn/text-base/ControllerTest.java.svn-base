package testCase;
import static org.junit.Assert.*;




import Logic.Controller;
import Data.Item;
import Data.VIP;
import fakeData.TestLogicItemData;
import fakeData.TestLogicVipData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Data.Shop;
public class ControllerTest {
	Controller con=new Controller();
	@Before
	public void setUp() throws Exception {
		
		
		//设置假的Data层来测试Controller层接口
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetVipInfo() {
		
		Controller.getShop().getVipList().add(new VIP(2, "vip2", "159962211111", 1000, 500));
		VIP v = Controller.getVIPByID(2);
		assertEquals(2,v.getID());
	}

	@Test
	public void testGetItemInfo() {
		
		Controller.getShop().getItemList().add(new Item(2, "item2", 11.5, 10, 9.5,95));
		Item i= Controller.getItemByID(2);
		assertEquals(2,i.getID());
	}
}
