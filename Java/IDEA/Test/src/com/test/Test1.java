package com.test;

import java.util.Arrays;
import java.util.Scanner;

/*从控制台接收10个整数，将其放入一个数组中，对其降序排列，排好序后打印输出；
 *然后再从控制台接收一个整数，通过二分法查找该数在数组中的位置，
 *若找到打印其位置序号，否则打印“无此数字”。
 */
public class Test1 {
    public static int[] canSort(int[] list) {
        int[] arr = new int[10];
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            arr[arr.length - 1 - i] = list[i];
        }
        return arr;
    }

    public static int findNum(int num, int[] list) {
        int[] arr = list;
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, num);
    }

    public static int foundNum(int num, int[] list) {
        int low = 0;
        int high = list.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = (high + low) / 2;
            if (list[middle] > num) {
                low = middle + 1;
            } else if (list[middle] < num) {
                high = middle + 1;
            } else {
                return middle;
            }
        }
        middle = -1;
        return middle;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入数组元素[" + (i + 1) + "]:");
            arr[i] = scan.nextInt();
        }
        arr = canSort(arr);
        String arrStr = "";
        for (int i : arr) {
            arrStr += i + ",";
        }
        System.out.println(arrStr);
        System.out.print("请输入目标值:");
        int target = scan.nextInt();
        if (foundNum(target, arr) == -1) {
            System.out.println("无此数字");
        } else {
            System.out.println("index:" + foundNum(target, arr));
            System.out.println("index(b):" + findNum(target, arr));

        }
    }
}
