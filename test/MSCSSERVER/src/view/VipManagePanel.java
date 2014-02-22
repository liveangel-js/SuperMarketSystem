/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VipManagePanel.java
 *
 * Created on 2011-11-23, 23:16:26
 */

package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import logic.controller.VipManageController;
import logic.interfaces.VipManageInterface;


import data.toObjectInterface;


/*
 *
 * @author bhlb
 */
public class VipManagePanel  extends PanelModel {
	VipManageInterface controller = new VipManageController();
	private int last=0;
	


    /** Creates new form VipManagePanel */
    public VipManagePanel() {
    	//增加会员按钮不能按两次未防御好，输入内容检测防御未设置好，取消输入回复工作未设置好
    	
        initComponents();
    }

//获取输入信息
   
    public String getInputInfo() {
		// TODO Auto-generated method stub
    	String temp = null;
    	if(male.isSelected()){
    		temp = text_ID.getText()+","+text_name.getText()+","+text_birthdate.getText()+","+"男"+","+text_mobile.getText()+","
    			+text_restScores.getText()+","+text_totalScores.getText();
    		System.out.println(temp);
    	}else{
    		temp = text_ID.getText()+","+text_name.getText()+","+text_birthdate.getText()+","+"女"+","+text_mobile.getText()+","
			+text_restScores.getText()+","+text_totalScores.getText();
    		System.out.println(temp);
    	}
		return temp;
	}
//更新显示信息 
    private void Update() {
//    	table_vip.setModel(tableModel.getTableModel());
		
	}
//初始化默认设置
    private void initializeSet() {
	
    	jTable1.setModel(new javax.swing.table.DefaultTableModel(
                controller.getVipTable(),
                    new String [] {
                        "ID", "姓名", "生日", "性别", "联系方式", "积分余额", "积分总额"
                    }
                ) {
                    Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class
                    };
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
//    	table_vip.setModel(tableModel.getTableModel());
//    	text_ID.setText(vmc.getNewVipId()+"");
    	text_ID.setEditable(false);
    	text_name.setText("");
    	text_name.setEditable(false);
    	text_birthdate.setText("");
    	text_birthdate.setEditable(false);
    	text_mobile.setText("");
    	text_mobile.setEditable(false);
    	text_restScores.setText("");
    	text_restScores.setEditable(false);
    	text_totalScores.setText("");
    	text_totalScores.setEditable(false);
    	text_IDDel.setText("");
    	text_IDDel.setEditable(false);
    	male.setEnabled(true);
    	female.setEnabled(true);
    	male.setSelected(true);
//重置设置
	}
	private void reset() {
		// TODO Auto-generated method stub
//		table_vip.setModel(tableModel.getTableModel());
		text_ID.setText("");
		text_ID.setEditable(false);
    	text_name.setText("");
    	text_name.setEditable(false);
    	text_birthdate.setText("");
    	text_birthdate.setEditable(false);
    	text_mobile.setText("");
    	text_mobile.setEditable(false);
    	text_restScores.setText("");
    	text_restScores.setEditable(false);
    	text_totalScores.setText("");
    	text_totalScores.setEditable(false);
    	male.setEnabled(false);
    	female.setEnabled(false);
	}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
	  // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_Open = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label_ID = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        label_name = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        text_birthdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_mobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_restScores = new javax.swing.JTextField();
        text_totalScores = new javax.swing.JTextField();
        btn_sure = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        btn_DelOpen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        text_IDDel = new javax.swing.JTextField();
        btn_Del = new javax.swing.JButton();

        setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N

        btn_Open.setFont(getFont());
        btn_Open.setText("增加新会员任务");
        btn_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OpenActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
               
            },
            new String [] {
                "ID", "姓名", "生日", "性别", "联系方式", "积分余额", "积分总额"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        label_ID.setFont(new java.awt.Font("微软雅黑", 0, 24));
        label_ID.setText("ID");

        text_ID.setFont(label_ID.getFont());

        label_name.setFont(label_ID.getFont());
        label_name.setText("姓名");

        buttonGroup1.add(male);
        male.setFont(label_ID.getFont());
        male.setText("男");

        buttonGroup1.add(female);
        female.setFont(label_ID.getFont());
        female.setText("女");

        jLabel1.setFont(label_ID.getFont());
        jLabel1.setText("生日");

        jLabel2.setFont(label_ID.getFont());
        jLabel2.setText("联系方式");

        jLabel3.setFont(label_ID.getFont());
        jLabel3.setText("积分总额");

        jLabel4.setFont(label_ID.getFont());
        jLabel4.setText("积分余额");

        btn_sure.setFont(getFont());
        btn_sure.setText("确定");
        btn_sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sureActionPerformed(evt);
            }
        });

        btn_Close.setFont(getFont());
        btn_Close.setText("关闭");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });

        btn_DelOpen.setFont(getFont());
        btn_DelOpen.setText("删除会员");
        btn_DelOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelOpenActionPerformed(evt);
            }
        });

        jLabel5.setFont(label_ID.getFont());
        jLabel5.setText("会员ID");

        btn_Del.setFont(getFont());
        btn_Del.setText("删除");
        btn_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_DelOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(text_IDDel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(text_restScores, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_name)
                                        .addComponent(male))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(female))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(66, 66, 66)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(text_ID, 0, 0, Short.MAX_VALUE)
                                                .addComponent(text_birthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(text_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(text_mobile, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(text_totalScores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE,126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Open, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Open, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ID)
                    .addComponent(text_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_name, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(label_name))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_totalScores, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(text_restScores, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DelOpen)
                    .addComponent(jLabel5)
                    .addComponent(text_IDDel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Del))
                .addGap(37, 37, 37))
        );
        initializeSet();
    }// </editor-fold>

    private void btn_OpenActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	if(text_name.isEditable()){
    		JOptionPane.showMessageDialog(null, "已经开始增加会员任务");
    	}
    	text_ID.setText(controller.getNewVipNum()+"");
    	text_name.setText("");
    	text_name.setEditable(true);
    	text_birthdate.setText("");
    	text_birthdate.setEditable(true);
    	text_mobile.setText("");
    	text_mobile.setEditable(true);
    	text_restScores.setText("");
    	text_restScores.setEditable(true);
    	text_totalScores.setText("");
    	text_totalScores.setEditable(true);
    	male.setEnabled(true);
    	female.setEnabled(true);
    	last = jTable1.getModel().getRowCount();
    	
    }                                        

    private void btn_sureActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	if(!text_name.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先点击增加新会员任务");
    	}
    	try{
    		Integer.parseInt(text_totalScores.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	try{
    		Long.parseLong(text_mobile.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	try{
    		Integer.parseInt(text_restScores.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	String sex = null;
    	if(male.isSelected()){
    		sex = "男";
    	}else{
    		sex="女";
    	}
    	Object[] newRow = {text_ID.getText(),text_name.getText(),text_birthdate.getText(),sex,text_mobile.getText(),text_totalScores.getText(),text_restScores.getText()};
    	((DefaultTableModel)jTable1.getModel()).addRow(newRow);
    	
    	controller.addNewVipNum();
    	text_ID.setText(controller.getNewVipNum()+"");
    	text_name.setText("");
    	text_name.setEditable(true);
    	text_birthdate.setText("");
    	text_birthdate.setEditable(true);
    	text_mobile.setText("");
    	text_mobile.setEditable(true);
    	text_restScores.setText("");
    	text_restScores.setEditable(true);
    	text_totalScores.setText("");
    	text_totalScores.setEditable(true);
    	
    }                                        

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	if(!text_name.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先点击增加新会员任务");
    	}
    	text_ID.setText("");
    	int nowRow = jTable1.getModel().getRowCount();
    	int length = nowRow-last;
    	String [] s = new String[length];
    	String temp = null;
    	for(int i=0;i<s.length;i++){
    		temp = (String)jTable1.getModel().getValueAt(last, 0)+","+(String)jTable1.getModel().getValueAt(last, 1)
    				+","+(String)jTable1.getModel().getValueAt(last, 2)+","+(String)jTable1.getModel().getValueAt(last, 3)
    				+","+(String)jTable1.getModel().getValueAt(last, 4)+","+(String)jTable1.getModel().getValueAt(last, 5)
    				+","+(String)jTable1.getModel().getValueAt(last, 6);
    		s[i]=temp;
    	}
    	controller.writeData(s);
    	initializeSet();
    }                                          

    private void btn_DelOpenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(text_IDDel.isEditable()){
    		JOptionPane.showMessageDialog(null, "已经开始删除会员");
    	}else{
    		text_IDDel.setEditable(true);
    	}
    	
    }

    private void btn_DelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	if(!text_IDDel.isEditable()){
    		JOptionPane.showMessageDialog(null, "请先点击删除会员");
    	}
    	try{
    		Integer.parseInt(text_IDDel.getText());
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null, "格式错误");
    		return;
    	}
    	String ID = text_IDDel.getText();
    	Boolean success = controller.deleteVip(ID);
    	if(success){
    		initializeSet();
    		controller.writeData(null);
    	}else{
    		JOptionPane.showMessageDialog(null, "不存在此会员");
    	}
    	
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Del;
    private javax.swing.JButton btn_DelOpen;
    private javax.swing.JButton btn_Open;
    private javax.swing.JButton btn_sure;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_name;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextField text_IDDel;
    private javax.swing.JTextField text_birthdate;
    private javax.swing.JTextField text_mobile;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_restScores;
    private javax.swing.JTextField text_totalScores;
    // End of variables declaration
}
