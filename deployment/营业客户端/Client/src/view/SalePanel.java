package view;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import logic.controller.SaleController;
import logic.interfaces.SaleInterface;


/**
 * @author Administrator
 *
 */
public class SalePanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField text_vip_id;
	
	private JButton button_vip_set;
	
	private JTextField text_item_id;
	
	private JTextField text_item_num;
	
	private JButton button_item_add;
	
	private JButton button_item_remove;
	
	private JButton button_add_item_complete;
	
	private DefaultTableModel item_list_mode;
	
	private DefaultTableModel gift_list_mode;
	
	private JTextField text_valid_point;
	
	private JTextField text_use_point;
	
	private JButton button_point_use;
	
	private JTextField text_totol_price;
	
	private JTextField text_special_price;
	
	private JTextField text_pay_price;
	
	private JTextField text_patback_price;
	
	private JButton button_pay_price;
	
	private JButton button_new_sale;
	
	private JButton button_cancel_sale;
	
	private SaleInterface controller;

	
	/**
	 * 
	 */
	public SalePanel(){
		this.initialize();
	}
	
	
	/**
	 * 
	 */
	public void initialize(){
		controller=new SaleController();
		controller.startSale();
		this.removeAll();
		this.setLayout(new BorderLayout());
		
				
		
		//top面板添加 VIP设置面板和商品添删面板
		JPanel top=new JPanel();
		this.add(top,BorderLayout.NORTH);
		
		
		
		//VIP面板
		JPanel vip_panel=new JPanel();
		vip_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "VIP"));
		vip_panel.add(new JLabel("No:"));
		text_vip_id=new JTextField(10);
		vip_panel.add(text_vip_id);
		button_vip_set=new JButton("确定");
		button_vip_set.addActionListener(this);
		vip_panel.add(button_vip_set);
		top.add(vip_panel);
		
		
		
		//添加、移除商品面板
		JPanel item_panel=new JPanel();
		item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		item_panel.add(new JLabel("ID:"));
		text_item_id=new JTextField(10);
		text_item_id.setEditable(false);
		item_panel.add(text_item_id);
		item_panel.add(new JLabel("数量:"));
		text_item_num=new JTextField(10);
		text_item_num.setEditable(false);
		item_panel.add(text_item_num);
		button_item_add=new JButton("添加");
		button_item_add.addActionListener(this);
		button_item_add.setEnabled(false);
		item_panel.add(button_item_add);
		button_item_remove=new JButton("移除");
		button_item_remove.addActionListener(this);
		button_item_remove.setEnabled(false);
		item_panel.add(button_item_remove);
		button_add_item_complete=new JButton("完成");
		button_add_item_complete.addActionListener(this);
		button_add_item_complete.setEnabled(false);
		item_panel.add(button_add_item_complete);
		top.add(item_panel);
		
		
		
		//body面板添加left_panel、right_panel
	    JPanel body=new JPanel();
	    this.add(body);
		body.setLayout(new FlowLayout());
	    
	    
		
		//left_panel添加商品列表面板、赠品列表面板
		JPanel left_panel=new JPanel();
		left_panel.setLayout(new BoxLayout(left_panel, BoxLayout.Y_AXIS));
		body.add(left_panel);
		
		
		
		//商品列表面板
		String[] columnNames ={"ID","名字","单价","优惠价","数量","总价"};
		item_list_mode = new DefaultTableModel(columnNames, 0);
		JTable itemTable = new JTable(item_list_mode);
		//itemTable.setEnabled(false);
		JScrollPane item_list_panel=new JScrollPane(itemTable);
		item_list_panel.setPreferredSize(new Dimension(500, 200));
		item_list_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		left_panel.add(item_list_panel);
		
		

		//赠品列表面板
		String[] giftcolumnNames ={"ID","名字","数量"};
		gift_list_mode = new DefaultTableModel(giftcolumnNames, 0);
		JTable giftTable = new JTable(gift_list_mode);
		//giftTable.setEnabled(false);
		JScrollPane gift_list_panel=new JScrollPane(giftTable);
		gift_list_panel.setPreferredSize(new Dimension(500, 200));
		gift_list_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "赠品列表"));
		left_panel.add(gift_list_panel);
		
		
		
		
		//right_panel添加积分面板、价格支付面板
		JPanel right_panel=new JPanel();
		body.add(right_panel);
		right_panel.setLayout(new BoxLayout(right_panel, BoxLayout.Y_AXIS));
		
		
		
		
		//积分面板
		JPanel point_panel=new JPanel();
		point_panel.setLayout(new BoxLayout(point_panel, BoxLayout.Y_AXIS));
		point_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "积分面板"));
		JPanel p1=new JPanel();
		p1.add(new JLabel("现有积分:"));
		text_valid_point=new JTextField(8);
		text_valid_point.setEditable(false);
		p1.add(text_valid_point);
		point_panel.add(p1);
		point_panel.add(Box.createVerticalStrut(12));
		JPanel p2=new JPanel();
		p2.add(new JLabel("使用积分:"));
		text_use_point=new JTextField(8);
		text_use_point.setEditable(false);
		p2.add(text_use_point);
		point_panel.add(p2);
		point_panel.add(Box.createVerticalStrut(12));
		JPanel p3=new JPanel();
		p3.add(new JLabel("剩余积分:"));
		point_panel.add(p3);
		button_point_use=new JButton("使用积分");
		button_point_use.addActionListener(this);
		button_point_use.setEnabled(false);
		point_panel.add(button_point_use);
		right_panel.add(point_panel);
	
		
		
		
		//价格、支付面板
		JPanel price_panel=new JPanel();
		price_panel.setLayout(new BoxLayout(price_panel, BoxLayout.Y_AXIS));
		price_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "金额支付"));
		JPanel p5=new JPanel();
		p5.add(new JLabel("应该总价:"));
		text_totol_price=new JTextField(8);
		text_totol_price.setEditable(false);
		p5.add(text_totol_price);
		price_panel.add(p5);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p11=new JPanel();
		p11.add(new JLabel("实际特价:"));
		text_special_price=new JTextField(8);
		text_special_price.setEditable(false);
		p11.add(text_special_price);
		price_panel.add(p11);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p6=new JPanel();
		p6.add(new JLabel("实际支付:"));
		text_pay_price=new JTextField(8);
		text_pay_price.setEditable(false);
		p6.add(text_pay_price);
		price_panel.add(p6);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p7=new JPanel();
		p7.add(new JLabel("实际找零:"));
		text_patback_price=new JTextField(8);
		text_patback_price.setEditable(false);
		p7.add(text_patback_price);
		price_panel.add(p7);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p8=new JPanel();
		button_pay_price=new JButton("确定");
		button_pay_price.addActionListener(this);
		button_pay_price.setEnabled(false);
		p8.add(button_pay_price);
		price_panel.add(p8);
		right_panel.add(price_panel);
		
		
		
		//新的销售和取消交易面板
		JPanel newSaleAndCancelPanel=new JPanel();
		newSaleAndCancelPanel.setLayout(new FlowLayout());
		button_new_sale=new JButton("新的销售");
		button_new_sale.addActionListener(this);
		newSaleAndCancelPanel.add(button_new_sale);
		button_cancel_sale=new JButton("取消交易");
		button_cancel_sale.addActionListener(this);
		newSaleAndCancelPanel.add(button_cancel_sale);
		newSaleAndCancelPanel.add(button_new_sale);
		right_panel.add(newSaleAndCancelPanel);
		button_new_sale.setEnabled(false);

		
		this.validate();
		this.repaint();
	}
	
	
	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_vip_set){
			this.setVIP();
			return;
		}
		if(e.getSource()==button_item_add){
			this.addItem();
			return;
		}
		if(e.getSource()==button_item_remove){
			this.removeItem();
			return;
		}
		if(e.getSource()==button_add_item_complete){
			this.completeAddItem();
			return;
		}
		if(e.getSource()==button_point_use){
			this.usePoint();
			return;
		}
		if(e.getSource()==button_pay_price){
			this.pay_the_price();
			return;
		}
		if(e.getSource()==button_new_sale){
			this.startNewSale();
			return;
		}
		if(e.getSource()==button_cancel_sale){
			this.cancelSale();
			return;
		}
	}
	
	
	/**
	 * 
	 */
	public void setVIP(){
		boolean ok=controller.setVIP(text_vip_id.getText());
		if(text_vip_id.getText().equals("")){
			ok=true;
		}
		if(!ok){
			JOptionPane.showMessageDialog(null, "VIP No 输入错误或者不存在！");
			return;
		}
		if(controller.isVIP()){
			text_valid_point.setText(controller.getVIPPoint());
		}
		
		text_vip_id.setEditable(false);
		button_vip_set.setEnabled(false);
		text_item_id.setEditable(true);
		text_item_num.setEditable(true);
		button_item_add.setEnabled(true);
		button_item_remove.setEnabled(true);
		button_add_item_complete.setEnabled(true);
	}
	
	
	/**
	 * 
	 */
	public void addItem(){
		boolean ok=controller.addItem(text_item_id.getText(),text_item_num.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "商品ID或者数量输入错误或者不存在！");
			return;
		}
		this.update();
	}
	
	
	/**
	 * 
	 */
	public void removeItem(){
		boolean ok=controller.removeItem(text_item_id.getText(),text_item_num.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "商品ID或者数量输入错误或者不存在！");
			return;
		}
		this.update();
	}
	
	
	
	/**
	 * 
	 */
	public void completeAddItem(){
		boolean ok=controller.completeAddItem();
		if(!ok){
			JOptionPane.showMessageDialog(null, "为购买任何物品！");
			return;	
		}
		text_item_id.setEditable(false);
		text_item_num.setEditable(false);
		button_item_add.setEnabled(false);
		button_item_remove.setEnabled(false);
		button_add_item_complete.setEnabled(false);
		if(controller.isVIP()){
			text_use_point.setEditable(true);
			button_point_use.setEnabled(true);
		}
		else{
			text_pay_price.setEditable(true);
			button_pay_price.setEnabled(true);
			text_totol_price.setText(controller.getTotalPrice());
			text_special_price.setText(controller.getSpecialPrice());
		}
		update();
		
	}
	
	
	/**
	 * 
	 */
	public void update(){
		this.updateItemList();
		this.updateGiftList();
		text_totol_price.setText(controller.getTotalPrice());
		this.validate();
		this.repaint();
	}
	
	
	/**
	 * 
	 */
	public void updateItemList(){
		while(item_list_mode.getRowCount()!=0){
			item_list_mode.removeRow(0);
		}
		ArrayList<String> itemListInfo=controller.getItemListInfo();
		if(itemListInfo==null){
			return;
		}
		for(int i=0;i<itemListInfo.size();i++){
			String item[]=itemListInfo.get(i).split(",");
			item_list_mode.addRow(item);
		
		}
	}
	
	
	/**
	 * 
	 */
	public void updateGiftList(){
		while(gift_list_mode.getRowCount()!=0){
			gift_list_mode.removeRow(0);
		}
	
		ArrayList<String> giftListInfo=controller.getGiftListInfo();
		System.out.println(giftListInfo+"ccc");
		if(giftListInfo==null){
			return;
		}
		System.out.println(giftListInfo+"ccc");
		for(int i=0;i<giftListInfo.size();i++){
			String item[]=giftListInfo.get(i).split(",");
			gift_list_mode.addRow(item);
		}
	}
	
	
	/**
	 * 
	 */
	public void usePoint(){
		boolean ok=controller.useVIPPoint(text_use_point.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "积分不足或者输入错误");
			return;
		}
		button_point_use.setEnabled(false);
		text_use_point.setEditable(false);
		text_pay_price.setEditable(true);
		button_pay_price.setEnabled(true);
		double special_price=Double.parseDouble(controller.getSpecialPrice());
		special_price-=Double.parseDouble(text_use_point.getText())/50.0;
		text_special_price.setText(String.format("%.2f",special_price));
	}
	
	
	/**
	 *  
	 */
	public void pay_the_price(){
		boolean ok=controller.pay(text_pay_price.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, "支付额输入错误！");
			return;
		}		
		String pay_back_price=controller.getPayBack();
		double momey=Double.parseDouble(pay_back_price);
		text_patback_price.setText(String.format("%.2f",momey));
		System.out.println(pay_back_price);
		button_pay_price.setEnabled(false);
		button_cancel_sale.setEnabled(false);
		button_new_sale.setEnabled(true);
		printBill();
        return ;
	}
	
	
	/**
	 * 
	 */
	public void printBill(){
		controller.printBill();
	}
	
	
	/**
	 * 
	 */
	public void startNewSale(){
		this.initialize();
	}
	
	
	/**
	 * 
	 */
	public void cancelSale(){
		initialize();
	}
}
