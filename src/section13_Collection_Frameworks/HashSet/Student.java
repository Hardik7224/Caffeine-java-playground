package section13_Collection_Frameworks.HashSet;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private char gender;

    Student(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender;
    }

    public static void main(String[] args) {
        Student s1 =  new Student(1, "Anuj",  'M');
        Student s2 =  new Student(2,"Mahak",'F');
        Student s3 =  new Student(3,"Hardik",'M');
        Student s4 =  new Student(4,"Vinayak",'M');
        Student s5 =  new Student(5,"Dev",'M');
        Student s6 =  new Student(6,"Nakul",'M');
        Student s7 =  new Student(7,"Shivam",'M');
        Student s8 =  new Student(8,"Vanshika",'F');
        Student s9 =  new Student(9,"Pranay",'M');
        Student s10 = new Student(10,"Samarth",'M');

        Set<Student> collection = new HashSet<>();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);
        collection.add(s5);
        collection.add(s6);                                           
        collection.add(s7);
        collection.add(s8);
        collection.add(s9);
        collection.add(s10);
        System.out.println(collection);
        System.out.println("Size: " + collection.size());
        System.out.println("Contains s1: " + collection.contains(s1));
        collection.remove(s2);
        System.out.println("After remove(s2): " + collection);
        System.out.println("Is empty: " + collection.isEmpty());
    }
}