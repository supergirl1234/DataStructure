package com.node;


/*
 * 判断链表是否是交叉链表：结点引用相同就是交叉链表
 *
 * A->B->C->D->E->F->G
 * 1->C->D->E->F->G
 * 这两个就是交叉链表
 * */


public class IsCrossNode {


    /*链表长度*/

    public static int LengthNode(Node head){

        int count=0;
        Node cur=head;
        while (cur!=null){

            count++;
            cur=cur.next;
        }
        return count;
    }
    public  static boolean isCross(Node head1,Node head2){

        Node p1=head1;
        Node p2=head2;
        int length1=LengthNode(head1);
        int length2=LengthNode(head2);
        if(length1<length2){
            int sub=length2-length1;
            for(int i=0;i<sub;i++){

                p2=p2.next;
            }

        }else if(length1>length2){
            int sub=length1-length2;
            for(int i=0;i<sub;i++){

                p1=p1.next;
            }


        }

        while(p1!=null&&p2!=null){

            if(p1==p2){

                return true;
            }else {

                p1=p1.next;
                p2=p2.next;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node A = new Node(2);
        Node B = new Node(3);
        Node C = new Node(4);
        Node D = new Node(5);
        Node E = new Node(6);
        Node F = new Node(7);
        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = F;

        Node p1=new Node(11);
        Node p2=new Node(12);
        p1.next = p2;
        p2.next=D;

        boolean result=isCross(head,p1);
        System.out.println(result);
    }
}
