package section10_OOPS.Abstraction;

// Dos And Don'ts Of Interfaces
interface Test1
{
    // 1. by default methods in interface are public and abstract
    public abstract void method1();
    void method2();

    // 2. Interface can not have private abstract methods
    // private void method3();


    // 3. Interfaces can have identifiers and these identifiers are static & final (Constant)
    int X = 10;

    // 4. Interface can have static concrete methods
    public static void method3()
    {
        System.out.println("Static Method Present Inside Interface Test1");
    }

    // 6. Interface can have default method from java 8 onwards
    default void method5()
    {
        System.out.println("Default Method-5");
    }

    // 7. Interface can have private concrete methods from java 9 onwards
    // default method will use the private method
    // private methods are useful only inside the interface
    private void method6()
    {
        System.out.println("Private Method In Interface");
    }
}

// 5. Interface can extend another interface
interface Test2 extends Test1
{
    void method4();
}

class MyTestImpl implements Test2
{
    @Override
    public void method1() {
        System.out.println("Method-1");
    }

    @Override
    public void method2() {
        System.out.println("Method-2");
    }

    @Override
    public void method4() {
        System.out.println("Method-3");
    }
}


public class Example12 {
    public static void main(String[] args) {
        System.out.println(Test1.X);
        Test1.method3();
    }
}