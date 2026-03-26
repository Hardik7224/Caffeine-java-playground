package section10_OOPS.InnerClass;

interface IMy {
    public void display();
}

public class Example4 {
    public static void main(String[] args) {
        IMy instance1 = new IMy()
        {
            @Override
            public void display() {
                System.out.println("Hello Java Virtual Machine");
            }
        };

        instance1.display();


        IMy instance2 = new IMy() {
            @Override
            public void display() {
                System.out.println("Hello Anonymous Inner Class");
            }
        };

        instance2.display();
    }
}