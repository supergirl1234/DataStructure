package comm;


import java.util.Arrays;

/*向上调整*/
public class Heap1 {

    /*前提：只有一个地方不满足堆的性质*/

    /*向上调整:与父节点进行比较*/
    /*调整为大堆*/
    public static void  UPtoBig(int[] arr,int k){

        /*调整到根节点就不调整了*/
        if(k==0){
            return;
        }
        //父节点
        int parent=(k-1)/2;
        /*与父节点进行比较*/
        if(arr[k]<arr[parent]){
            return;
        }
        /*与父节点交换位置*/
        int temp=arr[k];
        arr[k]=arr[parent];
        arr[parent]=temp;
        /*继续将parent处的节点进行向上调整*/
        UPtoBig(arr,parent);


    }
    /*向上调整：调整为小堆*/
    public static void  UPtoLittle(int[] arr,int k){

        /*调整到根节点就不调整了*/
        if(k==0){
            return;
        }
        //父节点
        int parent=(k-1)/2;
        /*与父节点进行比较*/
        /*如果父节点小，则结束*/
        if(arr[k]>arr[parent]){
            return;
        }
        /*否则与父节点交换位置*/
        int temp=arr[k];
        arr[k]=arr[parent];
        arr[parent]=temp;
        /*继续将parent处的节点进行向上调整*/
        UPtoLittle(arr,parent);


    }
    public static void main(String[] args) {


        /*OK*/
         int[] arr=new int[]{15,12,11,10,9,4,3,13,8};
        UPtoBig(arr,7);
        System.out.println(Arrays.toString(arr));//[15, 13, 11, 12, 9, 4, 3, 10, 8]



        int[] str=new int[]{4,6,7,9,5,11,13,12,15,16,17};
        UPtoLittle(str,4);
        System.out.println(Arrays.toString(str));//[4, 5, 7, 9, 6, 11, 13, 12, 15, 16, 17]
    }
}
