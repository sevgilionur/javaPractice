package day36_PracticeTask.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefence(){
        System.out.println("You can use " + brand + " " + model + " for self-defencing");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
 1.4 Create a sub class of Phone named Nokia:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        selfDefense()
        toString()

 */