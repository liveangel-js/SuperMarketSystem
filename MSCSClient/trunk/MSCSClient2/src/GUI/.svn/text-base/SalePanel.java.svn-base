package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import Logic.SaleController;


public class SalePanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField text_vip;
	private JButton button_vip;
	private JTextField text_item_id;
	private JTextField text_item_num;
	private JButton button_item_add;
	private JButton button_item_remove;
	private DefaultTableModel mode;
	private JTextField text_valid_point;
	private JTextField text_use_point;
	private JTextField text_last_point;
	private JButton button_point;
	private JTextField text_totol_price;
	private JTextField text_pay_price;
	private JTextField text_patback_price;
	private JButton button_price;
	private JButton button_new_sale;
	CashierPanel cp;
	 public static int TestMode = 0;
	public SalePanel(){
		
	}
	
	
	public SalePanel(CashierPanel cp){
		this.cp=cp;
		this.iniPanel();
		
	}
	
	
	
	public void iniPanel(){
		this.removeAll();
		SaleController.startSale();
		this.setLayout(new FlowLayout());
		//VIP面板
		JPanel vip_panel=new JPanel();
		vip_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "VIP"));
		vip_panel.add(new JLabel("No:"));
		text_vip=new JTextField(12);
		vip_panel.add(text_vip);
		button_vip=new JButton("确定");
		button_vip.addActionListener(this);
		vip_panel.add(button_vip);
		this.add(vip_panel);
		
		
		
		
		
		//添加、移除商品面板
		JPanel item_panel=new JPanel();
		item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		item_panel.add(new JLabel("ID:"));
		text_item_id=new JTextField(12);
		item_panel.add(text_item_id);
		item_panel.add(new JLabel("数量:"));
		text_item_num=new JTextField(12);
		item_panel.add(text_item_num);
		button_item_add=new JButton("添加");
		button_item_add.addActionListener(this);
		item_panel.add(button_item_add);
		button_item_remove=new JButton("移除");
		button_item_remove.addActionListener(this);
		button_item_remove.setEnabled(false);
		item_panel.add(button_item_remove);
		this.add(item_panel);
		
		
		
		
		//商品列表面板
		String[] columnNames ={"ID","名字","单价","优惠价","数量","总价"};
		mode = new DefaultTableModel(columnNames, 0);
		JTable itemTable = new JTable(mode);
		itemTable.setEnabled(false);
		JScrollPane item_list_panel=new JScrollPane(itemTable);
		item_list_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		this.add(item_list_panel);
		
		
		
		
		
		
		//积分面板
		JPanel point_price_panel=new JPanel();
		point_price_panel.setLayout(new BoxLayout(point_price_panel, BoxLayout.Y_AXIS));
		JPanel point_panel=new JPanel();
		point_panel.setLayout(new BoxLayout(point_panel, BoxLayout.Y_AXIS));
		point_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "积分面板"));
		JPanel p1=new JPanel();
		p1.add(new JLabel("现有积分:"));
		text_valid_point=new JTextField(8);
		text_valid_point.setEditable(false);
		p1.add(text_valid_point);
		point_panel.add(p1);
		JPanel p2=new JPanel();
		p2.add(new JLabel("使用积分:"));
		text_use_point=new JTextField(8);
		p2.add(text_use_point);
		point_panel.add(p2);
		JPanel p3=new JPanel();
		p3.add(new JLabel("剩余积分:"));
		text_last_point=new JTextField(8);
		text_last_point.setEditable(false);
		p3.add(text_last_point);
		point_panel.add(p3);
		button_point=new JButton("积分功能暂不能使用");
		button_point.setEnabled(false);
		point_panel.add(button_point);
		point_price_panel.add(point_panel);
		point_price_panel.add(Box.createVerticalStrut(50));
		
		
		
		
		
		
		
		//价格、支付面板
		JPanel price_panel=new JPanel();
		price_panel.setLayout(new BoxLayout(price_panel, BoxLayout.Y_AXIS));
		price_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "金额支付"));
		JPanel p5=new JPanel();
		p5.add(new JLabel("应该支付:"));
		text_totol_price=new JTextField(8);
		text_totol_price.setEditable(false);
		p5.add(text_totol_price);
		price_panel.add(p5);
		JPanel p6=new JPanel();
		p6.add(new JLabel("实际支付:"));
		text_pay_price=new JTextField(8);
		p6.add(text_pay_price);
		price_panel.add(p6);
		JPanel p7=new JPanel();
		p7.add(new JLabel("实际找零:"));
		text_patback_price=new JTextField(8);
		text_patback_price.setEditable(false);
		p7.add(text_patback_price);
		price_panel.add(p7);
		JPanel p8=new JPanel();
		button_price=new JButton("确定");
		button_price.addActionListener(this);
		p8.add(button_price);
		button_new_sale=new JButton("新的销售");
		button_new_sale.addActionListener(this);
		p8.add(button_new_sale);
		price_panel.add(p8);
		point_price_panel.add(price_panel);
		this.add(point_price_panel);
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_vip){
			this.setVIP();
		}
		if(e.getSource()==button_item_add){
			this.addItem();
		}
		if(e.getSource()==button_item_remove){
			this.removeItem();
		}
		if(e.getSource()==button_price){
			this.buy();
		}
		if(e.getSource()==button_new_sale){
			this.iniPanel();
			this.validate();
			this.repaint();
		}
	}
	
	
	public void setVIP(){
		boolean ok=SaleController.setVIP(text_vip.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "VIP No 输入错误或者不存在！");
			return;
		}
		text_vip.setEditable(false);
		button_vip.setEnabled(false);
		text_valid_point.setText(SaleController.getValidPoint());
	}
	
	
	
	public void addItem(){
		boolean ok=SaleController.addItem(text_item_id.getText(),text_item_num.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "商品ID或者数量输入错误或者不存在！");
			return;
		}
		this.updateItemList();
		text_totol_price.setText(SaleController.getPrice());
		this.updateItemList();
		text_totol_price.setText(SaleController.getPrice());
	}
	
	
	
	public void removeItem(){
		
	}
	
	
	public void updateItemList(){
		while(mode.getRowCount()!=0){
			mode.removeRow(0);
		}
		String[] itemListInfo=SaleController.getItemListInfo();
		for(int i=0;i<itemListInfo.length;i++){
			String item[]=itemListInfo[i].split(",");
			mode.addRow(item);
		}
	}
	
	public boolean buy(){
		if(SaleController.getItemNum()==0){
			JOptionPane.showMessageDialog(null, "未购买任何物品！");
			return false;
		}
		double price=0;
		try{
			price=Double.parseDouble(text_pay_price.getText());
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "支付额输入错误！");
			return false;
		}
		
		price=price-Double.parseDouble(SaleController.getPrice());
		if(price<0){
			JOptionPane.showMessageDialog(null, "支付额不足！");
			return false;
		}
		text_patback_price.setText(price+"");
		button_price.setEnabled(false);
        return true;
	}

}
