package comm;

import java.util.Stack;

/*
*
* 前序遍历，非递归
* */
public class Test1 {

    public static void test1(Node root){

        Stack<Node> stack=new Stack<>();
        Node cur=root;

        while(!stack.isEmpty()||cur!=null){

            /*先一条道把左子树走完*/
            while(cur!=null){

                stack.push(cur);
                System.out.print(cur.value);//在第一次遇到该节点时就输出
                cur= cur.left;
            }
            /*左子树走完之后，再出栈，去走每一个结点的右子树*/
            Node node=stack.pop();
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

        test1(root);
    }
}
