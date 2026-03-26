package section10_OOPS.Abstraction;

abstract class KFC
{
    public KFC()
    {
        System.out.println("KFC Constructor Called");
    }

    void makeItem()
    {
        System.out.println("Preparing KFC Chicken");
    }

    abstract void billing();
    abstract void offer();
}

class MyKFC extends KFC
{
    public MyKFC()
    {
        super();
        System.out.println("MyKFC Constructor Called");
    }

    @Override
    void billing() {
        System.out.println("Billing");
    }

    @Override
    void offer() {
        System.out.println("Wednesday Offer At MyFKC");
    }

    public void notifyNgpPeople()
    {
        System.out.println("Nagpur People Special Offer");
    }
}

public class Example5 {
    public static void main(String[] args) {
        // Child Can Hold The Object Of Child
        System.out.println("MyKFC Object : ");
        MyKFC myKFC = new MyKFC();
        myKFC.makeItem();
        myKFC.offer();
        myKFC.billing();
        myKFC.notifyNgpPeople();

        // Parent Can Hold The Object Of Child
        System.out.println("Parent Holding The Object Of Child");
        KFC instance = new MyKFC();
        instance.makeItem();
        instance.offer();
        instance.billing();
    }
}