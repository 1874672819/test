package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test33 {
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setSize(600, 600);
		
		frame.setLayout(null);
		JButton btn = new JButton("����");
		btn.setBounds(100, 100, 100,30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, "��ѡ��һ��","ѡ���",JOptionPane.YES_OPTION);
				JOptionPane.showMessageDialog(null,"Error", "������ʾ��", JOptionPane.ERROR_MESSAGE);
				
				JDialog d = new JDialog();
				d.setSize(200, 200);
				d.add(new JButton("��ť"));
				d.setVisible(true);
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		


}
