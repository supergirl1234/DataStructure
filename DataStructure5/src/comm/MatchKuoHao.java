package comm;


import java.util.Stack;

/*括号配对问题：使用栈实现*/
public class MatchKuoHao {


    public static boolean IsMatch(String str) {
        /*(、{、[  进栈，当碰到)、}、]时，栈中出一个元素，看其是否配对*/
        Stack<String> stack = new Stack<>();

        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            switch (s) {

                case "(":
                case "{":
                case "[":
                    /*入栈*/
                    stack.push(s);
                    break;
                case ")":
                case "]":
                case "}":
                    String os =stack.pop();
                    if ((s.equals(")") && os.equals("("))
                            || (s.equals("]") && os.equals("["))
                            || (s.equals("}") && os.equals("{"))) {
                        return true;

                    }
                    break;
                default:

            }
        }
        return false;


    }

    public static void main(String[] args) {
        //String str = "[(4+2)/（1+2）+2]/2";
        String str = "[(4+2/（1+2）+2]/2";
        boolean result=IsMatch(str);
        System.out.println(result);
    }
}
