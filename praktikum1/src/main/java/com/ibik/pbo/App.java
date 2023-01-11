package com.ibik.pbo;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Hello world!
 *
 */
public class App {
    App(){
    	JFrame frame = new JFrame();
    	frame.setVisible(true);
    	frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setSize(300,350);
    	frame.setTitle("Contoh Window Frame");
    	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
   public static void main( String[] args) {
	   new App();
   }
}
