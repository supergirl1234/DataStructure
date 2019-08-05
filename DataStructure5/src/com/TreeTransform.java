package com;


/*
 *大堆：要求根的值>=所有子树结点的值(子树的任意节点)
 *小堆： 要求根的值<=所有子树结点的值（子树的任意节点）
 * */

import java.util.Arrays;

/*向上调整和向下调整的前提条件都是：只有一个位置不满足堆的性质，其它位置都满足堆的性质*/
public class TreeTransform {


    /*向上调整:每一个结点与父亲节点进行比较*/

    /*向上调整使其成为一个大堆*/
    public static void UpAdjustToBig(int[] array, int index) {

        /*向上调整时，调整到根节点就不进行调整了，出口*/
        if (index == 0) {

            return;
        }
        int parent = (index - 1) / 2;
        if (array[parent] < array[index]) {
            /*互换位置*/
            int temp = array[parent];
            array[parent] = array[index];
            array[index] = temp;

            /*则继续调整parent节点*/
            UpAdjustToBig(array, parent);
        }
    }

    /*向上调整使其成为一个小堆*/
    public static void UpAdjustToLittle(int[] array, int index) {

        /*调整到根节点就不进行调整了，出口*/
        if (index == 0) {

            return;
        }
        int parent = (index - 1) / 2;
        if (array[parent] > array[index]) {
            /*互换位置*/
            int temp = array[parent];
            array[parent] = array[index];
            array[index] = temp;

            /*则继续调整parent节点*/
            UpAdjustToLittle(array, parent);
        }
    }




    public static void main(String[] args) {

        int[] array1 = new int[]{10, 9, 8, 5, 4, 2, 1, 7};
        UpAdjustToBig(array1, 7);
        System.out.println(Arrays.toString(array1));

        System.out.println("++++++++++++++++++++++++++++++++");

        int[] array2 = new int[]{1, 5, 3, 6, 7, 8, 9, 4};
        UpAdjustToLittle(array2, 7);
        System.out.println(Arrays.toString(array2));


    }
}


