package day44_PracticeTask.carTask;

public final class Tesla extends Car implements AutoPilot,AutoPark{

    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " has self drive feature");
    }

    @Override
    public void start() {
        System.out.println("Push the button to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("No worry "+ getModel() + " is driving by itself");
    }
}
