package Lambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	   public static void main(String[] args) {
		
		   JFrame frame = new JFrame("My Window");
		    frame.setSize(400, 400);
		    frame.setLayout(new FlowLayout());
		    
		    
		    //Create button and jframe
		   JButton button = new JButton("click me");
		   
		   button.addActionListener((e)->{
			   System.out.println("button click");
			   JOptionPane.showMessageDialog(null, "hey button click");
		   });
//		   
//		   button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("button click");
//				JOptionPane.showMessageDialog(null, "hey button click");
//			}
		
		   frame.add(button);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setVisible(true);
	}
}
