package day44_PracticeTask.carTask;

public final class BMW extends Car {

    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start/stop button");
    }

    @Override
    public void drive() {
        System.out.println("You can drive in safe, no worry");
    }
}
