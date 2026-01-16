package section9_Methods_And_Recursion;
// Method Overloading
public class Example5 {
    static int add(){
        return 12 + 13;
    }

    static int add(int x){
        return 12 + x;
    }

    static int add(int x, int y){
        return x+y;
    }

    static String add(String name){
        return name + "Win";
    }

    public static void main(String[] args)
    {
        int res = add();
        System.out.println(res);

        res = add(100);
        System.out.println(res);

        res = add(10,12);
        System.out.println(res);

        String data =  add("Text");
        System.out.println(data);
    }
}
