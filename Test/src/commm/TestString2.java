package commm;

public class TestString2 {

    public static void main(String[] args) {

        String str1="qwe";
        String str2=new String("qwe").intern();
        System.out.println(str1==str2);//true
    }
}
