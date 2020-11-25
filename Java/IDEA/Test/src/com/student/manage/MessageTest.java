package com.student.manage;

public class MessageTest {
    public static void main(String[] args) {
        MessageOperate operate = new MessageOperate();
        operate.addMessage("123", "张三", 15, '男');
        operate.addMessage("124", "张三", 15, '男');
        operate.addMessage("125", "张三", 10, '男');
//        System.out.println(operate.selectMessage());
//        operate.dropMessage("124");
        System.out.println(operate.selectMessage(10));
        System.out.println(operate.selectMessage("123"));
        System.out.println(operate.selectMessage('*'));
        System.out.println(operate.selectMessage('三'));

    }
}
