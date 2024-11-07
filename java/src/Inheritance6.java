
class BaseClass {
    int x = 30;
    void msg(){
        System.out.println("Abhi");
    }
}
class ChildClass extends BaseClass{
    int x = 40;
    int y = 70;
    void msg(){
        System.out.println("Abhijit");
    }
    void msg2(){
        System.out.println("Mohanty");
    }
}
public class Inheritance6 extends ChildClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        System.out.println("value of x: "+cc.x);

        cc.msg();
        cc.msg2();

        BaseClass cc2 = new ChildClass();
        System.out.println("value of x: " +cc2.x);

        cc2.msg();
    }
}
