// Implementing Lambda expression in java.awt

import java.awt.*;  
//import java.awt.event.*;  

//Driver class
public class Lambda1 {

	public static void main(String[] args) {  
		Frame frame=new Frame("ActionListener java8");  
	     
	      Button b=new Button("Click Here");  
	      b.setBounds(50,100,80,50); 
	  
	      b.addActionListener(e -> System.out.println("Hello World!"));  //lambda expression passed as argument.
	      frame.add(b);
	  
	      frame.setSize(200,200);  
	      frame.setLayout(null);  
	      frame.setVisible(true);   
	   }  
}
