package section10_OOPS.Encapsulation;
/*
this keyword --> this is a reference variable that refers to the current object of the class.
It is used inside non-static methods and constructors.

// Importance Of this keyword:
 1. this keyword is available inside the class.
 2. It holds the address of current object (for which constructor or method is being called).
 3. with the help of this keyword we can access the properties and methods of an object.
 4. We can not access the 'this' keyword outside a class.
*/

class MyCylinder
{
    // Data Part
    private float radius;
    private float height;

    // Constructors

    // No-Argument Constructor
    public MyCylinder() {
        radius = 100.0f;
        height = 180.0f;
    }

    // One-Argument Constructor
    public MyCylinder(float length) {
        radius = length;
        height = length;
    }

    // All-Argument Constructor
    public MyCylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter and Setter Methods
    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        if (r > 0)
            radius = r;
        else
            radius = 0;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float h) {
        if (h > 0)
            height = h;
        else
            height = 0;
    }

    // Member Functions
    public float lidArea() {
        float lid = (float)(Math.PI * radius * radius);
        return lid;
    }

    public float totalSurfaceArea() {
        float tsa = (float)(2 * lidArea() + 2 * Math.PI * radius * height);
        return tsa;
    }

    public float volume() {
        float v = (float)(Math.PI * Math.pow(radius, 2) * height);
        return v;
    }

    public void display() {
        System.out.println("Display Method Of MyCylinder Class");
        System.out.println("Height = " + this.height);
        System.out.println("Radius = " + this.radius);
        System.out.println("Lid Area = " + this.lidArea());
        System.out.println("Total Surface Area = " + this.totalSurfaceArea());
        System.out.println("Volume = " + this.volume());
    }
}

public class Example7 {
    public static void main(String[] args) {
        MyCylinder cylinder = new MyCylinder(100, 800);
        cylinder.display();
    }
}
