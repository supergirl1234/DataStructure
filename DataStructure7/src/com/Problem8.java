package com;


/*小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。*/

import java.util.Scanner;

/*思路：根据8的余数来判断；
*
* 如果苹果个数为奇数，肯定无法购买，返回-1；
*
* 苹果数对8取模，其结果只可能为0,2,4,6。若余数为6或者0，则可以直
接用6包装情况处理，不需要回溯购买8包装
若余数为4，只需回溯1次即可，因为8+4=12, 12%6 =
0。若余数为2，只需回溯2次即可，因为8+8+2=18, 18%6=3
* */
public class Problem8 {

    public static int numNeed(int num){

        /*如果苹果个数为奇数，返回-1*/
        if(num%2!=0||num==10||num<6){

            return  -1;
        }

        /*如果为偶数,根据情况判断*/
        /*如果苹果个数为偶数，则num/8的余数只能是0，2，4，6*/

     /*   if(num%8==0){
            return  num/8;

        }else if(num%8==2){
            *//*需要把两袋为8的拆开，加上剩下的2个苹果，用数量为6的袋子装*//*
            return  num/8-2+(2*8+2)/6;// 相当于return  num/8+1;

        }else  if(num%8==4){
            *//*需要把一袋为8的拆开，加上剩下的4个苹果，用数量为6的袋子装*//*
            return  num/8-1+(8+4)/6;// 相当于return  num/8+1;

        }else if(num%8==6){

            return  num/8+1;

        }

*/

        if(num%8==0){
            return  num/8;

        }else {

            return  num/8+1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer str = scanner.nextInt();
        int result=numNeed(str);
        System.out.println(result);
    }
}
