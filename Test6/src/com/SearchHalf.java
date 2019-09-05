package com;


/*二分查找*/
public class SearchHalf {

    public static int  serach(int[] array,int key){

        int left=0;
        int right=array.length-1;

        while(left<=right){
            int medium=(left+right)/2;
            if(key==array[medium]){
                return  medium;
            }
            if(key<array[medium]){
               right=medium-1;
            }
            if(key>array[medium]){
                left=medium+1;
            }

        }
        return  -1;
    }

    public static void main(String[] args) {

        int[] array=new int[]{1,3,5,7,9,10,23,34,35,37,50};

        int result=serach(array,9);
        System.out.println(result);
    }
}
