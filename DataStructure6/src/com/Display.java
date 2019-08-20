package com;

public class Display {

    public  static  void display(Node head){

        Node cur=head;
        while (cur!=null){

            System.out.print(cur.value+"  ");
            cur=cur.next;
        }
    }
}
