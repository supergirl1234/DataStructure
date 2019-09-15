package com;


import java.util.Scanner;

/*字符串中找出连续最长的数字串*/
public class Problem6 {

    public static String MaxLongStr(String str) {
        int max = 0;
        int end = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }else{
                count=0;
            }
            if (count > max) {

                max = count;
                end = i;
            }

        }

        return str.substring(end - max + 1, end + 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result=MaxLongStr(str);
        System.out.println(result);
    }
}
