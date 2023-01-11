package com.ibik.pbo;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Latihan02 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Latihan02() {
    
       
        pack();
        setLocationRelativeTo(null);
        setSize(350, 400);
        setTitle("Contoh Window Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Latihan02();
    }

    private void GenerateUI(Latihan02 frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        mainPanel.add(panel1, BorderLayout.NORTH);

        JLabel lblFullName = new JLabel("Fullname");
        lblFullName.setBounds(22, 23, 80, 16);

        panel1.add(lblFullName);

        final JTextField textFullName = new JTextField();
        textFullName.setBounds(105, 18, 169, 30);
        textFullName.setEditable(true);
        panel1.add(textFullName);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(22, 69, 61, 16);
        panel1.add(lblEmail);

        final JTextField textEmail = new JTextField();
        textEmail.setBounds(105, 64, 169, 30);
        panel1.add(textEmail);
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(22, 109, 61, 16);
        panel1.add(lblPhone);

        final JTextField txtPhone = new JTextField();
        txtPhone.setBounds(105, 104, 169, 30);
        panel1.add(txtPhone);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(22, 150, 61, 16);
        panel1.add(lblGender);

        final JRadioButton radioGender1 = new JRadioButton("Female");
        radioGender1.setBounds(105, 145, 100, 30);
        panel1.add(radioGender1);

        final JRadioButton radioGender2 = new JRadioButton("Male");
        radioGender2.setBounds(200, 145, 100, 30);
        panel1.add(radioGender2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioGender1);
        bg.add(radioGender2);

        JLabel lblCityzen = new JLabel("Citizenship");
        lblCityzen.setBounds(22, 185, 100, 16);
        panel1.add(lblCityzen);

        String country[] = {
                "Indonesia",
                "India",
                "Australia",
                "U.S.A",
                "England",
                "New Zealand"
        };

        final JComboBox<String> selectCitizen = new JComboBox<>(country);
        selectCitizen.setBounds(105, 180, 169, 30);
        panel1.add(selectCitizen);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(105, 250, 169, 40);
        ActionListener actionSubmit = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> data = new ArrayList<String>();

                if (!textFullName.getText().isEmpty()) {
                    data.add(textFullName.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Data tidak boleh kosong (Nama Kosong). Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (!textEmail.getText().isEmpty()) {
                    data.add(textEmail.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Data tidak boleh kosong (Email Kosong). Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (!txtPhone.getText().isEmpty()) {
                    data.add(txtPhone.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Data tidak boleh kosong (No. Telepon Kosong). Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (radioGender1.isSelected()) {
                    data.add(radioGender1.getText());
                } else if (radioGender2.isSelected()) {
                    data.add(radioGender2.getText());
                }

                data.add(selectCitizen.getSelectedItem().toString());

                String output = "";
                output += "Name : " + data.get(0) + "\n";
                output += "Email : " + data.get(1) + "\n";
                output += "Phone : " + data.get(2) + "\n";
                output += "Gender : " + data.get(3) + "\n";
                output += "Citizenship : " + data.get(4) + "\n";
                JOptionPane.showMessageDialog(null, output, "Test Submit", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        btnSubmit.addActionListener(actionSubmit);
        panel1.add(btnSubmit);

        frame.add(panel1);
    }
}