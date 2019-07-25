package com.linkedList;


public class MyLinkedList implements ILinkedList {

    /*LinkedList内部是用链表来实现的*/

    class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }
    private Node head=null;

    @Override
    public void PutFront(int item) {

        Node node=new Node(item);
        if(head==null){

            head=node;
        }else{

            node.next=head;
            head=node;

        }
    }

    @Override
    public void PutTail(int item) {

        Node node=new Node(item);

        /*如果链表中没有节点*/
        if(head==null){
            head=node;
        }else {
            /*找到最后一个节点，最后一个节点的特征是:node.next=null;*/

            Node cur = head;
            while (cur.next != null) {

                cur = cur.next;
            }
            cur.next=node;
        }
    }

    @Override
    public void DeleteFront() {

        /*如果链表中没有节点*/
        if(head==null){

            throw  new Error();
        }else if(head.next==null) { /*如果链表中只有一个节点*/
            head = null;
        }else {
            this.head = this.head.next;
        }

    }

    @Override
    public void DeleteTail() {
        /*如果链表中没有节点*/
        if(head==null){

            throw  new Error();
        }else if(head.next==null){ /*如果链表中只有一个节点*/
            head=null;

        }else {
            /*找到最后一个节点的前一个节点，这个节点的特征是:node.next.next=null;*/
            Node cur = head;
            while (cur.next.next != null) {
                cur = cur.next;

            }
            cur.next = null;
        }

    }

    /*打印*/

    public void print(){

        Node cur=head;
        while(cur!=null){

            if(cur.next==null){
                System.out.print(cur.value);
            }else {
                System.out.print(cur.value + " ");
            }

            cur=cur.next;

        }
        System.out.println();
    }
}
