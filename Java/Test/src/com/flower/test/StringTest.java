package com.flower.test;

public class StringTest {
    public static void main(String[] args) {
        int i = abc("beijing 2008");
        System.out.println(i);
    }
    public static int abc(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>='a'&&c<='z'||c>='A'&&c<='Z'){
                count++;
            }
        }
        return  count;
    }
}
