package comm;

public class GuiBingSort {

    public static void mergeSort(int[] array){
        int[] extra=new int[array.length];
        mergeSortInner(array,0,array.length,extra);
    }
    private static void mergeSortInner(int[] array, int left, int right, int[] extra) {
        if(left==right-1){
            return;
        }
        if(left>=right){
            return;
        }
        /*将该数组分为两部分*/
        int mid=left+(right-left)/2;
        mergeSortInner(array,left,mid,extra);
        mergeSortInner(array,mid,right,extra);
        /*将分成的两部分数组进行比较排序*/
        merge(array,left,mid,right,extra);

    }


    private static void merge(int[] array, int left, int mid, int right, int[] extra) {

        int i=left;
        int j=mid;
        int x=0;
        while (i<mid&&j<right){

            if(array[i]<=array[j]){

                extra[x++]=array[i++];
            }else {

                extra[x++]=array[j++];
            }
        }

        while (i<mid){
            extra[x++]=array[i++];
        }

        while (j<right){
            extra[x++]=array[j++];
        }

        /*又把排好顺序的元素重新放到原数组中*/
        for(int k=left;k<right;k++){
            array[k]=extra[k-left];

        }
    }
    public static void main(String[] args) {

    }
}
