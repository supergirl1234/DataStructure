package com.comm;


import java.util.LinkedList;
import java.util.Queue;

/*层次遍历,用到队列*/
public class CengciReverse {

    public static void ceng(Node head){

        if(head==null){

            return;
        }
        Queue<Node> queue=new LinkedList<>();
          queue.add(head);

        while(!queue.isEmpty()){
            Node p=queue.poll();
            if(p!=null) {
                System.out.println(p.value);

                /*将左节点、右节点加入队列中*/
                if(p.left!=null){

                    queue.add(p.left);

                }
                if(p.right!=null){

                    queue.add(p.right);

                }
            }

        }


    }
}
