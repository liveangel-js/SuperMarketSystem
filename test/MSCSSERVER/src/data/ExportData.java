package data;

import java.util.ArrayList;

public class ExportData extends Data{
	private static final long serialVersionUID = 1L;
	ArrayList<ExportRecord> exportList=new ArrayList<ExportRecord>();
	
	public ExportData(){
		
	}
	public void addExport(ExportRecord exportRecord){
		exportList.add(exportRecord);
	}

}
