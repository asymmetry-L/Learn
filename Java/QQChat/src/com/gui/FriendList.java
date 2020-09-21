package com.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class FriendList extends JFrame implements ActionListener,MouseListener{
	//����
	JButton hyHButton,msrHButton,hmdHButton;
	JPanel btnHNJPanel,btnHSJPanel,listHJPanel;
	
	//İ����
	JButton hyMButton,msrMButton,hmdMButton;
	JPanel btnMNJPanel,btnMSJPanel,listMJPanel;

	//������
	JButton hyDButton,msrDButton,hmdDButton;
	JPanel btnDNJPanel,btnDSJPanel,listDJPanel;

	JPanel boxJPanel;//��Ƭ����
	CardLayout card;//��Ƭ����
	
	//�����б�
	JLabel gfListJLabel[];
	JScrollPane jsp;
	
	public FriendList(String name) {
		// TODO Auto-generated constructor stub
		//button
		hyHButton = new JButton("�ҵĺ���");
		hyMButton = new JButton("İ����");
		hyDButton = new JButton("������");
		msrHButton = new JButton("�ҵĺ���");
		msrMButton = new JButton("İ����");
		msrDButton = new JButton("������");
		hmdHButton = new JButton("�ҵĺ���");
		hmdMButton = new JButton("İ����");
		hmdDButton = new JButton("������");
		
		//���
		btnHNJPanel = new JPanel();
		btnHSJPanel = new JPanel();
		listHJPanel = new JPanel();
		btnMNJPanel = new JPanel();
		btnMSJPanel = new JPanel();
		listMJPanel = new JPanel();
		btnDNJPanel = new JPanel();
		btnDSJPanel = new JPanel();
		listDJPanel = new JPanel();
		boxJPanel = new JPanel();
		
		//�����б�
		gfListJLabel = new JLabel[10];
		listHJPanel.setLayout(new GridLayout(10, 1, 10, 8));
		for (int i = 0; i < gfListJLabel.length; i++) {
			int j = i + 1;
			gfListJLabel[i] = new JLabel("00" + i, new ImageIcon("image/qq" + j + ".jpg"), JLabel.LEFT);
//			gfListJPanel[i].add(gfListJLabel[i]);
//			System.out.println(i);
			gfListJLabel[i].addMouseListener(this);
			listHJPanel.add(gfListJLabel[i]);
			
		}
		
		//����
		card = new CardLayout();
		
		//��������
		
		boxJPanel.setLayout(card);
		
		btnHSJPanel.setLayout(new GridLayout(2, 1));
		btnHNJPanel.setLayout(new BorderLayout());
		
		btnMNJPanel.setLayout(new GridLayout(2,1));
		btnMSJPanel.setLayout(new BorderLayout());
		
		btnDNJPanel.setLayout(new GridLayout(3,1));
		btnDSJPanel.setLayout(new BorderLayout());
		
		
		btnHSJPanel.add(hyMButton);
		btnHSJPanel.add(hyDButton);
		btnHNJPanel.add(hyHButton,BorderLayout.NORTH);
		btnHNJPanel.add(listHJPanel,BorderLayout.CENTER);
		btnHNJPanel.add(btnHSJPanel,BorderLayout.SOUTH);

		btnMNJPanel.add(msrHButton);
		btnMNJPanel.add(msrMButton);
		btnMSJPanel.add(btnMNJPanel,BorderLayout.NORTH);
		btnMSJPanel.add(listMJPanel,BorderLayout.CENTER);
		btnMSJPanel.add(msrDButton,BorderLayout.SOUTH);
		
		btnDNJPanel.add(hmdHButton);
		btnDNJPanel.add(hmdMButton);
		btnDNJPanel.add(hmdDButton);
		btnDSJPanel.add(btnDNJPanel,BorderLayout.NORTH);
		btnDSJPanel.add(listDJPanel,BorderLayout.CENTER);
		
		jsp = new JScrollPane(btnHNJPanel);
		boxJPanel.add("card1",jsp);
		boxJPanel.add("card2",btnMSJPanel);
		boxJPanel.add("card3",btnDSJPanel);
		this.add(boxJPanel);

		//������
		hyHButton.addActionListener(this);
		hyMButton.addActionListener(this);
		hyDButton.addActionListener(this);
		msrHButton.addActionListener(this);
		msrMButton.addActionListener(this);
		msrDButton.addActionListener(this);
		hmdHButton.addActionListener(this);
		hmdMButton.addActionListener(this);
		hmdDButton.addActionListener(this);
		
		this.setTitle(name);
		this.setSize(300, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FriendList("11");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < gfListJLabel.length; i++) {
			if (e.getSource() == gfListJLabel[i]) {
				new Chat(gfListJLabel[i].getText());
			}
			
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
		if (e.getSource() == hyHButton ||e.getSource() == msrHButton ||e.getSource() == hmdHButton) {
//			System.out.println("1234");
			card.show(boxJPanel, "card1");
		}else if (e.getSource() ==hyMButton ||e.getSource() == msrMButton ||e.getSource() == hmdMButton) {
			card.show(boxJPanel, "card2");
		}else if (e.getSource() == hyDButton ||e.getSource() ==msrDButton ||e.getSource() == hmdDButton) {
			card.show(boxJPanel, "card3");
		}
		
	}

}
