package com;

/*：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？*/


//输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行

import java.util.Scanner;
public class Problem4 {


    public static int total(int num){


        int total=0;
        while(num>2){

            total=total+num/3;//num/3 表示可以换得的饮料
            num=num/3+num%3;//num%3表示换完饮料后还剩的空瓶子

        }
        if(num==2){//如果有两个空瓶，可以向商家借一瓶
            total=total+1;

        }
        return  total;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){

            int n=scanner.nextInt();
            if(n==0){

                break;
            }else{

                int result=total(n);
                System.out.println(result);
            }

        }
    }
}
