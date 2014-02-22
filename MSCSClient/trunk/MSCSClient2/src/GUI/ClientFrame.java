package GUI;
import java.awt.*;
import javax.swing.*;
import Data.Item;
import Data.VIP;
import Logic.Controller;



public class ClientFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	public static final int X = 200;
	public static final int Y = 50;

	
	public ClientFrame() {
		super("连锁超市销售系统1.0");
		this.setLocation(X, Y);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}

	// 登陆界面
	public void login() {
		this.setVisible(false);
		new ClientLogin(this).setVisible(true);
	}
	// main方法入口
	public static void main(String args[]) {
		inilizaze();
		ClientFrame c=new ClientFrame();
		c.login();
	}
	public static void inilizaze(){
		Controller.getShop().getItemList().add(new Item(1, "帽子", 12.5, 10, 10.5,105 ));
		Controller.getShop().getVipList().add(new VIP(1, "二胖", "15996221234", 2000, 1000));
	}
}
