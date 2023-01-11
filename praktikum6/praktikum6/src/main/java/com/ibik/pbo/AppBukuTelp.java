package com.ibik.pbo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppBukuTelp {
    public static void main(String[] args) {
        ArrayList<String> fieldName = new ArrayList<String>();
        fieldName.add("Nama Lengkap");
        fieldName.add("Alamat");
        fieldName.add("No. Telp");

        ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < fieldName.size(); i++) {
            contact.add(new ArrayList<String>());
            for (int j = 0; j < fieldName.size(); j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan " + fieldName.get(j) + ":",
                        "Data ke - " + (i + 1), JOptionPane.QUESTION_MESSAGE);
                contact.get(i).add(j, value);
            }
        }

        String output = "";

        for (int i = 0; i < fieldName.size(); i++) {
            output += "Data ke - " + (i + 1) + "\n";
            for (int j = 0; j < fieldName.size(); j++) {
                output += fieldName.get(j) + ": " + contact.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(contact);
    }
}