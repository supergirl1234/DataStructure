package com;

/*删除有序链表中重复的结点*/
/*如0->1->2->2->2->4->5->6->6*/
public class DeleteDuplicatedNode {
    public static Node deleteDuplicatedNode(Node head){
        if(head==null){
            throw new Error();
        }
        /*需要两个指针，来比较这两个指针所指向的结点其值是否相等*/
        Node p1=head;
        Node p2=head.next;
        /*p1的前驱结点*/
        Node pre=new Node(0);
        pre.next=p1;

        Node arr=pre;
        while(p2!=null) {
            /*如果p1、p2所指向的结点的值不相等，则p1、p2都向后挪一位*/
            if (p1.value != p2.value) {
                pre = pre.next;
                p1 = p1.next;
                p2 = p2.next;
            } else {
                /*如果p1、p2所指向的结点的值相等，则将p2向后挪一位，直到p1的值与p2的值不相等，然后将p1的前一个结点的next设置为p2结点*/
                while (p2!=null&&p1.value == p2.value) {
                    p2 = p2.next;
                }
                pre.next = p2;
                if(p2!=null) {
                    p1 = p2;
                    p2 = p2.next;
                }


            }
        }

        return  arr.next;
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
        Node result=deleteDuplicatedNode(head);
        Display.display(result);

    }
}
