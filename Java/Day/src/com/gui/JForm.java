package com.gui;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JForm extends JFrame {
	JLabel jl1,jl2;
	JRadioButton jrb1,jrb2;
	JCheckBox jcb1,jcb2,jcb3,jcb4;
	JPanel jp1,jp2;
	public JForm() {
		jl1 = new JLabel("性别");
		jl2 = new JLabel("特长");
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		jcb1 = new JCheckBox("手");
		jcb2 = new JCheckBox("腿");
		jcb3 = new JCheckBox("头发");
		jcb4 = new JCheckBox("名字");
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jp1.add(jl1);
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp2.add(jl2);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jcb3);
		jp2.add(jcb4);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setSize(500,300);
		this.setLocation(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JForm();
	}

}
