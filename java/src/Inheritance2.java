class Base {
    static void display() {
        System.out.println("Base display()");
    }
}
class Derived extends Base {
    static void display() {
        System.out.println("Derived display()");
    }
}
public class Inheritance2 {
    public static void main(String args[]) {
        Base obj = new Derived();
        obj.display();
    }
}
