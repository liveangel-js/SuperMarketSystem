package view;
import javax.swing.*;
import java.awt.event.*;


public class CashierMenu extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String SELL="销售任务";
	
	public static final String RETURNITEM="退货任务";
	
	public static final String LOGOUT="注销用户";
	
	public static final String EXIT="退出系统";
	
	private JButton button_sell;
	
	private JButton button_return;
	
	private JButton button_logout;
	
	private JButton button_exit;

	
	/**
	 * 
	 */
	public CashierMenu(){
		this.initialize();
	}

	
	/**
	 * 
	 */
	public void initialize(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "主菜单"));
		
		
		this.add(Box.createVerticalStrut(30));
	    button_sell=new JButton(SELL);
	    button_sell.addActionListener(this);
		this.add(button_sell);
		
		
		this.add(Box.createVerticalStrut(10));
		button_return=new JButton(RETURNITEM);
		button_return.addActionListener(this);
	    this.add(button_return);
	        
	    this.add(Box.createVerticalStrut(10));
	    //this.add(Box.createVerticalStrut(40));
	    button_logout=new JButton(LOGOUT);
	    button_logout.addActionListener(this);
	    this.add(button_logout);
	    
	    
	    this.add(Box.createVerticalStrut(10));
	    button_exit=new JButton(EXIT);
	    button_exit.addActionListener(this);
	    this.add(button_exit);
	}
	
	
	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()==SELL){
			this.sellItem();
			return;
		}
		if(e.getActionCommand()==RETURNITEM){
			this.returnItem();
			return;
		}
        if(e.getActionCommand()==LOGOUT){
        	this.logout();
        	return;
		}
        if(e.getActionCommand()==EXIT){    
        	this.exit();
        	return;

        }		
	}
	
	
	/**
	 * 
	 */
	public void sellItem(){
		if(this.getParent().getComponentCount()==2){
			this.getParent().remove(1);
		}
		this.getParent().add(new SalePanel());
		this.getParent().validate();
		this.getParent().repaint();
	}
	
	
	/**
	 * 
	 */
	public void returnItem(){
		if(this.getParent().getComponentCount()==2){
			this.getParent().remove(1);
		}
		this.getParent().add(new ReturnPanel());
		this.getParent().validate();
		this.getParent().repaint();
	}
	
	
	/**
	 * 
	 */
	public void logout(){
		
	}
	
	
	/**
	 * 
	 */
	public void exit(){
		//
		//
    	System.exit(0);
	}
}
