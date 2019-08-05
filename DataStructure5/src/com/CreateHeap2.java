package com;


import java.util.Arrays;

/*建小堆*/
public class CreateHeap2 {
    public static void createHeap2(int[] array){


        for(int i=(array.length-2)/2;i>=0;i--){



            adjustDown2(array,i);
        }


    }


    /*向下调整为小堆*/
    public static  void adjustDown2(int[] array,int index){

        int left=2*index+1;
        int min=left;
        if(left<array.length){
            if(left+1<array.length&&array[left+1]<array[left]){

                min=left+1;
            }

            if(array[index]>array[min]){/*孩子结点小于根结点*/
                /*互换*/
                int temp=array[index];
                array[index]=array[min];
                array[min]=temp;

            }
            adjustDown2(array,min);
        }

    }

    public static void main(String[] args) {
        int[] array=new int[]{3,4,8,9,1,0,6,11};

        createHeap2(array);
        System.out.println(Arrays.toString(array));
    }
}
