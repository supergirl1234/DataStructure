package com;
import java.util.Arrays;
/*
 * 堆排序
 * */
public class Test6 {
    private static void test6(int[] array) {

        createHeap(array);//先建成大堆
        for (int i = 0; i < array.length; i++) {

            int temp = array[0];
            array[0] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

            heapfy(array,0,array.length-1-i);//再向下进行堆化
        }
    }

    public static void createHeap(int[] array) {

        /*建堆从最后一个非叶子结点开始*/
        int index = (array.length - 1 - 1) / 2;
        for (int i = index; i >= 0; i--) {
            heapfy(array, i, array.length);
        }
    }
    /*
     * 向下调整，堆化
     * */

    /*调整为大堆*/
    public static void heapfy(int[] array, int k, int size) {

        /*判断该节点是不是叶子结点，如果它是叶子结点，则它就没有左结点，所以判断该左结点存不存在*/
        int max = 2 * k + 1;
        if (max >= size) {
            return;
        }
        if (max + 1 < size && array[max + 1] > array[max]) {
            max = max + 1;
        }
        if(array[max]>array[k]){
            int temp = array[k];
            array[k] = array[max];
            array[max] = temp;

            heapfy(array, max, size);
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        test6(array);
        System.out.println(Arrays.toString(array));
    }
}
