package GUI;
import javax.swing.*;
import java.awt.event.*;


public class CashierMenu extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button_sell;
	private JButton button_return;
	private JButton button_logout;
	private JButton button_exit;
	CashierPanel cp;
	

	public CashierMenu(CashierPanel cp){
		this.cp=cp;
		
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "主菜单"));
		   
		
		this.add(Box.createVerticalStrut(30));
	    button_sell=new JButton("销售任务");
	    button_sell.addActionListener(this);
		this.add(button_sell);
		
		
		this.add(Box.createVerticalStrut(10));
		button_return=new JButton("退货任务");
		button_return.addActionListener(this);
	    this.add(button_return);
	        
	    this.add(Box.createVerticalStrut(10));
	    //this.add(Box.createVerticalStrut(40));
	    button_logout=new JButton("注销用户");
	    button_logout.addActionListener(this);
	    this.add(button_logout);
	    
	    
	    this.add(Box.createVerticalStrut(10));
	    button_exit=new JButton("退出系统");
	    button_exit.addActionListener(this);
	    this.add(button_exit);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="销售任务"){
			cp.sellItem();
			return;
		}
		if(e.getActionCommand()=="退货任务"){
			cp.returnItem();
			return;
		}
        if(e.getActionCommand()=="注销用户"){
        	
		}
        if(e.getActionCommand()=="退出系统"){    
//        	Client.sendRequest();
//        	Client.user.setOn(false);
//        	Client.returnInfo();
//        	Client.breakServer();
        	System.exit(0);
        }		
	}
}
