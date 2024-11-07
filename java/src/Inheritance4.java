class X
{
    String s = "Class A";
}

class Y extends X
{
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class Z extends Y
{
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Inheritance4
{
    public static void main(String[] args)
    {
        Z c = new Z();

        System.out.println(c.s);
    }
}