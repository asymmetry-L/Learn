package com.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JFrame implements ActionListener{
JButton jb1,jb2,jb3,jb4;
JPanel jp1;
JLabel jl1,jl2,jl3,jl4;
JPanel jp2;
JPanel jp3;//卡片容器
CardLayout card1;//卡片对象
public Card() {
	jb1=new JButton("红桃A");
	jb2=new JButton("黑桃A");
	jb3=new JButton("梅花A");
	jb4=new JButton("方片A");
	jp1=new JPanel();
	jl1=new JLabel("红桃A");
	jl2=new JLabel("黑桃A");
	jl3=new JLabel("梅花A");
	jl4=new JLabel("方片A");
	jp2=new JPanel();
	jp3=new JPanel();
	
	card1=new CardLayout();
	jp2.setLayout(card1);
	jp1.add(jb1);
	jp1.add(jb2);
	jp1.add(jb3);
	jp1.add(jb4);

	jp2.add("kp1", jl1);
	jp2.add("kp2",jl2);
	jp2.add("kp3",jl3);
	jp2.add("kp4",jl4);
	
	jp3.add(jp2);
	this.add(jp1,BorderLayout.SOUTH);
	this.add(jp3,BorderLayout.CENTER);

	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	jb4.addActionListener(this);
	
	this.setSize(500, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
}

//事件处理方法
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jb1)
	{

		card1.show(jp2, "kp1");
	}else if(e.getSource()==jb2) {
		card1.show(jp2, "kp2");
	}else if(e.getSource()==jb3) {
		card1.show(jp2, "kp3");
	}else if(e.getSource()==jb4) {
		card1.show(jp2, "kp4");
	}
		
	
}

public static void main(String[] args) {
	new Card();
}








}
