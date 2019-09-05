package com;

/*树中节点个数*/
public class Count {

    private static int count = 0;
    // 用遍历的思想解决这个问题
    private static void countByTraversal(Node root) {
        if (root != null) {
            count++;
            countByTraversal(root.left);
            countByTraversal(root.right);

        }

    }
    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;
        countByTraversal(a);
        System.out.println(count);
   }

}
