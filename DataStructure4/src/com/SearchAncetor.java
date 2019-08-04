package com;


//找两个结点的最近的公共祖先
public class SearchAncetor {

    /*在树上查找结点*/
    public static Node searchLeftORRight(Node root,Node p){

        if(root==null){

            return null;
        }
        if(root==p){
            return root;

        }
        Node node=searchLeftORRight(root.left,p);
        if(node!=null){
            return node;

        }
        node=searchLeftORRight(root.right,p);
        if(node!=null){
            return node;

        }
        return null;

    }

    public static Node searchAncestor1(Node root,Node p1,Node p2){

        if(p1==root||p2==root){
            return root;

        }
      Node node1=searchLeftORRight(root.left,p1);
      Node node2=searchLeftORRight(root.right,p2);
      if((node1!=null&&node2!=null)||(node1==null&&node2==null)){  /*如果两个结点分在再树的左子树和右子树上，则最近祖先为root*/

          return root;
      }
       if(node1!=null&&node2==null){/*如果两个结点都在树的左子树上，则在左子树上查找*/

          return searchAncestor1(root.left,p1,p2);
      }
      if(node1==null&&node2!=null){/*如果两个结点都在树的右子树上，则在左子树上查找*/

          return searchAncestor1(root.right,p1,p2);
      }

        return null;
    }


    public static Node searchAncestor2(Node root,Node p1,Node p2){

        if(p1==root||p2==root){
            return root;

        }


        /*判断结点在树的左子树上还是右子树上*/

        Node node1=searchLeftORRight(root.left,p1);
        Node node2=searchLeftORRight(root.left,p2);
        if(node1!=null&&node2!=null){ /*如果两个结点都在树的左子树上，则在左子树上查找*/

            return searchAncestor2(root.left,p1,p2);
        }else if(node1==null&&node2==null){/*如果两个结点都在树的右子树上，则在左子树上查找*/

            return searchAncestor2(root.right,p1,p2);

        }else{ /*如果两个结点分在再树的左子树和右子树上，则最近祖先为root*/

            return  root;
        }

    }
    public static void main(String[] args) {

        Node root = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');




        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        D.left = G;
        E.right = H;
       // Node re=searchAncestor1(root,D,G);
        //Node re=searchAncestor1(root,D,H);
        Node re=searchAncestor2(root,D,H);

        System.out.println(re.value);

    }
}
