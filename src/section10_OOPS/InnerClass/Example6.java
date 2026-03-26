package section10_OOPS.InnerClass;

class Outer {
    int x = 10;
    static int y = 100;

    static class Inner {
        public void display(Outer instance) {
            System.out.println(y);
            staticDisplay();

            System.out.println(instance.x);
            instance.nonStaticDisplay();
        }
    }

    public void nonStaticDisplay() {
        System.out.println("Display Method Of Outer Class");
    }

    public static void  staticDisplay() {
        System.out.println("Static Display Method Of Outer Class");
    }
}

public class Example6 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        Outer outer = new Outer();
        inner.display(outer);
    }
}