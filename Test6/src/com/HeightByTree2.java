package com;


/*给定一个二叉树,二叉树不是以数组的形式给出的，是以左右子树的形式给出的，找出其最大深度*/
public class HeightByTree2 {

    public static int  Height(Node height){
        if(height==null){
            return 0;
        }

        if (height.left==null&&height.right==null){
            return  1;
        }
        int leftHeight=Height(height.left);
        int rightHeight=Height(height.right);
        return  leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }

    public static void main(String[] args) {


        Node A=new Node(1);
        Node B=new Node(2);
        Node C=new Node(3);
        Node D=new Node(4);
        Node E=new Node(5);
        Node F=new Node(5);
        A.left=B;
        B.left=C;
        B.right=D;
        D.left=E;
        E.left=F;

        int result=Height(A);
        System.out.println(result );


    }
}
