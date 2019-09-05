package commm;

public class TestString {

    public static void main(String[] args) {

        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        String str4=str1;

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true


        String p1=new String ("wei");
        String p2=new String ("wei");
        String p3=p1;
        System.out.println(p1==p2);//false
        System.out.println(p1==p3);//true

    }
}
