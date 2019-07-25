package com.linkedList;

public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.PutFront(1);
        myLinkedList.PutFront(2);
        myLinkedList.PutFront(3);
        myLinkedList.print();
        myLinkedList.PutTail(4);
        myLinkedList.PutTail(5);
        myLinkedList.PutTail(6);
        myLinkedList.print();

        myLinkedList.DeleteFront();
        myLinkedList.DeleteTail();
        myLinkedList.print();


    }
}
