package com.operation;


/*将链表按照某个数据分割为小于该数据与大于该数据的两个链表*/
public class PartListNode {


    public static Node partNode(Node head,int num){

        Node smallNode=null;/*该链表存放小于num的结点*/
        Node smallLast=null;
        Node bigNode=null;/*该链表存放大于num的结点*/
        Node bigLast=null;
        Node cur=head;
        while(cur!=null){

            Node node=cur.next;
            if(cur.value<=num){
                /*尾插到smallNode中*/
                if(smallNode==null){
                    smallNode=cur;

                }else{

                    smallLast.next=cur;
                }
                smallLast=cur;
            }
            if(cur.value>num){

                /*尾插到bigNode中*/

                if(bigNode==null){
                    bigNode=cur;

                }else{

                    bigLast.next=cur;
                }
                bigLast=cur;
            }
            cur=node;

        }

        /*将smallNode和bigNode连接成一个链表*/
        if(smallNode==null){
            return bigLast;

        }else{

            smallLast.next=bigNode;
            return  smallNode;
        }

    }
    public static void main(String[] args) {

        Node head=new Node(1);
        Node A=new Node(6);
        Node B=new Node(8);
        Node C=new Node(3);
        Node D=new Node(2);
        Node E=new Node(68);
        Node F=new Node(12);
        Node G=new Node(11);
        head.next=A;
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        E.next=F;
        F.next=G;
       // Node result =partNode(head,7);//1->6->3->2->8->68->12->11
       Node result =partNode(head,5);//1->3->2->6->8->68->12->11
        Display.display(result);
    }
}
