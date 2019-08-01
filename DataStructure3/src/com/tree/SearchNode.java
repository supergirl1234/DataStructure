package com.tree;


/*
* 查找树中是否含有某个子树
*
* */
public class SearchNode {

    /*是否含有某个子树*/
    public static boolean containNode1(Node root,Node key){

        if(root==null){

            return false;
        }
        if(root==key){

            return true;
        }
        return containNode1(root.left,key)||containNode1(root.right,key);



    }


    /*是否包含子树，并返回其节点*/
    public static Node containNode2(Node root,Node key){

        if(root==null){

            return null;
        }
        if(root==key){

            return root;
        }
        Node node=containNode2(root.left,key);
        if(node!=null){

            return node;
        }
        node=containNode2(root.right,key);
        if(node!=null){

            return node;
        }
        return null;
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

        Node search=new Node('B');
        Node search2=new Node('E');
        Node search3=new Node('F');
        search.left=search2;
        search.right=search3;

       //boolean result1= containNode1(root,search);
        boolean result1= containNode1(root,B);
        System.out.println(result1);

        //Node result2= containNode2(root,search);
        Node result2= containNode2(root,B);
        System.out.println(result2);
    }


}
