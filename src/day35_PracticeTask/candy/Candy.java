package day35_PracticeTask.candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanut;

    public Candy(String brand, int quantity, double price, boolean hasPeanut) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanut(hasPeanut);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Invalid quantity " + quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Invalid price " + price);
            System.exit(0);
        }
        this.price = price;
    }

    public boolean isHasPeanut() {
        return hasPeanut;
    }

    public void setHasPeanut(boolean hasPeanut) {
        this.hasPeanut = hasPeanut;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price == 0)? "free": price )+
                ", hasPeanut=" + hasPeanut +
                '}';
    }
}
/*
1. CandiesTask
1.1 Create a custom class named Candy
private variables:
brand (String), quantity (int), price (double),
hasPeanuts (boolean)
Encapsulate All the private fields
(price of candy can not be set to negative)
(quantity of candy can not be set to zero or
negative)
Add a constructor that allows user to set all the fields
when the object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
toString():
if the price is zero, print "free" instead of 0
 */