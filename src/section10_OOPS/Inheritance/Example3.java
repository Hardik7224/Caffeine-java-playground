package section10_OOPS.Inheritance;

class Phone {
    private String phoneNumber;

    // No-Argument Constructor
    public Phone() {
        System.out.println("Phone No-Argument Constructor");
    }

    // All-Argument Constructor
    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void audioCall() {
        System.out.println("Making Call With Phone");
    }

    public void text() {
        System.out.println("Sending Text With Phone");
    }
}

class SmartPhone extends Phone {
    private String macId;
    private int ram;
    private int rom;

    // No-Argument Constructor
    public SmartPhone() {
        super();
        System.out.println("SmartPhone No-Argument Constructor");
    }
    // All-Argument Constructor
    public SmartPhone(String phoneNumber, String macId, int ram, int rom) {
        super(phoneNumber);
        this.macId = macId;
        this.ram = ram;
        this.rom = rom;
    }

    public void videoCall() {
        System.out.println("Making Video Call With SmartPhone");
    }

    public void chat() {
        System.out.println("Chatting Via SmartPhone");
    }
}

public class Example3 {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        SmartPhone apple = new SmartPhone(
                "7378736978", "A3264732F6GH", 16, 512
        );
    }
}
