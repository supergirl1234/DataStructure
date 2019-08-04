package com;


import java.util.Arrays;

/*插排,将其排为从小到大的序列*/
public class InsertSort {
    /*插排,将其排为从小到大的序列*/
    public static void insertSort(int[] array){
        /*有序部分[0,i),无序部分[i,array.length)*/
        /*从无序部分取出一个数，依次从后往前与有序部分的数进行比较，比较到合适的位置，就将其插入*/
        for(int i=1;i<array.length;i++){

            int key=array[i];
            for(int j=i-1;j>=0;j--){
                if(key<array[j]){
                    array[j+1]=array[j];//将前面的数后移
                }else{
                    break; //找到key应该插入的位置了
                }
                array[j]=key;
            }
        }

    }
    public static void main(String[] args) {

        int[] array=new int[]{2,4,1,6,7,9,0,10,5};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
