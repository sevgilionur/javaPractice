package day44_PracticeTask.carTask;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " has self drinig mode");
    }

    @Override
    public void start() {
        System.out.println("Show your face to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("The most comfortable car to drive");
    }

    @Override
    public void fly() {
        System.out.println("You can fly and drive with " +getModel());
    }
}
