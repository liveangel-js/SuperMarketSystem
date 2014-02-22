/*
 * DesktopApplication1View.java
 */

package mscs.view;

import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import mscs.businessLogic.ISaleController;
import mscs.businessLogic.SaleController;
import mscs.data.CommodityRecord;
import mscs.data.MemberRecord;
import mscs.internetConnetion.StartSocketThread;

/**
 * The application's main frame.
 */
public class View extends FrameView {
	
	private MemberRecord user;
    public static int TestMode = 0;
    private ISaleController saleControl;
    
    public ISaleController getSaleControl() {
		return saleControl;
	}

	public void setSaleControl(ISaleController saleControl) {
		this.saleControl = saleControl;
	}
    
    public View(SingleFrameApplication app) {
        super(app);
        if(TestMode==0){
        	
	        initComponents();
	        /**自动生成的代码 开始**/
	        // status bar initialization - message timeout, idle icon and busy animation, etc
	        ResourceMap resourceMap = getResourceMap();
	        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
	        messageTimer = new Timer(messageTimeout, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusMessageLabel.setText("");
	            }
	        });
	        messageTimer.setRepeats(false);
	        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
	        for (int i = 0; i < busyIcons.length; i++) {
	            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
	        }
	        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
	                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
	            }
	        });
	        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
	        statusAnimationLabel.setIcon(idleIcon);
	        progressBar.setVisible(false);
	
	        // connecting action tasks to status bar via TaskMonitor
	        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
	        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
	            public void propertyChange(java.beans.PropertyChangeEvent evt) {
	                String propertyName = evt.getPropertyName();
	                if ("started".equals(propertyName)) {
	                    if (!busyIconTimer.isRunning()) {
	                        statusAnimationLabel.setIcon(busyIcons[0]);
	                        busyIconIndex = 0;
	                        busyIconTimer.start();
	                    }
	                    progressBar.setVisible(true);
	                    progressBar.setIndeterminate(true);
	                } else if ("done".equals(propertyName)) {
	                    busyIconTimer.stop();
	                    statusAnimationLabel.setIcon(idleIcon);
	                    progressBar.setVisible(false);
	                    progressBar.setValue(0);
	                } else if ("message".equals(propertyName)) {
	                    String text = (String)(evt.getNewValue());
	                    statusMessageLabel.setText((text == null) ? "" : text);
	                    messageTimer.restart();
	                } else if ("progress".equals(propertyName)) {
	                    int value = (Integer)(evt.getNewValue());
	                    progressBar.setVisible(true);
	                    progressBar.setIndeterminate(false);
	                    progressBar.setValue(value);
	                }
	            }
	        });
	        /**自动生成的代码 结束**/
	        
	        saleControl = new SaleController();
	        
	        //设置View使用到的表的表头
	        final Object[] goodHeader = {"编号","描述","价格","特价","开始时间","结束时间"};
	        final Object[][] content = {};
	        DefaultTableModel dtm=new DefaultTableModel(content,goodHeader); 
	        goodsTable.setModel(dtm);
	        
	        final Object[] buyHeader = {"编号","名称","价格","数量"};
	        DefaultTableModel dtm2=new DefaultTableModel(content,buyHeader); 
	        buyTable.setModel(dtm2);
	        
	        //添加双击购物列表删除购买货物事件
	        buyTable.addMouseListener(new MouseAdapter(){
	            @Override
	             public void mouseClicked(MouseEvent e) {
	                int clicked = e.getClickCount();
	                if(clicked==2){
	                    //获得点击的行数
	                    int i = buyTable.rowAtPoint(e.getPoint());
	                    //删除购买商品
	                    String gid = ((String)((DefaultTableModel)buyTable.getModel()).getValueAt(i, 0));
	                    ((DefaultTableModel)buyTable.getModel()).removeRow(i);
	                    saleControl.removeItem(gid);
	                }
	             }    
	        });
	        
	        //开始监听服务器端的连接
	        StartSocketThread sthread = new StartSocketThread(this.saleControl);
	        sthread.start();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    /**自动生成的方法**/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goodsID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodsTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        buyNum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        buyTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        sumLabel = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mscs.view.ApplicationRunner.class).getContext().getResourceMap(View.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        customerID.setText(resourceMap.getString("customerID.text")); // NOI18N
        customerID.setName("customerID"); // NOI18N
        customerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerIDKeyPressed(evt);
            }
        });

        jSeparator1.setName("jSeparator1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        customerName.setText(resourceMap.getString("customerName.text")); // NOI18N
        customerName.setName("customerName"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        goodsID.setText(resourceMap.getString("goodsID.text")); // NOI18N
        goodsID.setName("goodsID"); // NOI18N
        goodsID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goodsIDKeyPressed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        goodsTable.setFont(resourceMap.getFont("goodsTable.font")); // NOI18N
        goodsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        goodsTable.setEnabled(false);
        goodsTable.setName("goodsTable"); // NOI18N
        jScrollPane1.setViewportView(goodsTable);

        jSeparator2.setName("jSeparator2"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        buyNum.setText(resourceMap.getString("buyNum.text")); // NOI18N
        buyNum.setName("buyNum"); // NOI18N
        buyNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buyNumKeyPressed(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        buyTable.setFont(resourceMap.getFont("buyTable.font")); // NOI18N
        buyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        buyTable.setEnabled(false);
        buyTable.setName("buyTable"); // NOI18N
        jScrollPane2.setViewportView(buyTable);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        sumLabel.setText(resourceMap.getString("sumLabel.text")); // NOI18N
        sumLabel.setName("sumLabel"); // NOI18N

        buyButton.setText(resourceMap.getString("buyButton.text")); // NOI18N
        buyButton.setName("buyButton"); // NOI18N
        buyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyButtonMouseClicked(evt);
            }
        });

        addButton.setText(resourceMap.getString("addButton.text")); // NOI18N
        addButton.setName("addButton"); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(buyButton)
                        .addGap(44, 44, 44))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addButton)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buyNum, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(goodsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(buyNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addButton)
                                .addGap(2, 2, 2)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(399, Short.MAX_VALUE)
                        .addComponent(buyButton)))
                .addContainerGap())
        );

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        setComponent(mainPanel);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents
    
    
//添加各个事件
    
private void customerIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerIDKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String uid = this.customerID.getText();
         try{
        //获得用户信息
            user = getUserInfo(Integer.parseInt(uid));
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "用户ID输入有误！！！请检查");
             return;
         }
         if(user == null){
             JOptionPane.showMessageDialog(null, "没有找到用户！！！");
             this.customerID.setText("");
         }else
              this.customerName.setText(user.getUname());
    }
}//GEN-LAST:event_customerIDKeyPressed

private void goodsIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goodsIDKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String gid = this.goodsID.getText();
        CommodityRecord g = null;
         try{
        //获得用户信息
            g = getGoodInfo(Integer.parseInt(gid));
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "产品ID输入有误！！！请检查");
             return;
         }
         if(g == null){
             JOptionPane.showMessageDialog(null, "没有找到产品！！！");
             this.goodsID.setText("");
         }else{
             
             Object[] o = {g.getGid(),g.getDescri(),g.getPrice(),g.getSpecPrice(),parseDateToString(g.getSpecStart()),parseDateToString(g.getSpecEnd())};
             if(((DefaultTableModel)this.goodsTable.getModel()).getRowCount()>0)
                ((DefaultTableModel)this.goodsTable.getModel()).removeRow(0);
             ((DefaultTableModel)this.goodsTable.getModel()).addRow(o);
         }
    }
}//GEN-LAST:event_goodsIDKeyPressed

private String parseDateToString(Date d){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    return format.format(d);
}

private void buyNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyNumKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try{
            if(Integer.parseInt(buyNum.getText()) > 0)
                handleAddItem();
            else
                throw new Exception();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "请输入正确的购买数量");
        }
     }
    
}//GEN-LAST:event_buyNumKeyPressed

private void handleAddItem(){
    
        int s = this.goodsTable.getSelectedRow();
        if(s == -1){
            s = 0;
        }
        
        //获得商品信息
        String gid = ((Integer)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 0)).toString();
        String gname = (String)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 1);
        String price = ((Double)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 2)).toString();
        String startDate = (String)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 4);
        String endDate = (String)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 5);
        String sprice =  ((Double)((DefaultTableModel)this.goodsTable.getModel()).getValueAt(s, 3)).toString();
        String num = this.buyNum.getText();
        
        //查看是否在特价时间
        boolean isSpecTime = this.saleControl.checkSpecTime(startDate,endDate);
        if(isSpecTime)
            price = sprice;
        
        addItem(Integer.parseInt(gid), gname,Double.parseDouble(price),Integer.parseInt(num));

        Object[] o = {gid,gname,price,num};
        ((DefaultTableModel)this.buyTable.getModel()).addRow(o);
}

private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
// TODO add your handling code here:
    try{
            if(Integer.parseInt(buyNum.getText()) > 0)
                handleAddItem();
            else
                throw new Exception();
     }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "请输入正确的购买数量");
     }
}//GEN-LAST:event_addButtonMouseClicked

private void buyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtonMouseClicked
// TODO add your handling code here:
    double sum = getTotalPrice();
    this.sumLabel.setText(String.valueOf(sum));
}//GEN-LAST:event_buyButtonMouseClicked


public MemberRecord  getUserInfo(int id){
	return this.saleControl.getUserInfo(id);
}

public CommodityRecord getGoodInfo(int id){
	return this.saleControl.getGoodInfo(id);
}

public double getTotalPrice(){
	return this.saleControl.buy();
}

public boolean addItem(int id, String name, double price, int num){
	return this.saleControl.addItem(id, name, price, num);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextField buyNum;
    private javax.swing.JTable buyTable;
    private javax.swing.JTextField customerID;
    private javax.swing.JLabel customerName;
    private javax.swing.JTextField goodsID;
    private javax.swing.JTable goodsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel sumLabel;
    // End of variables declaration//GEN-END:variables

    private Timer messageTimer = null;
    private Timer busyIconTimer = null;
    private Icon idleIcon = null;
    private Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}
