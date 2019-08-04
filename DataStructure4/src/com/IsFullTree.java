package com;

import java.util.LinkedList;
import java.util.Queue;

//判断是否是完全二叉树
//思路：层序遍历，如果遇到空结点后，后面还有结点，则不是完全二叉树
public class IsFullTree {


    public static boolean isFull(Node root){

        /*先层序遍历*/

        Queue<Node> queue=new LinkedList<>();
         queue.add(root);
         while(true){

             Node node=queue.poll();
             if(node==null){/*如果某个节点为null了，则去判断队列中剩余的结点是否为全为null,如果全为null，则说明是完全二叉树，否则就说明不是完全二叉树*/

                 break;

             }
             queue.add(node.left);
             queue.add(node.right);
         }

         /*判断队列中剩余的结点是否全为null*/
        while(!queue.isEmpty()){

            Node node=queue.poll();
            if(node!=null){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Node root = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');



        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        D.left = G;
        E.right = H;

        boolean result=isFull(root);
        System.out.println(result);

    }
}
