package GUI;
import java.awt.*;
import javax.swing.*;


public class CashierPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH=ClientFrame.WIDTH;
	public static final int HEIGHT=ClientFrame.HEIGHT;
	ClientFrame cf;
	CashierMenu menu;
    SalePanel sp;
	ReturnItemPanel rp;
	
	
	public CashierPanel (ClientFrame cf){
		this.cf=cf;
		this.setLayout(new BorderLayout());
		menu=new CashierMenu(this);
		this.add(menu,BorderLayout.WEST);
		sp=new SalePanel(this);
		this.add(sp);
	}
	//
	public void sellItem(){
		sp=new SalePanel(this);
		this.remove(1);
		this.add(sp);
		this.validate();
		this.repaint();
	}
	//
	public void returnItem(){
		rp=new ReturnItemPanel(this);
		this.remove(1);
		this.add(rp);
		this.validate();
		this.repaint();
	}
}
