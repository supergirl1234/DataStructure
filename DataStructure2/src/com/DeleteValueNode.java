package com;


/*删除链表中指定value值的结点*/
public class DeleteValueNode {


    public static Node  deleteValue2(Node head,int value){
        /*0->1->2->2->4->5->6->6*/
        Node pre=new Node(0);
        Node first=pre;
        Node cur=head;
        pre.next=head;
        while(cur!=null){
            if(cur.value==value){
                pre.next=cur.next;
                cur=cur.next;

            }else {
                pre = pre.next;
                cur = cur.next;
            }

        }
        return  first.next;


    }
    public static void main(String[] args) {
        Node head=new Node(0);
        Node A=new Node(1);
        Node B=new Node(2);
        Node C=new Node(2);
        Node D=new Node(4);
        Node E=new Node(5);
        Node F=new Node(6);
        Node G=new Node(6);
        head.next=A;
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        E.next=F;
        F.next=G;
        Node result2=deleteValue2(head,6);
        Display.display(result2);

    }
}
