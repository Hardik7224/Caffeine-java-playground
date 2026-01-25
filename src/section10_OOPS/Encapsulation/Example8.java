package section10_OOPS.Encapsulation;

// Constructor Chaining
class SampleTest1
{
    public SampleTest1()
    {
        System.out.println("No-Argument Constructor Of SampleTest Class");
    }

    public SampleTest1(int x)
    {
        this();   // calls no-argument constructor
        System.out.println(x);
    }

    public SampleTest1(int x, int y)
    {
        this(x);  // calls one-argument constructor
        System.out.println(x);
        System.out.println(y);
    }

    public SampleTest1(String name)
    {
        this();   // calls no-argument constructor
        System.out.println(name);
    }
}

public class Example8 {
    public static void main(String[] args)
    {
        SampleTest1 t1 = new SampleTest1();
        SampleTest1 t2 = new SampleTest1(12);
        SampleTest1 t3 = new SampleTest1(13, 10);
        SampleTest1 t4 = new SampleTest1("When there is a will there's a way");
    }
}
