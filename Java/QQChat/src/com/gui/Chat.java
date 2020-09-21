package com.gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame implements ActionListener{
	
	int j = 0; //计数
	String nameString;
	
	JButton sendButton;
	JLabel chatArea[];
	JLabel nameJLabel;
	JPanel jp;
	JPanel chatJPanel;
	JScrollPane jsp;
	JTextField chatJTextField;
	public Chat(String name) {
		// TODO Auto-generated constructor stub
		nameString = name;
		nameJLabel = new JLabel("好友：" + name + "    ");
		chatJTextField = new JTextField(10);
		chatJTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					if (j>30) {
						j=0;
					}
					chatArea[j].setText("对" + nameString + "说:    ");
					j++;
					chatArea[j].setText(chatJTextField.getText() + "    ");//(chatJTextField.getText(), JLabel.RIGHT);
					j++;
					chatJTextField.setText("");
				}
			}
		});
		sendButton = new JButton("发送");
		sendButton.addActionListener(this);
		
		jp = new JPanel();
		jp.add(nameJLabel);
		jp.add(chatJTextField);
		jp.add(sendButton);
		chatArea = new JLabel[30];
		chatJPanel = new JPanel();
		chatJPanel.setLayout(new GridLayout(30, 1));
		for (int i = 0; i < chatArea.length; i++) {
			chatArea[i] = new JLabel(" ", JLabel.RIGHT);
			chatJPanel.add(chatArea[i]);
		}
		
		jsp = new JScrollPane(chatJPanel);
		this.add(jsp,BorderLayout.CENTER);
		this.add(jp,BorderLayout.SOUTH);
		//窗口设置
		this.setTitle("QQ Chat");
		ImageIcon icon = new ImageIcon("image/logo.png");
		this.setIconImage(icon.getImage());
		this.setSize(300, 500);
		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chat("test");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == sendButton) {
				if (j>30) {
					j=0;
				}
				chatArea[j].setText("对" + nameString + "说:    ");
				j++;
				chatArea[j].setText(chatJTextField.getText() + "    ");//(chatJTextField.getText(), JLabel.RIGHT);
				j++;
				chatJTextField.setText("");
//				chatJPanel.add(chatArea[j]);
		}
	}

}
