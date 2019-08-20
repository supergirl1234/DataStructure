package com;


/*逆置链表*/

public class ReverseNode {

    /*思路1：将链表进行遍历，将遍历到的每个结点头插到另一个链表中*/

    public static Node reverse1(Node head) {
        Node result = null;//存放结果的链表
        Node cur = head;
        while (cur != null) {
            Node node = cur.next;

            /*头插到result中*/
            cur.next = result;
            result = cur;
            cur = node;
        }
        return result;

    }

    /*思路2：使用三个3个指针p1、p2、p3,三者的关系是：p1.next=p2,p2.next=p3*/
    public static Node reverse2(Node head) {

       Node p1=null;
       Node p2=head;
       while (p2!=null){
          Node p3=p2.next;//p3指针的位置
           /*要逆置该链表，则将节点之间的指向反转*/
           p2.next=p1;

           /*然后三个指针都往后移动*/
           p1=p2;
           p2=p3;

       }

        return p1;

    }

    public static void main(String[] args) {
        Node head = new Node('2');
        Node p1 = new Node('1');
        Node p2 = new Node('4');
        Node p3 = new Node('8');
        Node p4 = new Node('9');
        Node p5 = new Node('0');
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;

       /* Node result = reverse1(head);
        Display.display(result);*/

        Node result =reverse2(head);
        Display.display(result);

    }
}
