package com.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiBtn extends JFrame{
	JButton jb1,jb2,jb3,jb4;
	public GuiBtn() {
		jb1 = new JButton("��");
		jb2 = new JButton("��");
		jb3 = new JButton("��");
		jb4 = new JButton("��");
		this.setLayout(new BorderLayout());//Ĭ�ϲ���
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.EAST);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.CENTER);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GuiBtn();
	}
}
