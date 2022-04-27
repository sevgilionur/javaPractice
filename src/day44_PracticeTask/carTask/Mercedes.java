package day44_PracticeTask.carTask;

public final class Mercedes extends Car implements AutoPark{

    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has auto park");
    }

    @Override
    public void start() {
        System.out.println("Push the button to start " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("You can drive in safe in "+getModel());
    }
}
