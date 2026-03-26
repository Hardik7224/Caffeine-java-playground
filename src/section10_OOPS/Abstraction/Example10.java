package section10_OOPS.Abstraction;

class Phone {
    void call() {
        System.out.println("Making Call With Phone");
    }

    void sms() {
        System.out.println("Sending SMS With Phone");
    }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPLayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPLayer {
    public void videoCall() {
        System.out.println("VideoCall With SmartPhone");
    }

    @Override
    public void click() {
        System.out.println("Clicking Picture With SmartPhone");
    }

    @Override
    public void record() {
        System.out.println("Recording Video With SmartPhone");
    }

    @Override
    public void play() {
        System.out.println("Playing Music With SmartPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Music With SmartPhone");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Music With SmartPhone");
    }
}

public class Example10 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        s.videoCall();

        IMusicPLayer m = s;
        m.pause();
        m.play();
        m.stop();

        ICamera c = s;
        c.click();
        c.record();
    }
}