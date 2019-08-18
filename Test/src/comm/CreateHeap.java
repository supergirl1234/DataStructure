package comm;

import java.util.Arrays;

/*建堆*/
public class CreateHeap {
    /*建大堆*/
    public static void createHeap(int[] arr) {
        /*从最后一个非叶子节点开始向下调整*/
        int k=(arr.length-1-1)/2;
        for(int i=k;i>=0;i--) {
            DownToBig(arr, i);
        }
    }
    public static void DownToBig(int[] arr,int k){

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
    public static void main(String[] args) {

        int[] arr=new int[]{1,4,6,8,9,3,7,2,11,15};
        createHeap(arr);
        System.out.println(Arrays.toString(arr));

    }
}
