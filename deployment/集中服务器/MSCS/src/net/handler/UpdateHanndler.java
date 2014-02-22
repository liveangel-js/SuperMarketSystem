package net.handler;

import data.Data;
import data.DataReader;
import data.ShopData;
import data.ShopRecord;
import data.VIPData;
import net.Command;

public class UpdateHanndler implements HandlerInterface{

	public static final String UPLOAD="UPLOAD";
	
	public static final String DOWNLOAD="DOWNLOAD";
	
	

	@Override
	public void handle(Command command) {
		// TODO Auto-generated method stub
		if(command.getMethod().equals(UPLOAD)){
			Object result=upload(command.getPara());
			command.setResult(result);
			return;
		}
		if(command.getMethod().equals(DOWNLOAD)){
			Object result=download(command.getPara());
			command.setResult(result);
			return;
		}
	}
	
	
	/**
	 * @param para
	 * @return Object
	 * 用于同步
	 */
	public static synchronized Object upload(Object[] para){
        System.out.println("营业服务器上传数据中~~~~~\n\n");
		String ID=(String) para[0];
		ShopData shops=(ShopData) DataReader.read(Data.SHOP);
		ShopRecord shop=shops.getShopRecordByID(ID);
		return null;
	}
	
	
	/**
	 * @param para
	 * @return Object
	 */
	public Object download(Object[] para){
		System.out.println("营业服务器下载数据中~~~~~\n\n");
		String ID=(String) para[0];
		ShopData shops=(ShopData) DataReader.read(Data.SHOP);
		ShopRecord shop=shops.getShopRecordByID(ID);
		return shop;
	}
}
