package com.tree;


/*计算出树的结点总数*/
public class CountTreeNode {


    public static int CountNode(Node root){

        if(root==null){

            return 0;
        }
        return  1+CountNode(root.left)+CountNode(root.right);/*根节点+左子树的节点个数+右子树的节点个数*/

    }
    public static void main(String[] args) {
        Node root = new Node('A');
        Node A = new Node('B');
        Node B = new Node('C');
        Node C = new Node('D');
        Node D = new Node('E');
        Node E = new Node('F');
        Node F = new Node('G');

        root.left = A;
        root.right = B;
        A.left = C;
        A.right = D;
        B.left = E;
        B.right = F;

       int result= CountNode(root);
        System.out.println(result);
    }
}
