package view;
import java.awt.*;
import javax.swing.*;

import net.Command;
import net.Connection;

import java.awt.event.*;

import logic.controller.Controller;

/**
 * @author Administrator
 * 
 */
public class LoginDialog extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 250;

	public static final int HEIGHT = 280;

	public static final int X = ClientFrame.X + ClientFrame.WIDTH / 2 - WIDTH / 2;

	public static final int Y = ClientFrame.Y + ClientFrame.HEIGHT / 2 - HEIGHT / 2;

	public static final String LOGIN = "登录";

	public static final String SETTING = "设置";

	public static final String EXIT = "退出";

	private static TextArea text_info;

	private JPanel panel_login;

	private JTextField text_username;

	private JPasswordField text_password;

	private JButton button_login;

	private JButton button_set;

	private JButton button_exit;

//	private LoginInterface service;

	/**
	 * 
	 */
	public LoginDialog() {
		super(new JFrame(), "连锁超市销售系统客户端1.0", true);
		this.initialize();
		this.setVisible(true);
	}

	/**
	 * 
	 */
	public void initialize() {
		this.setLocation(X, Y);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new FlowLayout());
	
		
	//	service = new LoginController();
		panel_login = new JPanel();
		panel_login.setLayout(new BoxLayout(panel_login, BoxLayout.Y_AXIS));
		this.add(panel_login);

		JPanel panel_username = new JPanel();
		panel_username.add(new JLabel("用户账号"));
		text_username = new JTextField(15);
		panel_username.add(text_username);
		panel_login.add(panel_username);

		JPanel panel_password = new JPanel();
		panel_password.add(new JLabel("用户密码"));
		text_password = new JPasswordField(15);
		text_password.setEchoChar('\u25cf');
		panel_password.add(text_password);
		panel_login.add(panel_password);

		JPanel panel_button = new JPanel();
		button_login = new JButton(LOGIN);
		button_login.addActionListener(this);
		button_login.setPreferredSize(new Dimension(60,20));
		panel_button.add(button_login);

		button_set = new JButton(SETTING);
		button_set.addActionListener(this);
		button_set.setPreferredSize(new Dimension(60,20));
		button_set.setEnabled(false);
		panel_button.add(button_set);

		button_exit = new JButton(EXIT);
		button_exit.addActionListener(this);
		button_exit.setPreferredSize(new Dimension(60,20));
		panel_button.add(button_exit);
		panel_login.add(panel_button);

		JPanel panel_remind_info = new JPanel();
		text_info = new TextArea("", 5, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
		text_info.setEditable(false);
		panel_remind_info.add(text_info);
		panel_login.add(panel_remind_info);
		
		
		//this.setVisible(true);
		//this.validate();
		//this.repaint();
	}

	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == LOGIN) {
			this.userLogin();
			return;
		}
		if (e.getActionCommand() == SETTING) {
			this.set();
			return;
		}
		if (e.getActionCommand() == EXIT) {
			this.exit();
		}
	}

	/**
	 * 
	 */
	public void userLogin() {
		@SuppressWarnings("deprecation")
		Object para[]={text_username.getText(),text_password.getText()};
		Command command=new Command("LOGIN", "CASHIER", para);
		Connection.out(command);
		boolean ok=(Boolean) Connection.in().getResult();
		//boolean ok=true;
		if (!ok) {
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
		}
		Controller.cashier_id=text_username.getText();
		this.setVisible(false);
		new ClientFrame();
	}

	/**
     * 
     */
	public void set() {

	}

	/**
     * 
     */
	public void exit() {
		System.exit(EXIT_ON_CLOSE);
	}

	/**
	 * @param string_remind
	 */
	public static void remind(String string_remind) {
		text_info.append(string_remind + "\n");
	}




	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Connection.connect();
		Skin.set();
		new LoginDialog();
	}
}
