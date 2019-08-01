package com.tree;


/*判断一棵树是否是镜像的

      A
    B   B
   C D  C D

例如上面的就是镜像的
*/

public class IsMirrorTree {

    public static  boolean IsMirror(Node root){
        if(root==null){
            return  true;

        }

        return isMirr(root.left,root.right);

    }

    public  static  boolean isMirr(Node p,Node q){
        if(p==null&&q==null){

            return  true;
        }
        if(p==null||q==null){
            return false;

        }

        /*先比较根结点，再比较根结点的左子树和右子树*/
        return  p.value==q.value
                &&isMirr(p.left,q.left)
                &&isMirr(p.right,q.right);

    }
    public static void main(String[] args) {

        Node root=new Node('A');
        Node A=new Node('B');
        Node B=new Node('C');
        Node C=new Node('D');
        Node D=new Node('E');
        Node E=new Node('F');
        Node F=new Node('G');

        root.left=A;
        root.right=A;
        A.left=C;
        A.right=D;
        C.left=B;
        C.right=E;
        D.left=F;
        D.right=F;

        boolean result=IsMirror(root);
        System.out.println(result);

    }
}
