package com;


import java.util.Scanner;

/*A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C*/
public class Problem1 {

    public static void main(String[] args) {

       float A,B,C;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入四个数");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();

        A=(a+c)/2f;
        B=(b+d)/2f;
        C=(d-b)/2f;

        /*判断求得的A、B、C是否都为整数，如果不是整数说明无解*/
        if((A-(a+c)/2)!=0){
            System.out.println("无解");
           return;
        }
        if((B-(b+d)/2)!=0){
            System.out.println("无解");
            return;
        }
        if((C-(d-b)/2)!=0){
            System.out.println("无解");
            return;
        }

        /*否则输出*/
        System.out.println("A="+(int)A+"  B="+(int)B+"  C="+(int)C);


    }
}
