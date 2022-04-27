package day44_PracticeTask.deviceTask;

public final class Samsung extends Phone implements Downloadable,AndroidApps{


    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("You can download app from " + appStoreName);
    }

    @Override
    public void turnOn() {
        System.out.println("You can turn on " + getBrand()+" "+getModel() + " by pushing the power button");
    }

    @Override
    public void turnOff() {
        System.out.println("You can turn off " + getBrand()+" "+getModel() + " by pushing the power button");
    }
}
/*
7. Create the following subclasses of Phone and add any extra methods that are needed:

1. Iphone :extends Phoneclass and implements Downloadable & AppleApps interfaces
2. Samsung:extends Phoneclass and implements Downloadable & AndroidApps interfaces
4. Google:extends Phone class and implements Downloadable & AndroidApps interfaces
8. Create the following sub classes of Computer and add any extramethods that are needed:
 */