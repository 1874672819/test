package com;

import java.awt.event.WindowListener;

import javax.swing.JFrame;

import com.sun.glass.events.WindowEvent;

public class test3 {
  public static void main(String[] args) {
	final JFrame frame = new JFrame();
	frame.setSize(500, 500);
	
	frame.addWindowListener(new WindowListener() {						
		public void windowOpened(WindowEvent arg0) {
			System.out.println("�������");
		}						
		public void windowIconified(WindowEvent arg0) {
			System.out.println("������С����");
		}						
		public void windowDeiconified(WindowEvent arg0) {
			System.out.println("������С������ԭ��");
		}						
		
		public void windowDeactivated(WindowEvent arg0) {
			System.out.println("����ʧȥ������");
		}						
	
		public void windowClosing(WindowEvent arg0) {
			System.out.println("����ر�");
			//frame.dispose();  //��windowClosing������ִ��dispose������windowClosed����ִ��,���ʹ����frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)����windowClosed������ִ��
		}						

		public void windowClosed(WindowEvent arg0) {
			System.out.println("�����Ѿ��ر���");
		}						
	
		public void windowActivated(WindowEvent arg0) {
			System.out.println("�����ý���");
		}
		@Override
		public void windowOpened(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowIconified(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeiconified(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowActivated(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeactivated(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	});										
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// TODO Auto-generated method stub

}

}
