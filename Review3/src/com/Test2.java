package com;


import java.util.Arrays;

/*
* 选择排序
* */
public class Test2 {

    public  static  void test2(int[] array){



        for(int i=0;i<array.length;i++){
            int max=0;//表示数值最大的那个数的下标
            int j=1;
            for(;j<array.length-i;j++){
                if(array[j]>array[max]){

                    max=j;//找出数值最大的那个数的下标

                }

            }

            Swap.swap(array,max,array.length-i-1);
        }

    }

    public static void main(String[] args) {

        int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        test2(array);
        System.out.println(Arrays.toString(array));
    }
}
