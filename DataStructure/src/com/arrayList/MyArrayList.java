package com.arrayList;



public class MyArrayList implements IArrayList {
    public int[] array;//用来存放数据的数组
    public int size;//用来保存数组中数据个数

    public MyArrayList(int capacity) {
        this.array = new int[capacity];/*初始化数组的大小*/
        this.size = 0;/*刚开始数组中数据个数为0*/
    }

    @Override
    public void PutFront(int item) {

        ensureCapacity();
        /*将数组中的数据都往后挪一位*/
        for(int i=size-1;i>=0;i--){

            array[i+1]=array[i];
        }
        /*将数据插入到数组中第一个*/
        array[0]=item;
        /*数组个数加1*/
        size++;


    }

    @Override
    public void PutTail(int item) {
        ensureCapacity();
        /*将数据插入到后面*/
        array[size]=item;
        size++;

    }

    @Override
    public void DeleteFront() {


        /*将数组中的数据从第二个数开始都往前面挪一位，则第一个数据就被删除了*/
        for(int i=1;i<size;i++){

            array[i-1]=array[i];
        }
        /*数组个数减一*/
        size--;

    }

    @Override
    public void DeleteTail() {



        /*直接将数组个数减一，最后一个数据就不存在了*/
        size--;

    }

    @Override
    public void DeleteItem(int index) {
        if(index<0||index>=size){

            throw new Error();
        }

        /*从index位置开始，将index位置(不包括index位置)后面的数都向前挪一位*/
        for(int i=index+1;i<size;i++){

            array[i-1]=array[i];
        }
        this.size--;
    }

    @Override
    public void PutItem(int index,int item) {

        if(index<0||index>=size){

            throw new Error();
        }
        ensureCapacity();
        /*从index位置开始，将index位置(包括index位置)后面的数都向后挪一位*/
        /*从后往前挪*/
        for(int i=size-1;i>=index;i--){

            array[i+1]=array[i];
        }

        /*然后将要插入的数据插入到index位置*/
        array[index]=item;
        this.size++;
    }

    /*最重要的一点，要判断数组是否还装的下，要是装不下，则将数组进行扩容，一般是将数组扩容为原来的两倍*/

    public  void ensureCapacity(){

        if(this.size==array.length){//此时就要进行扩容了

            /*怎么进行扩容？*/

            /*创建一个新的数组，数组的容量为原来数组的2倍，然后将原来数组的内容搬到这个新数组中*/
            int[] array2=new int[array.length*2];
            for(int i=0;i<size;i++){

                array2[i]=array[i];
            }

            this.array=array2;


        }
    }

    /*打印*/
  public  void print(){

      for(int i=0;i<size;i++){

          System.out.print(array[i]+" ");
      }
  }
  public int size(){
      return  this.size;
  }

    public int length(){
        return  this.array.length;
    }
}
