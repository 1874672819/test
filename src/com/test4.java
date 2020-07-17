package com;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class test4 {
	 public static void main(String[] args) throws Exception {
	        final JFrame jf = new JFrame("�ļ�ѡ����");
	        jf.setSize(400, 250);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel();

	        // �����ı�����, ������ʾ�����Ϣ
	        final JTextArea msgTextArea = new JTextArea(10, 30);
	        msgTextArea.setLineWrap(true);
	        panel.add(msgTextArea);

	        JButton openBtn = new JButton("��");
	        openBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	// TODO Auto-generated method stub
	                showFileOpenDialog(jf, msgTextArea);
	            }
	        });
	        panel.add(openBtn);

	        JButton saveBtn = new JButton("����");
	        saveBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	// TODO Auto-generated method stub
	                showFileSaveDialog(jf, msgTextArea);
	            }
	        });
	        panel.add(saveBtn);

	        jf.setContentPane(panel);
	        jf.setVisible(true);
	    }

	    
	     //���ļ�
	    
	    private static void showFileOpenDialog(Component parent, JTextArea msgTextArea) {
	        // ����һ��Ĭ�ϵ��ļ�ѡȡ��
	        JFileChooser fileChooser = new JFileChooser();

	        // ����Ĭ����ʾ���ļ���Ϊ��ǰ�ļ���
	        fileChooser.setCurrentDirectory(new File("."));

	        // �����ļ�ѡ���ģʽ��ֻѡ�ļ���ֻѡ�ļ��С��ļ����ļ�����ѡ��
	        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        // �����Ƿ�������ѡ
	        fileChooser.setMultiSelectionEnabled(true);

	        // ���ӿ��õ��ļ���������FileNameExtensionFilter �ĵ�һ������������, ��������Ҫ���˵��ļ���չ�� �ɱ������
	        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar"));
	        // ����Ĭ��ʹ�õ��ļ�������
	        fileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));

	        // ���ļ�ѡ����߳̽�������, ֱ��ѡ��򱻹رգ�
	        int result = fileChooser.showOpenDialog(parent);

	        if (result == JFileChooser.APPROVE_OPTION) {
	            // ��������"ȷ��", ���ȡѡ����ļ�·��
	            File file = fileChooser.getSelectedFile();

	            // �������ѡ�����ļ�, ��ͨ�����淽����ȡѡ��������ļ�
	            // File[] files = fileChooser.getSelectedFiles();

	            msgTextArea.append("���ļ�: " + file.getAbsolutePath() + "\n\n");
	        }
	    }

	   
	     //ѡ���ļ�����·��
	     
	    private static void showFileSaveDialog(Component parent, JTextArea msgTextArea) {
	        // ����һ��Ĭ�ϵ��ļ�ѡȡ��
	        JFileChooser fileChooser = new JFileChooser();

	        // ���ô��ļ�ѡ����Ĭ��������ļ���
	        fileChooser.setSelectedFile(new File("�����ļ�.zip"));

	        // ���ļ�ѡ����߳̽�������, ֱ��ѡ��򱻹رգ�
	        int result = fileChooser.showSaveDialog(parent);

	        if (result == JFileChooser.APPROVE_OPTION) {
	            // ��������"����", ���ȡѡ��ı���·��
	            File file = fileChooser.getSelectedFile();
	            msgTextArea.append("���浽�ļ�: " + file.getAbsolutePath() + "\n\n");
	        }
	    }


}