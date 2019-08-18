package comm;

import java.util.Arrays;

public class XierSort {
    public static  void insertSortWithGap(int[] arr,int gap){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-gap;
            for(;j>=0&&key<arr[j];j=j-gap){
                arr[j+gap]=arr[j];
            }
            arr[j+gap]=key;
        }
    }
    public static void shellSort(int[] array){
        int gap=array.length;
        while(true){
            gap=(gap/3)+1;
            insertSortWithGap(array,gap);
            if(gap==1){

                break;
            }
        }

    }
    public static void main(String[] args) {

        /*OK*/
        int[] array=new int[]{3,5,6,1,9,-1,2,7};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
