package day44_PracticeTask.carTask;

public final class Nio extends Car implements AutoPark,AutoPilot{

    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " has self drive feature");
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has auto park feature");
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" to start the car");
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " can drive itself");
    }
}
