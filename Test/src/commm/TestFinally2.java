package commm;

class Person{
    public int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class TestFinally2 {
    public static Person test() {
        Person person = new Person();
        try {
            person.age = 1;
            return person;
        }catch (Exception e) {
            person.age = 2;
            return person;
        }finally {
            person = new Person();
            person.age = 3;
            return person;
        }
    }
    public static void main(String[] args) {
        // A.0 B.1 C.2 D.3
        System.out.println(test().age);
    }
}
