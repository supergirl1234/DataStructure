package com;


/*斐波那契数*/
public class Solution {
    public static int Fibonacci(int n) {

        if(n<=0){
            return 0;

        }
        if(n==1||n==2){

            return 1;
        }
        int f1=1;
        int f2=1;
        int result=0;
        for(int i=3;i<=n;i++){
            result=f1+f2;
            f1=f2;
            f2=result;
        }
        return f2;
    }

    public static void main(String[] args) {
       int result= Fibonacci(4);

        System.out.println(result);

    }
}