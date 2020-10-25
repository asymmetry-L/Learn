package com.test;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Test extends JFrame {
    public Test(String title) throws HeadlessException {
        super(title);
        JPanel lPanel = new JPanel();
        JButton active1 = new JButton("功能1");
        JButton active2 = new JButton("功能1");
        JButton active3 = new JButton("功能1");
        JButton active4 = new JButton("功能1");
        JButton active5 = new JButton("功能1");
        JButton active6 = new JButton("功能1");
        JButton active7 = new JButton("功能1");
        JButton active8 = new JButton("功能1");
        JButton active9 = new JButton("功能1");
        JButton active10 = new JButton("功能1");
        JButton active11 = new JButton("功能1");
        JButton active12 = new JButton("功能1");
        lPanel.add(active1);
        lPanel.add(active2);
        lPanel.add(active3);
        lPanel.add(active4);
        lPanel.add(active5);
        lPanel.add(active6);
        lPanel.add(active7);
        lPanel.add(active8);
        lPanel.add(active9);
        lPanel.add(active10);
        lPanel.add(active11);
        lPanel.add(active12);
        lPanel.setPreferredSize(new Dimension(100,700));
        JPanel rPanel = new JPanel();
        this.add(lPanel,BorderLayout.WEST);
        this.add(rPanel,BorderLayout.CENTER);
        this.setSize(1080,720);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test("window");
    }
}