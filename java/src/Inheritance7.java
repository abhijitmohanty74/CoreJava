class Abhi{
    void show(){
        System.out.println("I Love Cricket");
    }
}
class Abhijit extends Abhi{
    @Override
    void show(){
        System.out.println("I Am a Wicket keeper");
    }
}
public class Inheritance7 {
    public static void main(String[] args) {
        Abhi a = new Abhi();
        a.show();

        Abhi a1 = new Abhijit();
        a1.show();
    }
}
