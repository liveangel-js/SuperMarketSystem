/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TotalSalesPanel.java
 *
 * Created on 2011-11-26, 22:28:01
 */

package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import logic.controller.SaleDiscountController;
import logic.interfaces.SaleDiscountInterface;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 *
 * @author bhlb
 */
public class SaleDiscountPanel extends javax.swing.JPanel {

    /** Creates new form TotalSalesPanel */
    public SaleDiscountPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        removeAll();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_total = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text_totalEnd = new javax.swing.JTextField();
        text_money = new javax.swing.JTextField();
        text_degree = new javax.swing.JTextField();
        text_totalBegin = new javax.swing.JTextField();
        btn_addTotal = new javax.swing.JButton();
        btn_totalRemove = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        text_removeID = new javax.swing.JTextField();

        setFont(new java.awt.Font("微软雅黑", 0, 18));
        setPreferredSize(new java.awt.Dimension(850, 630));
        setLayout(null);

        table_total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "总额特价ID", "额度", "折扣率", "开始日期", "结束日期"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_total);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 480, 409);

        jLabel1.setFont(getFont());
        jLabel1.setText("总额特价列表");
        add(jLabel1);
        jLabel1.setBounds(30, 40, 110, 20);

        jLabel7.setFont(getFont());
        jLabel7.setText("\u7279\u4ef7\u989d\u5ea6");
        add(jLabel7);
        jLabel7.setBounds(545, 70, 80, 30);

        jLabel8.setFont(getFont());
        jLabel8.setText("\u7279\u4ef7\u6298\u6263");
        add(jLabel8);
        jLabel8.setBounds(545, 125, 80, 30);

        jLabel9.setFont(getFont());
        jLabel9.setText("开始日期");
        add(jLabel9);
        jLabel9.setBounds(545, 184, 80, 30);

        jLabel10.setFont(getFont());
        jLabel10.setText("\u7279\u4ef7\u6807\u8bc6");
        add(jLabel10);
        jLabel10.setBounds(545, 348, 80, 24);
        add(text_totalEnd);
        text_totalEnd.setBounds(648, 240, 120, 30);
        add(text_money);
        text_money.setBounds(648, 73, 120, 30);
        add(text_degree);
        text_degree.setBounds(648, 128, 120, 30);
        add(text_totalBegin);
        text_totalBegin.setBounds(648, 187, 120, 30);

        btn_addTotal.setFont(getFont());
        btn_addTotal.setText("添加");
        btn_addTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTotalActionPerformed(evt);
            }
        });
        add(btn_addTotal);
        btn_addTotal.setBounds(648, 295, 80, 30);

        btn_totalRemove.setFont(getFont());
        btn_totalRemove.setText("移除");
        btn_totalRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalRemoveActionPerformed(evt);
            }
        });
        add(btn_totalRemove);
        btn_totalRemove.setBounds(648, 404, 78, 30);

        jLabel11.setFont(getFont());
        jLabel11.setText("结束日期");
        add(jLabel11);
        jLabel11.setBounds(545, 240, 80, 24);
        add(text_removeID);
        text_removeID.setBounds(648, 348, 118, 30);
        
        
        controller=new SaleDiscountController();
        controller.start();
        update();
    }// </editor-fold>

    
    
    public void update(){
		while(table_total.getModel().getRowCount()!=0){
			((DefaultTableModel) table_total.getModel()).removeRow(0);
		}
		ArrayList<String> promotions=controller.getPromotionList();
		if(promotions==null){
			return;
		}
		for(int i=0;i<promotions.size();i++){
			//System.out.println(itemListInfo.get(i));
			String item[]=promotions.get(i).split(",");
			((DefaultTableModel) table_total.getModel()).addRow(item);
		}
    }
    private void btn_addTotalActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	boolean ok=controller.addDiscount(text_money.getText(), text_degree.getText(), text_totalBegin.getText(), text_totalEnd.getText());
    	if(!ok){
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
    	}
    	update();
}                                            

    private void btn_totalRemoveActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    	boolean ok=controller.removeDiscount(text_removeID.getText());
    	if(!ok){
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
    	}
    	update();
    }                                              


    // Variables declaration - do not modify
    private javax.swing.JButton btn_addTotal;
    private javax.swing.JButton btn_totalRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_total;
    private javax.swing.JTextField text_degree;
    private javax.swing.JTextField text_money;
    private javax.swing.JTextField text_removeID;
    private javax.swing.JTextField text_totalBegin;
    private javax.swing.JTextField text_totalEnd;
    
    private SaleDiscountInterface controller;
    // End of variables declaration

}
