package day44_PracticeTask.carTask;

public final class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to start "+ getMake());
    }

    @Override
    public void drive() {
        System.out.println("It has drive assistant, relax in " + getMake());
    }
}
