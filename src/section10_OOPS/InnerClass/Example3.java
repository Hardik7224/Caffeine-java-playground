package section10_OOPS.InnerClass;

abstract class My {
    public abstract void display();
}

class Outer3 {
    int x = 12;

    public void method1()
    {
        int y = 100;

        My instance = new My()
        {
            public void display()
            {
                System.out.println(x);
                System.out.println(y);
                // y++; // y is effectively final
                System.out.println("Hello People");
            }
        };

        instance.display();
    }
}

public class Example3 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method1();
    }
}
