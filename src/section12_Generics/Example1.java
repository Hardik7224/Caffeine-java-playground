package section12_Generics;

class Person {
    String name;
}

public class Example1 {
    public static void main(String[] args) {

        Object instance = null;

        // 1. Person object
        instance = new Person();
        System.out.println(instance);

        Person person = (Person) instance;
        System.out.println(person.name);

        // 2. int array
        instance = new int[]{1,2,3,4,5,6};
        System.out.println(instance);

        int[] nums = (int[]) instance;
        System.out.println(nums[3]);

        // 3. String object
        instance = new String("String Instance");
        System.out.println(instance);

        String str = (String) instance;
        System.out.println(str.toLowerCase());
    }
}