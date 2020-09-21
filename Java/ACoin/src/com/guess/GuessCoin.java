package com.guess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageProducer;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuessCoin extends JFrame implements ActionListener,MouseListener{
	JPanel imgJPanel,oPanel;
	JTextField inputJTextField,outputJTextField;
	JButton submit;
	JLabel imageJLabel,tipJLabel;
	public GuessCoin() {
		// TODO Auto-generated constructor stub
		imageJLabel = new JLabel(new ImageIcon("image/num.png"));
		imageJLabel.addMouseListener(this);
		tipJLabel = new JLabel("��Ӳ����������1�����棻2�����棬�²¿���",JLabel.CENTER);
		tipJLabel.setForeground(Color.blue);
		inputJTextField = new JTextField();
		inputJTextField.addActionListener(this);
		submit = new JButton("���");
		submit.addActionListener(this);
		outputJTextField = new JTextField();
		imgJPanel = new JPanel();
		imgJPanel.add(imageJLabel);
		oPanel = new JPanel();
		oPanel.setLayout(new GridLayout(4, 1));
		oPanel.add(tipJLabel);
		oPanel.add(inputJTextField);
		oPanel.add(submit);
		oPanel.add(outputJTextField);
		
		this.add(imgJPanel,BorderLayout.NORTH);
		this.add(oPanel,BorderLayout.CENTER);
		
		this.setTitle("��Ӳ����Ϸ");
		this.setSize(500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessCoin();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == imageJLabel) {
			JOptionPane.showMessageDialog(null, "�²¿�");
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String num = String.valueOf((int)(1 + Math.random()*2));
		System.out.println(inputJTextField.getText()+":"+num);
		if (e.getSource() == submit ||e.getSource() == inputJTextField) {
			if (inputJTextField.getText().equals(String.valueOf(num))) {
				outputJTextField.setText("�¶��ˣ�");
				outputJTextField.setForeground(Color.green);
			}else {
				outputJTextField.setText("�´��ˣ�");
				outputJTextField.setForeground(Color.red);
			}
		}
	}

}
