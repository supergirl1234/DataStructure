package com;


import java.util.Arrays;

/*冒泡排序*/
public class Test1 {

    public static  void test1(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){

                if(array[j]>array[j+1]){

                    Swap.swap(array,j,j+1);
                }
            }

        }

    }
    public static void main(String[] args) {
        int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        test1(array);
        System.out.println(Arrays.toString(array));

    }
}
