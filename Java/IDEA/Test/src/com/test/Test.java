package com.test;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    JButton[] active = new JButton[16];
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JPanel rightTopPanel = new JPanel();

    public Test(String title) throws HeadlessException {
        super(title);
        leftPanel.setBackground(new Color(255, 255, 200));
        rightPanel.setBackground(new Color(255, 235, 200));
        rightTopPanel.setBackground(new Color(235, 245, 255));
        leftPanel.setPreferredSize(new Dimension(200, 720));
        rightTopPanel.setPreferredSize(new Dimension(1080 - 200, 80));
        leftPanel.setLayout(new GridLayout(16, 1));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(rightTopPanel, BorderLayout.NORTH);
//        this.addLeftBtnList();
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.CENTER);
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Test window = new Test("Test");
        window.addLeftBtnList();
    }

    public void addLeftBtnList() {
        int i = 1;
        for (JButton item : active) {
            item = new JButton("功能" + i);
            item.setPreferredSize(new Dimension(100, 720 / 20));
            leftPanel.add(item);
            i++;
            System.out.println(1111);
        }

    }
}