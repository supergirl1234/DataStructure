package com;


import java.util.Scanner;

/*输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 */
public class Problem9 {



    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {

            char[] str1 = scanner.nextLine().toCharArray();
            String str2=scanner.nextLine();
            for(int i=0;i<str1.length;i++){

                if(!str2.contains(String.valueOf(str1[i]))){

                    System.out.print(str1[i]);
                }
            }
        }



    }
}
