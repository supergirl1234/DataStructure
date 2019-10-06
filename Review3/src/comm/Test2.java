package comm;

import java.util.Stack;

/*
* 中序遍历，非递归
* */
public class Test2 {

    public static void test2(Node root){


        Stack<Node> stack=new Stack<>();
        Node cur=root;

        while(!stack.isEmpty()||cur!=null){
            /*也是先一条左子树先走到头*/
            while(cur!=null){

                stack.push(cur);/*在第一次遇到该节点时不输出*/
                cur=cur.left;
            }
            Node node=stack.pop();
            System.out.print(node.value);//在第二次遇到该节点时输出
            cur=node.right;


        }

    }

    public static void main(String[] args) {


        Node root=new Node('A');
        Node p1=new Node('B');
        Node p2=new Node('C');
        Node p3=new Node('D');
        Node p4=new Node('E');
        Node p5=new Node('F');
        Node p6=new Node('G');
        Node p7=new Node('H');
        Node p8=new Node('I');
        Node p9=new Node('J');
        Node p10=new Node('K');
        root.left=p1;
        root.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.left=p5;
        p2.right=p6;
        p3.left=p7;
        p4.right=p8;
        p5.left=p9;
        p6.right=p10;
        test2(root);
    }

}
