package day44_PracticeTask.carTask;

public final class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has autoPark system");
    }

    @Override
    public void start() {
        System.out.println("Push the button to start");
    }

    @Override
    public void drive() {
        System.out.println("You can drive in safe");
    }
}
