package com;


import java.util.Arrays;

/*
 * 向下调整
 * */
public class TreeTransform2 {


    /*向下调整:每一个结点与孩子节点进行比较*/

    /*调整为大堆*/
    public static void adjustDown1(int[] array, int index) {

        /*左孩子*/
        int max = 2 * index + 1;
        /*调整结束的标志就是调整到叶子节点了
        * 如何判断是叶子节点：标志就是2*节点下标+1>=数组的长度，则该节点就是叶子节点了
        * */
        if (max < array.length) {

            /*右孩子*/
            if (max + 1 < array.length && array[max + 1] < array[max]) {
                max = max + 1;

            }
            /*根节点与孩子节点中最大的那个比较，如果孩子节点大就互换*/

            if (array[index] < array[max]) {

                int t = array[max];
                array[max] = array[index];
                array[index] = t;
            }

            adjustDown1(array, max);
        }

    }


    /*调整为小堆*/
    public static void adjustDown(int[] array, int index){

        int min = 2 * index + 1;
        while (min < array.length) {
            if (min + 1 < array.length && array[min + 1] < array[min]) {
                min += 1;
            }

            if (array[index] <= array[min]) {
                break;
            }
            /*如果孩子节点中最小的那个还比根节点小，则互换*/

            int t = array[min];
            array[min] = array[index];
            array[index] = t;

            index = min;
            min = 2 * index + 1;
        }
    }

    public static void main(String[] args) {

        int[] array1 = new int[]{12,9,8,4,3,7,6,5};
        adjustDown1(array1,3);
        System.out.println(Arrays.toString(array1));



        int[] array = new int[]{1,7,4,5,10,8,9,12};
        adjustDown(array,1);
        System.out.println(Arrays.toString(array));

    }
}
