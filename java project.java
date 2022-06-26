

import java.awt.event.*;
import javax.swing.*;
public class Java {
 Java(){
  JFrame f = new JFrame("Student Info System");
  JLabel l1 = new JLabel("Enter the Roll No. to know details");
  l1.setBounds(40,50,200,30);
  JTextField t1 = new JTextField();
  t1.setBounds(40,80,240,20);
  JButton b1 = new JButton("Enter");
  b1.setBounds(300,80,70,20);
  JLabel p1 = new JLabel("Name");
  JLabel p2 = new JLabel("Branch");
  JLabel p3 = new JLabel("Semester");
  JLabel p4 = new JLabel("Email");
  JLabel p5 = new JLabel ("Phone No.");
  p1.setBounds(40,120,60,20);
  p2.setBounds(40,150,60,20);
  p3.setBounds(40,180,60,20);
  p4.setBounds(40,210,60,20);
  p5.setBounds(40,240,60,20);
  JTextField s1 = new JTextField();
  JTextField s2 = new JTextField();
  JTextField s3 = new JTextField();
  JTextField s4 = new JTextField();
  JTextField s5 = new JTextField();
  s1.setBounds(130,120,150,20);
  s2.setBounds(130,150,150,20);
  s3.setBounds(130,180,150,20);
  s4.setBounds(130,210,150,20);
  s5.setBounds(130,240,150,20);
  JLabel p7 = new JLabel();
  p7.setBounds(40,300,200,30);
  f.add(l1);
  f.add(t1);
  f.add(b1);
  f.add(p1);
  f.add(p2);
  f.add(p3);
  f.add(p4);
  f.add(p5);
  f.add(p7);
  f.add(s1);
  f.add(s2);
  f.add(s3);
  f.add(s4);
  f.add(s5);
  f.setSize(500,400);
  f.setLayout(null);
  f.setVisible(true);
  
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener() {

   @Override
   public void actionPerformed(ActionEvent e) {
    String s = t1.getText();
    int a = Integer.parseInt(s);
    
	if(a==1901) {
    	s1.setText("Tarun");
    	s2.setText("Electronics");
    	s3.setText("3");
    	s4.setText("tarunpsv@gmail.com");
    	s5.setText("9406541257");
    	p7.setText("");

    	}
    else if(a==1903) {
    	s1.setText("Rohith");
    	s2.setText("Electrical");
    	s3.setText("3");
    	s4.setText("rohtihcse@gmail.com");
    	s5.setText("6302148967");
    	p7.setText("");
    	}
    	else if(a==1904) {
    	s1.setText("Karthik");
    	s2.setText("CSE");
    	s3.setText("3");
    	s4.setText("karthikbaka@gmail.com");
    	s5.setText("7820146935");
    	p7.setText("");
    	}
    	else if(a==1905) {
    	s1.setText("Siddhartha");
    	s2.setText("CSE");
    	s3.setText("3");
    	s4.setText("sidcapman@gmail.com");
    	s5.setText("8919182220");
    	p7.setText("");
    	}else if(a==1902) {
    	s1.setText("Emma Watson");
    	s2.setText("Electrical");
    	s3.setText("3");
    	s4.setText("staremma@gmail.com");
    	s5.setText("6302148967");
    	p7.setText("");
    	}
    	else {
    	p7.setText("Info not available for this Roll No.");
    	s1.setText("");
    	s2.setText("");
    	s3.setText("");
    	s4.setText("");
    	s5.setText("");
    	}

     
   }
         
        });
   
 }

 public static void main(String[] args) {
  new Java();
 }

}
