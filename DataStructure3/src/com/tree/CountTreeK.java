package com.tree;


/*计算出树的第K层的结点总数*/
public class CountTreeK {


    public static int CountK(Node root,int k){


        if(root==null){
            return 0;

        }
        if(k==1){
            return 1;

        }

        return CountK(root.left,k-1)+CountK(root.right,k-1);
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

        int result= CountK(root,4);
        System.out.println(result);

    }
}
