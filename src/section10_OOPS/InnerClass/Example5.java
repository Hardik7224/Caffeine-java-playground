package section10_OOPS.InnerClass;

class Outer5 {
    int x = 10;
    static int y = 12;

    static class Inner5 {
        public void display()
        {
            System.out.println("Hello People");
            System.out.println(y);
            method1();
        }
    }

    public static void method1() {
        System.out.println("Static Method Of Outer5");
    }

    public void method2() {
        System.out.println("Non-Static Method Of Outer5");
    }
}

public class Example5 {
    public static void main(String[] args) {
        Outer5.Inner5 inner5 = new Outer5.Inner5();
        inner5.display();
    }
}
