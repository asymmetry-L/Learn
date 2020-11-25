package com.asymmetry.test;

public class StringTest {
    public static void main(String[] args) {
        int count = 0;
        String strDeom = " 111 111 1 1 1 1             ";
        for (int i = 0; i < strDeom.length(); i++) {
            i = strDeom.indexOf(" ", i);
            System.out.println(strDeom.indexOf(" ", i));
            count++;
        }
        System.out.println(count);
    }
}
