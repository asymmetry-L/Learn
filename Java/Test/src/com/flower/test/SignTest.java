package com.flower.test;

import com.flower.dao.impl.SignImpl;
import com.flower.entity.User;

import java.util.Scanner;

public class SignTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        SignImpl sign = new SignImpl();
        User userInfo = null;
//        while (true){
//            System.out.println("************请选择功能************");
//            System.out.println("[1]登录\t[2]注册");
//            String dire = scan.nextLine();
//            if (dire.equals("1")){
//                System.out.println("*********************************");
//                System.out.println("*************欢迎登录*************");
//                System.out.println("*********************************");
//                System.out.print("[ID]:");
//                String id = scan.nextLine();
//                System.out.print("[密码]:");
//                String pwd = scan.nextLine();
//                userInfo = sign.signUp(id,pwd);
//                break;
//            }else if (dire.equals("2")){
//                String id = null;
//                userInfo = new User();
//                System.out.println("*********************************");
//                System.out.println("*************欢迎注册*************");
//                System.out.println("*********************************");
//                do {
//                System.out.print("请输入8位数字密码[ID]:");
//                id = scan.nextLine();
//                userInfo.setUser_id(scan.nextLine());
//                }while (id.length()==8);
//                System.out.print("[密码]");
//                System.out.print("[用户名]:");
//                System.out.print("[性别]:");
//                System.out.print("[生日]:");
//                System.out.print("[TEL]:");
//            }
//            System.out.println("");
//            User user= new User("10012","李四四","1000","男","2000-5-3","987654321",1);
            System.out.println(sign.viewUsersMsg());
//            sign.signIn(user);
//            sign.signUp()
        }
//    }
}
