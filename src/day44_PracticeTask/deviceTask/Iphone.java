package day44_PracticeTask.deviceTask;

public final class Iphone extends Phone implements Downloadable,AppleApps{

    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
/*
7. Create the following subclasses of Phone and add any extra methods that are needed:

1. Iphone :extends Phoneclass and implements Downloadable & AppleApps interfaces
2. Samsung:extends Phoneclass and implements Downloadable & AndroidApps interfaces
4. Google:extends Phoneclass and implements Downloadable & AndroidApps interfaces
8. Create the following sub classes of Computer and add any extramethods that are needed:
 */