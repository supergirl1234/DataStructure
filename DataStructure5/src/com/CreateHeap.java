package com;


import java.util.Arrays;

/*建大堆*/
public class CreateHeap {

    public static void createHeap(int[] array){


        /*最后一个非叶子节点的下标为：(array.length-2)/2*/
        for(int i=(array.length-2)/2;i>=0;i--){

            /*一步一步的从后往前 进行向下调整*/

            /*因为向下调整和向上调整的前提都是：只有一个位置不满足堆的性质，
             *只有从后往前 进行，才能在每次进行调整时满足这个前提
             * 每次对某个节点开始进行调整时，该节点下面的结点都已经满足大堆或小堆了，就只剩该节点可能不满足堆的性质了，
             * */
            adjustDown(array,i);
        }


    }
    /*向下调整,调整为大堆*/
    public static void adjustDown(int[] array,int index){


        /*调整到最后一个非叶子节点，就不调整了*/
        /*一个节点是否是叶子节点，就看它是否有左孩子节点*/
        /*左孩子*/
        int left=2*index+1;
        int max=left;
        if(left<array.length){
            if(left+1<array.length&&array[left+1]>array[left]){

             max=left+1;
            }

            if(array[index]<array[max]){/*孩子结点大于根结点*/
                /*互换*/
                int temp=array[index];
                array[index]=array[max];
                array[max]=temp;

            }
            adjustDown(array,max);
        }


    }

    public static void main(String[] args) {

        int[] array=new int[]{3,4,8,9,1,0,6,11};

        createHeap(array);
        System.out.println(Arrays.toString(array));
    }
}
