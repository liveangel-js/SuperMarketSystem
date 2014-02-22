package net;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import net.handler.HandlerFactory;
import net.handler.HandlerInterface;
import net.handler.LoginHandler;


public class CommandThread extends Thread {
	
	private Socket socket;
	
	private Command command;
	
	private HandlerInterface handler;
	
	private ObjectInputStream in;
	
	private ObjectOutputStream out;
	
	
	public CommandThread(Socket s){
		try {
			socket = s;
			in = new ObjectInputStream(socket.getInputStream());
			out = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void run(){
		while(true){
			try {
				command = (Command) in.readObject();
				System.out.println(command);
				handler = HandlerFactory.createHandler(command.getCommand());
				handler.handle(command);
				out.writeObject(command);
			} catch (Exception e) {
			    e.printStackTrace();
			    break;
		    }
	    }
	}
}
