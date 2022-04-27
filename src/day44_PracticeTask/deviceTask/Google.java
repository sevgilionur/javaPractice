package day44_PracticeTask.deviceTask;

public final class Google extends Phone implements Downloadable,AndroidApps{

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
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
1. Iphone :extends Phoneclass and implements Downloadable & AppleApps interfaces
2. Samsung:extends Phoneclass and implements Downloadable & AndroidApps interfaces
4. Google:extends Phoneclass and implements Downloadable & AndroidApps interfaces

 */