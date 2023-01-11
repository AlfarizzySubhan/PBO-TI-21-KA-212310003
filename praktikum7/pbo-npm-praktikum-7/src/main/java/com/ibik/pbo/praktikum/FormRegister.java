package com.ibik.pbo.praktikum;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormRegister extends JFrame{
	private JPanel contentPane;
	private JTextField text_npm;
	private JTextField text_email;
	private JTextField text_password;
	private JTextField text_repassword;
	private JTextField text_firstname;
	private JTextField text_middlename;
	private JTextField text_lastname;
	private JTextField text_birthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormRegister frame = new FormRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTittle = new JLabel("FORM REGISTER");
		lblTittle.setBounds(65,18,108,15);
		contentPane.add(lblTittle);
		
		JLabel lblNewLabel = new JLabel("NPM");
		lblNewLabel.setBounds(10, 52, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_4 = new JLabel("FirstName");
		lblNewLabel_4.setBounds(10, 77, 79, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("MiddleName");
		lblNewLabel_5.setBounds(10, 101, 79, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("LastName");
		lblNewLabel_6.setBounds(10, 127, 68, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(10, 154, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_7 = new JLabel("Birthday");
		lblNewLabel_7.setBounds(10, 183, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		text_npm = new JTextField();
		text_npm.setBounds(123, 51, 86, 20);
		contentPane.add(text_npm);
		text_npm.setColumns(10);

		text_firstname = new JTextField();
		text_firstname.setBounds(123, 77, 86, 20);
		contentPane.add(text_firstname);
		text_firstname.setColumns(10);

		text_middlename = new JTextField();
		text_middlename.setBounds(123, 105, 86, 20);
		contentPane.add(text_middlename);
		text_middlename.setColumns(10);

		text_lastname = new JTextField();
		text_lastname.setBounds(123, 130, 86, 20);
		contentPane.add(text_lastname);
		text_lastname.setColumns(10);
		
		text_email = new JTextField();
		text_email.setBounds(123, 158, 86, 20);
		contentPane.add(text_email);
		text_email.setColumns(10);

		text_birthday = new JTextField();
		text_birthday.setBounds(123, 186, 86, 20);
		contentPane.add(text_birthday);
		text_birthday.setColumns(10);

		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.setBounds(21, 234, 89, 23);
		contentPane.add(btn_cancel);

		JButton btn_register = new JButton("Register");
		btn_register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inserttodb();
				
			}
		});
		btn_register.setBounds(120, 234, 89, 23);
		contentPane.add(btn_register);

	}

	protected void inserttodb() {
		// TODO Auto-generated method stub
		String output = "";
		output += "NPM :"+ text_npm.getText()+"\n"+
		"first name :"+ text_firstname.getText()+"\n"+
		"middle name :"+ text_middlename.getText()+"\n"+
		"last name :"+ text_lastname.getText()+"\n"+
		"email :"+ text_email.getText()+"\n"+
		"Birthday :"+ text_birthday.getText()+"\n";

		Students std = new Students();
		StudentsDao stddao = new StudentsDao();

		std.setNpm(text_npm.getText());
		std.setFirstname(text_firstname.getText());
		std.setMiddlename(text_middlename.getText());
		std.setLastname(text_lastname.getText());
		std.setEmail(text_email.getText());
		std.setBirthdate(text_birthday.getText());

		try {
			stddao.saved(std);
			JOptionPane.showMessageDialog(null,"Berhasil disimpan");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"gagal disimpan");
		}

	}

}
