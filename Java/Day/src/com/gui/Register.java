package com.gui;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {
	JButton reSet,submit;
	JLabel nameTip,phoneNumTip,emailTip,occupationTip,idCodeTip,psdTip;
	JCheckBox agreement;
	JTextField name,phoneNum,email,idCode;
	JPasswordField psd;
	JComboBox occupation;
	JList list;
	public Register() {
		nameTip = new JLabel("������");
		phoneNumTip = new JLabel("�ֻ��ţ�");
		emailTip = new JLabel("�������䣺");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
