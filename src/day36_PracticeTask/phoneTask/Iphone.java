package day36_PracticeTask.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, String color, double price) {
        super("Apple",model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having face time calling with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having face time calling with " + email);
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
1.2 Create a sub class of Phone named IPhone:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()

 */