package section10_OOPS.Abstraction;

abstract class Super2
{
    public Super2()
    {
        System.out.println("Constructor Of Super2 Class");
    }

    public void method1()
    {
        System.out.println("Method-1 Of Super2 Class");
    }

    abstract public void method2();
}

class Sub2 extends Super2
{
    public void method2()
    {
        System.out.println("Method-2 Of Sub2 Class");
    }

    public void method3()
    {
        System.out.println("Method-3 Of Sub2 Class");
    }
}

public class Example3 {
    public static void main(String[] args) {
        // Child Can Hold The Object Of Child
        Sub2 sub = new Sub2();
        sub.method1();
        sub.method2();
        sub.method3();

        // Parent Can Hold The Object Of Child
        Super2 sup = new Sub2();
        sup.method1();
        sup.method2();
    }
}