package view;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;

import org.jvnet.substance.border.FlatBorderPainter;

import logic.controller.ReturnController;
import logic.interfaces.ReturnInterface;


/**
 * @author Administrator
 *
 */
public class ReturnPanel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField text_bill_id;
	
	private JButton button_bill_set;
	
	private JTextField text_item_id;
	
	private JTextField text_item_num;
	
	private JButton button_item_return;
	
	private JButton button_item_remove;
	
	private JButton button_item_return_complete;
	
	private DefaultTableModel sale_item_list_mode;
	
	private DefaultTableModel sale_gift_list_mode;
	
	private DefaultTableModel returned_item_list_mode;
	
	private DefaultTableModel returned_gift_list_mode;
	
	private DefaultTableModel return_item_list_mode;
	
	private DefaultTableModel return_gift_list_mode;
	
    private JTextField text_valid_point;
	
	private JTextField text_use_point;
	
	private JTextField text_totol_price;
	
	private JButton button_pay_price;
	
	private ReturnInterface controller;
	
	private JButton button_return_price;
	
	private JTextField text_return_money;
	
	private JButton button_cancel;
	
	private JButton button_ok;
	
	/**
	 * 
	 */
	public ReturnPanel(){
		this.initialize();
	}
	
	
	
	/**
	 * 
	 */
	public void initialize(){
		controller=new ReturnController();
		controller.startReturnItem();
		
		
		this.removeAll();
		this.setLayout(new BorderLayout());
		
		
        
		
		//top�������˵������˻����
		JPanel top=new JPanel();
		this.add(top,BorderLayout.NORTH);
		
		
		
		
		//�˵����
		JPanel bill_panel=new JPanel();
		bill_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�˵�"));
		bill_panel.add(new JLabel("No:"));
		text_bill_id=new JTextField(15);
		bill_panel.add(text_bill_id);
		button_bill_set=new JButton("���");
		button_bill_set.addActionListener(this);
		bill_panel.add(button_bill_set);
		top.add(bill_panel);
		
		
		
		//�˻����
		JPanel return_items_panel=new JPanel();
		return_items_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�˻�"));
		return_items_panel.add(new JLabel("ID:"));
		text_item_id=new JTextField(9);
		return_items_panel.add(text_item_id);
		return_items_panel.add(new JLabel("����:"));
		text_item_num=new JTextField(9);
		return_items_panel.add(text_item_num);
		button_item_return=new JButton("�˻�");
		button_item_return.addActionListener(this);
		return_items_panel.add(button_item_return);
		button_item_remove=new JButton("�Ƴ�");
		button_item_remove.addActionListener(this);
		return_items_panel.add(button_item_remove);
		button_item_return_complete=new JButton("���");
		button_item_return_complete.addActionListener(this);
		return_items_panel.add(button_item_return_complete);
		top.add(return_items_panel);
		
		
		
//		JPanel return_money=new JPanel();
//		button_return_price=new JButton();
//		text_return_money=new JTextField();
//		return_money.add(button_return_price);
//		return_money.add(text_return_money);
//		top.add(return_money);
		
		
		//body������ sale_panel,returned_panel,return_panel
	    JPanel body=new JPanel();
	    this.add(body);
		//body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
	    body.setLayout(new FlowLayout());
		
		
		
		
		//sale_panel
		JPanel sale_panel=new JPanel();
		//sale_panel.setLayout(new BoxLayout(sale_panel, BoxLayout.X_AXIS));
		sale_panel.setLayout(new FlowLayout());
		body.add(sale_panel);
		
		
		
		
		//sale��Ʒ�б����	
		String[] sale_item_columnNames ={"ID","����","����","�Żݼ�","����","�ܼ�"};
		sale_item_list_mode = new DefaultTableModel(sale_item_columnNames,0);
		JTable sale_item_table = new JTable(sale_item_list_mode);
		//sale_item_table.setEnabled(false);
		JScrollPane sale_item_panel=new JScrollPane(sale_item_table);
		sale_item_panel.setPreferredSize(new Dimension(400, 200));
		sale_item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "������Ʒ�б�"));
		sale_panel.add(sale_item_panel);
		
		
		
		//sale��Ʒ�б����
		String[] sale_gift_columnNames ={"ID","����","����"};
		sale_gift_list_mode = new DefaultTableModel(sale_gift_columnNames, 0);
		JTable sale_gift_table = new JTable(sale_gift_list_mode);
		//sale_gift_table.setEnabled(false);
		JScrollPane sale_gift_panel=new JScrollPane(sale_gift_table);
		sale_gift_panel.setPreferredSize(new Dimension(200, 200));
		sale_gift_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�����Ʒ�б�"));
		sale_panel.add(sale_gift_panel);
		
		
		
		
		//returned_panel
		JPanel returned_panel=new JPanel();
		//returned_panel.setLayout(new BoxLayout(returned_panel, BoxLayout.X_AXIS));
		returned_panel.setLayout(new FlowLayout());
		body.add(returned_panel);
		
		
		
		
		//returned��Ʒ�б����	
		String[] returned_item_columnNames ={"ID","����","����","�Żݼ�","����","�ܼ�"};
		returned_item_list_mode = new DefaultTableModel(returned_item_columnNames, 0);
		JTable returned_item_table = new JTable(returned_item_list_mode);
		//returned_item_table.setEnabled(false);
		JScrollPane returned_item_panel=new JScrollPane(returned_item_table);
		returned_item_panel.setPreferredSize(new Dimension(400, 100));
		returned_item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "������Ʒ�б�"));
		returned_panel.add(returned_item_panel);
		
		
		
		//returned��Ʒ�б����
		String[] returned_gift_columnNames ={"ID","����","����"};
		returned_gift_list_mode = new DefaultTableModel(returned_gift_columnNames,0);
		JTable returned_gift_table = new JTable(returned_gift_list_mode);
		//returned_gift_table.setEnabled(false);
		JScrollPane returned_gift_panel=new JScrollPane(returned_gift_table);
		returned_gift_panel.setPreferredSize(new Dimension(200, 100));
		returned_gift_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "������Ʒ�б�"));
		returned_panel.add(returned_gift_panel);

		
		
		
		//return_panel
		JPanel return_panel=new JPanel();
		//return_panel.setLayout(new BoxLayout(return_panel, BoxLayout.X_AXIS));
		return_panel.setLayout(new FlowLayout());
		body.add(return_panel);
		
		
		
		
		//returned��Ʒ�б����	
		String[] return_item_columnNames ={"ID","����","����","�Żݼ�","����","�ܼ�"};
		return_item_list_mode = new DefaultTableModel(return_item_columnNames, 0);
		JTable return_item_table = new JTable(return_item_list_mode);
		//return_item_table.setEnabled(false);
		JScrollPane return_item_panel=new JScrollPane(return_item_table);
		return_item_panel.setPreferredSize(new Dimension(400, 100));
		return_item_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "������Ʒ�б�"));
		return_panel.add(return_item_panel);
		
		
		
		//returned��Ʒ�б����
		String[] return_gift_columnNames ={"ID","����","����"};
		return_gift_list_mode = new DefaultTableModel(return_gift_columnNames,0);
		JTable return_gift_table = new JTable(return_gift_list_mode);
		//return_gift_table.setEnabled(false);
		JScrollPane return_gift_panel=new JScrollPane(return_gift_table);
		return_gift_panel.setPreferredSize(new Dimension(200, 100));
		return_gift_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ӧ����Ʒ�б�"));
		return_panel.add(return_gift_panel);
		
		
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		text_return_money=new JTextField(8);
		button_cancel=new JButton("ȡ��");
		button_ok=new JButton("����˻�");
		button_cancel.addActionListener(this);
		button_ok.addActionListener(this);
		button_ok.setEnabled(false);
		button_cancel.setEnabled(false);
		panel.add(new JLabel("�˿��:"));
		panel.add(text_return_money);
		panel.add(button_ok);
		panel.add(button_cancel);
		body.add(panel);
		
		
		
		
		validate();
		repaint();
		
		
		
		
		
//		//�������
//		JPanel point_panel=new JPanel();
//		point_panel.setLayout(new BoxLayout(point_panel, BoxLayout.Y_AXIS));
//		point_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�������"));
//		JPanel p1=new JPanel();
//		p1.add(new JLabel("���л���:"));
//		text_valid_point=new JTextField(8);
//		text_valid_point.setEditable(false);
//		p1.add(text_valid_point);
//		point_panel.add(p1);
//		point_panel.add(Box.createVerticalStrut(12));
//		JPanel p2=new JPanel();
//		p2.add(new JLabel("Ӧ�ۻ���:"));
//		text_use_point=new JTextField(8);
//		text_use_point.setEditable(false);
//		p2.add(text_use_point);
//		point_panel.add(p2);
//		point_panel.add(Box.createVerticalStrut(12));
//		JPanel p3=new JPanel();
//		point_panel.add(p3);
//		returned_panel.add(point_panel);
//		
//		
//		
//		returned_panel.add(Box.createVerticalStrut(50));
//		
//		
//		//�۸�֧�����
//		JPanel price_panel=new JPanel();
//		price_panel.setLayout(new BoxLayout(price_panel, BoxLayout.Y_AXIS));
//		price_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "���֧��"));
//		JPanel p5=new JPanel();
//		p5.add(new JLabel("�˿��ܶ�:"));
//		text_totol_price=new JTextField(8);
//		text_totol_price.setEditable(false);
//		p5.add(text_totol_price);
//		price_panel.add(p5);
//		price_panel.add(Box.createVerticalStrut(12));
//		JPanel p6=new JPanel();
//		price_panel.add(p6);
//		price_panel.add(Box.createVerticalStrut(12));
//		JPanel p7=new JPanel();
//		price_panel.add(p7);
//		price_panel.add(Box.createVerticalStrut(12));
//		JPanel p8=new JPanel();
//		button_pay_price=new JButton("ȷ��");
//		button_pay_price.addActionListener(this);
//		button_pay_price.setEnabled(false);
//		p8.add(button_pay_price);
//		price_panel.add(p8);
//		returned_panel.add(price_panel);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button_bill_set){
			setBillID();
			return;
		}
		if(e.getSource()==button_item_return){
			returnItem();
			return ;
		}
		if(e.getSource()==button_item_remove){
			removeItem();
			return;
		}
		if(e.getSource()==button_item_return_complete){
			completeReturnItem();
			return;
		}
		if(e.getSource()==button_cancel){
			cancel();
			return;
		}
		if(e.getSource()==button_ok){
			completeReturn();
			return;
		}
	}
	
	
	public void setBillID(){
		boolean ok=controller.setSaleID(text_bill_id.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, " ���������߲����ڣ�");
			return;
		}
		text_bill_id.setEditable(false);
		button_bill_set.setEnabled(false);
		text_item_id.setEditable(true);
		text_item_num.setEditable(true);
		button_item_return.setEnabled(true);
		button_item_remove.setEnabled(true);
		button_item_return_complete.setEnabled(true);
		button_cancel.setEnabled(true);
		ArrayList<String> list=controller.getSaleItemListInfo();
		for(int i=0;i<list.size();i++){
			String item[]=list.get(i).split(",");
			sale_item_list_mode.addRow(item);
		}
		list=controller.getSaleGiftListInfo();
		for(int i=0;i<list.size();i++){
			String item[]=list.get(i).split(",");
			sale_gift_list_mode.addRow(item);
		}
		list=controller.getReturnedItemListInfo();
		for(int i=0;i<list.size();i++){
			String item[]=list.get(i).split(",");
			returned_item_list_mode.addRow(item);
		}
		list=controller.getReturnedGiftListInfo();
		for(int i=0;i<list.size();i++){
			String item[]=list.get(i).split(",");
			returned_gift_list_mode.addRow(item);
		}
	}
	
	
	
	
	public void returnItem(){
		boolean ok=controller.returnItem(text_item_id.getText(), text_item_num.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, " �������");
			return;
		}
		update();
	}
	
	public void removeItem(){
		boolean ok=controller.removeItem(text_item_id.getText(), text_item_num.getText());
		if(!ok){
			JOptionPane.showMessageDialog(null, " �������");
			return;
		}
		update();
	}
	
	
	public void completeReturnItem(){
		boolean ok=controller.completeReturnItem();
		if(!ok){
			JOptionPane.showMessageDialog(null, " ���������߲����ڣ�");
			return;
		}
		update();
		text_item_id.setEditable(false);
		text_item_num.setEditable(false);
		button_item_return.setEnabled(false);
		button_item_remove.setEnabled(false);
		button_item_return_complete.setEnabled(false);
		button_ok.setEnabled(true);
		double money=Double.parseDouble(controller.getMoneyReturn());
		text_return_money.setText(String.format("%.2f",money));
	}
	
	
	public void update(){
		updateItemList();
		updateGiftList();
	}
	
	
	public void updateItemList(){
		while(return_item_list_mode.getRowCount()!=0){
			return_item_list_mode.removeRow(0);
		}
	
		ArrayList<String> itemList=controller.getReturnItemListInfo();
		if(itemList==null){
			return;
		}
		for(int i=0;i<itemList.size();i++){
			String item[]=itemList.get(i).split(",");
			return_item_list_mode.addRow(item);
		}
	}
	
	
	
	
	public void updateGiftList(){
		while(return_gift_list_mode.getRowCount()!=0){
			return_gift_list_mode.removeRow(0);
		}
	
		ArrayList<String> giftList=controller.getReturnGiftListInfo();
		if(giftList==null){
			return;
		}
		for(int i=0;i<giftList.size();i++){
			String item[]=giftList.get(i).split(",");
			return_gift_list_mode.addRow(item);
		}
	}
	
	
	public void cancel(){
		initialize();
	}
	
	
	public void completeReturn(){
		controller.completeReturn();
		JOptionPane.showMessageDialog(null, " ����˻���");
		initialize();
	}
}
