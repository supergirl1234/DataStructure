package com;


/*于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。

给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
*/

import java.util.Scanner;
import java.util.Stack;

/*思路：用栈*/
public class Problem7 {

    public static boolean isLegal(String str,int n) {


        if (str == null|| str.length()!=n) {
            return false;

        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));

            } else if (str.charAt(i) == ')') {

                if (stack.isEmpty()) {
                    return false;

                } else {

                    /*不空就出栈*/
                    stack.pop();
                }
            } else {

                /*如果不是( 或者 ）就false*/
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;

        } else {

            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n=scanner.nextInt();

        boolean result = isLegal(str,n);
        System.out.println(result);
    }
}
