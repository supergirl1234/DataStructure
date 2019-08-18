package comm;

import java.util.Arrays;

/*选择排序*/
public class SelectSort {
    public  static  void selectSort1(int[] arr){
        /*每次选择一个最小的数放在前面*/
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            /*找出最小的数的下标后，将其放在下标为i的位置处*/
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public  static  void selectSort2(int[] arr){
        /*每次选择一个最大的数放在后面*/
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;

                }
            }
            /*找出最小的数的下标后，将其放在下标为arr.length-1-i位置处*/
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max]=temp;
        }

    }
    public static void main(String[] args) {


        /*OK*/
        int[] arr=new int[]{4,8,3,5,6,2,1,0,-2};
        /*selectSort2(arr);
        System.out.println(Arrays.toString(arr));*/



        selectSort1(arr);
        System.out.println(Arrays.toString(arr));


    }
}
