package com.ibik.pbo;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class test extends JFrame{
	test(){
	
	setVisible(true);
	pack();
	setLocationRelativeTo(null);
	setSize(300,350);
	setTitle("Calculator");
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	GenerateUI(this);
	}
	public static void main(String[] args) {
		new test();
	}
	
	public void GenerateUI(test frame) {
		BorderLayout bl = new BorderLayout();
		JPanel windowPanel = new JPanel();	
		windowPanel.setLayout(bl);
		
		JTextField text1 = new JTextField();
		text1.setText(String.valueOf(0));
		windowPanel.add("North",text1);
		
		JPanel panelBtnNum = new JPanel();
		JButton buttons[] = new JButton[10];
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			panelBtnNum.add(buttons[i]);
			
		}
		
		JButton buttonClear = new JButton("C");
		panelBtnNum.add(buttonClear);
		
		JButton buttonEqual = new JButton("=");
		panelBtnNum.add(buttonEqual);
		
		JPanel panelBtnOperand = new JPanel();
		panelBtnOperand.setLayout(new GridLayout(2,2));
		String operand[] = {"+","-","x","/"};
		JButton btnOperand[] = new JButton[operand.length];
		for(int i = 0; i < operand.length; i++) {
			btnOperand[i] = new JButton(operand[i]);
			panelBtnOperand.add(btnOperand[i]);
		}
		
		windowPanel.add("East",panelBtnOperand);
		frame.add(windowPanel);
			}
		}
