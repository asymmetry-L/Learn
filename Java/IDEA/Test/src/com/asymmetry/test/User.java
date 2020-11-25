package com.asymmetry.test;

import java.util.ArrayList;
import java.util.Iterator;


public class User {
    private static ArrayList<ArrayList> userList = new ArrayList();
    private ArrayList<String> user;

    public User() {
    }

    public User(String name, String age) {
        this.user = new ArrayList<>();
        this.user.add(name);
        this.user.add(age);
        userList.add(this.user);
    }

    public static void main(String[] args) {
        User app = new User();
        new User("张三", "17");
        new User("张三", "17");
        new User("张三", "17");
        new User("张三", "17");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        System.out.println("\n\n");
        for (ArrayList list : userList) {
            System.out.println(list);
        }
        System.out.println("\n\n");
        Iterator<ArrayList> iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
