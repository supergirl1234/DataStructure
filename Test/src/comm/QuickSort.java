package comm;


/*快速排序*/

import java.util.Arrays;

/*思想：找到一个基准值 放到整个序列的最右边 ，然后从第一个数开始，每个数与这个基准值进行比较，
如果该数小于这个基准值，就按比较顺序移到该序列的前面，最后把该基准值放到其后的位置,
然后整个序列就变成了基准值左边的都比基准值小，右边的都比基准值大，然后再以上面的方式进行一次对左边序列的一次排序，和对右边序列的一次排序*/
public class QuickSort {
    public  static void Quick(int[] array){
        Quickstart(array,0,array.length);
    }
    private static void Quickstart(int[] array, int left, int right) {//左闭右开
        /*缺少出口*/
        if(left==right){//size==0
            return;
        }
        if(left==right-1){//size==1

            return;
        }
        /*找一个基准值*/
        /*找最右边的数为基准值*/
        int  obg=array[right-1];

        /*从第一个数开始，每个数与这个基准值进行比较*/
        int d=left;
        for(int i=left;i<right;i++){
            if(array[i]<obg){
                swap(array,i,d);
                d++;
            }
        }
        /*将基准值调换位置*/
        swap(array,d,right-1);

        /*继续对左半部分排序*/
        Quickstart(array,0,d);
        /*对右半部分排序*/
        Quickstart(array,d+1,right);
    }
    public static void swap(int[] array,int a,int b){

        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    /*找基准值还可以这样找:三数取中法*/
    public static int FindJiZhunZhi(int[] array, int left, int right){

        int mid=left+(right-left)/2;
        /*比较left、mid、right，找出中间数大小的值*/
        if(array[left]>array[mid]){
            if(array[right]>array[left]){
                return  left;

            }else if(array[right]<array[mid]){
                return  mid;
            }else {
                return  right;
            }
        }else{//array[left]<array[mid]
            if(array[right]<array[left]){
                return  left;
            }else if(array[right]>array[mid]){
                return  mid;
            }else {
                return  right;
            }

        }


    }
    /*每个数与基准值进行比较还可以这样写*/
    public static  void  biJiao(int[] array, int left, int right){

        int begin=left;
        int end=right;
        /*基准值*/
        int obg=array[right];
        while(begin<end){
            while (begin<end&&array[begin]<obg){
                begin++;

            }
            while (begin<end&&array[end]>obg){

                end--;
            }
            swap(array,begin,end);

        }
        swap(array,begin,right);

    }

    public static void main(String[] args) {

        int[] array=new int[]{5,3,8,1,0,4,6,9,2,7,9};
        Quick(array);
        System.out.println(Arrays.toString(array));
    }
}
