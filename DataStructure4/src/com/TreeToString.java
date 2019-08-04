package com;


/*
* 将一个二叉树转换为带括号的字符串
* 左子树空，括号不能省略；右子树空，括号能省略；
* */
public class TreeToString {

    public static void  treeToString(Node root, StringBuilder sb){

        if(root!=null){
            sb.append('（');
            sb.append(root.value);
            if(root.left==null&&root.right!=null){
                sb.append("()");
            }else{
                treeToString(root.left,sb);
            }
            treeToString(root.right,sb);
            sb.append(')');
        }
    }

    public static  String treeToString(Node root){
        if(root==null){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        treeToString(root,sb);

        sb.delete(0,1);
        sb.delete(sb.length()-1,sb.length());

        return sb.toString();
    }

    public static void main(String[] args) {
        Node root=new Node('A');
        Node B=new Node('B');
        Node C=new Node('C');
        Node D=new Node('D');
        Node E=new Node('E');
        Node F=new Node('F');
        Node G=new Node('G');
        Node H=new Node('H');
        root.left=B;root.right=C;
        B.left=D;B.right=E;
        C.right=F;
        D.left=G;
        E.right=H;

        String result=treeToString(root);
        System.out.println(result);

    }

}
