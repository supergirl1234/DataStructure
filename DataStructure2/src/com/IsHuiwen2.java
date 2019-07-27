package com;

/*  思想：将链表的后半部分结点头插到另一个链表中，然后将这两个链表进行比较*/
public class IsHuiwen2 {

    /*获取链表的长度*/
    public static int length(Node head){
        Node cur=head;
        int count=0;
        while(cur!=null){

            count++;
            cur= cur.next;
        }
        return count;
    }
    /*将链表的后半部分头插到另一个链表中*/
    public static Node halfNode(Node head){
        Node result=null;/*存放后半部分链表*/
        int length=length(head);
        Node cur=head;
        for(int i=0;i<length/2;i++){
            cur=cur.next;
        }
        while(cur!=null){
            Node node=cur.next;
            /*头插到result中*/
            cur.next=result;
            result=cur;
            cur=node;
        }
        return  result;

    }
    public static boolean IsHuiWenNode(Node head){

        Node lastHalfNode=halfNode(head);
        Node cur1=head;
        Node cur2=lastHalfNode;
        while(cur2!=null){
            if(cur1.value!=cur2.value){
                return  false;

            }else {

                cur1=cur1.next;
                cur2=cur2.next;
            }

        }
        return  true;
    }
    public static void main(String[] args) {
        Node head=new Node(0);
        Node A=new Node(1);
        Node B=new Node(2);
       // Node C=new Node(3);
        Node D=new Node(3);
        Node E=new Node(2);
        Node F=new Node(1);
        Node G=new Node(0);
        head.next=A;
        A.next=B;
        /*B.next=C;
        C.next=D;*/
        B.next=D;
        D.next=E;
        E.next=F;
        F.next=G;
        boolean result=IsHuiWenNode(head);

        System.out.println(result);


    }
}
