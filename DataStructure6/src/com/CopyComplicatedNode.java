package com;

/*节点的复制过程和random的复制过程是分离的
* 建立映射关系，每个
*
* */

import java.util.HashMap;
import java.util.Map;

/*复杂链表复制，这是个深拷贝*/
public class CopyComplicatedNode {

    /*第一种方法：*/
    public static Node Copy1(Node head){

     Node cur=head;
     /*先复制节点*/
     while(cur!=null){

         /*创造一个新结点，使其成为该节点的下一个节点*/
         Node node=new Node(cur.value);

         node.next=cur.next;
         cur.next=node;

         cur=cur.next.next;

     }
     /*再复制random*/
        cur=head;
        while(cur!=null){
            if(cur.random==null){
                cur.next.random=null;

            }else {
                cur.next.random = cur.random.next;
            }
            cur=cur.next.next;
        }

        /*再将整个链表进行拆分*/
        Node newNode=head.next;//存放新生成的新的链表

        cur=head;
        while(cur!=null){

         Node p=cur.next;

         cur.next=p.next;
         if(cur.next!=null) {
             p.next = cur.next.next;

         }else{
             p.next=null;
         }
         cur=cur.next;

        }
        return  newNode;
    }

    /*第二种方法:用Map*/
    public static Node Copy2(Node head){

        Node result=new Node('0');//存放结果的链表
        Node newLast=result;//存放结果链表的尾结点
        Map<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){

            Node node=new Node(cur.value);

            newLast.next=node;
            newLast=node;

            map.put(cur,node);/*Map<老节点，新结点>*/

            cur=cur.next;
        }

        cur=head;
        Node temp=result.next;
        while(cur!=null){
            temp.random=map.get(cur.random);
            cur=cur.next;

        }
        return result.next;

    }
    public static void main(String[] args) {

    }
}
