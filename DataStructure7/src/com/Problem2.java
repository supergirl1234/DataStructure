package com;

import java.util.Scanner;

/*将字符串B插入字符串A使产生的字符串是一个回文串,寻找有多少种插入办法可以使新串是一个回文串*/
/*输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数*/
public class Problem2 {


    /*
    * 判断一个字符串是否是回文字符串
    * */

    public static boolean isHuiWen(String str){


        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){

                start++;
                end--;

            }else{

                return  false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("请输入两个字符串：");
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();

        int count=0;
        for(int i=0;i<str1.length();i++){
           /* String str=str1.substring(0,i)+str2+str1.substring(i,str1.length());

            if(isHuiWen(str)){

                count++;
            }*/

           /*这样写比上面那段效率更高*/
          StringBuilder sb=new StringBuilder(str1);
          sb.insert(i,str2);
            if(isHuiWen(sb.toString())){

                count++;
            }

        }

        System.out.println(count);
    }
}
