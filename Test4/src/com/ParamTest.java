package com;

public class ParamTest {

    public static void swap2(int[] array){


        int temp=array[0];
        array[0]=array[1];
        array[1]=temp;
        System.out.print("函数中：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array=new int[]{1,2};
        swap2(array);
        System.out.print("主方法中：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
