package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;


public class ReturnItemPanel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField text_bill;
	private JButton button_bill;
	private JTextField text_item_id;
	private JTextField text_item_num;
	private JButton button_item;
	private DefaultTableModel mode;
	private JTextField text_patback_price;
	private JButton button_price;
	CashierPanel cp;
	
	
	
	public ReturnItemPanel(CashierPanel cp){
		this.cp=cp;
        this.setLayout(new FlowLayout());
		
		
		//收据面板
		JPanel pvip=new JPanel();
		pvip.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "收据"));
		pvip.add(new JLabel("收据编号:"));
		text_bill=new JTextField(12);
		pvip.add(text_bill);
		button_bill=new JButton("确定");
		button_bill.addActionListener(this);
		pvip.add(button_bill);
		this.add(pvip);
		
		
		
		//购买商品面板
		JPanel pitem=new JPanel();
		pitem.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		pitem.add(new JLabel("商品ID:"));
		text_item_id=new JTextField(12);
		pitem.add(text_item_id);
		pitem.add(new JLabel("商品数目:"));
		text_item_num=new JTextField(12);
		pitem.add(text_item_num);
		button_item=new JButton("确定");
		button_item.addActionListener(this);
		pitem.add(button_item);
		this.add(pitem);
		
		
		
		//购买商品列表面板
		String[] columnNames ={"ID","名字","单价","优惠价","数量","总价"};
		mode = new DefaultTableModel(columnNames, 0);
		JTable itemTable = new JTable(mode);
		itemTable.setEnabled(false);
		JScrollPane pitemList=new JScrollPane(itemTable);
		pitemList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "商品购买"));
		this.add(pitemList);
		
		
		
		//价格、支付面板
		JPanel pprice=new JPanel();
		pprice.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "金额支付"));
		pprice.add(new JLabel("退款:"));
		text_patback_price=new JTextField(12);
		pprice.add(text_patback_price);
		button_price=new JButton("确定");
		button_price.addActionListener(this);
		pprice.add(button_price);
		this.add(pprice);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button_bill){
			
		}
		if(e.getSource()==button_item){
			
		}
		if(e.getSource()==button_price){
			
		}
	}

}
