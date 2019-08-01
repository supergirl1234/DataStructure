package com.tree;


/*计算树的高度*/
public class NodeHeight {


    public static int height(Node root){
        if(root==null){
            return  0;

        }
       /*左子树的高度和右子树的高度，哪个高，就取谁*/

        int height1=height(root.left);
        int height2=height(root.right);

        return 1+(height1>height2?height1:height2);

    }

    public static void main(String[] args) {

        Node root = new Node('A');
        Node A = new Node('B');
        Node B = new Node('C');
        Node C = new Node('D');
        Node D = new Node('E');
        Node E = new Node('F');
        Node F = new Node('G');
        Node G = new Node('H');
        Node H = new Node('I');

        root.left = A;
        root.right = B;
        A.left = C;
        A.right = D;
        B.left = E;
        B.right = F;
        D.left = H;
        D.right = G;

        int result= height(root);
        System.out.println(result);
    }
}
