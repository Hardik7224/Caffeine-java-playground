package section10_OOPS.Polymorphism;
/*
 Polymorphism in Java is the ability of an object to take many forms,
 where a single method or object behaves differently in different situations.
 */

class Parent{
    public void method1(){
        System.out.println("Method 1 of Parent class");
    }
    public void method2(){
        System.out.println("Method 2 of Parent class");
    }
}

class Child extends Parent{
    public void method3(){
        System.out.println("Method 3 of Child class");
    }
    public void method4(){
        System.out.println("Method 4 of Child class");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method1();
        p.method2();
    }
}
