package com.asymmetry.test;

public class RemoveElement {
    public static int[] remove(int[] array, int index) {
        int[] list = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                list[i] = array[i];
            } else if (i > index) {
                list[i - 1] = array[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 40, 50};
        for (int item : remove(arr, 2)) {
            System.out.println(item);

        }
    }
}
