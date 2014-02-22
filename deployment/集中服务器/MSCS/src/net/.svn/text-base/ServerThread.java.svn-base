package net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
	
	private ArrayList<CommandThread> commandThreads=new ArrayList<CommandThread>();
	
	private ServerSocket serverSocket;
	
	
	public static void main(String[] args){
		new ServerThread();
	}
	
	
	public ServerThread(){
			try {
				serverSocket = new ServerSocket(1111);
				System.out.println("Server Start");
				start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		
	}
	
	public void run(){
		try{
			while(true){
				System.out.println("等待客户端中~~~\n");
				Socket socket = serverSocket.accept();
				CommandThread commandThread = new CommandThread(socket);
				commandThread.start();
				commandThreads.add(commandThread);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
