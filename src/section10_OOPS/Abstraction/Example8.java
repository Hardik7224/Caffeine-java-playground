package section10_OOPS.Abstraction;
/*
====================================================|
             ABSTRACT CLASS IN JAVA                 |
====================================================|
                                                    |
🔷 Definition:                                      |
----------------------------------------------------|
An abstract class in Java is a class that cannot    |
be instantiated and may contain both abstract       |
(methods without body) and concrete methods         |
(methods with body), used to achieve abstraction.   |
                                                    |
🔑 Key Points:                                      |
----------------------------------------------------|
✔ Cannot create objects of an abstract class        |
✔ Can have both abstract and non-abstract methods   |
✔ Can have constructors and variables               |
✔ Uses 'extends' keyword for inheritance            |
✔ Subclass must implement abstract methods          |
                                                    |
🎯 One-line Definition:                             |
----------------------------------------------------|
An abstract class is a class that contains abstract |
methods and is meant to be inherited by subclasses. |
                                                    |
====================================================|
*/

abstract class ParentTest1
{
    abstract public void method1();
    abstract public void method2();
}

class ChildTest1 extends ParentTest1
{
    @Override
    public void method1() {
        System.out.println("Method-1 Of ChildTest1 class");
    }

    @Override
    public void method2() {
        System.out.println("Method-2 Of ChildTest2 class");
    }

    public void method3()
    {
        System.out.println("Method-3 Of ChildTest2 Class");
    }
}

public class Example8 {
    public static void main(String[] args) {
        ChildTest1 instance1 = new ChildTest1();
        instance1.method1();
        instance1.method2();
        instance1.method3();

        ParentTest1 instance2 = new ChildTest1();
        instance2.method1();
        instance2.method2();

    }
}