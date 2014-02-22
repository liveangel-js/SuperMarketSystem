package mscs.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MemberData implements IDataReader,IDataWriter{
	ArrayList<MemberRecord> memberList;
	String fileName = "customers.txt";
	
	public MemberData(){
		memberList = new ArrayList<MemberRecord>();
		
		File file = new File(fileName);
        try {
        	MemberRecord mr;
            BufferedReader bufferReader = new BufferedReader(new FileReader(file));
            String text = "";
            String[] userInfo = null;
            while((text = bufferReader.readLine())!=null){
                userInfo = processInfo(text);
                mr = new MemberRecord(userInfo[1],(Integer.parseInt(userInfo[0])));
                memberList.add(mr);
            } 
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch(Exception e ){
            e.printStackTrace();
        }
	}

	public Record readDataByID(int id) {
		// TODO Auto-generated method stub
		for(MemberRecord m :memberList){
			if(m.getUid() == id)
				return m;
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
	
}
