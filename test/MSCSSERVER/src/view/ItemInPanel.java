package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import logic.controller.ItemInController;
import logic.interfaces.ItemInInterface;

public class ItemInPanel extends PanelModel {
	private ItemInInterface controller = new ItemInController();
	 public ItemInPanel() {
	        initComponents();
	    }

	    /** This method is called from within the constructor to
	     * initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is
	     * always regenerated by the Form Editor.
	     */
			    @SuppressWarnings("unchecked")
			    // <editor-fold defaultstate="collapsed" desc="Generated Code">
			    // <editor-fold defaultstate="collapsed" desc="Generated Code">
			     // <editor-fold defaultstate="collapsed" desc="Generated Code">
	 private void initComponents() {
		
		    jLabel1 = new javax.swing.JLabel();
		    jLabel2 = new javax.swing.JLabel();
		    btn_Close = new javax.swing.JButton();
		    text_cost = new javax.swing.JTextField();
		    jScrollPane1 = new javax.swing.JScrollPane();
		    text_info = new javax.swing.JTextArea();
		    jLabel3 = new javax.swing.JLabel();
		    jLabel4 = new javax.swing.JLabel();
		    jLabel5 = new javax.swing.JLabel();
		    jLabel6 = new javax.swing.JLabel();
		    text_ID = new javax.swing.JTextField();
		    text_Num = new javax.swing.JTextField();
		    text_begin = new javax.swing.JTextField();
		    text_end = new javax.swing.JTextField();
		    jScrollPane2 = new javax.swing.JScrollPane();
		    table_itemIn = new javax.swing.JTable();
		    btn_sure = new javax.swing.JButton();
		    btn_itemIn = new javax.swing.JButton();
		    btn_Open = new javax.swing.JButton();
		    jScrollPane3 = new javax.swing.JScrollPane();
		    jTable1 = new javax.swing.JTable();
		
		    setFont(new java.awt.Font("微软雅黑", 0, 18));
		    setPreferredSize(new java.awt.Dimension(850, 630));
		    setLayout(null);
		
		    jLabel1.setFont(getFont());
		    jLabel1.setText("成本价");
		    add(jLabel1);
		    jLabel1.setBounds(520, 400, 80, 40);
		
		    jLabel2.setFont(getFont());
		    jLabel2.setText("商品标识");
		    add(jLabel2);
		    jLabel2.setBounds(520, 30, 80, 40);
		
		    btn_Close.setFont(getFont());
		    btn_Close.setText("结束入库");
		    btn_Close.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            btn_CloseActionPerformed(evt);
		        }
		    });
		    add(btn_Close);
		    btn_Close.setBounds(680, 520, 130, 30);
		    add(text_cost);
		    text_cost.setBounds(630, 410, 150, 30);
		
		    text_info.setColumns(20);
		    text_info.setRows(5);
		    jScrollPane1.setViewportView(text_info);
		
		    add(jScrollPane1);
		    jScrollPane1.setBounds(600, 90, 230, 130);
		
		    jLabel3.setFont(getFont());
		    jLabel3.setText("商品信息");
		    add(jLabel3);
		    jLabel3.setBounds(510, 80, 80, 40);
		
		    jLabel4.setFont(getFont());
		    jLabel4.setText("入库数量");
		    add(jLabel4);
		    jLabel4.setBounds(520, 240, 80, 40);
		
		    jLabel5.setFont(getFont());
		    jLabel5.setText("生产日期");
		    add(jLabel5);
		    jLabel5.setBounds(520, 290, 80, 40);
		
		    jLabel6.setFont(getFont());
		    jLabel6.setText("报废日期");
		    add(jLabel6);
		    jLabel6.setBounds(520, 340, 80, 40);
		    add(text_ID);
		    text_ID.setBounds(630, 40, 90, 30);
		    add(text_Num);
		    text_Num.setBounds(630, 250, 150, 30);
		    add(text_begin);
		    text_begin.setBounds(630, 300, 150, 30);
		    add(text_end);
		    text_end.setBounds(630, 350, 150, 30);
		
		    table_itemIn.setModel(new javax.swing.table.DefaultTableModel(
		        new Object [][] {
		            {null, null, null, null, null, null},
		            {null, null, null, null, null, null},
		            {null, null, null, null, null, null},
		            {null, null, null, null, null, null}
		        },
		        new String [] {
		            "商品标识", "描述", "数量", "生产日期", "报废日期", "成本价"
		        }
		    ) {
		        Class[] types = new Class [] {
		            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
		        };
		        boolean[] canEdit = new boolean [] {
		            false, false, false, false, true, true
		        };
		
		        public Class getColumnClass(int columnIndex) {
		            return types [columnIndex];
		        }
		
		        public boolean isCellEditable(int rowIndex, int columnIndex) {
		            return canEdit [columnIndex];
		        }
		    });
		    jScrollPane2.setViewportView(table_itemIn);
		
		    add(jScrollPane2);
		    jScrollPane2.setBounds(20, 40, 470, 290);
		
		    btn_sure.setFont(getFont());
		    btn_sure.setText("确定");
		    btn_sure.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            btn_sureActionPerformed(evt);
		        }
		    });
		    add(btn_sure);
		    btn_sure.setBounds(750, 40, 90, 30);
		
		    btn_itemIn.setFont(getFont());
		    btn_itemIn.setText("入库");
		    btn_itemIn.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            btn_itemInActionPerformed(evt);
		        }
		    });
		    add(btn_itemIn);
		    btn_itemIn.setBounds(590, 460, 130, 30);
		
		    btn_Open.setFont(getFont());
		    btn_Open.setText("开始入库");
		    btn_Open.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            btn_OpenActionPerformed(evt);
		        }
		    });
		    add(btn_Open);
		    btn_Open.setBounds(520, 520, 130, 30);
		
		    jTable1.setModel(new javax.swing.table.DefaultTableModel(
		        new Object [][] {
		            {null, null, null},
		            {null, null, null},
		            {null, null, null},
		            {null, null, null}
		        },
		        new String [] {
		            "商品标识", "商品描述", "商品价格"
		        }
		    ) {
		        Class[] types = new Class [] {
		            java.lang.String.class, java.lang.String.class, java.lang.String.class
		        };
		        boolean[] canEdit = new boolean [] {
		            false, false, false
		        };
		
		        public Class getColumnClass(int columnIndex) {
		            return types [columnIndex];
		        }
		
		        public boolean isCellEditable(int rowIndex, int columnIndex) {
		            return canEdit [columnIndex];
		        }
		    });
		    jScrollPane3.setViewportView(jTable1);
		
		    add(jScrollPane3);
		    jScrollPane3.setBounds(20, 370, 470, 230);
		    initializeSet();
		}// </editor-fold>

	    private void btn_sureActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	    	if(!text_ID.isEditable()){
	    		JOptionPane.showMessageDialog(null, "请先点击开始入库");
	    		return;
	    	}
	    	try{
				Integer.parseInt(text_ID.getText());
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "格式错误");
	    		return;
				
			}
	    	
	    	text_ID.setEditable(false);
	    	String temp = controller.getItemInfoByID(text_ID.getText());
	    	if(temp==null){
	    		JOptionPane.showMessageDialog(null, "不存在此商品");
	    		text_ID.setEditable(true);
	    		text_Num.setEditable(false);
			    text_begin.setEditable(false);
			    text_cost.setEditable(false);
			    text_end.setEditable(false);
	    	}else{
	    		text_info.setText(temp);
	    		text_Num.setEditable(true);
			    text_begin.setEditable(true);
			    text_cost.setEditable(true);
			    text_end.setEditable(true);
	    	}
	    	
		    
		    
	    	
	    	
	    }

	    private void btn_itemInActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	    	if(!text_Num.isEditable()){
	    		JOptionPane.showMessageDialog(null, "请先点击开始入库");
	    		return;
	    	}
	    	int tempNum=0;
	    	Double tempCost = 0.0;
	    	try{
	    		tempNum = Integer.parseInt(text_Num.getText());
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "数量格式有错！");
				return;
			}
			try{
				tempCost = Double.parseDouble(text_cost.getText());
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "成本价格式有错！");
				return;
				
			}
	    	
	    	
	    	
    		String[] temp = controller.getItemInfoByID(text_ID.getText()).split(",");
	    	int column = table_itemIn.getColumnCount();
		    Object[]   newRow = {text_ID.getText(),temp[1],tempCost,tempNum,text_begin.getText(),text_end.getText()};
		    ((DefaultTableModel)table_itemIn.getModel()).addRow(newRow);
		    
		    text_ID.setText("");
		    text_info.setText("");
		    text_begin.setText("");
		    text_cost.setText("");
		    text_end.setText("");
		    text_Num.setText("");
		    text_ID.setEditable(true);
		    text_Num.setEditable(false);
		    text_begin.setEditable(false);
		    text_cost.setEditable(false);
		    text_end.setEditable(false);
		    text_info.setEditable(false);
	    	
	    	
	    }

	    private void btn_OpenActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	    	text_ID.setEditable(true);
	    }

	    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	    	if((!text_Num.isEditable())&&(!text_ID.isEditable())){
	    		JOptionPane.showMessageDialog(null, "请先点击开始入库");
	    		return;
	    	}
	    	String [] s =new String[table_itemIn.getRowCount()];
	    	System.out.println(table_itemIn.getRowCount());
	    	String temp = null;
	    	for(int i=0;i<s.length;i++){
	    		temp = (String) table_itemIn.getModel().getValueAt(i, 0)+","
	    			+((Double)table_itemIn.getModel().getValueAt(i, 2)).toString()+","+((Integer) table_itemIn.getModel().getValueAt(i, 3)).toString()+","
	    			+(String) table_itemIn.getModel().getValueAt(i, 4)+","+(String) table_itemIn.getModel().getValueAt(i, 5);
	    		s[i]=temp;
	    		
	    	}
	    	controller.writeData(s);
	    	
	    	
	    	Update();
	    }

	  //更新显示信息 
		private void Update(){
			table_itemIn.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {

		            },
		            new String [] {
		                "商品标识", "描述", "成本价", "数量", "生产日期", "报废日期"
		            }
		        ) {
					Class[] types = new Class [] {
		                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
		            };
		            boolean[] canEdit = new boolean [] {
		                false, false, true, true, true, true
		            };

		            public Class getColumnClass(int columnIndex) {
		                return types [columnIndex];
		            }

		            public boolean isCellEditable(int rowIndex, int columnIndex) {
		                return canEdit [columnIndex];
		            }
		        });
	    	text_ID.setText("");
		    text_info.setText("");
		    text_begin.setText("");
		    text_cost.setText("");
		    text_end.setText("");
		    text_Num.setText("");
		    text_ID.setEditable(false);
		    text_Num.setEditable(false);
		    text_begin.setEditable(false);
		    text_cost.setEditable(false);
		    text_end.setEditable(false);
		    text_info.setEditable(false);
			
		}
		//初始化默认设置
		private void initializeSet() {
			jTable1.setModel(new javax.swing.table.DefaultTableModel(
			        controller.getGoodsTable(),
			        new String [] {
			            "商品标识", "商品描述", "商品价格"
			        }
			    ) {
			        Class[] types = new Class [] {
			            java.lang.String.class, java.lang.String.class, java.lang.String.class
			        };
			        boolean[] canEdit = new boolean [] {
			            false, false, false
			        };
			
			        public Class getColumnClass(int columnIndex) {
			            return types [columnIndex];
			        }
			
			        public boolean isCellEditable(int rowIndex, int columnIndex) {
			            return canEdit [columnIndex];
			        }
			    });
//			System.out.println(jTable1.getModel().getValueAt(0, 0));
			table_itemIn.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {

		            },
		            new String [] {
		                "商品标识", "描述", "成本价", "数量", "生产日期", "报废日期"
		            }
		        ) {
					Class[] types = new Class [] {
		                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
		            };
		            boolean[] canEdit = new boolean [] {
		                false, false, true, true, true, true
		            };

		            public Class getColumnClass(int columnIndex) {
		                return types [columnIndex];
		            }

		            public boolean isCellEditable(int rowIndex, int columnIndex) {
		                return canEdit [columnIndex];
		            }
		        });
			
			text_ID.setEditable(false);
		    text_Num.setEditable(false);
		    text_begin.setEditable(false);
		    text_cost.setEditable(false);
		    text_end.setEditable(false);
		    text_info.setEditable(false);
			
			
		}
		//重置设置
		private void reset() {
			
		}
		public boolean checkInput(){
			
			try{
				Integer.parseInt(text_Num.getText());
			}catch(NumberFormatException e){
				return false;
				
			}
			try{
				Double.parseDouble(text_cost.getText());
			}catch(NumberFormatException e){
				return false;
				
			}
			return true;
		}

	    // Variables declaration - do not modify
	    private javax.swing.JButton btn_Close;
	    private javax.swing.JButton btn_Open;
	    private javax.swing.JButton btn_itemIn;
	    private javax.swing.JButton btn_sure;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JTable table_itemIn;
	    private javax.swing.JTextField text_ID;
	    private javax.swing.JTextField text_Num;
	    private javax.swing.JTextField text_begin;
	    private javax.swing.JTextField text_cost;
	    private javax.swing.JTextField text_end;
	    private javax.swing.JTextArea text_info;
	    // End of variables declaration

}
