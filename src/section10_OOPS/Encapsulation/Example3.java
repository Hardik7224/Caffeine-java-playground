package section10_OOPS.Encapsulation;
class Circle
{
    // Properties
    public float radius;

    // Behavior
    public float perimeter()
    {
        float p = (float) (2 *  Math.PI * radius);
        return p;
    }

    public float area()
    {
        float a = (float) (Math.PI * Math.pow(radius,2));
        return a;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 112.13f;

        float a = c1.area();
        float p = c1.perimeter();

        System.out.println("Area : " + a);
        System.out.println("Perimeter : " + p);
    }
}