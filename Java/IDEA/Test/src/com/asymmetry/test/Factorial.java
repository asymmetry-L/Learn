package com.asymmetry.test;

public class Factorial {

    public static double funcP(int num1, int num2, int num3, int num4, int num5) {
        return num1 * num2 * num3 * num4 * num5;
    }

    public static double funcX(int num) {
        int result = 1;
        for (; num > 0; num--) {
            result *= num;
        }
        return result;
    }

    public static double funcD(int num) {
        if (num == 1) {
            return 1;
        }
        return num * funcD(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(funcP(1, 2, 3, 4, 5) + funcX(6) + funcD(11));
    }
}
