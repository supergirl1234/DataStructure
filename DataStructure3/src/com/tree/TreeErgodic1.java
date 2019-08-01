package com.tree;


/*树的遍历：前序、中序、后序
 * 递归遍历
 * */
public class TreeErgodic1 {



    /*前序*/
    public static void FrontErgodic(Node root) {

        /*先根结点，再左子树，再右子树*/

        if (root != null) {
            System.out.print(root.value + "");

            FrontErgodic(root.left);

            FrontErgodic(root.right);
        }
    }

    /*中序*/
    public static void MediumErgodic(Node root) {

        /*先左子树，再根结点，再右子树*/

        if (root != null) {
            FrontErgodic(root.left);
            System.out.print(root.value + "");

            FrontErgodic(root.right);
        }
    }

    /*后续*/
    public static void PostErgodic(Node root) {

        /*先左子树，再右子树，再根结点*/


        if (root != null) {
            FrontErgodic(root.left);

            FrontErgodic(root.right);
            System.out.print(root.value + "");
        }
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

        FrontErgodic(root);
        System.out.println();
        MediumErgodic(root);
        System.out.println();
        PostErgodic(root);

    }
}
