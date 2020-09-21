package com.gui;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Cursor;
	import java.awt.Font;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTabbedPane;
	import javax.swing.JTextField;

	public class QqLogin extends JFrame implements ActionListener{//��Ӽ�����
	static String[][] userList = new String[30][2];
	int i = 0;
	//��������
	JLabel jl1;
	//�м�����
	JTabbedPane jtp;//ҳǩ�����ѡ����壩�������������
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	JPanel jp2,jp3,jp4;//��������彫������Ҫ����ҳǩ�����
	//�ϲ�����
	JButton jb1,jb2,jb3;
	JPanel jp1;
	
	String userName;
	public QqLogin() {
		//��������
		 jl1=new JLabel(new ImageIcon("img/qqHead.gif"));
		//�м�����
		 jtp=new JTabbedPane();//����ҳǩ�������
		 jl2=new JLabel("qq����",JLabel.CENTER);
		 jl3=new JLabel("qq����",JLabel.CENTER);
		 jl4=new JLabel("��������",JLabel.CENTER);
		 jl4.setFont(new Font("����",Font.PLAIN,14));
		 jl4.setForeground(Color.blue);
		 jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jl5=new JLabel("<html><a href='https://www.qq.com' style='text-decoration:none'>�������뱣��</a><html>",JLabel.CENTER);
		 jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jtf=new JTextField(10);
		 jpf=new JPasswordField(10);
		 jb4=new JButton("�������");
		 jcb1=new JCheckBox("�����¼");
		 jcb2=new JCheckBox("��ס����");
		 jp2=new JPanel();
		 jp3=new JPanel();
		 jp3.setBackground(Color.blue);
		 jp4=new JPanel();
		 jp4.setBackground(new Color(60,90,180));
		//�ϲ�����
		jb1=new JButton("��¼");
		jb2=new JButton("ȡ��");
		jb3=new JButton("ע����");
		jp1=new JPanel();
		jp2.setLayout(new GridLayout(3,3,2,2));
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jtp.add("qq����", jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("qq����",jp4);
		this.add(jtp,BorderLayout.CENTER);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		//ע�������
		jb4.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(this);
		jb3.addActionListener(this);
		this.setSize(365, 300);
		this.setTitle("�û���¼");
		ImageIcon img=new ImageIcon("img/qqLogo.gif");
		this.setIconImage(img.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public QqLogin(String userCode,String userPwd) {
		//��������
		 jl1=new JLabel(new ImageIcon("img/qqHead.gif"));
		//�м�����
		 jtp=new JTabbedPane();//����ҳǩ�������
		 jl2=new JLabel("qq����",JLabel.CENTER);
		 jl3=new JLabel("qq����",JLabel.CENTER);
		 jl4=new JLabel("��������",JLabel.CENTER);
		 jl4.setFont(new Font("����",Font.PLAIN,14));
		 jl4.setForeground(Color.blue);
		 jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jl5=new JLabel("<html><a href='https://www.qq.com' style='text-decoration:none'>�������뱣��</a><html>",JLabel.CENTER);
		 jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jtf=new JTextField(10);
		 jpf=new JPasswordField(10);
		 jb4=new JButton("�������");
		 jcb1=new JCheckBox("�����¼");
		 jcb2=new JCheckBox("��ס����");
		 jp2=new JPanel();
		 jp3=new JPanel();
		 jp3.setBackground(Color.blue);
		 jp4=new JPanel();
		 jp4.setBackground(new Color(60,90,180));
		//�ϲ�����
		jb1=new JButton("��¼");
		jb2=new JButton("ȡ��");
		jb3=new JButton("ע����");
		jp1=new JPanel();
		jp2.setLayout(new GridLayout(3,3,2,2));
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jtp.add("qq����", jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("qq����",jp4);
		this.add(jtp,BorderLayout.CENTER);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		//ע�������
		jb4.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(this);
		jb3.addActionListener(this);
		this.setSize(365, 300);
		this.setTitle("�û���¼");
		ImageIcon img=new ImageIcon("img/qqLogo.gif");
		this.setIconImage(img.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.userList[i][0] = userCode;
		this.userList[i][1] = userPwd;
		i++;
		
	}


		public static void main(String[] args) {
			new QqLogin();

		}


	    //�¼�������
		public void actionPerformed(ActionEvent e) {
			boolean flag = false; 
			if(e.getSource()==jb4) {
				jtf.setText("");
				jpf.setText("");
			}
			else if(e.getSource()==jb2)//�����ȡ����ť
			{
				this.dispose();//�رմ���
			}else if(e.getSource()==jb3) {
				new Reg();
			}
			if(e.getSource()==jb1) {//��¼
				//��ȡ�û���������ݣ�1.�û���2.��
				String user=jtf.getText();
				char c[]=jpf.getPassword();
				String pwd=String.valueOf(c);
				for (int j=0;j<=i;j++) {
					if(this.userList[j][0].equals(jtf.getText())&&this.userList[j][1].equals(String.valueOf(jpf.getPassword()))) {
						userName = userList[j][0];
						System.out.println(this.userList[0][0]);
						System.out.println(this.userList[0][1]);
						flag = true;
					}
				}
				//�ж�����������Ƿ���ȷ���Ƿ��������е�����һ�£� ���裺�û���admin ���룺123456
				if(flag == true)
				{
					//������ȷ����������б���δ��ɣ����������
					new FriendList(this.userName);
					flag =false;
					this.dispose();//�رմ���
				}else 
				{
					//���ݴ���ʹ����Ϣ�Ի��������ʾJOptionPane��
					//JOptionPane.showMessageDialog(this, "������û������벻��ȷ��");
					JOptionPane.showMessageDialog(this, "�û������벻��ȷ", "�����", JOptionPane.WARNING_MESSAGE);
				}				
			}
			
		}

	}
