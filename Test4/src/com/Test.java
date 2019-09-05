package com;
public class Test {
    public static void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("函数中：a:"+a+"  b:"+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap1(a,b);
        System.out.println("主方法：a:"+a+"  b:"+b);
    }
}