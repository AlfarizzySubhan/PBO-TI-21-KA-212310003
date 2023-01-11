package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OtherWindow extends JFrame implements ActionListener{
	private JButton btn ;
	OtherWindow(){
		setVisible(true);
	pack();
	setTitle("Contoh Action Listener Pada Button");
	setSize(300,300);
	setLayout(new FlowLayout());
	
	btn = new JButton("Back To First Window");
	btn.addActionListener(this);
	add(btn);
	}
	public static void main(String[] args) {
		new OtherWindow();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			AppActionListener aal = new AppActionListener();
			aal.setVisible(true);
			dispose();
		}
	}

}
