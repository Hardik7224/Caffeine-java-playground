package section10_OOPS.Encapsulation;
/*
Getters and setters are methods used to access (get) and modify (set) the private data members of a class.
They are a key part of Encapsulation in Object-Oriented Programming (OOP).
 */

class MyTelevision
{
    private String brandName;
    private int channelNumber;
    private  int volume;
    private boolean isOn;

    public void turnOnOff() {
        isOn = !isOn;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brand) {
        brandName = brand;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

public class Example5
{
    public static void main(String[] args)
    {
        MyTelevision television = new MyTelevision();
        television.setBrandName("Samsung");

        // Turn ON the TV
        television.turnOnOff();

        if (television.isOn()) {
            television.setVolume(10);
            television.setChannelNumber(3);
        }

        System.out.println("Brand: " + television.getBrandName());
        System.out.println("TV ON? " + television.isOn());
        System.out.println("Channel: " + television.getChannelNumber());
        System.out.println("Volume: " + television.getVolume());

        // Turn OFF the TV
        television.turnOnOff();
        System.out.println("TV ON? " + television.isOn());
    }
}