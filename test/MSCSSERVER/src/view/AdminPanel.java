package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import data.Data;
import data.DataReader;
import data.DataWriter;
import data.Shop;

import logic.controller.WorkerManageController;
import logic.interfaces.WorkerManageInterface;


/**
 *
 * @author bhlb
 */
public class AdminPanel extends PanelModel {
	private WorkerManageInterface controller = new WorkerManageController();
	
	private void update(){
		jTableWorkerList.setModel(new javax.swing.table.DefaultTableModel(
	            controller.getTable(),
	            new String [] {
	                "工号", "姓名", "密码", "职位"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
		
	}
	//初始化默认设置
	private void initializeSet() {
		
		text_newID.setEditable(false);
		text_newID.setText("");
		text_newName.setEditable(false);
		text_newName.setText("");
		jrb_newBranch.setEnabled(false);
		jrb_newCashier.setEnabled(false);
		jrb_newCashier.setSelected(true);
		text_delID.setEditable(false);
		text_delID.setText("");
		text_delInfo.setEditable(false);
		text_delInfo.setText("");
		text_changeID.setEditable(false);
		text_changeID.setText("");
		text_changeInfo.setEditable(false);
		text_changeInfo.setText("");
		jrb_changeBranch.setEnabled(false);
		jrb_changeCashier.setEnabled(false);
		jrb_changeBranch.setSelected(true);
		jrb_newBranch.setEnabled(false);
		jrb_newCashier.setEnabled(false);
		jrb_newCashier.setSelected(true);
		text_shopID.setEditable(false);
		text_shopID.setText("");
		
		text_oldPassword.setEditable(false);
		text_oldPassword.setText("");
		text_newPassword.setEditable(false);
		text_newPassword.setText("");
		text_passwordID.setEditable(false);
		text_passwordID.setText("");
		
		
		
		update();
		
	
	}
	//重置设置
	private void reset() {
		jTableNew.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                
	            },
	            new String [] {
	                "工号", "姓名", "密码", "职位"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }
	        });
	}
	
	public AdminPanel() {
	        initComponents();
	   }

    /** Creates new form AdminPanel */
	 // <editor-fold defaultstate="collapsed" desc="Generated Code">
	
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btn_newClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_newID = new javax.swing.JTextField();
        text_newName = new javax.swing.JTextField();
        jrb_newCashier = new javax.swing.JRadioButton();
        jrb_newBranch = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNew = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableWorkerList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btn_setShop = new javax.swing.JButton();
        jbn_delCancel = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        text_delID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_delInfo = new javax.swing.JTextField();
        btn_newAdd = new javax.swing.JButton();
        jbn_delSure = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        text_shopID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_newPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jrb_changeCashier = new javax.swing.JRadioButton();
        jrb_changeBranch = new javax.swing.JRadioButton();
        jbn_changeCancel = new javax.swing.JButton();
        jbn_changeSure = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn_change = new javax.swing.JButton();
        text_passwordID = new javax.swing.JTextField();
        jbn_shopCancel = new javax.swing.JButton();
        jbn_shopSure = new javax.swing.JButton();
        btn_modifyPassword = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_changeInfo = new javax.swing.JTextField();
        text_changeID = new javax.swing.JTextField();
        jbn_delIDSure = new javax.swing.JButton();
        jbn_changeIDSure = new javax.swing.JButton();
        jbn_modifyPasswordIDSure = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        text_oldPassword = new javax.swing.JTextField();
        jbn_newPasswordSure = new javax.swing.JButton();

        setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        btn_newClose.setFont(getFont());
        btn_newClose.setText("结束");
        btn_newClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newCloseActionPerformed(evt);
            }
        });
        add(btn_newClose);
        btn_newClose.setBounds(900, 10, 70, 40);

        jLabel1.setFont(getFont());
        jLabel1.setText("新职位");
        add(jLabel1);
        jLabel1.setBounds(180, 450, 70, 30);

        jLabel2.setFont(getFont());
        jLabel2.setText("员工列表");
        add(jLabel2);
        jLabel2.setBounds(560, 70, 120, 30);

        jLabel3.setFont(getFont());
        jLabel3.setText("姓名");
        add(jLabel3);
        jLabel3.setBounds(320, 20, 60, 30);
        add(text_newID);
        text_newID.setBounds(230, 20, 80, 30);
        add(text_newName);
        text_newName.setBounds(370, 20, 100, 30);

        buttonGroup1.add(jrb_newCashier);
        jrb_newCashier.setFont(jrb_newBranch.getFont());
        jrb_newCashier.setText("收银员");
        add(jrb_newCashier);
        jrb_newCashier.setBounds(670, 20, 70, 27);

        buttonGroup1.add(jrb_newBranch);
        jrb_newBranch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jrb_newBranch.setText("分店经理");
        add(jrb_newBranch);
        jrb_newBranch.setBounds(580, 20, 90, 27);

        jTableNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "工号", "姓名", "密码", "职位"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNew);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 440, 170);

        jLabel4.setFont(getFont());
        jLabel4.setText("工号");
        add(jLabel4);
        jLabel4.setBounds(170, 20, 50, 30);

        jTableWorkerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "工号", "姓名", "密码", "职位"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableWorkerList);

        add(jScrollPane2);
        jScrollPane2.setBounds(550, 100, 430, 170);

        jLabel5.setFont(getFont());
        jLabel5.setText("新用户列表");
        add(jLabel5);
        jLabel5.setBounds(20, 60, 120, 30);

        btn_setShop.setFont(getFont());
        btn_setShop.setText("设置店铺号");
        btn_setShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setShopActionPerformed(evt);
            }
        });
        add(btn_setShop);
        btn_setShop.setBounds(20, 580, 130, 40);

        jbn_delCancel.setFont(getFont());
        jbn_delCancel.setText("取消");
        jbn_delCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_delCancelActionPerformed(evt);
            }
        });
        add(jbn_delCancel);
        jbn_delCancel.setBounds(930, 300, 70, 40);

        btn_new.setFont(getFont());
        btn_new.setText("雇佣新员工");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        add(btn_new);
        btn_new.setBounds(10, 10, 130, 40);
        add(text_delID);
        text_delID.setBounds(220, 310, 110, 30);

        jLabel6.setFont(getFont());
        jLabel6.setText("店铺号");
        add(jLabel6);
        jLabel6.setBounds(180, 580, 70, 30);

        jLabel7.setFont(getFont());
        jLabel7.setText("员工信息");
        add(jLabel7);
        jLabel7.setBounds(460, 300, 80, 30);
        add(text_delInfo);
        text_delInfo.setBounds(550, 310, 280, 30);

        btn_newAdd.setFont(getFont());
        btn_newAdd.setText("添加");
        btn_newAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newAddActionPerformed(evt);
            }
        });
        add(btn_newAdd);
        btn_newAdd.setBounds(790, 10, 70, 40);

        jbn_delSure.setFont(getFont());
        jbn_delSure.setText("离职");
        jbn_delSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_delSureActionPerformed(evt);
            }
        });
        add(jbn_delSure);
        jbn_delSure.setBounds(850, 300, 70, 40);

        btn_del.setFont(getFont());
        btn_del.setText("员工离职");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        add(btn_del);
        btn_del.setBounds(20, 300, 130, 40);
        add(text_shopID);
        text_shopID.setBounds(260, 580, 80, 30);

        jLabel8.setFont(getFont());
        jLabel8.setText("工号");
        add(jLabel8);
        jLabel8.setBounds(160, 500, 50, 30);

        jLabel9.setFont(getFont());
        jLabel9.setText("新密码");
        add(jLabel9);
        jLabel9.setBounds(670, 500, 60, 30);
        add(text_newPassword);
        text_newPassword.setBounds(740, 500, 120, 30);

        jLabel10.setFont(getFont());
        jLabel10.setText("职位");
        add(jLabel10);
        jLabel10.setBounds(490, 20, 60, 30);

        buttonGroup2.add(jrb_changeCashier);
        jrb_changeCashier.setFont(jrb_newBranch.getFont());
        jrb_changeCashier.setText("收银员");
        add(jrb_changeCashier);
        jrb_changeCashier.setBounds(360, 450, 70, 27);

        buttonGroup2.add(jrb_changeBranch);
        jrb_changeBranch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jrb_changeBranch.setText("分店经理");
        add(jrb_changeBranch);
        jrb_changeBranch.setBounds(270, 450, 90, 27);

        jbn_changeCancel.setFont(getFont());
        jbn_changeCancel.setText("取消");
        jbn_changeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_changeCancelActionPerformed(evt);
            }
        });
        add(jbn_changeCancel);
        jbn_changeCancel.setBounds(590, 440, 70, 40);

        jbn_changeSure.setFont(getFont());
        jbn_changeSure.setText("变化");
        jbn_changeSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_changeSureActionPerformed(evt);
            }
        });
        add(jbn_changeSure);
        jbn_changeSure.setBounds(510, 440, 70, 40);

        jLabel11.setFont(getFont());
        jLabel11.setText("工号");
        add(jLabel11);
        jLabel11.setBounds(170, 310, 50, 30);

        btn_change.setFont(getFont());
        btn_change.setText("职位变化");
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });
        add(btn_change);
        btn_change.setBounds(20, 390, 130, 40);
        add(text_passwordID);
        text_passwordID.setBounds(210, 500, 80, 30);

        jbn_shopCancel.setFont(getFont());
        jbn_shopCancel.setText("取消");
        jbn_shopCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_shopCancelActionPerformed(evt);
            }
        });
        add(jbn_shopCancel);
        jbn_shopCancel.setBounds(460, 580, 70, 40);

        jbn_shopSure.setFont(getFont());
        jbn_shopSure.setText("确认");
        jbn_shopSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_shopSureActionPerformed(evt);
            }
        });
        add(jbn_shopSure);
        jbn_shopSure.setBounds(380, 580, 70, 40);

        btn_modifyPassword.setFont(getFont());
        btn_modifyPassword.setText("修改密码");
        btn_modifyPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyPasswordActionPerformed(evt);
            }
        });
        add(btn_modifyPassword);
        btn_modifyPassword.setBounds(20, 500, 130, 40);

        jLabel12.setFont(getFont());
        jLabel12.setText("工号");
        add(jLabel12);
        jLabel12.setBounds(170, 390, 50, 30);

        jLabel13.setFont(getFont());
        jLabel13.setText("员工信息");
        add(jLabel13);
        jLabel13.setBounds(470, 390, 80, 30);
        add(text_changeInfo);
        text_changeInfo.setBounds(550, 390, 280, 30);
        add(text_changeID);
        text_changeID.setBounds(230, 390, 110, 30);

        jbn_delIDSure.setFont(getFont());
        jbn_delIDSure.setText("确认");
        jbn_delIDSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_delIDSureActionPerformed(evt);
            }
        });
        add(jbn_delIDSure);
        jbn_delIDSure.setBounds(360, 300, 70, 40);

        jbn_changeIDSure.setFont(getFont());
        jbn_changeIDSure.setText("确认");
        jbn_changeIDSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_changeIDSureActionPerformed(evt);
            }
        });
        add(jbn_changeIDSure);
        jbn_changeIDSure.setBounds(380, 380, 70, 40);

        jbn_modifyPasswordIDSure.setFont(getFont());
        jbn_modifyPasswordIDSure.setText("确认");
        jbn_modifyPasswordIDSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_modifyPasswordIDSureActionPerformed(evt);
            }
        });
        add(jbn_modifyPasswordIDSure);
        jbn_modifyPasswordIDSure.setBounds(330, 500, 70, 40);

        jLabel14.setFont(getFont());
        jLabel14.setText("旧密码");
        add(jLabel14);
        jLabel14.setBounds(440, 500, 70, 30);
        add(text_oldPassword);
        text_oldPassword.setBounds(510, 500, 120, 30);

        jbn_newPasswordSure.setFont(getFont());
        jbn_newPasswordSure.setText("修改");
        jbn_newPasswordSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_newPasswordSureActionPerformed(evt);
            }
        });
        add(jbn_newPasswordSure);
        jbn_newPasswordSure.setBounds(910, 500, 70, 40);
        initializeSet();
    }// </editor-fold>

    private void btn_setShopActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	text_shopID.setEditable(true);
    	text_shopID.setText("");
    }

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(text_newID.isEditable()) {
    		JOptionPane.showMessageDialog(null, "已经开启雇佣任务");
    		return;
    	}
    	text_newID.setEditable(true);
    	text_newName.setEditable(true);
    	text_newID.setText("");
    	text_newName.setText("");
    	jrb_newBranch.setEnabled(true);
    	jrb_newCashier.setEnabled(true);
    }

    private void btn_newAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_newID.isEditable()){
    		JOptionPane.showMessageDialog(null, "清点击雇佣新员工");
    		return;
    	}
    	try{
    		Integer.parseInt(text_newID.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	String position = null;
    	if(jrb_newBranch.isSelected()){
    		position = "分店经理";
    	}else{
    		position = "收银员";
    	}
    	Object[] newRow = {text_newID.getText(),text_newName.getText(),text_newID.getText(),position};
    	((DefaultTableModel)jTableNew.getModel()).addRow(newRow);
    	
    	text_newID.setEditable(true);
    	text_newName.setEditable(true);
    	text_newID.setText("");
    	text_newName.setText("");
    	jrb_newBranch.setEnabled(true);
    	jrb_newCashier.setEnabled(true);
    	
    }

    private void btn_newCloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_newID.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先开始任务");
    		return;
    	}
    	
    	String [] s =new String[jTableNew.getRowCount()];
    	String temp = null;
    	for(int i=0;i<s.length;i++){
    		temp = (String) jTableNew.getModel().getValueAt(i, 0)+","+(String) jTableNew.getModel().getValueAt(i, 1)+","+
    				(String) jTableNew.getModel().getValueAt(i, 2)+","+(String) jTableNew.getModel().getValueAt(i, 3);
    		s[i]=temp;
    	}
    	controller.writeData(s);
    	update();
    	reset();
    }

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(text_delID.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先取消员工离职");
    		return;
    	}
    	text_delID.setText("");
    	text_delID.setEditable(true);
    	text_delInfo.setText("");
    }

    private void jbn_delSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    	if(text_delInfo.getText().equals("")){
    		if(text_delID.isEditable()){
    			JOptionPane.showMessageDialog(null, "请先输入工号并确认");return;
    		}else{
    			JOptionPane.showMessageDialog(null, "请先点击员工离职");return;
    		}
    		
    	}
    	String ID= text_delID.getText();
    	if(controller.deleteWorker(ID)){
    		JOptionPane.showMessageDialog(null, "删除成功");
    		text_delID.setText("");
        	text_delID.setEditable(false);
        	text_delInfo.setText("");
        	text_delInfo.setEditable(false);
        	update();
        	
    	}else{
    		JOptionPane.showMessageDialog(null, "不存在此员工");
    		text_delID.setText("");
        	text_delID.setEditable(false);
        	text_delInfo.setText("");
        	text_delInfo.setEditable(false);
        	update();
    	}
    	
    	
    }

    private void jbn_delCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	text_delID.setText("");
    	text_delID.setEditable(false);
    	text_delInfo.setText("");
    	text_delInfo.setEditable(false);
    	
    }

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(text_changeID.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先职位变化--取消");
    		return;
    	}
    	text_changeID.setText("");
    	text_changeID.setEditable(true);
    	text_changeInfo.setText("");
    	
    }

    private void jbn_changeSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(text_changeInfo.getText().equals("")){
    		if(text_delID.isEditable()){
    			JOptionPane.showMessageDialog(null, "请先输入工号并确认");return;
    		}else{
    			JOptionPane.showMessageDialog(null, "请先点击职位变化");return;
    		}
    		
    	}
    	
    	if(jrb_changeBranch.isSelected()){
    		controller.changePosition(text_changeID.getText(), "分店经理");
    	}else{
    		controller.changePosition(text_changeID.getText(), "收银员");
    	}
    	text_changeID.setEditable(false);
		text_changeID.setText("");
		text_changeInfo.setEditable(false);
		text_changeInfo.setText("");
		jrb_changeBranch.setEnabled(false);
		jrb_changeCashier.setEnabled(false);
		update();
    	
    }

    private void jbn_changeCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	text_changeID.setEditable(false);
		text_changeID.setText("");
		text_changeInfo.setEditable(false);
		text_changeInfo.setText("");
		jrb_changeBranch.setEnabled(false);
		jrb_changeCashier.setEnabled(false);
    }

    private void jbn_shopSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_shopID.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先点击设置店铺号");return;
    	}
    	try{
    		Integer.parseInt(text_shopID.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	int n = Integer.parseInt(text_shopID.getText());
    	if(n<=0||(n/10!=0)){
    		JOptionPane.showMessageDialog(null, "店铺号只能为1位数字");
    		return;
    	}
    	Shop temp = (Shop)DataReader.read(Data.SHOPNUMBER);
    	temp.setShopNumber(n);
    	DataWriter.write(temp, Data.SHOPNUMBER);
    	text_shopID.setEditable(false);
    	text_shopID.setText("");
    	JOptionPane.showMessageDialog(null, "设置成功现在的店铺号为"+n);
    	
    	
    }

    private void jbn_shopCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	text_shopID.setEditable(false);
    	text_shopID.setEditable(true);
    	
    }
    private void btn_modifyPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	text_passwordID.setText("");
    	text_passwordID.setEditable(true);
    	
    	
    }

    private void jbn_delIDSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	try{
    		Integer.parseInt(text_delID.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	String info = controller.getWorkerByID(text_delID.getText());
    	if(info==null){
    		JOptionPane.showMessageDialog(null, "不存在此员工！");
    		return;
    	}
    	text_delID.setEditable(false);
    	text_delInfo.setText(info);
    }

    private void jbn_changeIDSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	try{
    		Integer.parseInt(text_changeID.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	String info = controller.getWorkerByID(text_changeID.getText());
    	if(info==null){
    		JOptionPane.showMessageDialog(null, "不存在此员工！");
    		return;
    	}
    	text_changeID.setEditable(false);
    	text_changeInfo.setText(info);
    	jrb_changeBranch.setEnabled(true);
    	jrb_changeCashier.setEnabled(true);
    }

    private void jbn_modifyPasswordIDSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_passwordID.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先点击修改密码");
    		return;
    	}
    	try{
    		Integer.parseInt(text_passwordID.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	
    	if(controller.getWorkerByID(text_passwordID.getText())==null){
    		text_passwordID.setText("");
    		JOptionPane.showMessageDialog(null, "不存在此员工");
    		
    		return;
    	}
    	text_passwordID.setEditable(false);
    	text_oldPassword.setText(controller.getWorkerByID(text_passwordID.getText()).split(",")[2]);
    	text_newPassword.setEditable(true);
    	text_newPassword.setText("");
    	
    	
    }

    private void jbn_newPasswordSureActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_newPassword.isEditable()){
    		JOptionPane.showMessageDialog(null, "前置工作未完成不能修改密码");
    		return;
    	}
    	controller.changePassword(text_passwordID.getText(), text_newPassword.getText());
    	update();
    	text_passwordID.setEditable(false);
    	text_passwordID.setText("");
    	text_oldPassword.setEditable(false);
    	text_oldPassword.setText("");
    	text_newPassword.setEditable(false);
    	text_newPassword.setText("");
    	
    	
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_modifyPassword;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_newAdd;
    private javax.swing.JButton btn_newClose;
    private javax.swing.JButton btn_setShop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableNew;
    private javax.swing.JTable jTableWorkerList;
    private javax.swing.JButton jbn_changeCancel;
    private javax.swing.JButton jbn_changeIDSure;
    private javax.swing.JButton jbn_changeSure;
    private javax.swing.JButton jbn_delCancel;
    private javax.swing.JButton jbn_delIDSure;
    private javax.swing.JButton jbn_delSure;
    private javax.swing.JButton jbn_modifyPasswordIDSure;
    private javax.swing.JButton jbn_newPasswordSure;
    private javax.swing.JButton jbn_shopCancel;
    private javax.swing.JButton jbn_shopSure;
    private javax.swing.JRadioButton jrb_changeBranch;
    private javax.swing.JRadioButton jrb_changeCashier;
    private javax.swing.JRadioButton jrb_newBranch;
    private javax.swing.JRadioButton jrb_newCashier;
    private javax.swing.JTextField text_changeID;
    private javax.swing.JTextField text_changeInfo;
    private javax.swing.JTextField text_delID;
    private javax.swing.JTextField text_delInfo;
    private javax.swing.JTextField text_newID;
    private javax.swing.JTextField text_newName;
    private javax.swing.JTextField text_newPassword;
    private javax.swing.JTextField text_oldPassword;
    private javax.swing.JTextField text_passwordID;
    private javax.swing.JTextField text_shopID;

}
