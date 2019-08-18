package comm;

import java.util.Arrays;

/*向下调整：与孩子节点进行比较*/
public class Heap2 {


    /*调整为大堆*/

    public  static void DownToBig(int[] arr,int k){

        /*调整到叶子节点就不调整了*/

        int left=2*k+1;
        if(left>arr.length-1){
            return;
        }
        /*找出孩子节点中最大的*/
        int max=left;
        if(left+1<arr.length&&arr[left+1]>arr[max]){
            max=left+1;
        }
        /*判断孩子节点和父节点的大小*/
        if (arr[k]>arr[max]){//如果父节点大于孩子节点，就不调整了
           return;
        }
        /*否则交换位置*/
        int temp=arr[k];
        arr[k]=arr[max];
        arr[max]=temp;
        /*继续向下调整*/
        DownToBig(arr,max);

    }
    /*调整为小堆*/
    public  static void DownToLittle(int[] arr,int k){
        /*调整到叶子节点就不调整了*/

        int left=2*k+1;
        if(left>arr.length){
            return;
        }
        /*找出孩子节点中最小的*/
        int min=left;
        if(left+1<arr.length&&arr[left+1]<arr[min]){
            min=left+1;
        }
        /*判断孩子节点和父节点的大小*/
        if (arr[k]<arr[min]){//如果父节点小于孩子节点，就不调整了
            return;
        }
        /*否则交换位置*/
        int temp=arr[k];
        arr[k]=arr[min];
        arr[min]=temp;
        /*继续向下调整*/
        DownToLittle(arr,min);


    }
    public static void main(String[] args) {


        /*OK*/
        int[] arr=new int[]{15,12,11,10,9,4,3,13,8};
        DownToBig(arr,3);
        System.out.println(Arrays.toString(arr));//[15, 12, 11, 13, 9, 4, 3, 10, 8]


        int[] str=new int[]{4,6,7,9,5,11,13,12,15,16,17};
        DownToLittle(str,1);
        System.out.println(Arrays.toString(str));//[4, 5, 7, 9, 6, 11, 13, 12, 15, 16, 17]
    }
}
