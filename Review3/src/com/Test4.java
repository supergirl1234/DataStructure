package com;


import java.util.Arrays;

/*
* 快速排序
* */
public class Test4 {

    public  static  void test4(int[] array){

       Par(array,0,array.length-1);

    }

    private static void Par(int[] array, int left, int right) {

        /*当[left,right]之间只剩一个数或者没有数存在时，就就结束了*/
        if(left==right){

            return;
        }
        if(left>right){

            return;
        }

        /*先找到以最右边的数为基准值排完序后基准值的位置*/
        int partationValue=Paration(array,left,right);//左闭右闭
        //然后再将左半边的数进行快速排序，采用递归的方法
        Par(array,0,partationValue-1);
        //再将右半边的数进行快速排序，采用递归的方法
        Par(array,partationValue+1,right);

    }

    private static int Paration(int[] array, int left, int right) {//左闭右闭
        //以最右边的数为基准值进行排序
        int index=right;
        int value=array[index];
        while(left<right){

            while (left<right&&array[left]<value){
                left++;

            }
            while (left<right&&array[right]>=value){
                right--;

            }
            Swap.swap(array,left,right);
        }

        Swap.swap(array,left,index);
        return  left;

    }

    public static void main(String[] args) {

        int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        test4(array);
        System.out.println(Arrays.toString(array));


    }
}
