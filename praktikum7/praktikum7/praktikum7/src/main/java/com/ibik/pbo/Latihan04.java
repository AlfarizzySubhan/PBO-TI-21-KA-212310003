package com.ibik.pbo;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Latihan04 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Latihan04() {
        
        pack();
        setLocationRelativeTo(null);
        setSize(1000, 480);
        setTitle("Form");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Latihan04();
    }

    private void GenerateUI(Latihan04 frame) {
        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Save");
        JMenuItem item3 = new JMenuItem("Exit");

        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);

        frame.setJMenuBar(menuBar);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        // Header Title
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        JLabel headerTitle = new JLabel("FORM PENILAIAN MATAKULIAH PBO");
        headerTitle.setFont(new Font("Arial", Font.PLAIN, 30));
        headerPanel.add(headerTitle);

        // Start of Form
        Border lftPanelBorder = BorderFactory.createTitledBorder("Input Data Mahasiswa");
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setPreferredSize(new Dimension(480, 480));
        mainPanel.add(leftPanel, BorderLayout.WEST);
        // Start of Panel Content

        // // Input NPM
        JLabel npmLabel = new JLabel("NPM");
        npmLabel.setBounds(22, 40, 80, 30);
        leftPanel.add(npmLabel);

        JTextField inputNPM = new JTextField();
        inputNPM.setBounds(22, 80, 400, 30);
        leftPanel.add(inputNPM);

        // // Input Nama
        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(22, 120, 80, 30);
        leftPanel.add(namaLabel);

        JTextField inputNama = new JTextField();
        inputNama.setBounds(22, 160, 400, 30);
        leftPanel.add(inputNama);

        // // Input Nilai
        JLabel gradeLabel = new JLabel("Nilai");
        gradeLabel.setBounds(22, 200, 80, 30);
        leftPanel.add(gradeLabel);

        JRadioButton gradeA = new JRadioButton("A");
        gradeA.setBounds(25, 240, 50, 30);
        leftPanel.add(gradeA);

        JRadioButton gradeB = new JRadioButton("B");
        gradeB.setBounds(100, 240, 50, 30);
        leftPanel.add(gradeB);

        JRadioButton gradeC = new JRadioButton("C");
        gradeC.setBounds(175, 240, 50, 30);
        leftPanel.add(gradeC);

        JRadioButton gradeD = new JRadioButton("D");
        gradeD.setBounds(250, 240, 50, 30);
        leftPanel.add(gradeD);

        JRadioButton gradeE = new JRadioButton("E");
        gradeE.setBounds(325, 240, 50, 30);
        leftPanel.add(gradeE);

        JRadioButton gradeF = new JRadioButton("F");
        gradeF.setBounds(400, 240, 50, 30);
        leftPanel.add(gradeF);

        ButtonGroup bg = new ButtonGroup();
        bg.add(gradeA);
        bg.add(gradeB);
        bg.add(gradeC);
        bg.add(gradeD);
        bg.add(gradeE);
        bg.add(gradeF);

        // // Button CRUD Data
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(25, 280, 100, 30);
        leftPanel.add(btnSave);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(175, 280, 100, 30);
        leftPanel.add(btnDelete);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(325, 280, 100, 30);
        leftPanel.add(btnClear);
        // End of Panel Content
        leftPanel.setBorder(lftPanelBorder);
        // End of Form

        // Table
        Border rPanelBorder = BorderFactory.createTitledBorder("Data Mahasiswa");
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(rightPanel, BorderLayout.EAST);

        String data[][] = {
                { "212310036", "Alfarizzy subhan", "B" },
                { "212310055", "Septiawan Pratama", "C" },
                { "212310001", "Muhammad firdaus", "A" }
        };
        String column[] = {
                "Student ID",
                "Name",
                "Grade"
        };

        JTable jt = new JTable(data, column);
        jt.setBounds(22, 40, 480, 450);
        JScrollPane sp = new JScrollPane(jt);

        rightPanel.add(sp);

        rightPanel.setBorder(rPanelBorder);
    }
}