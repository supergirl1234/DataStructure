package com.node;

/*
 *复制链表
 * */

class ListNode {

    int value;
    ListNode next;
    ListNode random;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
        this.random = null;
    }
}

public class CopyNode {


    /*复制原链表的每一个结点，并将其插入到原链表每一个结点的后面
     * 比如A->B->C->D
     *    变成A->A->B->B->C->C->D->D
     * */
    public static ListNode copyValue(ListNode head) {
        ListNode cur=head;
        while(cur!=null){

            ListNode newNode=new ListNode(cur.value);
            newNode.next=cur.next;
            cur.next=newNode;

            cur=cur.next.next;
        }
       return  head;

    }

    /*设置新链表的random*/

    public static ListNode copyRandom(ListNode head) {


        ListNode cur=head;
        while(cur!=null){

            if( cur.random!=null) {
                cur.next.random = cur.random.next;
            }else{
                cur.next.random=null;

            }

            cur=cur.next.next;
        }


        return head;
    }


    /*再加将获取的整个链表插分为原链表和新链表*/

    public static ListNode divide(ListNode head) {
        ListNode p1=head;
        ListNode p2=head.next;
        ListNode result=head.next;
        while(p1!=null){

           ListNode node=p1.next;
           p1.next=node.next;

           if(node.next!=null) {
               node.next = node.next.next;
           }

            p1=p1.next;


        }
        return  result;

    }

    public static  ListNode Copy(ListNode head){

        ListNode newNode=copyValue(head);
        ListNode newNewListNode=copyRandom(newNode);
        return divide(newNewListNode);

    }

    public static void main(String[] args) {

        ListNode head=new ListNode( 1);
        ListNode A=new ListNode( 2);
        ListNode B=new ListNode( 3);
        ListNode C=new ListNode( 4);
        ListNode D=new ListNode( 5);
        ListNode E=new ListNode( 6);
        ListNode F=new ListNode( 7);
        head.next=A;
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        E.next=F;

        head.random=head;
        A.random=C;
        B.random=F;
        C.random=E;
        D.random=D;
        E.random=null;
        F.random=A;

        ListNode result=Copy(head) ;
        Disply.print2(result);


    }
}
