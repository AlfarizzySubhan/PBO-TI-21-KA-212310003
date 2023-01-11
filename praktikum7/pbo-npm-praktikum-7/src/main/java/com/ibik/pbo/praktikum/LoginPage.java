package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class LoginPage extends JFrame implements ActionListener{
	private JButton btnRegister;
	
	LoginPage(){
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(350,350);
		setTitle("Login");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		GenerateUI(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginPage();
	}
	
	public void GenerateUI(LoginPage frame) {
		 JPanel mainPanel = new JPanel();
		 mainPanel.setLayout(new BorderLayout());
		 frame.setContentPane(mainPanel);
		 
		 JPanel panel1 = new JPanel();
		 panel1.setLayout(null);
		 mainPanel.add(panel1,BorderLayout.NORTH);
		 
		 JLabel lblUsername = new JLabel("Username");
		 lblUsername.setBounds(22, 23, 80, 16);
		 panel1.add(lblUsername);

		 JTextField textUsername = new JTextField();
		 textUsername.setBounds(105, 18, 169, 30);
		 panel1.add(textUsername);
		 
		 JLabel lblPassword = new JLabel("Password");
		 lblPassword.setBounds(22, 69, 61, 16);
		 panel1.add(lblPassword);

		 JPasswordField textPassword = new JPasswordField();
		 textPassword.setBounds(105, 64, 169, 30);
		 panel1.add(textPassword);
		 
		 JCheckBox chkRemember = new JCheckBox("Remember account ?");
		 chkRemember.setBounds(105, 100, 169, 40);
		 panel1.add(chkRemember);

		 JButton btnRegister = new JButton("Register");
		 btnRegister.setBounds(85, 150, 110, 40);
		 panel1.add(btnRegister);
		 btnRegister.addActionListener(this);
		 add(btnRegister);
		 
		 final JButton btnLogin = new JButton("Login");
		 btnLogin.setBounds(200, 150, 110, 40);
		 panel1.add(btnLogin);
		 btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLogin) {
					JOptionPane.showMessageDialog(null,"Selamat datang Asisten Dosen PBO","Data Ditemukan",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		 add(btnLogin);
		 
		 
		 JLabel lblCopyright = new JLabel("copyright IBIK @2022",SwingConstants.CENTER);
		 lblCopyright.setBackground(Color.BLUE);
		 lblCopyright.setSize(300, 50);
		 mainPanel.add(lblCopyright,BorderLayout.SOUTH);
		 frame.add(panel1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			RegisterPage rp = new RegisterPage();
			rp.setVisible(true);
			dispose();
			}
		}

		
	
