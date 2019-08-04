package com;

/*用带空结点的前序遍历，还原二叉树
* 如果是用不带空结点的前序遍历，还原的二叉树是和最初的二叉树是不一样的；
* */

import java.util.Arrays;

class  NO{

    Node node;
    int used;/*用到的结点的个数*/

    public NO(Node node, int used) {
        this.node = node;
        this.used = used;
    }
}

public class CreateTree {

    public static NO createTree(char[] tree){
        if(tree.length==0){

            return new NO(null,0);
        }

        /*先找到根节点*/
        Node root=new Node(tree[0]);
        if(root.value=='#'){
            return new NO(null,1);
        }
        /*创建左子树*/
        //先找到左子树的前序遍历个数
        char[] leftTree=new char[tree.length-1];
        leftTree=Arrays.copyOfRange(tree,1,tree.length);
        NO leftNO=createTree(leftTree);


        /*创建右子树*/
        //先找到右子树的前序遍历个数
        char[] rightTree=new char[tree.length-1-leftNO.used];
        rightTree=Arrays.copyOfRange(tree,1+leftNO.used,tree.length);
        NO rightNO=createTree(rightTree);

       /*将root、left、right建立起关系*/

        root.left=leftNO.node;
        root.right=rightNO.node;
        return new NO(root,1+leftNO.used+rightNO.used);

    }
    public static void main(String[] args) {


        char[] preOrder=new char[]{'A','B','C','#','D','#','#','#','E'};

        System.out.println(createTree(preOrder).used);


    }
}
