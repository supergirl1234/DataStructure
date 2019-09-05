package com.comm;


import java.util.Stack;

/*后序遍历,非递归*/
public class PostReverse {

    public static void post(Node root){

        if(root==null){

            return;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        Node last = null;
        while(!stack.isEmpty()||cur!=null){

            /*也是优先处理左子树*/
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.peek();
           if(top.right==null){
               System.out.println(top.value);
               stack.pop();
               last=top;
           }else if(top.right == last) {
               /*处理完右结点，则处理右结点的根结点*/
               System.out.print(top.value);
               stack.pop();
               last = top;
           } else {
               /*处理右子树*/
               cur = top.right;
           }

        }

    }
}
