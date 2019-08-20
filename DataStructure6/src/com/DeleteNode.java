package com;

/*删除链表中某个特定的值*/
public class DeleteNode {

    /*1.先不管第一个节点，等其他节点都处理好了，再处理第一个*/
    public static Node delete1(Node head, char k) {

        if (head == null) {
            return null;
        }
        Node pre = head;
        Node cur = head.next;
        while (cur != null) {

            if (cur.value == k) {

                pre.next = cur.next;
            } else {

                pre = cur;
            }
            cur = cur.next;
        }
        /*如果第一个节点就是要删除的节点*/
        if (head.value == k) {
            head = head.next;
        }
        return head;

    }

    /*2.创建一个新节点（假的），使其next为该链表*/
    public static Node delete2(Node head, char k) {

        Node node = new Node('1');
        node.next = head;


        Node pre = node;
        Node cur = head;
        while (cur != null) {

            if (cur.value == k) {

                pre.next = cur.next;
            } else {

                pre = cur;
            }
            cur = cur.next;
        }

        return node.next;

    }

    /*3.做特殊处理，如果pre==null*/
    public static Node delete3(Node head, char k) {


        Node pre = null;
        Node cur = head;
        while (cur != null) {

            if (cur.value == k) {


                if (pre == null) {//说明删的是头结点

                    head = head.next;
                } else {

                    pre.next = cur.next;
                }

            } else {

                pre = cur;
            }
            cur = cur.next;
        }

        return head;

    }


    /*4.遍历链表，比较节点的值和value，如果不相等，把该节点搬到新的链表上*/
    public static Node delete4(Node head, char k) {

        Node result = null;//存放结果的链表
        Node last = null;//result链表的尾结点
        Node cur = head;
        while (cur != null) {
            if (cur.value != k) {
                /*尾插到result上*/
                if (result == null) {
                    result = cur;
                } else {
                    last.next = cur;
                }
                last = cur;
            }
            cur = cur.next;
        }
        if(last!=null) {
            last.next = null;
        }
        return result;
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

        char c = '4';

        //Node result= delete1(head,c);
        // Node resulbt= delete2(head,c);
        //Node result= delete3(head,c);
        Node result = delete4(head, c);
        Display.display(result);
    }
}
