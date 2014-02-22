package data;
import java.io.*;


public class DataWriter {
	
	private static String fileName;

	private static File file;
	
	private static FileOutputStream fout;
	
	private static ObjectOutputStream out;

	
	
	public static void write(Data data,String file_name) {
		try {
			fileName=file_name;
			file=new File(fileName);
			fout=new FileOutputStream(file);
			out=new ObjectOutputStream(fout);
			out.writeObject(data);
			out.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
