package server.Thread;

import server.data.UpdateServerData;

public class TransThread extends Thread{
	
	UpdateServerData updateServerData;
	
	public TransThread(UpdateServerData u){
		this.updateServerData = u;
	}
	
	public void run(){
		this.updateServerData.update();
	}
}
