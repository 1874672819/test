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
		frame.add(new JButton("按钮1"),BorderLayout.SOUTH);   //此布局失效
		frame.add(new JButton("按钮2"));
		frame.add(new JButton("按钮3"));
		frame.add(new JButton("按钮4"));
		frame.add(new JButton("按钮5"));
		frame.setVisible(true);
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		// TODO Auto-generated method stub

	}