package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class RegisterPage extends JFrame {
	RegisterPage(){
		
		pack();
		setLocationRelativeTo(null);
		setSize(400,400);
		setTitle("Register");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		GenerateUI(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RegisterPage();

	}
	public void GenerateUI(RegisterPage frame) {
		 JPanel mainPanel = new JPanel();
		 mainPanel.setLayout(new BorderLayout());
		 frame.setContentPane(mainPanel);
		 
		 JPanel panel1 = new JPanel();
		 panel1.setLayout(null);
		 mainPanel.add(panel1,BorderLayout.NORTH);
		 
		 JLabel lblFullName = new JLabel("FullName");
		 lblFullName.setBounds(22, 23, 80, 16);
		 panel1.add(lblFullName);

		 JTextField textFullName = new JTextField();
		 textFullName.setBounds(105, 18, 169, 30);
		 panel1.add(textFullName);
		 
		 JLabel lblEmail = new JLabel("Email");
		 lblEmail.setBounds(22, 69, 61, 16);
		 panel1.add(lblEmail);

		 JTextField textEmail = new JTextField();
		 textEmail.setBounds(105, 64, 169, 30);
		 panel1.add(textEmail);

		 JLabel lblPhone = new JLabel("Phone");
		 lblPhone.setBounds(22, 115, 80, 16);
		 panel1.add(lblPhone);

		 JTextField textPhone = new JTextField();
		 textPhone.setBounds(105, 115, 169, 30);
		 panel1.add(textPhone);
		 
		 JLabel lblGender = new JLabel("Gender");
		 lblGender.setBounds(22, 169, 80, 16);
		 panel1.add(lblGender);

		 JRadioButton radioGender1 = new JRadioButton("Female");
		 radioGender1.setBounds(105, 163, 100, 30);
		 panel1.add(radioGender1);
		 JRadioButton radioGender2 = new JRadioButton("Male");
		 radioGender2.setBounds(200, 163, 100, 30);
		 panel1.add(radioGender2);
		 
		 ButtonGroup bg=new ButtonGroup();
		 bg.add(radioGender1);bg.add(radioGender2);
		 
		 JLabel lblCityzen= new JLabel("Citizenship");
		 lblCityzen.setBounds(22, 215, 100, 16);
		 panel1.add(lblCityzen);
		 
		 String
		 country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"};
		  JComboBox selectCitizen = new JComboBox(country);
		  selectCitizen.setBounds(105, 210, 169, 30);
		  panel1.add(selectCitizen);

		 
		 final JButton btnSubmit = new JButton("Submit");
		 btnSubmit.setBounds(85, 280, 190, 40);
		 panel1.add(btnSubmit);
		 btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnSubmit) {
//					checkPostData(e);
				}
				
			}
		});
		 panel1.add(btnSubmit);
		 
		 
		 JLabel lblCopyright = new JLabel("copyright IBIK @2022",SwingConstants.CENTER);
		 lblCopyright.setBackground(Color.BLUE);
		 lblCopyright.setSize(300, 50);
		 mainPanel.add(lblCopyright,BorderLayout.SOUTH);
		 frame.add(panel1);
		 	 
	}
//	protected void checkPostData(ActionEvent e) {
//        String message = "";
//        String gender = "";
//        if(radioGender1.isSelected()){
//            gender = radioGender1.getText();
//        }else if(radioGender2.isSelected()){
//            gender = radioGender2.getText();
//        }else{
//            gender = "";
//        }
//        if((!textFullName.getText().isEmpty()) && (!textEmail.getText().isEmpty()) && (!textPhone.getText().isEmpty()) && (!gender.equals("")) && (!selectCitizen.getSelectedItem().equals("")) ){
//            message += "Data anda adalah:\n";
//            message += "Fullname: "+textFullName.getText()+"\n";
//            message += "Email: "+textEmail.getText()+"\n";
//            message += "Phone: "+textPhone.getText()+"\n";
//            message += "Gender: "+gender+"\n";
//            message += "Citizenship: "+selectCitizen.getSelectedItem().toString();
//
//            int result = JOptionPane.showConfirmDialog(null, message, "Berhasil ditambahkan", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
//            if(result == JOptionPane.OK_OPTION) {
//            	new RegisterPage().setVisible(true);
//                dispose();
//            }
//        }else{
//            message = "Silakan mengisi data dengan benar";
//            JOptionPane.showMessageDialog(null, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
//        }
//	}
}
