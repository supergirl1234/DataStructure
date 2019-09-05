package com.comm;


import java.util.Stack;

/*中序遍历，非递归*/
public class ZhongReverse {
    public static void zhong(Node root){

        Node cur=root;
        Stack<Node> stack=new Stack<>();
        while (!stack.isEmpty()||cur!=null){

            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }

            Node top=stack.pop();
            /*top 取出的节点 是第二次遇到该节点*/
            System.out.println(top.value);
            cur=top.right;
        }

    }
}
