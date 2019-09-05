package com;

/*找两个节点最近的祖先*/
public class LowCommonAncester {

    public static Node lowCommonAncester(Node head,Node p,Node q){
        if(p==head||q==head){
            return  head;
        }

        boolean leftp=find(head.left,p);//
        boolean leftq=find(head.left,q);
        if(leftp&&leftq){//都在左子树上

            lowCommonAncester(head.left,p,q);
        }
        if (!leftp&&!leftq){//都在右子树上
            lowCommonAncester(head.right,p,q);
        }

            return  head;


    }

    private static boolean find(Node head, Node p) {

        if(head==null){
            return  false;

        }
        if(p==head){

            return  true;
        }
        boolean result=find(head.left,p);
        if(!result){
           result= find(head.right,p);

        }

        return  result;
    }

    public static void main(String[] args) {

    }
}
