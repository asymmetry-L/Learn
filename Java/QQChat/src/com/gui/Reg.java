package com.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.RSAKeyGenParameterSpec;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Reg extends JFrame implements ActionListener{
	//1.�̳�JFrame
JLabel jl1,jl2;
JTextField jtf;
JPasswordField jpf;
JButton jb1,jb2;
JPanel jp1,jp2,jp3;
static String userCode,userPwd;
public Reg() {
	//�������
	jl1=new JLabel("�û���(6λ)");
	jtf=new JTextField(10);
	jl2=new JLabel("����(7λ)");
	jpf=new JPasswordField(10);
    jb1=new JButton("ע��");
    jb2=new JButton("ȡ��");
	jp1=new JPanel();
	jp2=new JPanel();
	jp3=new JPanel();
	//���ò���
	this.setLayout(new GridLayout(3,1));
	//������
	jtf.addActionListener(this);
	jpf.addActionListener(this);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jp1.add(jl1);
	jp1.add(jtf);
	jp2.add(jl2);
	jp2.add(jpf);
	jp3.add(jb1);
	jp3.add(jb2);
	this.add(jp1,BorderLayout.NORTH);
	this.add(jp2,BorderLayout.CENTER);
	this.add(jp3,BorderLayout.SOUTH);
	//չʾ����
	this.setSize(300, 200);
	this.setTitle("ע��");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	
}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	this.userCode = jtf.getText();
	this.userPwd = String.valueOf(jpf.getPassword());
	if (userCode.length()>5 && userPwd.length() >=6 && e.getSource()==jb1) {
		
		this.userCode = jtf.getText();
		this.userPwd = String.valueOf(jpf.getPassword());
		QqLogin carchLogin = new QqLogin(this.userCode,this.userPwd);
		carchLogin.dispose();
		this.dispose();
	} else if (e.getSource() ==jb2) {
		this.dispose();
	}
}
	public static void main(String[] args) {

	}

}
