package section10_OOPS.InnerClass;

/*
 * Inner class --> An inner class in Java is a class that is defined inside another class,
                   and it can access all the members (including private) of the outer class.

 *  Topics To Be Covered:
 *   Types Of Inner Class
 *      1. Nested Inner Class
 *      2. Local Inner Class
 *      3. Anonymous Inner Class
 *      4. static inner class

 *     We can define a class inside another class.
 *     Outer class can have an inner class inside that is also called as inner class.
 *     If you have a class and it is becoming very big and complex.
 *     To reduce the complexity of bigger class. you can define the class inside another class.
 *     We can also define interface inside.

 *     1. Nested Inner Class :
 *        a) Inner Class can access the members of outer class (It will be just like global variables for inner class)
 *        b) We can inner class by creating it's object inside inner class.
 *        c) Outer class can not access data members of inner class directly unless it has created the object of inner class.
 *        d) It is possible to create the object inner class outside of outer class but it is useless.
 *        e) For Every class in java, a separate compiled *.class is created, for inner class Outer$Inner.class file created.
 */

class Outer1
{
    int x = 12;

    class Inner1
    {
        int y = 17;

        public void display()
        {
            System.out.println("Inner Class : " + x);
            System.out.println("Inner Class : " + y);
        }
    }

    public void display()
    {
        Inner1 inner = new Inner1();
        inner.display();
    }
}

public class Example1 {
    public static void main(String[] args) {

        Outer1 outer = new Outer1();
        outer.display();

        Outer1.Inner1 inner1 = outer.new Inner1();
        inner1.display();

        Outer1.Inner1 inner2 = new Outer1().new Inner1();
        inner2.display();

    }
}