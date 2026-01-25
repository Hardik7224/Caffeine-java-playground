package section10_OOPS.Encapsulation;

class Triangle
{
    // Fields
    public float a;
    public float b;
    public float c;

    // Member Functions
    public float perimeter()
    {
        float p = a + b + c;
        return p;
    }

    public float area()
    {
        float s = perimeter() / 2;
        float res =  (float)Math.sqrt(s * (s-a) * ( s-b) * (s-c));
        return res;
    }

}

public class Example4
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle();
        t1.a = 10;
        t1.b = 12;
        t1.c = 13;

        System.out.println("Perimeter : " + t1.perimeter());
        System.out.println("Area : " + t1.area());
    }
}