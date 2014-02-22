package data;

public class StockItem extends Record{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private double price;
	private double cost;
	private int number;
	private String startDate;
	private String endDate;
	public StockItem(String ID,String name, double price, double cost, int number,
			String startDate, String endDate) {
		super();
		this.ID=ID;
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.number = number;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getStockItemInfo(){
		String s =ID+","+name+","+cost+","+number+","+startDate+","+endDate;
		System.out.println("ø‚¥Ê–≈œ¢"+s);
		return s;
	}
	public int getStockNumber(){
		return number;
	}
	public void setNumber(int n){
		this.number=n;
	}
	
	

}
