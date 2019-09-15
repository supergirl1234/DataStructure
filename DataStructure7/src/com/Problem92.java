package com;

import java.util.Scanner;

public class Problem92 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            String pattern="["+str2+"]";

            /*public String replaceAll(String regex, String replacement)   regex是正则表达式*/
            String result=str1.replaceAll(pattern,"");
            System.out.println(result);

        }
    }
}
