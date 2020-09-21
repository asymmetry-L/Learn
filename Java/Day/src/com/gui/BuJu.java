package com.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuJu extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	JPanel jp1,jp2;
	public BuJu() {
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		jb7 = new JButton("7");
		jb8 = new JButton("8");
		jb9 = new JButton("9");
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.CENTER);
		this.add(jb6,BorderLayout.WEST);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setSize(500,300);
		this.setLocation(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BuJu();
	}

}
