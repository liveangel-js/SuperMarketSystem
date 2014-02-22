package Logic;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import GUI.ClientLogin;

public class ServerLogic {
	
	
	private static Socket client;
	private static ObjectInputStream in;
	private static ObjectOutputStream out;
	private static String IP="127.0.0.1";
	private static int port=8888;
	
	
	
	
	
	//连接服务器
	public static void connectServer(){
		
		
		try{
			ClientLogin.remind("连接服务器中······\n");	
			System.out.print("连接服务器中······\n");
			client=new Socket(IP,port);
			ClientLogin.remind("服务器已连接\n");
			in=new ObjectInputStream(client.getInputStream());
			out=new ObjectOutputStream(client.getOutputStream());
		}
		catch(IOException e){
			ClientLogin.remind("服务器连接失败\n请检查网络设置\n");
			System.out.print("服务器连接失败\n请检查网络设置\n");
			e.printStackTrace();
		}
	}
	//断开与服务器的连接
	public static void breakServer(){
		try {
			in.close();
			out.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
