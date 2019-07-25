package com.arrayList;

public class TestMyArrayList {

    public static void main(String[] args) {

        MyArrayList myArrayList=new MyArrayList(6);
        myArrayList.PutFront(1);
        myArrayList.PutFront(2);
        myArrayList.PutFront(3);
        myArrayList.PutTail(4);
        myArrayList.PutTail(4);
        myArrayList.PutTail(5);
        myArrayList.PutTail(6);
        myArrayList.print();
        System.out.println();
        myArrayList.DeleteFront();
        myArrayList.DeleteTail();
        myArrayList.print();
        System.out.println();

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.size);
        System.out.println(myArrayList.length());
        System.out.println(myArrayList.array.length);
        myArrayList.PutItem(2,9);
        myArrayList.print();
        System.out.println();
        myArrayList.DeleteItem(3);
        myArrayList.print();
    }
}
