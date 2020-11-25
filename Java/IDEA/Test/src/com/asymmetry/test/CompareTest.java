package com.asymmetry.test;

public class CompareTest implements Comparable<String> {
    public String string;

    public CompareTest(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        CompareTest[] list = {
                new CompareTest("apple"),
                new CompareTest("banana"),

        };
        System.out.println(new CompareTest("abc").compareTo("aback"));
        new CompareTest("abc").compareTo("aback");
    }

    @Override
    public int compareTo(String str) {
        if (this.string.length() < str.length()) {
            return 1;
        } else if (this.string.length() > str.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
