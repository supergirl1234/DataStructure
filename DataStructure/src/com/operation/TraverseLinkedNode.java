package com.operation;


/*将整个链表反转*/
/*思想是：将原链表中的每一个结点都头插到新链表中*/
public class TraverseLinkedNode {

    public static Node traverse(Node head) {
        Node result = null;/*新结点*/
        Node cur = head;
        while (cur != null) {

            Node node=cur.next;/*将cur.next结点保存 */
            /*头插*/
            if(result==null){

                result=cur;
                result.next=null;
            }else{

                cur.next=result;
                result=cur;
            }
            cur=node;

        }
        return result;

    }

    public static void main(String[] args) {


        Node head=new Node(1);
        Node A=new Node(2);
        Node B=new Node(3);
        Node C=new Node(4);
        Node D=new Node(5);
        Node E=new Node(6);
        Node F=new Node(7);

        head.next=A;
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        E.next=F;
        Node result=traverse(head);
        Display.display(result);
    }

}
