package view;

import javax.swing.JPanel;

import logic.controller.StoreAnalyController;
import logic.interfaces.StoreAnalyInterface;
import logic.model.StoreAnalyModel;

public class StoreAnalyPanel extends PanelModel{
	 // <editor-fold defaultstate="collapsed" desc="Generated Code">
	private StoreAnalyInterface controller= new StoreAnalyController();
	public StoreAnalyPanel(){
		initComponents();
	}
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 630));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        		controller.getTable(),
            new String [] {
                "商品标识", "描述", "价格", "数量", "生产日期","报废日期"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false,false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 500, 500);
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

}

