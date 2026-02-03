package section10_OOPS.Inheritance;

class Circle {
    private float radius;

    public Circle() {
        this.radius = 10.0f;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float area() {
        float a = (float) (Math.PI * Math.pow(this.radius, 2));
        return a;
    }

    public float perimeter() {
        float p = (float) (2 * Math.PI * this.radius);
        return p;
    }
}

class Cylinder extends Circle {
    private float height;

    public Cylinder() {
        super();
        this.height = 98;
    }

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float volume() {
        float v = (float) (Math.PI * Math.pow(this.getRadius(), 2) * this.height);
        return v;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(12, 100);

        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.volume());
    }
}
