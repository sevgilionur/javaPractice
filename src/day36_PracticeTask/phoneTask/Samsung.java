package day36_PracticeTask.phoneTask;

public class Samsung extends Phone{

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(brand + " " + model + " is freezing");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        freeze()
        toString()

 */