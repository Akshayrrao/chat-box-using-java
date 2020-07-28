import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class solution extends JFrame implements ActionListener{
	
	    String msg1;
	    String msg2;
		JFrame f = new JFrame("frame");  
		JInternalFrame in = new JInternalFrame("USER-1", true, true, true, true);
		JPanel p = new JPanel(); 
		JLabel l1=new JLabel("USER 1:");
		//JTextArea ta1=new JTextArea();
		JTextField tf1=new JTextField(20);
		JButton b1=new JButton("SEND");
		JButton b2=new JButton("CLEAR");
		JLabel l2=new JLabel();
		JInternalFrame in1 = new JInternalFrame("USER-2", true, true, true, true);
		JPanel p1 = new JPanel(); 
		JLabel l3=new JLabel("USER 2:");
		//JTextArea ta2=new JTextArea();
		 JTextField tf2=new JTextField(20);
		JButton b3=new JButton("REPLY");
		JButton b4=new JButton("CLEAR");
		JLabel l4=new JLabel();
		JTextArea textArea = new JTextArea(20, 20);
		JScrollPane scrollableTextArea = new JScrollPane(textArea);
		JTextArea textArea1 = new JTextArea(20, 20);
		JScrollPane scrollableTextArea1 = new JScrollPane(textArea1);
		
	public solution()
	{ 
		f.setLayout(new FlowLayout());
		f.add(in); 
		f.add(in1); 
		f.setSize(1500,1500);
		f.setVisible(true);
		in.setVisible(true); 
		in1.setVisible(true);
		in.add(p); 
		in1.add(p1);
		p.add(l1); 
		//p.add(ta1);
		p.add(tf1);
		p.add(b1);
		p.add(b2);
		p.add(l2);  
		p1.add(l3);
		//p1.add(ta2);
		p1.add(tf2);
		p1.add(b3);
		p1.add(b4);
		p1.add(l4);
		f.getContentPane().setBackground(Color.WHITE);
		l1.setForeground(Color.BLUE);
		l3.setForeground(Color.BLUE);
		b1.setBackground(Color.YELLOW);
		b3.setBackground(Color.YELLOW);
		b2.setBackground(Color.GREEN);
		b4.setBackground(Color.GREEN);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		p.add(textArea);
		p.add(scrollableTextArea);
		p1.add(textArea1);
		p1.add(scrollableTextArea1);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        f.getContentPane().add(scrollableTextArea); 
        scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        f.getContentPane().add(scrollableTextArea1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="CLEAR")
		{
			tf1.setText("");
			tf2.setText("");
			
		}
		if(e.getActionCommand()=="SEND")
		{
			msg1=tf1.getText();
			l2.setText("Message sent");
			textArea.append("User-1:"+msg1+"\n");
			textArea1.append("User-1:"+msg1+"\n");
		}
		
		if(e.getActionCommand()=="REPLY")
		{
			
			msg2=tf2.getText();
			l4.setText("Message sent");
			textArea.append("User-2:"+msg2+"\n");
			textArea1.append("User-2:"+msg2+"\n");
			
		}
	}
	public static void main(String args[])
	{
		new solution();
	}
	
} 
