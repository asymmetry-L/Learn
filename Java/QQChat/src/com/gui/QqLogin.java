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

	public class QqLogin extends JFrame implements ActionListener{//添加监听器
	static String[][] userList = new String[30][2];
	int i = 0;
	//北部区域
	JLabel jl1;
	//中间区域
	JTabbedPane jtp;//页签组件（选项卡窗体）（容器类组件）
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	JPanel jp2,jp3,jp4;//这三个面板将来都是要放在页签组件上
	//南部区域
	JButton jb1,jb2,jb3;
	JPanel jp1;
	
	String userName;
	public QqLogin() {
		//北部区域
		 jl1=new JLabel(new ImageIcon("img/qqHead.gif"));
		//中间区域：
		 jtp=new JTabbedPane();//创建页签组件对象
		 jl2=new JLabel("qq号码",JLabel.CENTER);
		 jl3=new JLabel("qq密码",JLabel.CENTER);
		 jl4=new JLabel("忘记密码",JLabel.CENTER);
		 jl4.setFont(new Font("宋体",Font.PLAIN,14));
		 jl4.setForeground(Color.blue);
		 jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jl5=new JLabel("<html><a href='https://www.qq.com' style='text-decoration:none'>申请密码保护</a><html>",JLabel.CENTER);
		 jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jtf=new JTextField(10);
		 jpf=new JPasswordField(10);
		 jb4=new JButton("清除号码");
		 jcb1=new JCheckBox("隐身登录");
		 jcb2=new JCheckBox("记住密码");
		 jp2=new JPanel();
		 jp3=new JPanel();
		 jp3.setBackground(Color.blue);
		 jp4=new JPanel();
		 jp4.setBackground(new Color(60,90,180));
		//南部区域
		jb1=new JButton("登录");
		jb2=new JButton("取消");
		jb3=new JButton("注册向导");
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
		jtp.add("qq号码", jp2);
		jtp.add("手机号码",jp3);
		jtp.add("qq邮箱",jp4);
		this.add(jtp,BorderLayout.CENTER);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		//注册监听器
		jb4.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(this);
		jb3.addActionListener(this);
		this.setSize(365, 300);
		this.setTitle("用户登录");
		ImageIcon img=new ImageIcon("img/qqLogo.gif");
		this.setIconImage(img.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public QqLogin(String userCode,String userPwd) {
		//北部区域
		 jl1=new JLabel(new ImageIcon("img/qqHead.gif"));
		//中间区域：
		 jtp=new JTabbedPane();//创建页签组件对象
		 jl2=new JLabel("qq号码",JLabel.CENTER);
		 jl3=new JLabel("qq密码",JLabel.CENTER);
		 jl4=new JLabel("忘记密码",JLabel.CENTER);
		 jl4.setFont(new Font("宋体",Font.PLAIN,14));
		 jl4.setForeground(Color.blue);
		 jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jl5=new JLabel("<html><a href='https://www.qq.com' style='text-decoration:none'>申请密码保护</a><html>",JLabel.CENTER);
		 jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 jtf=new JTextField(10);
		 jpf=new JPasswordField(10);
		 jb4=new JButton("清除号码");
		 jcb1=new JCheckBox("隐身登录");
		 jcb2=new JCheckBox("记住密码");
		 jp2=new JPanel();
		 jp3=new JPanel();
		 jp3.setBackground(Color.blue);
		 jp4=new JPanel();
		 jp4.setBackground(new Color(60,90,180));
		//南部区域
		jb1=new JButton("登录");
		jb2=new JButton("取消");
		jb3=new JButton("注册向导");
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
		jtp.add("qq号码", jp2);
		jtp.add("手机号码",jp3);
		jtp.add("qq邮箱",jp4);
		this.add(jtp,BorderLayout.CENTER);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		//注册监听器
		jb4.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(this);
		jb3.addActionListener(this);
		this.setSize(365, 300);
		this.setTitle("用户登录");
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


	    //事件处理方法
		public void actionPerformed(ActionEvent e) {
			boolean flag = false; 
			if(e.getSource()==jb4) {
				jtf.setText("");
				jpf.setText("");
			}
			else if(e.getSource()==jb2)//若点击取消按钮
			{
				this.dispose();//关闭窗体
			}else if(e.getSource()==jb3) {
				new Reg();
			}
			if(e.getSource()==jb1) {//登录
				//获取用户输入的内容：1.用户名2.密
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
				//判断输入的内容是否正确（是否与数据中的数据一致） 假设：用户名admin 密码：123456
				if(flag == true)
				{
					//数据正确，进入好友列表（还未完成），聊天界面
					new FriendList(this.userName);
					flag =false;
					this.dispose();//关闭窗体
				}else 
				{
					//数据错误（使用消息对话框组件提示JOptionPane）
					//JOptionPane.showMessageDialog(this, "输入的用户名密码不正确！");
					JOptionPane.showMessageDialog(this, "用户名密码不正确", "输错了", JOptionPane.WARNING_MESSAGE);
				}				
			}
			
		}

	}
