package com.gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tim extends JFrame{
	JButton qq,weChat,submit;
	JPanel left,right,right_1,right_2,right_3;
	JTextField qqCode;
	JPasswordField qqPwd;
	JCheckBox reSet,autoLg;
	JLabel forget,enroll;
	public Tim() {
		// TODO Auto-generated constructor stub
		qq = new JButton();//°´Å¥
		ImageIcon qqIcon = new ImageIcon("image/QQ.png");
		qq.setIcon(qqIcon);
		weChat = new JButton();
		ImageIcon weChatIcon = new ImageIcon("image/weChat.png");
		weChat.setIcon(weChatIcon);
		submit = new JButton("Enter");
		
		qqCode = new JTextField(10);//ÎÄ±¾¿ò
		
		qqPwd = new JPasswordField(10);//ÃÜÂë¿ò
		
		reSet = new JCheckBox("¼Ç×¡ÃÜÂë");//¸´Ñ¡¿ò
		autoLg = new JCheckBox("×Ô¶¯µÇÂ¼");
		
		forget = new JLabel("Íü¼ÇÃÜÂë");//±êÇ©
		enroll = new JLabel("×¢²áÕËºÅ");
		
		left = new JPanel();//Ãæ°å
		right = new JPanel();
		right.setLayout(new GridLayout(3, 1, 50, 50));
		right_1 = new JPanel();
		right_1.add(qq);
		right_1.add(weChat);
		
		right_2 = new JPanel();
		right_2.setLayout(new GridLayout(3 ,1 ,0 ,20));
		right_2.add(qqCode);
		right_2.add(qqPwd);
		right_2.add(submit);
		
		right_3 = new JPanel();
		right_3.setLayout(new GridLayout( 2, 2, 10, 10));
		right_3.add(reSet);
		right_3.add(forget);
		right_3.add(autoLg);
		right_3.add(enroll);
		left.setPreferredSize(new Dimension(900 ,400));
		left.setBackground(Color.pink);
		right.add(right_1);
		right.add(right_2);
		right.add(right_3);
		this.add(left,BorderLayout.CENTER);
		this.add(right,BorderLayout.EAST);
		
		this.setTitle("Tim");
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				new Chat();
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tim tim = new Tim();
	}

}
