package testCase;
import static org.junit.Assert.*;


import Logic.SaleController;

import Data.Item;

import Data.Sale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaleControllerTest {
	
	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPrice() {
		SaleController.getShop().getItemList().add(new Item(1, "帽子", 12.5, 10, 10.5,105));
		SaleController.getShop().getItemList().add(new Item(2, "item2", 11.5, 10, 9.5,95));
		SaleController.startSale();
		SaleController.addItem("1","10");
		SaleController.addItem("2","10");
		assertEquals("200.0",SaleController.getPrice());
	}

	@Test
	public void testGetItemNum() {
//		SaleController.getShop().getItemList().add(new Item(1, "帽子", 12.5, 10, 10.5,105));
//		SaleController.getShop().getItemList().add(new Item(2, "item2", 11.5, 10, 9.5,95));
//		SaleController.startSale();
//		SaleController.addItem("1","10");
//		SaleController.addItem("2","10");
		assertEquals(2,SaleController.getItemNum());
		
	}
	@Test
	public void testgetItemListInfo() {
//		SaleController.getShop().getItemList().add(new Item(1, "帽子", 12.5, 10, 10.5,105));
//		SaleController.getShop().getItemList().add(new Item(2, "item2", 11.5, 10, 9.5,95));
//		SaleController.startSale();
//		SaleController.addItem("1","10");
//		SaleController.addItem("2","10");
		String[] Info=new String[2];
		Info[1]=2+","+"item2"+","+ 11.5+","+10+","+9.5+","+95;
		Info[0]=1+","+"帽子"+","+ 12.5+","+10.5+","+10+","+105;
		assertEquals(Info[0],SaleController.getItemListInfo()[0]);
		assertEquals(Info[1],SaleController.getItemListInfo()[1]);
	}
}
