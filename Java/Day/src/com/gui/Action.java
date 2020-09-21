package com.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Action extends JFrame{
	JButton jb;
	JComboBox operator;
	JTextField num1,num2,num3;
	public Action() {
		jb = new JButton("=");
		String[] op = {"+","-","*","/"};
		operator = new JComboBox(op);
		num1 = new JTextField(8);
		num2 = new JTextField(8);
		num3 = new JTextField(8);
		this.setLayout(new FlowLayout());
		this.add(num1);
		this.add(operator);
		this.add(num2);
		this.add(jb);
		this.add(num3);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1=num1.getText();//获取内容
				String str2=num2.getText();
				//将数字格式的字符串转换为数字
				double num_1=Double.parseDouble(str1);
				double num_2=Double.parseDouble(str2);
				double jg=0;
				//如何获取下拉列表中的值jcb.getSelectedItem()
				if(operator.getSelectedItem().equals("+"))
				{
					jg=num_1+num_2;
				}
				else if(operator.getSelectedItem().equals("-")) {
					jg=num_1-num_2;
				}
				else if(operator.getSelectedItem().equals("*")) {
					jg=num_1*num_2;
				}
		
				else if(operator.getSelectedItem().equals("/")) {
					if(str2.equals("0")) {
						//消息对话框组件JOptionPane
//						JOptionPane.showMessageDialog(this,"不能为0");
						return;
					}
					else {
					jg=num_1/num_2;
					}
				}
				String str3=String.valueOf(jg);//将数字类型转换为字符串
				num3.setText(str3);//setText() :设置值
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Action();
	}

}
