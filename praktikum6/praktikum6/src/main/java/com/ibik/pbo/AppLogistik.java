package com.ibik.pbo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppLogistik {
    public static ArrayList<String> order = new ArrayList<String>();
    public static boolean isStop = false;
    public static boolean validation = true;

    public static void main(String[] args) {

        mainloop: do {
            try {
                String menu_label = "Menu : \n";
                menu_label += "1. Cek Ongkir\n";
                menu_label += "2. Cek Resi\n";
                menu_label += "3. Keluar\n\n";
                menu_label += "Pilih menu: ";

                String value = JOptionPane.showInputDialog(null, menu_label, "Menu",
                        JOptionPane.QUESTION_MESSAGE);

                if (value == null) {
                    int exit = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    if (exit == 0) {
                        JOptionPane.showMessageDialog(null, "Terima Kasih!", "XYZ Expedition",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } else {
                        continue;
                    }
                } else if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mohon Masukkan Kode!", "Alert!", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                int menu = Integer.parseInt(value);

                switch (menu) {
                    case 1:
                        order.clear();
                        String field[] = { "Berat Barang (gr)", "Jarak Tempuh (km)" };

                        for (int i = 0; i < field.length; i++) {
                            String values = JOptionPane.showInputDialog(null, "Masukkan " + field[i],
                                    "Cek Ongkir",
                                    JOptionPane.QUESTION_MESSAGE);
                            if (values == null) {
                                int choose = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?", "Keluar",
                                        JOptionPane.YES_NO_OPTION);

                                if (choose == 0) {
                                    isStop = true;
                                    JOptionPane.showMessageDialog(null, "Terima Kasih!", "XYZ Expedition",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    break mainloop;
                                } else if (choose == 1) {
                                    isStop = false;
                                    i--;
                                }
                            } else if (values.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Harap Masukkan Data!", "Alert!",
                                        JOptionPane.ERROR_MESSAGE);
                                i--;
                            } else {
                                order.add(values);
                            }
                        }

                        int hargaOngkir = ongkir(order.get(0), order.get(1));
                        order.add(Integer.toString(hargaOngkir));

                        String noResi = "XYZ-001";
                        order.add(noResi);

                        String output = "";
                        output += "Total ongkir : " + hargaOngkir + "\n";
                        output += "Resi : " + order.get(3);

                        JOptionPane.showMessageDialog(null, output, "Cek Ongkir",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 2:
                        cekResi();
                        break;

                    case 3:
                        int choose = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?", "Keluar",
                                JOptionPane.YES_NO_OPTION);

                        if (choose == 0) {
                            isStop = true;
                            JOptionPane.showMessageDialog(null, "Terima Kasih!", "XYZ Expedition",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else if (choose == 1) {
                            isStop = false;
                        }
                        break;

                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Harap masukkan angka!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } while (isStop == false);
    }

    public static int ongkir(String berat, String jarak) {
        int vberat = Integer.parseInt(berat);
        int vjarak = Integer.parseInt(jarak);
        int totalOngkir = 0;
        int hargaBerat = 0;
        int hargaJarak = 0;

        hargaBerat = (vberat / 100) * 5000;
        hargaJarak = (vjarak / 10) * 8000;

        totalOngkir = hargaBerat + hargaJarak;

        return totalOngkir;
    }

    public static void cekResi() {
        if (order.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Kosong!", "Cek Resi",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String no_resi = JOptionPane.showInputDialog(null, "Masukkan No. Resi : ", "Cek Resi",
                    JOptionPane.QUESTION_MESSAGE);
            if (!no_resi.equals(order.get(3))) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan!", "Cek Resi",
                        JOptionPane.ERROR_MESSAGE);
            } else if (no_resi.equals(order.get(3))) {
                String output = "";
                output += "Status Pengiriman XYZ Expedition\n";
                output += "===========================\n\n";
                output += "No Resi Pengiriman : " + order.get(3) + "\n";
                output += "Total Ongkir : " + order.get(2) + "\n";
                output += "Status : Sedang Proses";
                JOptionPane.showMessageDialog(null, output, "Cek Resi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}