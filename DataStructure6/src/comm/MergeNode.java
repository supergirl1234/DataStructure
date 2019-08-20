package comm;


/*合并两个有序链表*/
public class MergeNode {

    public static Node merge(Node p1, Node p2) {
        Node result = null;//存放结果链表
        Node last = null;//结果链表的尾结点
        if (p1 == null) {
            return p2;
        }
        if (p2 == null) {
            return p1;
        }
        Node cur1 = p1;
        Node cur2 = p2;
        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                //cur1尾插到result中
                if (result == null) {
                    result = cur1;
                } else {
                    last.next = cur1;
                }
                last = cur1;
                cur1 = cur1.next;
            } else {
                //cur2尾插到result中
                if (result == null) {
                    result = cur2;
                } else {

                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;

            }
        }

        /*如果链表1或者链表2还有剩余*/
        if (cur1 != null) {
            last.next = cur1;
        }
        if (cur2 != null) {
            last.next = cur2;
        }

        return result;

    }

    public static void main(String[] args) {


        Node p1 = new Node(1);
        Node p2 = new Node(4);
        Node p3 = new Node(5);
        Node p4 = new Node(8);
        Node p5 = new Node(12);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;

        Node t1 = new Node(2);
        Node t2 = new Node(6);
        Node t3 = new Node(9);
        Node t4 = new Node(11);
        Node t5 = new Node(14);
        Node t6 = new Node(17);
        Node t7 = new Node(18 );
        Node t8 = new Node(23);
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        t5.next=t6;
        t6.next=t7;
        t7.next=t8;
        t8.next=null;
        Node result = merge(p1, t1);
        Display.display(result);
    }
}
