/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SalesPanel.java
 *
 * Created on 2011-11-26, 16:31:15
 */

package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import logic.controller.ItemDiscountController;
import logic.interfaces.ItemDiscountInterface;
import javax.swing.table.TableRowSorter;

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
public class ItemDiscountPanel extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form SalesPanel */
    public ItemDiscountPanel() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_item = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_Sure = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        text_specialPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_itemBegin = new javax.swing.JTextField();
        text_itemEnd = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_Remove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_promotionID = new javax.swing.JTextField();

        setFont(new java.awt.Font("微软雅黑", 0, 18));
        this.setPreferredSize(new java.awt.Dimension(850, 630));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(null);

        table_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "商品标识", "商品描述", "价格", "特价", "开始日期", "结束日期"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(table_item);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 490, 470);

        jLabel2.setFont(getFont());
        jLabel2.setText("商品特价列表");
        add(jLabel2);
        jLabel2.setBounds(30, 22, 110, 20);

        btn_Sure.setFont(getFont());
        btn_Sure.setText("确定");
        btn_Sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SureActionPerformed(evt);
            }
        });
        add(btn_Sure);
        btn_Sure.setBounds(770, 170, 70, 30);

        jLabel3.setFont(getFont());
        jLabel3.setText("商品标识");
        add(jLabel3);
        jLabel3.setBounds(530, 170, 80, 30);

        text_ID.setFont(getFont());
        add(text_ID);
        text_ID.setBounds(630, 170, 120, 30);

        add(jScrollPane3);
        jScrollPane3.setBounds(530, 50, 230, 100);

        jLabel4.setFont(getFont());
        jLabel4.setText("商品特价");
        add(jLabel4);
        jLabel4.setBounds(530, 220, 80, 30);
        add(text_specialPrice);
        text_specialPrice.setBounds(630, 220, 120, 30);

        jLabel5.setFont(getFont());
        jLabel5.setText("开始日期");
        add(jLabel5);
        jLabel5.setBounds(530, 270, 80, 30);

        jLabel6.setFont(getFont());
        jLabel6.setText("结束日期");
        add(jLabel6);
        jLabel6.setBounds(530, 320, 80, 30);
        add(text_itemBegin);
        text_itemBegin.setBounds(630, 270, 120, 30);
        add(text_itemEnd);
        text_itemEnd.setBounds(630, 320, 120, 30);

        btn_add.setFont(getFont());
        btn_add.setText("添加");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        add(btn_add);
        btn_add.setBounds(770, 320, 70, 30);

        btn_Remove.setFont(getFont());
        btn_Remove.setText("移除");
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });
        add(btn_Remove);
        btn_Remove.setBounds(770, 370, 70, 30);

        jLabel1.setFont(getFont());
        jLabel1.setText("商品信息");
        add(jLabel1);
        jLabel1.setBounds(530, 20, 90, 30);

        jLabel7.setFont(getFont());
        jLabel7.setText("\u4fc3\u9500\u6807\u8bc6");
        add(jLabel7);
        jLabel7.setBounds(530, 370, 80, 30);
        add(text_promotionID);
        text_promotionID.setBounds(630, 370, 120, 30);
        {
        	text_showItemInfo = new javax.swing.JTextPane();
        	this.add(text_showItemInfo);
        	text_showItemInfo.setBounds(531, 50, 227, 97);
        }
        this.setFocusCycleRoot(true);
        
        
        table_item.setRowSorter(new TableRowSorter<TableModel>(table_item.getModel()));
    	controller=new ItemDiscountController();
    	controller.start();
    	update();
        
        
    }// </editor-fold>
    
    
    public void update(){
		while(table_item.getModel().getRowCount()!=0){
			((DefaultTableModel) table_item.getModel()).removeRow(0);
		}
		ArrayList<String> promotions=controller.getPromotionList();
		if(promotions==null){
			return;
		}
		for(int i=0;i<promotions.size();i++){
			//System.out.println(itemListInfo.get(i));
			String item[]=promotions.get(i).split(",");
			((DefaultTableModel) table_item.getModel()).addRow(item);
		}
    }
    
    
    

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void btn_SureActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	boolean ok=controller.setID(text_ID.getText());
    	if(!ok){
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
    	}
    	String info[]=controller.getItemInfo(text_ID.getText()).split(",");
    	text_showItemInfo.setText("商品标识\t商品描述\t商品价格\t\n");
    	text_showItemInfo.setText(text_showItemInfo.getText()+info[0]+"\t"+info[1]+"\t"+info[2]+"\t");
    	//text_ID.setEditable(false);
    }                                        

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    	boolean ok=controller.setDiscount(text_specialPrice.getText(), text_itemBegin.getText(), text_itemEnd.getText());
    	if(!ok){
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
    	}
    	update();
    }                                       

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	boolean ok=controller.removeDiscount(text_promotionID.getText());
    	if(!ok){
			JOptionPane.showMessageDialog(null, "输入错误");
			return;
    	}
    	update();
    }                                         


    // Variables declaration - do not modify
    private javax.swing.JButton btn_Remove;
    public javax.swing.JButton btn_Sure;
    public javax.swing.JButton btn_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_item;
    public javax.swing.JTextField text_ID;
    public javax.swing.JTextField text_itemBegin;
    public javax.swing.JTextField text_itemEnd;
    public javax.swing.JTextField text_promotionID;
    private javax.swing.JTextPane text_showItemInfo;
    public javax.swing.JTextField text_specialPrice;
    private ItemDiscountInterface controller;
    // End of variables declaration

}
