package com;

/*有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。

给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在
*/
public class Problem3 {


    public static int MaxByK(int[] arr,int start,int end,int k){//左闭右开

       int paraKey= FastSortInner(arr,start,end);

       if(k==paraKey-start+1){

           return arr[paraKey];

       }else if(k<paraKey-start+1){

           return  MaxByK(arr,start, paraKey, k);
       }else{

           return  MaxByK(arr,paraKey+1,end, k-paraKey-1);
       }


    }

    /*返回一次排序后，基准值新在的位置*/
    private static int FastSortInner(int[] arr, int low, int high) {//左闭右开

        int  para=high-1;
        int start=low;
        int end=high-1;
        while(start<end){
            if(start<end&&arr[start]<arr[para]){
                start++;

            }
            if(start<end&&arr[end]<arr[para]){

                end--;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }

        int temp=arr[start];
        arr[start]=arr[para];
        arr[para]=temp;
        return start;


    }

    public static void main(String[] args) {


        int[] array=new int[]{3,5,7,1,0,11,34,-1,4,2};
        int result=MaxByK(array,0,array.length,7);
        System.out.println(result);

    }
}
