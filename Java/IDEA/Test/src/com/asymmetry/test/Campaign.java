package com.asymmetry.test;

public class Campaign {
    int id;
    String name;
    int poll = 0;

    public Campaign(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void vote(Campaign candidate) {
        candidate.poll += 1;
    }

    public static String result(Campaign[] people) {
        int polls = 0;
        String monitor = "";
        for (Campaign item : people) {
            if (item.poll > 3 && item.poll == polls) {
                return monitor + item.name + "票数相等";
            }
            if (item.poll > polls) {
                polls = item.poll;
                monitor = item.name;
            }
        }
        return monitor;
    }

    public static void main(String[] args) {
        Campaign[] voters = new Campaign[3];
        boolean flag = true;
        String monitor = "";
        while (flag) {
            voters[0] = new Campaign(101, "张三");
            voters[1] = new Campaign(102, "李四");
            voters[2] = new Campaign(103, "王五");
            for (int i = 0; i < 10; i++) {
                vote(voters[(int) (Math.random() * 3)]);
            }
            monitor = result(voters);
            if (monitor.length() < 5) {
                flag = false;
            }
        }
        System.out.println("班长为:" + monitor);
        System.out.println(voters[0].name + ":" + voters[0].poll);
        System.out.println(voters[1].name + ":" + voters[1].poll);
        System.out.println(voters[2].name + ":" + voters[2].poll);
    }
}
