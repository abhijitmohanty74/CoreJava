class D
{
    {
        System.out.println(1);
    }
}

class E extends D
{
    {
        System.out.println(2);
    }
}

class C extends E
{
    {
        System.out.println(3);
    }
}

public class Inheritance3
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}