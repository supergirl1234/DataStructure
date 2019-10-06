package comm;

import java.util.Stack;

/*
*
* 后序遍历，非递归
* */
public class Test3 {

    public static void test3(Node root){

        Stack<Node> stack=new Stack<>();
        Node cur=root;
        Node last=null;//last代表后序访问的那个结点，已经被访问过了
        while(!stack.isEmpty()||cur!=null){

            while(cur!=null){
                stack.push(cur);//第一次遇到该节点
                cur=cur.left;

            }
            Node node=stack.peek();//第二次遇到该节点，先不出栈，也不输出
            //该节点的右子树
            Node rightNode=node.right;
            if(rightNode==null){
                System.out.print(node.value);
                stack.pop();
                last=node;
            }else if(rightNode==last){//如果他的右子树已经被访问过了

                System.out.print(node.value);
                stack.pop();
                last=node;
            }else{//如果右子树不空，且没有被访问过

                cur=rightNode;//右子树
            }


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
        test3(root);

    }
}
