package section10_OOPS.Abstraction;
/*
Abstraction in Java is the process of hiding implementation details
and showing only the essential features of an object.
 */
class Super
{
    public Super()
    {
        System.out.println("Super Class Constructor Called");
    }

    public void method1()
    {
        System.out.println("Method-1 Of Super Class");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Super su = new Super();
        su.method1();
    }
}