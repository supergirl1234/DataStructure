package com.comm;


import java.util.Stack;

/*前序遍历，非递归*/
public class PreReverse {
    public static void pre(Node root){

        if(root==null){

            return;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while (!stack.isEmpty() ||cur!=null){
            while (cur!=null) {
                /*第一次遇到该节点*/
                System.out.println(cur.value);//先打印出值
                stack.push(cur);
                // 优先遍历左子树
                cur = cur.left;

            }
            /*出栈时再处理右子树*/
                Node p=stack.pop();
                cur=p.right;
            }

    }
}
