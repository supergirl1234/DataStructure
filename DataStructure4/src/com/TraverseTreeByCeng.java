package com;

/*层序遍历二叉树*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraverseTreeByCeng {

    /*将树的根结点入队列，根结点在出队列时，将根结点的左结点和右结点分别入队列，然后再依次出队列，在出队列时，分别将左结点右右结点入队列，以此类推*/
    public static void Traverse(Node root) {

        if(root==null){

            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node node = queue.poll();

            if(node!=null){
                System.out.print(node.value+" ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }

        }


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

        Traverse(root);
    }
}
