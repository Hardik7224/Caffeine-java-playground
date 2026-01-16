package section9_Methods_And_Recursion;
/*
Variable Arguments (varargs) :
   Variable arguments allow a method to accept any number of arguments
   of the same data type using a single parameter.
Syntax:
     _________________________________________________
    | returnType methodName(dataType... variableName) |
    |_________________________________________________|
 Here ,the ... (three dots) means variable number of arguments.
 */

public class Example6 {
    void printNames(String...name)
    {
        for(String t :name)
        {
            System.out.println(t);
        }
    }

    public static void main(String...args)
    {
        Example6 instance = new Example6();

        instance.printNames();
        instance.printNames("Alice");
        instance.printNames("Kira","Tressy","Sara");
    }
}
