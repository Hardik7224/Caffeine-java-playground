package section10_OOPS.Abstraction;

abstract class Shape
{
    public abstract float area();
    public abstract float perimeter();
}

class Circle extends Shape
{
    float radius;

    public Circle(float radius)
    {
        this.radius = radius;
    }

    @Override
    public float area() {

        return (float)(Math.PI * Math.pow(radius,2));
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }
}

class Rectangle extends Shape
{
    float length;
    float breadth;

    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public float area()
    {
        return length * breadth;
    }

    public float perimeter()
    {
        return  2 * (length +  breadth);
    }
}

public class Example6 {
    public static void main(String[] args) {
        System.out.println("Circle Shape : ");
        Shape instance = new Circle(10);
        float a = instance.area();
        float p = instance.perimeter();

        System.out.println(a);
        System.out.println(p);

        System.out.println("Rectangle Shape : ");
        instance = new Rectangle(12,18);
        a = instance.area();
        p = instance.perimeter();

        System.out.println(a);
        System.out.println(p);
    }
}