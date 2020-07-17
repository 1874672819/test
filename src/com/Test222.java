package com;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test222 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		JPanel leftPanel = new JPanel();
		final JPanel centerPanel = new JPanel();
		
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(centerPanel);
		
		//网格布局,三行,一列
		leftPanel.setLayout(new GridLayout(3,1)); 
		JButton btnPrev=new JButton("前一个");
		JButton btnNext=new JButton("后一个");
		JButton btnThree=new JButton("第三个");
		
		leftPanel.add(btnPrev);
		leftPanel.add(btnNext);
		leftPanel.add(btnThree);		
		
		//中间的主面板,设为卡片布局
		final CardLayout cl=new CardLayout(); //卡片布局
		centerPanel.setLayout(cl);   
		centerPanel.add(new JButton("A"),"1AAA");
		centerPanel.add(new JButton("B"),"2AAA");
		centerPanel.add(new JButton("C"),"3AAA");
		centerPanel.add(new JButton("D"),"4AAA");
		centerPanel.add(new JButton("E"),"5AAA");
		centerPanel.add(new JButton("F"),"6AAA");		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//用于按钮事件处理的内部类
		class MyActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("前一个")){
					cl.previous(centerPanel);
				}
				else if(e.getActionCommand().equals("后一个")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("第三个")){
					cl.show(centerPanel, "5AAA");  //指定显示哪一个
				}
			}
		}
		
		MyActionListener listener = new MyActionListener();
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnThree.addActionListener(listener);
}
		// TODO Auto-generated method stub

	}
