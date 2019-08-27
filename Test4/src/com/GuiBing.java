package com;

import java.util.Arrays;

public class GuiBing {


    public static void GuiBingSort(int[] array) {

        guiBingInner(array, 0, array.length);//左闭右开

    }

    private static void guiBingInner(int[] array, int left, int right) {


        if (left + 1 == right) {
            return;

        }
        /*找出中间数的下标*/
        int mid = (left + right) / 2;
        /*分别对左半部的数组进行归并排序，对右半部分的数组进行归并排序,采用递归的方法*/
        guiBingInner(array, left, mid);
        guiBingInner(array, mid, right);

        /*然后再将排好序的左半部分和右半部分数组进行合并*/
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {

        /*需要一个额外的数组*/
        int[] extra = new int[right - left];
        /*将[left,mid)数组和{mid，right)数组合并*/
        int p = left;
        int q = mid;
        int i = 0;
        while (p < mid && q < right) {
            if (array[p] <= array[q]) {
                extra[i] = array[p];
                i++;
                p++;

            } else if (array[q] < array[p]) {
                extra[i] = array[q];
                i++;
                q++;
            }

        }

        while (p < mid) {

            extra[i] = array[p];
            i++;
            p++;
        }

        while (q < right) {

            extra[i] = array[q];
            i++;
            q++;
        }
        /*最后再将extra数组中的值返回放到array原数组中*/
        for (int k = 0; k < extra.length; k++) {

            array[k + left] = extra[k];
        }

    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 7, 4, 9, 2, 4, 6, 8, 5, 17, 23, 12};

        GuiBingSort(array);
        System.out.println(Arrays.toString(array));

    }
}
