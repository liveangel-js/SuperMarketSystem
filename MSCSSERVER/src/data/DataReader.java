package data;
import java.io.*;


/**
 * @author Administrator
 *
 */
public class DataReader {
	
	private static String fileName;

	private static File file;
	
	private static FileInputStream fin;
	
	private static ObjectInputStream in;
	


	
	/**
	 * @return Data
	 */
	public static Data read(String file_name) {
		try{
			fileName=file_name;
			file=new File(fileName);
			fin=new FileInputStream(file);
			in=new ObjectInputStream(fin);    
			Data data=(Data)in.readObject();
			in.close();
			fin.close();                  
			return data;
		}
		catch(Exception e){	
			e.printStackTrace();
			return null;
		}
	}
}
