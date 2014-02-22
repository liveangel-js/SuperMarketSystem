package logic.controller;

import data.Admin;
import data.Data;
import data.DataReader;
import data.WorkerData;

import logic.interfaces.LoginInterface;

public class LoginController implements LoginInterface {

	@Override
	public boolean Login(Boolean b, String s) {
		// TODO Auto-generated method stub
		String tempUsername=null;
		String tempPassword= null;
		tempUsername = s.split(",")[0];
		tempPassword = s.split(",")[1];
		if(b){
//			DataReader reader = new DataReader();
			Admin admin = (Admin)DataReader.read(Data.ADMIN);
			System.out.println(s);
			System.out.println(admin.getUsername()+",,"+admin.getPassword());
			
			if(tempUsername.equals(admin.getUsername())&&tempPassword.equals(admin.getPassword())){
				System.out.println("管理员登陆成功");
				return true;
				
			}else{
				
				return false;
			}
			
		}else{
//			return true;
			WorkerData worker_data = (WorkerData)DataReader.read(Data.WORKERS);
			String r = worker_data.getWorkerInfoByID(tempUsername);
			if(r.split(",")[3].equals("收银员")) return false;
			if(r==null){
				return false;
			}else{
				if(tempPassword.equals(r.split(",")[2])){
					return true;
				}else{
					return false;
				}
				
			}
			
			
			
			
		}
		
		
	}

	

}
