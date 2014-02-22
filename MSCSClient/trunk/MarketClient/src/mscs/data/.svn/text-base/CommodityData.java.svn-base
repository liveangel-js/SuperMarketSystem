package mscs.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class CommodityData implements IDataReader,IDataWriter,IDataUpdate{
	
	ArrayList<CommodityRecord> commidityList = new ArrayList<CommodityRecord>();
	String fileName = "goods.txt";
	
	public CommodityData(){
		File file = new File(fileName);
        try{
            BufferedReader bufferReader = new BufferedReader(new FileReader(file));
            String text = "";
            String[] goodInfo = null;
            CommodityRecord cr = null;
            while((text = bufferReader.readLine())!=null){
            	if(text.trim().equals(""))
            		continue;
                goodInfo = processInfo(text);
                cr = new CommodityRecord(Integer.parseInt(goodInfo[0]),goodInfo[1],Double.parseDouble(goodInfo[2]),Double.parseDouble(goodInfo[3]),goodInfo[4],goodInfo[5]);
                this.commidityList.add(cr);
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
	}

	public Record readDataByID(int id) {
		// TODO Auto-generated method stub
		for(CommodityRecord c : commidityList){
			if(c.getGid() == id)
				return c;
		}
		return null;
	}

	public void saveData(Record r) {
		// TODO Auto-generated method stub
		
	}
	private String[] processInfo(String info){
        String[] items = info.split(",");
        return items;
    }

	public void startUpdate() {
		// TODO Auto-generated method stub
		int bufferSize = 8192;  
        byte[] buf = new byte[bufferSize];
        int port = 8821;
        String filename = "goods.txt";
        Socket s = null;
        try {
            ServerSocket ss = new ServerSocket(port);
            while(true){
                s = ss.accept();
                System.out.println("连接成功");
                
                DataInputStream inputStream = new DataInputStream(new BufferedInputStream(s.getInputStream()));  
                DataOutputStream fileOut = new DataOutputStream(new BufferedOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))); 
                
                while (true) {  
                    int read = 0;  
                    if (inputStream != null) {  
                        read = inputStream.read(buf);  
                    }  
                    if (read == -1) {  
                        break;  
                    }   
                    fileOut.write(buf, 0, read);  
                } 
                System.out.println("传输完毕");
                
                fileOut.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
	}
}
