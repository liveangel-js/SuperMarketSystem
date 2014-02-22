package testCase;
import static org.junit.Assert.*;
import Data.Item;
import Data.VIP;
import Logic.Controller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTest {
	//鏁村娴佺▼鐨勬祴璇�

	Controller con;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadVIPDataByID() {
		Controller.getShop().getVipList().add(new VIP(1, "sd", "15996221234", 2000, 1000));
		VIP vip = Controller.getVIPByID(1);
		assertEquals("15996221234",vip.getTelNum());
	}
	
	@Test
	public void testReadItemDataByID(){
		Controller.getShop().getItemList().add(new Item(1, "123", 12.5, 10, 10.5,105));
		Item item = Controller.getItemByID(1);
		assertEquals("123",item.getName());
	}
}




	

