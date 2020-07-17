package com;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class test3333 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("window");
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel pal = new JPanel();
		
		JButton btn = new JButton("Çëµã»÷´Ë°´Å¥");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Object[] op = new Object[] {"1","2","3"};
			int optionSelected = JOptionPane.showOptionDialog(null, "", "", 
					JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, 
					null, op, op[0]);
			}});
		  pal.add(btn);

	      jf.setContentPane(pal);
	      jf.setVisible(true);
	}
	
}
