import java.sql.SQLOutput;

class A {
    int i = 32;
}
class B extends A {
    int i = 23;
}
public class Inheritance5 {
    public static void main(String[] args) {
        A an = new B();
        System.out.println(an.i);
    }
}