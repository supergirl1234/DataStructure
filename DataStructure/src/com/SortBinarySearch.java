package com;


/*
 * 二分查找:只能是已经有序的排列，才能使用二分查找
 * */
public class SortBinarySearch {

    public static int BinarySearch(int[] array, int num) {

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
           int medium=(left+right)/2;
            if (num < array[medium]) {
                right = medium - 1;


            } else if (num > array[medium]) {
                left = medium + 1;
            } else {

                return medium;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        int result=BinarySearch(array,10);
        System.out.println(result);
    }
}
