package com.operation;


/*合并两个有序链表,前提是这两个链表必须是有序的*/
public class MergeLinkedNode {



    public static Node Merge(Node headA,Node headB){

        /*存放结果值的链表*/
        Node result=null;
        Node last=null;
        Node head1=headA;
        Node head2=headB;
        while (head1!=null&&head2!=null){
            if(head1.value<=head2.value){

                /*head1插入链表result中*/
                if(result==null){/*若存放结果的链表为空*/

                    result=head1;


                }else{

                    last.next=head1;
                }
                last=head1;

                head1=head1.next;
            }else{

                /*head2插入链表result中*/
                if(result==null){

                    result=head2;


                }else{

                    last.next=head2;
                }
                last=head2;

                head2=head2.next;

            }


        }

        /*如果某一个链表有剩余，则将剩余的链表直接插在result链表的最后*/
        if(head1!=null){
            if(result==null){/*在这里还是要判断结果链表result是否为空*/

                result=head1;

            }else {
                last.next = head1;
            }

           while(head1.next!=null){

                head1=head1.next;
            }
            //更新last
            last=head1;

        }
        if (head2!=null){
            if (result==null){

                result=head2;

            }else {
                last.next = head2;
            }
            while(head2.next!=null){

                head2=head2.next;
            }
            //更新last
            last=head2;
        }

        return  result;
    }

    public static void main(String[] args) {

        Node  headA=new Node(1);
        Node  A=new Node(3);
        Node  B=new Node(6);
        Node  C=new Node(8);
        headA.next=A;
        A.next=B;
        B.next=C;

        Node  headB=new Node(1);
        Node  a=new Node(2);
        Node  b=new Node(3);
        Node  c=new Node(7);
        Node  d=new Node(9);
        Node  e=new Node(10);
        Node  f=new Node(11);
        headB.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node result=Merge(headA,headB);
        Display.display(result);
    }
}
