package com.gui;

import javax.swing.JFrame;

public class JavaWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();//创建窗体对象
		frame.setTitle("window");//设置窗体标题
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体时结束程序
		frame.setVisible(true);//显示窗体
	}

}
