package com;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Test1 {
	public  static  void  main(String[]  args) {
		JFrame jframe = new JFrame("新体验");
		jframe.setLocation(100, 100);   //设置位置
		jframe.setSize(600, 500);    //设置大小
		
		jframe.setLayout(new FlowLayout());   //设置流式布局
		
		//frame.setBackground(Color.black);  窗体不显示颜色
		
		//获得内容面板
		Container con = jframe.getContentPane();
		
		//在内容面板中添加组件
		
		//添加文本
		JLabel label_username = new JLabel("用户名:");
		//JLabel label_image = new JLabel(new ImageIcon("./src/image/1.png"));  //设置标签图片
		//label_username.setText("用户名：");
		con.add(label_username);
		
		//添加文本框
		//JTextField userName = new JTextField(5);    //指定列数为5
		//JTextField userName = new JTextField("Susan");    //文本框中初始化字段为Susan
		JTextField userName = new JTextField();
		userName.setText("fsr");
		System.out.println(userName.getText());    //得到文本框中的值
		con.add(userName);
		
		//设置文本域
		JTextArea textArea = new JTextArea(10,10); 
		textArea.setText("做好：");
		textArea.append("认真学习");  //追加文本
		con.add(textArea);
		
		//设置按钮
		JButton button = new JButton("添加");
		//JButton btn_image = new JButton(new ImageIcon("./src/image/1.png"));
		con.add(button);
		
		//设置复选框
		JCheckBox checkbox = new JCheckBox("安卓",true);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		
		//设置单选按钮
		JRadioButton radio1 = new JRadioButton("男",true);
		con.add(radio1);
		JRadioButton radio2 = new JRadioButton("女",false);
		con.add(radio2);
		
		//设置单选按钮组
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		
		//设置下拉列表
		String [] items = {"选项一","选项二","选项三"};
		JComboBox<String> sel = new JComboBox<String>(items);
		sel.addItem("选项四");
		sel.setSelectedIndex(2);  //按索引设置默认项
		System.out.println(sel.getSelectedItem());
		con.add(sel);
		
		//设置表格
		//没有显示列名
		/*String [] colName = {"姓名","性别","年龄","分数"};  //列名
		String [][]  rowData = {{"张三","男","15","96"},{"张三","男","15","96"},{"张三","男","15","96"}};  //数据
		JTable table = new JTable(rowData,colName);
		con.add(table);*/
		
		String [] colName = {"姓名","性别","年龄","分数"}; 
		DefaultTableModel dt = new DefaultTableModel(colName,0);
		
		dt.addRow(new String[]{"张三","男","15","96"});
		dt.addRow(new String[]{"李四","男","15","96"});
		dt.addRow(new String[]{"王五","男","15","96"});
		dt.addRow(new String[]{"赵二","男","15","96"});
		dt.addRow(new String[]{"钱一","男","15","96"});
		dt.addRow(new String[]{"胡六","男","15","96"});
		dt.addRow(new String[]{"七七","男","15","96"});
		dt.addRow(new String[]{"天八","男","15","96"});
		
		JTable table = new JTable(dt);
		table.setRowHeight(60);
		
		JScrollPane jp = new JScrollPane(table);   //设置滚动面板
		jp.setPreferredSize(new Dimension(400, 200));  //设置滚动面板大小
		jframe.add(jp);  //在窗体中添加滚动面板
		
		//设置菜单
		JMenuBar menuBar = new JMenuBar();
		jframe.setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("文件");  //一级菜单
		JMenu menu2 = new JMenu("关于");
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		menu1.add(new JMenuItem("打开")); //添加二级菜单
		menu1.add(new JMenuItem("保存")); //添加二级菜单
		
		//jf.pack();//自动匹配窗体大小 ,setSize()方法则失效
//jf.setLocationRelativeTo(null);  //设置窗口相对于指定组件的位置。如果组件当前未显示或者 c 为 null，则此窗口将置于屏幕的中央。
		jframe.setVisible(true);  //设置窗体可见
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置右上角关闭按钮 关闭窗体
		
	}
}
