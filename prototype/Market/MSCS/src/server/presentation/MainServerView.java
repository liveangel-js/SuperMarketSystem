package server.presentation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import server.logic.MainServerBusinessLogic;

//鍒跺畾鍟嗕笟绛栫暐鐣岄潰
public class MainServerView extends JFrame{
	 JLabel label1=new JLabel("杈撳叆鍟嗗搧鏍囪瘑:");
	 JTextField txt1 = new JTextField(100);	 
	 JButton button1=new JButton("鏄剧ず");
	 
	 JLabel label2=new JLabel("鍟嗗搧淇℃伅锛�");
	 JTextArea textArea1=new JTextArea(100,50);
	 
	 JLabel label3=new JLabel("杈撳叆鍟嗗搧鐗逛环淇℃伅锛�");
	 
	 JLabel label4=new JLabel("鐗逛环锛�");
	 JTextField txt2 = new JTextField(100);
	 
	 JLabel label5=new JLabel("寮�鏃堕棿锛�");
	 JTextField txt3 = new JTextField(100);
	 
	 JLabel label6=new JLabel("缁撴潫鏃堕棿锛�");
	 JTextField txt4 = new JTextField(100);
	 
	 JButton button2=new JButton("纭畾");
	 
	 JLabel label7=new JLabel("鐗逛环鍟嗗搧鍒楄〃锛�");
	 JTextArea textArea2=new JTextArea(100,100);
	 
	 JButton button3=new JButton("鏇存柊");
	 
	 JLabel label8=new JLabel("");
	 
	 //澶勭悊鐣岄潰浜嬩欢鐨勯�杈戝眰瀵硅薄
	 MainServerBusinessLogic logic;
	 
     public MainServerView() {
    	logic=new MainServerBusinessLogic(); 
    	
    	JPanel panel = (JPanel)this.getContentPane();
    	 
    	panel.add(label1);
    	label1.setLocation(20,20);
    	label1.setSize(80,30);
    	panel.add(txt1);
    	txt1.setLocation(120,20);
    	txt1.setSize(200,30);
    	panel.add(button1);
    	button1.setLocation(340, 20);
    	button1.setSize(100, 30);
    	
    	panel.add(label2);
    	label2.setLocation(20,60);
    	label2.setSize(100,30);
    	panel.add(textArea1);
    	textArea1.setLocation(100,60);
    	textArea1.setSize(400,100);
    	textArea1.setEditable(false);
    	textArea1.setBorder(BorderFactory.createLineBorder(Color.black,1));
    	
    	panel.add(label3);
    	label3.setLocation(20,170);
    	label3.setSize(150,30);
    	
    	panel.add(label4);
    	label4.setLocation(20,210);
    	label4.setSize(100,30);
    	panel.add(txt2);
    	txt2.setLocation(100,210);
    	txt2.setSize(200,30);
    	
    	panel.add(label5);
    	label5.setLocation(20,250);
    	label5.setSize(100,30);
    	panel.add(txt3);
    	txt3.setLocation(100,250);
    	txt3.setSize(200,30);
    	
    	panel.add(label6);
    	label6.setLocation(20,290);
    	label6.setSize(100,30);
    	panel.add(txt4);
    	txt4.setLocation(100,290);
    	txt4.setSize(200,30);
    	
    	panel.add(button2);
    	button2.setLocation(20,330);
    	button2.setSize(100,30);	 	 	
    	
    	panel.add(label7);
    	label7.setLocation(20,370);
    	label7.setSize(100,30);
    	panel.add(textArea2);
    	textArea2.setLocation(150,370);
    	textArea2.setSize(400,200);
    	textArea2.setEditable(false);
    	textArea2.setBorder(BorderFactory.createLineBorder(Color.black,1));
    	
    	panel.add(button3);
    	button3.setLocation(20,580);
    	button3.setSize(100,30);
    	
    	panel.add(label8);
    	label8.setLocation(50,620);
    	label8.setSize(100,30);
    	
    	//璁剧疆绐楀彛鍙涓斾笉鍙慨鏀瑰ぇ灏�
    	setVisible(true);
    	setResizable(false);
    	
    	//鎸夐挳1鐨勮Е鍙戜簨浠�鏄剧ず鍟嗗搧淇℃伅锛屽寘鎷晢鍝佹爣璇嗐�鎻忚堪鍜屼环鏍�
    	button1.addActionListener(new ActionListener(){
    		  public void actionPerformed(ActionEvent e)
    		  {
    			  String tempString=logic.searchItem(Integer.parseInt(txt1.getText()));//璋冪敤閫昏緫灞傜殑searchItem鏂规硶
    			  if(tempString.charAt(0)!='0')
    			  {
    				   tempString="鍟嗗搧鏍囪瘑锛屾弿杩帮紝浠锋牸"+"\n"+tempString;
    				   textArea1.setText(tempString);
    			  }
    			  else 
    				   JOptionPane.showMessageDialog(null, "璇ュ晢鍝佷笉瀛樺湪","閿欒",JOptionPane.INFORMATION_MESSAGE);
    		  }
    	   }
    	);
    	
    	//鎸夐挳2鐨勮Е鍙戜簨浠讹細鎺ユ敹杈撳叆鐨勫晢鍝佺壒浠蜂俊鎭苟鍐欏叆鏂囦欢锛屽寘鎷壒浠枫�寮�鏃ユ湡鍜岀粨鏉熸棩鏈熷苟涓旀樉绀哄晢鍝佺壒浠蜂俊鎭�
    	button2.addActionListener(new ActionListener(){
  		      public void actionPerformed(ActionEvent e){ 
                   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
                   {
                	   JOptionPane.showMessageDialog(null, "璇峰畬鏁磋緭鍏ュ晢鍝佹爣璇嗐�鐗逛环銆佸紑濮嬫棩鏈熷拰缁撴潫鏃ユ湡","閿欒",JOptionPane.INFORMATION_MESSAGE);
                   }
                   else
                   {
                	   String tempString="鍟嗗搧鏍囪瘑锛屽悕绉帮紝浠锋牸锛岀壒浠凤紝寮�鏃ユ湡锛岀粨鏉熸棩鏈焅n";
                	   ArrayList<String> tempList=new ArrayList<String>();
                	   
                	   //鍐欏叆鍟嗗搧鐗逛环淇℃伅 ,璋冪敤閫昏緫灞傜殑writeItem鏂规硶             	   
                	   logic.writeItem(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),txt3.getText(),txt4.getText());
                	   
                	   //璇诲彇鍟嗗搧鐗逛环淇℃伅,璋冪敤閫昏緫灞傜殑searchSale鏂规硶
                	   tempList=logic.searchSale();
                	   for(int i=0;i<tempList.size();i++)
                	   {
                		   tempString+=tempList.get(i)+"\n";
                	   }
                	   textArea2.setText(tempString);
                   }
  		      }
  	       }
  	    );
    	
    	//鎸夐挳3鐨勮Е鍙戜簨浠�浼犺緭鍟嗕笟绛栫暐缁欏鎴风
    	button3.addActionListener(new ActionListener(){
  		      public void actionPerformed(ActionEvent e){ 
  		    	    logic.update();//璋冪敤閫昏緫灞傜殑update鏂规硶
  		      }
  	       }
  	    );
    	
	 }
     
     
     
     public static void main(String []args){
    	 MainServerView view=new MainServerView();
    	 view.setSize(580, 650);
     }
     
}
