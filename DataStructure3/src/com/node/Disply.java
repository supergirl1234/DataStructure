package com.node;

public class Disply {

    public static void print1(Node head) {
        Node cur = head;
        while (cur != null) {
            if (cur.next != null) {
                System.out.println(cur.value + "->");
            } else {
                System.out.println(cur.value);

            }

            cur=cur.next;
        }

    }

    public static void print2(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null) {
                System.out.print(cur.value + "->");
            } else {
                System.out.print(cur.value);

            }

            cur=cur.next;
        }

    }
}
