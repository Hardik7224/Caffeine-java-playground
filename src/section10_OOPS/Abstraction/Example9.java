package section10_OOPS.Abstraction;
/*
====================================================|
                INTERFACE IN JAVA                   |
====================================================|
                                                    |
🔷 Definition:                                      |
----------------------------------------------------|
An interface in Java is a reference type that       |
contains abstract methods (without body) and        |
constants, used to achieve abstraction and          |
multiple inheritance.                               |
                                                    |
🔑 Key Points:                                      |
----------------------------------------------------|
✔ Methods are by default public and abstract        |
✔ Variables are public static final (constants)     |
✔ Cannot create objects of an interface             |
✔ A class uses 'implements' to inherit interface    |
✔ Supports multiple inheritance                     |
                                                    |
🎯 One-line Definition:                             |
----------------------------------------------------|
An interface is a blueprint of a class that         |
contains only abstract methods and constants.       |
                                                    |
====================================================|
*/

interface ParentTest2
{
    void method1();
    void method2();
}

class ChildTest2 implements ParentTest2
{
    @Override
    public void method1() {
        System.out.println("Method-1 Of ChildTest2 Class");
    }

    @Override
    public void method2() {
        System.out.println("Method-2 Of ChildTest2 Class");
    }

    public void method3()
    {
        System.out.println("Method-3 Of ChildTest3 Class");
    }
}

public class Example9
{
    public static void main(String[] args)
    {
        ChildTest2 instance1 = new ChildTest2();
        instance1.method1();
        instance1.method2();
        instance1.method3();

        ParentTest2 instance2 = new ChildTest2();
        instance2.method1();
        instance2.method2();
    }
}