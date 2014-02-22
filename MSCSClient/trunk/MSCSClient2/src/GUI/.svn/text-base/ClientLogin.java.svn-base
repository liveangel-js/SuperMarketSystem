package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ClientLogin extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH=250;
	public static final int HEIGHT=280;
	public static final int X=ClientFrame.X+ClientFrame.WIDTH/2-WIDTH/2;
	public static final int Y=ClientFrame.Y+ClientFrame.HEIGHT/2-HEIGHT/2;
	
	private JPanel loginPanel;
	private JTextField text_username;
	private JPasswordField text_password;
	private JButton button_login;	
	private JButton button_set;
	private JButton button_exit;
	private static TextArea text_info;
	ClientFrame cf;

	
	public ClientLogin(ClientFrame cf){	
		super(cf,"连锁超市销售系统1.0",true);
		this.setLocation(X,Y);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.cf=cf;
		
		this.login();
	}
	//按钮监听
    public void actionPerformed(ActionEvent e) {
    	if(e.getActionCommand()=="登录"){
        	this.setVisible(false);
        	cf.setVisible(true);
        	cf.add(new CashierPanel(cf));
        	cf.validate();
        	cf.repaint();
        	return;
    	}
    	if(e.getActionCommand()=="设置"){
        	return;
    	}
    	if(e.getActionCommand()=="退出"){
    		System.exit(EXIT_ON_CLOSE);
    	}

	}
	//初始化登录面板
	public void initializeLoginPanel(){
		loginPanel=new JPanel();
		loginPanel.setLayout(new BoxLayout(loginPanel,BoxLayout.Y_AXIS));
		
		
		JPanel p1=new JPanel();
		p1.add(new JLabel("用户账号"));
		text_username=new JTextField(10);
		p1.add(text_username);
		loginPanel.add(p1);
		
		
		JPanel p2=new JPanel();
		p2.add(new JLabel("用户密码"));
		text_password=new JPasswordField(10);
		text_password.setEchoChar('\u25cf');      //设置回显字符为'●'
		p2.add(text_password);
		loginPanel.add(p2);
		

		JPanel p3=new JPanel();
		button_login=new JButton("登录");
		button_login.addActionListener(this);
		p3.add(button_login);
		button_set=new JButton("设置");
		button_set.addActionListener(this);
		p3.add(button_set);
		button_exit=new JButton("退出");
		button_exit.addActionListener(this);
		p3.add(button_exit);
		loginPanel.add(p3);
	
		
		JPanel p4=new JPanel();
		text_info=new TextArea("",5,25,TextArea.SCROLLBARS_VERTICAL_ONLY);
		text_info.setEditable(false);
		p4.add(text_info);
		loginPanel.add(p4);
	}
	public void login(){
		this.initializeLoginPanel();
		this.add(loginPanel);
		this.validate();
		this.repaint();
	}
	public static void remind(String string_remind){
		text_info.append(string_remind+"\n");
	}
}
