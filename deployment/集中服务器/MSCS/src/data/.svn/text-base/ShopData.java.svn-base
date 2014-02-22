package data;

import java.util.ArrayList;

import logic.controller.GoodsManageController;


public class ShopData extends Data{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ShopRecord> shopList=new ArrayList<ShopRecord>();
	
	
	/**
	 * 
	 */
	public ShopData(){
		
	}
	
	
	/**
	 * @param ID
	 * @return ShopRecord
	 */
	public ShopRecord getShopRecordByID(String ID){
		for(int i=0;i<shopList.size();i++){
			ShopRecord shop=shopList.get(i);
			if(shop.getID().equals(ID))
				return shop;
		}
		return null;
	}
	
	/**
	 * @param ID
	 * @return ShopRecord
	 */
	public void setShopRecord(ShopRecord shop){
		for(int i=0;i<shopList.size();i++){
			if(shop.getID().equals(shopList.get(i).getID())){
				shop=shopList.get(i);
			}
				
		}
	}
	
	/**
	 * @param shop
	 */
	public void addShopRecord(ShopRecord shop){
		shopList.add(shop);
	}
	
	
	/**
	 * @param shop
	 * @return boolean
	 */
	public boolean removeShopRecord(ShopRecord shop){
		return shopList.remove(shop);
	}
	
	
	/**
	 * @param ID
	 * @return boolean
	 */
	public boolean removeShopRecord(String ID){
		ShopRecord shop=this.getShopRecordByID(ID);
		if(shop!=null){
			shopList.remove(shop);
			return true;
		}
		return false;
	}
}
