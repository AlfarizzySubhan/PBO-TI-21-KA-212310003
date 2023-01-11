package com.ibik.pbo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Hello world!
 *
 */
public class Latihan01 extends JFrame{ 
	
	Latihan01(){
		
		
		pack();
		setLocationRelativeTo(null);
		setSize(300,300);
		setTitle("Latihan01");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		GenerateUI(this);
		setVisible(true);
	} 
	
    public static void main( String[] args )
    {
        new Latihan01();
    }
    private void GenerateUI(Latihan01 frame) {
    	JButton button1 = new JButton();
    	button1.setText("HALO");
    	JButton button2 = new JButton();
    	button2.setText("EVERYONE");
    	JButton button3 = new JButton();
    	button3.setText("IBIK");
    	
    	button1.setBounds(25,30,100,50);
    	button2.setBounds(200,30,100,50);
    	button3.setBounds(120,100,100,50);
    	
    	frame.add(button1);
    	frame.add(button2);
    	frame.add(button3);
    	frame.setLayout(null);
    	
    	
    	button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"HELLO Is a Word for 'Hello' ","You just click HELLO",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
    	button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"EVERYONE Is a Word for 'Everyone' ","You just click EVERYONE",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});    
    	button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"IBIK is an acronym for 'Institute Bisnis dan Informatika Kesatuan' ","You just click IBIK",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});    
    	
    	
    }

}
