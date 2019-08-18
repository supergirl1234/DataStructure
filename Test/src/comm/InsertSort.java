package comm;


import java.util.Arrays;

/*插入排序：每次从一个无序序列中取一个数，将其在有序序列中遍历*/
public class InsertSort {
    /*排成小-》大*/
    public static void insertSort1(int[] arr){
        /*有序[0,i) 无序[i,arr.length-1)*/
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            /*数组中下标小于i的数据都是有序的，看看将下标为i的数据插在有序数组中的哪个位置*/
            int j=i-1;
            for(;j>=0;j--){
                /*先找出该放置的位置，再一起移动*/
                if(arr[i]>arr[j]) {
                    /*找到了该插入的位置 下标位j+1*/
                    break;
                }

            }
            /*将 j +1到i-1的数据都往后移动一位*/
            for(int k=i-1;k>j;k--){
                arr[k+1]=arr[k];
            }

            arr[j+1]=temp;
        }
    }
    public static void insertSort2(int[] arr){
        /*有序[0,i) 无序[i,arr.length)*/
        for(int i=0;i<arr.length;i++){
            /*数组中下标小于i的数据都是有序的，看看将下标为i的数据插在有序数组中的哪个位置*/
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--) {
                if (temp < arr[j]) {
                    /*如果temp小于他前面的那个数，则将他前面的那个数往后移动一位*/
                    arr[j + 1] = arr[j];
                }else{
                    //如果temp不小于他前面的那个数，则跳出循环
                    break;
                }
            }
            arr[j+1] = temp;


        }
    }
    public static void main(String[] args) {


        /*OK*/
        int[] array=new int[]{0,3,1,4,9,7,5,-1,-3};
       /* insertSort2(array);
        System.out.println(Arrays.toString(array));*/

        insertSort1(array);
        System.out.println(Arrays.toString(array));


    }
}
