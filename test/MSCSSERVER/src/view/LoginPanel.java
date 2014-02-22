/*
 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LogicPanel.java
 *
 * Created on 2011-11-24, 18:49:56
 */

package view;

import javax.swing.JOptionPane;

import logic.controller.LoginController;
import logic.interfaces.LoginInterface;

//import logic.LoginController;
//import logic.interfaces.LoginInterface;

/**
 *
 * @author bhlb
 */
public class LoginPanel extends javax.swing.JPanel implements InputInterface {
	private ShowMainViewInterface mainView;
	private ShowAdminMainViewInterface adminView;

	private LoginInterface lc;
    /** Creates new form LogicPanel */
    public LoginPanel(ShowMainViewInterface s,ShowAdminMainViewInterface a) {
//    	this.mainView=mv;
    	mainView = s;
    	adminView = a;
    	lc=new LoginController();
//    	li=loginInterface;
        initComponents();
    }

    @Override
	public String getInputInfo() {
		// TODO Auto-generated method stub
    	String temp = null;
    	if(isAdministrator.isSelected()){
    		temp = "administrator"+","+username.getText()+","+password.getText();
    		System.out.println(temp);
    	}else{
    		temp ="manager"+","+username.getText()+","+password.getText();
    		System.out.println(temp);
    	}
		return temp;
    
	}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Login = new javax.swing.JButton();
        faq = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isAdministrator = new javax.swing.JRadioButton();
        isShopManager = new javax.swing.JRadioButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(null);

        Login.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        Login.setText("登录");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        add(Login);
        Login.setBounds(330, 420, 150, 70);

        faq.setFont(Login.getFont());
        faq.setText("FAQ");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });
        add(faq);
        faq.setBounds(540, 420, 140, 70);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel1.setText("营业服务器");
        add(jLabel1);
        jLabel1.setBounds(400, 140, 250, 70);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel2.setText("超市连锁系统登录端");
        add(jLabel2);
        jLabel2.setBounds(290, 50, 440, 70);

        jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        jLabel3.setText("密码");
        add(jLabel3);
        jLabel3.setBounds(220, 300, 80, 50);

        jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        jLabel4.setText("用户名");
        add(jLabel4);
        jLabel4.setBounds(220, 220, 110, 50);

        buttonGroup1.add(isAdministrator);
        isAdministrator.setFont(Login.getFont());
        isAdministrator.setText("管理员");
        add(isAdministrator);
        isAdministrator.setBounds(350, 370, 130, 40);

        buttonGroup1.add(isShopManager);
        isShopManager.setFont(Login.getFont());
        isShopManager.setText("分店经理");
        isShopManager.setSelected(true);
        add(isShopManager);
        isShopManager.setBounds(560, 370, 160, 40);

        username.setFont(jLabel3.getFont());
        add(username);
        username.setBounds(390, 230, 230, 50);

        password.setFont(jLabel3.getFont());
        add(password);
        password.setBounds(390, 310, 230, 50);
    }// </editor-fold>

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(isAdministrator.isSelected()){
    		if(lc.Login(true, username.getText()+","+password.getText())){
    			adminView.showAdminPanel();
    		}else{
    			JOptionPane.showMessageDialog(null, "用户名或密码错误");
    		}
    	}else{
    		if(lc.Login(false, username.getText()+","+password.getText())){
    			mainView.showMainView();
    		}else{
    			JOptionPane.showMessageDialog(null, "用户名或密码错误");
    		}
    		
    	}
    }

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Login;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton faq;
    private javax.swing.JRadioButton isAdministrator;
    private javax.swing.JRadioButton isShopManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration
	

}
