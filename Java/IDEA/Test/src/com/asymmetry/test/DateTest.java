package com.asymmetry.test;

public class DateTest {
    public static double jC(double num) {
        if (num == 1) {
            return 1;
        }
        return num * jC(num - 1);
    }

    public static double sum(double num) {
        if (num == 1) {
            return 1;
        }
        return jC(num) + sum(num - 1);
    }

    public static void main(String[] args) {
//        Date date =  new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time = format.format(date);
//        System.out.println("TIME:" + time);
        System.out.println(sum(20));
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += jC(i);
            System.out.println(sum);
        }
    }
}
