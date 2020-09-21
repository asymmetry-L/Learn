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
				String str1=num1.getText();//��ȡ����
				String str2=num2.getText();
				//�����ָ�ʽ���ַ���ת��Ϊ����
				double num_1=Double.parseDouble(str1);
				double num_2=Double.parseDouble(str2);
				double jg=0;
				//��λ�ȡ�����б��е�ֵjcb.getSelectedItem()
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
						//��Ϣ�Ի������JOptionPane
//						JOptionPane.showMessageDialog(this,"����Ϊ0");
						return;
					}
					else {
					jg=num_1/num_2;
					}
				}
				String str3=String.valueOf(jg);//����������ת��Ϊ�ַ���
				num3.setText(str3);//setText() :����ֵ
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Action();
	}

}
