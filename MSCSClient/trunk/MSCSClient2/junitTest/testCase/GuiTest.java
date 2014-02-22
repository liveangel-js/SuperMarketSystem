package testCase;
import static org.junit.Assert.*;

import java.util.ArrayList;

import GUI.SalePanel;
import Data.Item;
import Data.Sale;
import Logic.SaleController;
import fakeLogic.TestSaleController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GuiTest {
	
	@Before
	public void setUp() throws Exception {
		SalePanel.TestMode = 1;
		
		//浣跨敤涓�釜鍋囩殑SaleController鏉ユ祴璇旼UI灞傛帴鍙�
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuy() {
		SaleController.startSale();
		SalePanel salePanel=new SalePanel();
		assertEquals(false,salePanel.buy());
	}

	

}





	