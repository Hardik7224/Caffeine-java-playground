package section10_OOPS.Inheritance;

class Superclass
{
    public void method1()
    {
        System.out.println("Method-1 Of SuperClass");
    }

    public void method2()
    {
        System.out.println("Method-2 Of SuperClass");
    }
}

class SubClass extends Superclass
{
    public void method3()
    {
        System.out.println("Method-3 Of SubClass");
    }

    @Override
    public void method2()
    {
        System.out.println("Method-2 Of SubClass");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Superclass super1 = new Superclass();

        SubClass sub1 = new SubClass();

        sub1.method1();
        sub1.method2();
        sub1.method3();
    }
}