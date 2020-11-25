package com.asymmetry.test;

public class Sum100 {
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    /**
     * @param num1 左闭区间
     * @param num2 右开区间
     */
    public static void sum(int num1, int num2) {
        int num = 0;
        for (; num1 < num2; num1++) {
            num += num1;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
        sum(1, 101);
    }
}
