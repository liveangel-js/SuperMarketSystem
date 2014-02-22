package view;
import java.awt.*;
import javax.swing.*;


/**
 * @author Administrator
 *
 */
public class ClientFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 800;
	
	public static final int HEIGHT = 600;
	
	public static final int X = 200;
	
	public static final int Y = 50;

	
	/**
	 * 
	 */
	public ClientFrame() {
		super("连锁超市销售系统客户端1.0");
		this.setLocation(X, Y);
		this.setSize(WIDTH, HEIGHT);
		//this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.initialize();
	}
	
	
	/**
	 * 
	 */
	public void initialize(){
    	this.setVisible(true);
    	this.add(new CashierPanel());
    	this.validate();
    	this.repaint();
	}
}
