package section10_OOPS.Encapsulation;
/*
====================================================|
            STATIC & FINAL KEYWORDS                 |
====================================================|
                                                    |
🔷 static keyword:                                  |
----------------------------------------------------|
static is a keyword in Java used to define members  |
(variables, methods, blocks) that belong to the     |
class rather than any specific object, and are      |
shared among all instances of that class.           |
                                                    |
🔶 final keyword:                                   |
----------------------------------------------------|
final is a keyword in Java used to restrict         |
modification:                                       |
                                                    |
✔ A final variable cannot be changed (constant)     |
✔ A final method cannot be overridden               |
✔ A final class cannot be inherited                 |
                                                    |
🎯 Key Difference:                                  |
----------------------------------------------------|
static → shared data                                |
final  → fixed data                                 |
====================================================|
*/

final class Utility {
    // static final variable (constant)
    static final double TAX = 0.18;

    // static method
    static void showTax() {
        System.out.println("Tax rate: " + TAX);
    }
}

class Student {

    int roll;
    String name;

    // static variable
    static String college = "ABC College";

    // constructor
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // static method
    static void changeCollege() {
        college = "XYZ College";
    }

    // final method
    final void showDetails() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class Example11 {
    public static void main(String[] args) {
        // using static method from final class
        Utility.showTax();

        // change static variable
        Student.changeCollege();

        // create objects
        Student s1 = new Student(1, "Adam");
        Student s2 = new Student(2, "Casey");

        // display details
        s1.showDetails();
        s2.showDetails();
    }
}