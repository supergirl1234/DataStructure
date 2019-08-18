package comm;

import java.util.Arrays;

/*堆排序*/
public class HeapSort {


    public static void Sort(int[] arr) {

        /*先将数据建成一个大堆*/
        createHeap(arr);
        for (int i = 0; i < arr.length; i++) {
            /*将大数放在最后*/
            int temp = arr[0];
            arr[0] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            /*除了最后一个数，其他的元素构成的树又不满足堆的性质了,在下标为0的位置不满足堆的性质*/
            /*将除了最后一个数的数据再次进行向下调整*/
            DownToBig(arr, arr.length -1 - i, 0);
        }

    }

    /*建大堆*/
    public static void createHeap(int[] arr) {
        /*从最后一个非叶子节点开始向下调整*/
        int k = (arr.length - 1 - 1) / 2;
        for (int i = k; i >= 0; i--) {
            DownToBig(arr, arr.length, i);
        }
    }

    /*向下调整*/
    public static void DownToBig(int[] arr, int size, int k) {
        /*调整到叶子节点就不调整了*/
        int left = 2 * k + 1;
        if (left > size - 1) {
            return;
        }
        /*找出孩子节点中最大的*/
        int max = left;
        if (left + 1 < size && arr[left + 1] > arr[max]) {
            max = left + 1;
        }
        /*判断孩子节点和父节点的大小*/
        if (arr[k] > arr[max]) {//如果父节点大于孩子节点，就不调整了
            return;
        }
        /*否则交换位置*/
        int temp = arr[k];
        arr[k] = arr[max];
        arr[max] = temp;
        /*继续向下调整*/
        DownToBig(arr, size, max);
    }

    public static void main(String[] args) {

        /*OK*/
        int[] array=new int[]{1,0,11,4,12,6,8,9,-1};

        Sort(array);
        System.out.println(Arrays.toString(array));
    }
}
