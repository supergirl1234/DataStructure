package com.tree;


/*计算出树的叶子结点总数*/
public class CountTreeLeaf {

    public static int LeafCount1(Node root){


        /*叶子节点的特点是：左子树为null，右子树为null*/
        if (root.left==null&&root.right==null){

            return 1;
        }else{

            return LeafCount1(root.left)+LeafCount1(root.right);
        }
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

        int result= LeafCount1(root);
        System.out.println(result);
    }
}
