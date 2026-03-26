package section10_OOPS.Abstraction;

abstract class Hospital
{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
    abstract void discharge();
}

class MerryHospital extends Hospital
{

    @Override
    void emergency() {
        System.out.println("Merry Hospital Emergency");
    }

    @Override
    void appointment() {
        System.out.println("Merry Hospital Appointment");
    }

    @Override
    void admit() {
        System.out.println("Merry Hospital Admit");
    }

    @Override
    void billing() {
        System.out.println("Merry Hospital Billing");
    }

    @Override
    void discharge() {
        System.out.println("Merry Hospital Discharge");
    }
}

class AlexisHospital extends Hospital
{

    @Override
    void emergency() {
        System.out.println("Alexis Hospital Emergency");
    }

    @Override
    void appointment() {
        System.out.println("Alexis Hospital Appointment");
    }

    @Override
    void admit() {
        System.out.println("Alexis Hospital Admit");
    }

    @Override
    void billing() {
        System.out.println("Alexis Hospital Billing");
    }

    @Override
    void discharge() {
        System.out.println("Alexis Hospital Discharge");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Hospital h = new MerryHospital();

        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
        h.discharge();

        h = new AlexisHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
        h.discharge();
    }
}