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
		
				
		
		//top������ VIP����������Ʒ��ɾ���
		JPanel top=new JPanel();
		this.add(top,BorderLayout.NORTH);
		
		
		
		//VIP���
		JPanel vip_panel=new JPanel();
		vip_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "VIP"));
		vip_panel.add(new JLabel("No:"));
		text_vip_id=new JTextField(10);
		vip_panel.add(text_vip_id);
		button_vip_set=new JButton("ȷ��");
		button_vip_set.addActionListener(this);
		vip_panel.add(button_vip_set);
		top.add(vip_panel);
		
		
		
		//��ӡ��Ƴ���Ʒ���
		JPanel item_panel=new JPanel();
		item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "��Ʒ����"));
		item_panel.add(new JLabel("ID:"));
		text_item_id=new JTextField(10);
		text_item_id.setEditable(false);
		item_panel.add(text_item_id);
		item_panel.add(new JLabel("����:"));
		text_item_num=new JTextField(10);
		text_item_num.setEditable(false);
		item_panel.add(text_item_num);
		button_item_add=new JButton("���");
		button_item_add.addActionListener(this);
		button_item_add.setEnabled(false);
		item_panel.add(button_item_add);
		button_item_remove=new JButton("�Ƴ�");
		button_item_remove.addActionListener(this);
		button_item_remove.setEnabled(false);
		item_panel.add(button_item_remove);
		button_add_item_complete=new JButton("���");
		button_add_item_complete.addActionListener(this);
		button_add_item_complete.setEnabled(false);
		item_panel.add(button_add_item_complete);
		top.add(item_panel);
		
		
		
		//body������left_panel��right_panel
	    JPanel body=new JPanel();
	    this.add(body);
		body.setLayout(new FlowLayout());
	    
	    
		
		//left_panel�����Ʒ�б���塢��Ʒ�б����
		JPanel left_panel=new JPanel();
		left_panel.setLayout(new BoxLayout(left_panel, BoxLayout.Y_AXIS));
		body.add(left_panel);
		
		
		
		//��Ʒ�б����
		String[] columnNames ={"ID","����","����","�Żݼ�","����","�ܼ�"};
		item_list_mode = new DefaultTableModel(columnNames, 0);
		JTable itemTable = new JTable(item_list_mode);
		//itemTable.setEnabled(false);
		JScrollPane item_list_panel=new JScrollPane(itemTable);
		item_list_panel.setPreferredSize(new Dimension(500, 200));
		item_list_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "��Ʒ����"));
		left_panel.add(item_list_panel);
		
		

		//��Ʒ�б����
		String[] giftcolumnNames ={"ID","����","����"};
		gift_list_mode = new DefaultTableModel(giftcolumnNames, 0);
		JTable giftTable = new JTable(gift_list_mode);
		//giftTable.setEnabled(false);
		JScrollPane gift_list_panel=new JScrollPane(giftTable);
		gift_list_panel.setPreferredSize(new Dimension(500, 200));
		gift_list_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "��Ʒ�б�"));
		left_panel.add(gift_list_panel);
		
		
		
		
		//right_panel��ӻ�����塢�۸�֧�����
		JPanel right_panel=new JPanel();
		body.add(right_panel);
		right_panel.setLayout(new BoxLayout(right_panel, BoxLayout.Y_AXIS));
		
		
		
		
		//�������
		JPanel point_panel=new JPanel();
		point_panel.setLayout(new BoxLayout(point_panel, BoxLayout.Y_AXIS));
		point_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�������"));
		JPanel p1=new JPanel();
		p1.add(new JLabel("���л���:"));
		text_valid_point=new JTextField(8);
		text_valid_point.setEditable(false);
		p1.add(text_valid_point);
		point_panel.add(p1);
		point_panel.add(Box.createVerticalStrut(12));
		JPanel p2=new JPanel();
		p2.add(new JLabel("ʹ�û���:"));
		text_use_point=new JTextField(8);
		text_use_point.setEditable(false);
		p2.add(text_use_point);
		point_panel.add(p2);
		point_panel.add(Box.createVerticalStrut(12));
		JPanel p3=new JPanel();
		p3.add(new JLabel("ʣ�����:"));
		point_panel.add(p3);
		button_point_use=new JButton("ʹ�û���");
		button_point_use.addActionListener(this);
		button_point_use.setEnabled(false);
		point_panel.add(button_point_use);
		right_panel.add(point_panel);
	
		
		
		
		//�۸�֧�����
		JPanel price_panel=new JPanel();
		price_panel.setLayout(new BoxLayout(price_panel, BoxLayout.Y_AXIS));
		price_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "���֧��"));
		JPanel p5=new JPanel();
		p5.add(new JLabel("Ӧ���ܼ�:"));
		text_totol_price=new JTextField(8);
		text_totol_price.setEditable(false);
		p5.add(text_totol_price);
		price_panel.add(p5);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p11=new JPanel();
		p11.add(new JLabel("ʵ���ؼ�:"));
		text_special_price=new JTextField(8);
		text_special_price.setEditable(false);
		p11.add(text_special_price);
		price_panel.add(p11);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p6=new JPanel();
		p6.add(new JLabel("ʵ��֧��:"));
		text_pay_price=new JTextField(8);
		text_pay_price.setEditable(false);
		p6.add(text_pay_price);
		price_panel.add(p6);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p7=new JPanel();
		p7.add(new JLabel("ʵ������:"));
		text_patback_price=new JTextField(8);
		text_patback_price.setEditable(false);
		p7.add(text_patback_price);
		price_panel.add(p7);
		price_panel.add(Box.createVerticalStrut(12));
		JPanel p8=new JPanel();
		button_pay_price=new JButton("ȷ��");
		button_pay_price.addActionListener(this);
		button_pay_price.setEnabled(false);
		p8.add(button_pay_price);
		price_panel.add(p8);
		right_panel.add(price_panel);
		
		
		
		//�µ����ۺ�ȡ���������
		JPanel newSaleAndCancelPanel=new JPanel();
		newSaleAndCancelPanel.setLayout(new FlowLayout());
		button_new_sale=new JButton("�µ�����");
		button_new_sale.addActionListener(this);
		newSaleAndCancelPanel.add(button_new_sale);
		button_cancel_sale=new JButton("ȡ������");
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
			JOptionPane.showMessageDialog(null, "VIP No ���������߲����ڣ�");
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
			JOptionPane.showMessageDialog(null, "��ƷID�����������������߲����ڣ�");
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
			JOptionPane.showMessageDialog(null, "��ƷID�����������������߲����ڣ�");
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
			JOptionPane.showMessageDialog(null, "Ϊ�����κ���Ʒ��");
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
			JOptionPane.showMessageDialog(null, "���ֲ�������������");
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
			JOptionPane.showMessageDialog(null, "֧�����������");
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
