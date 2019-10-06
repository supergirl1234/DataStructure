package com;


import java.util.Arrays;

/*
* 插入排序
* */
public class Test3 {
    public  static  void test3(int[] array){

          for(int i=0;i<array.length;i++){
              ;
              int temp=array[i];
              int j=i-1;
              for(;j>=0;j--){

                  if(temp>array[j]){//找到合适的位置，就不往下进行比较了

                      break;

                  }
              }
              /*找到合适的位置之后，就开始移动数据*/
              for(int k=i-1;k>j;k--){

                  array[k+1]=array[k];
              }

              array[j+1]=temp;





          }

    }
    public static void main(String[] args) {

        int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        test3(array);
        System.out.println(Arrays.toString(array));
    }
}
