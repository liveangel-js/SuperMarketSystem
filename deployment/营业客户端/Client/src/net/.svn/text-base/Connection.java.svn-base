package net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection {
	private static ObjectInputStream in;
	private static ObjectOutputStream out;
	private static Socket socket;
	
	
	public static void connect(){
		while(true){
			try {
				socket = new Socket("127.0.0.1",1111);
				System.out.println("Connected");
				out = new ObjectOutputStream(socket.getOutputStream());
				in = new ObjectInputStream(socket.getInputStream());
				System.out.println("Connected");
				break;
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	}
	
	
	
	public static Command in(){
		try {
			Command command=(Command) in.readObject();
			return command;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void out(Command command){
		try {
			out.writeObject(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
