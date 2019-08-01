package com.tree;


/*
* 查找树中是否含有某个值
* */
public class SearchValue {

    public static boolean containValue1(Node root,char num){
        if(root==null){

            return  false;
        }
      if(root.value==num){
          return true;

      }

      return containValue1(root.left,num)||containValue1(root.right,num);


    }

    /*查找树中是否含有某个值,并返回该节点*/
    public static Node containValue2(Node root,char num){
        if(root==null){

            return  null;
        }
        if(root.value==num){
            return root;

        }

        /*左子树中查找*/
        Node node=containValue2(root.left,num);
        if(node!=null){

            return node;
        }

        /*右子树中查找*/
        node=containValue2(root.right,num);
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

        //boolean result=containValue1(root,'F');
        boolean result=containValue1(root,'M');
        System.out.println(result);
        Node node=containValue2(root,'A');
        System.out.println(node.value);


    }
}
