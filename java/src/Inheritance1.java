import java.sql.SQLOutput;

class Animal {
    String sound() {
        return "Generic Sound";
    }
}
class Cat extends Animal {
    String sound() {
        return "Meow";
    }
}
public class Inheritance1 {
    public static void main (String Args[]) {
        Animal an = new Cat();
        System.out.println(an.sound());
    }
}
