package com;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test22 {

	public static void main(String[] args) {
		Frame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("��ť1"),BorderLayout.SOUTH);   //�˲���ʧЧ
		frame.add(new JButton("��ť2"));
		frame.add(new JButton("��ť3"));
		frame.add(new JButton("��ť4"));
		frame.add(new JButton("��ť5"));
		frame.setVisible(true);
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		// TODO Auto-generated method stub

	}