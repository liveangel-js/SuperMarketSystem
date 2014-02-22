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
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "���˵�"));
		   
		
		this.add(Box.createVerticalStrut(30));
	    button_sell=new JButton("��������");
	    button_sell.addActionListener(this);
		this.add(button_sell);
		
		
		this.add(Box.createVerticalStrut(10));
		button_return=new JButton("�˻�����");
		button_return.addActionListener(this);
	    this.add(button_return);
	        
	    this.add(Box.createVerticalStrut(10));
	    //this.add(Box.createVerticalStrut(40));
	    button_logout=new JButton("ע���û�");
	    button_logout.addActionListener(this);
	    this.add(button_logout);
	    
	    
	    this.add(Box.createVerticalStrut(10));
	    button_exit=new JButton("�˳�ϵͳ");
	    button_exit.addActionListener(this);
	    this.add(button_exit);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="��������"){
			cp.sellItem();
			return;
		}
		if(e.getActionCommand()=="�˻�����"){
			cp.returnItem();
			return;
		}
        if(e.getActionCommand()=="ע���û�"){
        	
		}
        if(e.getActionCommand()=="�˳�ϵͳ"){    
//        	Client.sendRequest();
//        	Client.user.setOn(false);
//        	Client.returnInfo();
//        	Client.breakServer();
        	System.exit(0);
        }		
	}
}
