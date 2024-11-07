class JointFamily{
    int member = 17;
    void msg(){
        System.out.println("Total Member");
    }
}
class MyFamily extends JointFamily{
    int member = 5;
    int members = 12;
    void msg(){
        System.out.println("My Family Member");
    }
    void msg2(){
        System.out.println("Other Members");
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        MyFamily mf = new MyFamily();
        mf.msg();

        JointFamily jf = new JointFamily();
        jf.msg();

        MyFamily mf1 = new MyFamily();
        mf1.msg2();
    }
}
