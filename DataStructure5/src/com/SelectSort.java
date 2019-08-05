package com;


import java.util.Arrays;

/*选择排序*/
public class SelectSort {


    /*将最大的放在后面:在所有数据中依次找出值最大的，依次将其放在整个排列的最后*/
    public static  void selectSort1(int[] array){

        /*找出数值最大的*/
       for (int i=0;i<array.length;i++){

           int max=0;
           for(int j=1;j<array.length-i;j++){
               if(array[j]>array[max]){
                   max=j;
               }
           }

           /*将大数放在后面*/
           int temp=array[array.length-1-i];
           array[array.length-1-i]=array[max];
           array[max]=temp;

       }


    }
    /*将最小的放在前面:在所有数据中依次找出值最小的，依次将其放在整个排列的最前面*/
    public static  void selectSort2(int[] array){

     for(int i=0;i<array.length;i++){
         int min=i;
         for(int j=i+1;j<array.length;j++){
             if(array[j]<array[min]){
                 min=j;
             }
         }
         /*将小数放在前面*/
         int temp=array[i];
         array[i]=array[min];
         array[min]=temp;
     }
    }
    public static void main(String[] args) {

        int[] array=new int[]{1,5,8,2,9,3,7,0};
       /* selectSort1(array);
        System.out.println(Arrays.toString(array));*/

        selectSort2(array);
        System.out.println(Arrays.toString(array));

    }
}
