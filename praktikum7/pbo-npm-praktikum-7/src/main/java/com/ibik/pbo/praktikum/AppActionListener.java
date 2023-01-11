package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppActionListener extends JFrame implements ActionListener{
	
	private JButton btn ;
	AppActionListener(){
		setVisible(true);
	pack();
	setTitle("Contoh Action Listener Pada Button");
	setSize(300,300);
	setLayout(new FlowLayout());
	
	btn = new JButton("Click Me");
	btn.addActionListener(this);
	add(btn);
	}
	public static void main(String[] args) {
		new AppActionListener();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			OtherWindow othFrame = new OtherWindow();
			othFrame.setVisible(true);
			dispose();
		}
	}

}
