package section10_OOPS.Abstraction;

interface IMember
{
    void callback();
    boolean isPremiumMember();
}

class Store
{
    int count = 0;
    IMember[] members = new Customer[10];

    public void register(IMember member)
    {
        members[count] = member;
        count++;
    }

    public void notifyPremiumCustomers()
    {
        for (int i=0; i < count; i++)
        {
            // Notifying Only Premium Customers
            if(true == members[i].isPremiumMember())
            {
                members[i].callback();
            }
        }
    }

}

class Customer implements IMember
{
    String name;
    String email;
    String phoneNumber;
    boolean isPremiumMember;

    Customer(String name, String email, String phoneNumber, boolean isPremiumMember)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isPremiumMember = isPremiumMember;
    }

    @Override
    public void callback()
    {
        System.out.println("Okay!, I Will Visit Store, " + name);
    }

    @Override
    public boolean isPremiumMember()
    {
        return this.isPremiumMember;
    }
}

public class Example11 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Prabhas", "prabhas@gmail.com", "7378736964",true);
        Customer customer2 = new Customer("Vijay", "thalapativijay@gmail.com","9423115052",false);
        Customer customer3 = new Customer("Arjun", "alluarjun@gmail.com","7874782378",true);
        Customer customer4 = new Customer("john","john@gmail.com","9867542378",false);

        Store store = new Store();

        store.register(customer1);
        store.register(customer2);
        store.register(customer3);
        store.register(customer4);

        store.notifyPremiumCustomers();

    }
}