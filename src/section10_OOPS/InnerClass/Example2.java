package section10_OOPS.InnerClass;

class Outer2
{
    int x = 12;
    static int y = 10;

    // Outside of display method inner class is not visible
    void display()
    {
        System.out.println("Display method of Outer Class");

        class Inner2
        {
            int z = 17;

            void display()
            {
                System.out.println("Display method Of Local Inner Class");
                System.out.println(x);
                System.out.println(y);
            }
        }

        Inner2 inner = new Inner2();
        inner.display();
    }

}

public class Example2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.display();
    }
}
