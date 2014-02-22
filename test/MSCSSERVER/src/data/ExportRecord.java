package data;

public class ExportRecord extends Record{
	private static final long serialVersionUID = 1L;
	private String name;
	private double cost;
	private int number;
	private String reason;
	public ExportRecord(String ID,String name, double cost, int number, String reason) {
		super();
		this.ID = ID;
		this.name = name;
		this.cost = cost;
		this.number = number;
		this.reason = reason;
	}

}
