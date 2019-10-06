package com;

import java.util.Arrays;

/*
 * 归并排序：将数组分为左右两部分，将左边排为有序数组，将右边排为有序数组，然后再将两个有序数组进行合并排序
 * */
public class Test5 {

    public static void test5(int[] array) {

        Guibing(array, 0, array.length - 1);

    }

    private static void Guibing(int[] array, int left, int right) {
        if (left == right) {
            return;

        }
        int mid = (left + right) / 2;
        Guibing(array, left, mid);//将左半部分排为有序数组
        Guibing(array, mid + 1, right);//将右半部分排为有序数组
        Merge(array, left, mid, right);//将左右两半有序部分合并为有序的一个数组
    }

    /*合并两个有序数组*/
    private static void Merge(int[] array, int left, int mid, int right) {
        int[] extra = new int[right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= right) {

            if (array[p1] <= array[p2]) {

                extra[i] = array[p1];
                p1++;
            } else if (array[p2] < array[p1]) {
                extra[i] = array[p2];
                p2++;

            }
            i++;


        }
        while (p1 <= mid) {

            extra[i] = array[p1];
            i++;
            p1++;
        }
        while (p2 <= right) {

            extra[i] = array[p2];
            i++;
            p2++;
        }

        for(int k=left;k<=right;k++){
            array[k]=extra[k-left];

        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        test5(array);
        System.out.println(Arrays.toString(array));

    }
}
