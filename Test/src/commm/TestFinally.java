package commm;

public class TestFinally {

    public static int print() {

        int a=10;
        try{
            a=11;
            return a;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            a=12;
            return a;
        }
    }


    public static int print2() {
        int a = 10;
        try {
           a = 11;
           return a;
       }catch (Exception e) {
           a = 12;

           return  a;
       }finally {
           a = 13;
           return a;
       }

   }
    public static void main(String[] args) {

        System.out.println(print());
        System.out.println(print2());

    }
}
