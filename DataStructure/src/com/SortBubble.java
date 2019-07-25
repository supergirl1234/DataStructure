package com;


/*
* 冒泡排序:排成升序
* */
public class SortBubble {

    public static void Bubble(int[] array){

        /*外循环*/
        for(int i=0;i<array.length-1;i++){

            /*内循环，将大数放在最后*/
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {


        //int[] array=new int[]{9,3,5,8,0,1,11,12,4,2};
        int[] array=new int[]{11,10,9,8,7,6,5,4,3,2,1,0};

        Bubble(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
