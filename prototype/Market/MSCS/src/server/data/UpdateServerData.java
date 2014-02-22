package server.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UpdateServerData implements UpdateDataInterface{
      public void update(){
    	  String filePath = "商品特价信息.txt";
          try {
              // TODO code application logic here
              Socket s = new Socket("localhost",8821);
              System.out.println("connect ok");
              DataOutputStream ps = new DataOutputStream(s.getOutputStream());
              DataInputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
              
              //
              int bufferSize = 8192;  
              byte[] buf = new byte[bufferSize];  
              while (true) {  
                      int read = 0;  
                      if (fis != null) {  
                          read = fis.read(buf);  
                      }  
    
                      if (read == -1) {  
                          break;  
                      }  
                      ps.write(buf, 0, read);  
              }
              ps.flush();
              fis.close();  
              s.close();                  
              System.out.println("transfer OK");  
              
          } catch (UnknownHostException ex) {
              ex.printStackTrace();
          } catch (Exception ex) {
              ex.printStackTrace();
          }
      }
}
