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
			System.out.println("窗体打开了");
		}						
		public void windowIconified(WindowEvent arg0) {
			System.out.println("窗体最小化了");
		}						
		public void windowDeiconified(WindowEvent arg0) {
			System.out.println("窗体最小化被还原了");
		}						
		
		public void windowDeactivated(WindowEvent arg0) {
			System.out.println("窗体失去焦点了");
		}						
	
		public void windowClosing(WindowEvent arg0) {
			System.out.println("窗体关闭");
			//frame.dispose();  //在windowClosing方法中执行dispose方法，windowClosed方法执行,如果使用了frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)，则windowClosed方法不执行
		}						

		public void windowClosed(WindowEvent arg0) {
			System.out.println("窗体已经关闭了");
		}						
	
		public void windowActivated(WindowEvent arg0) {
			System.out.println("窗体获得焦点");
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
