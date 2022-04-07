package day12_PracticeTask;


import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = scan.nextLine();
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();
        System.out.println("Enter your name");
        String name = scan.next();

        scan.close();
        
        double totalPrice = quantity * price;

        System.out.println(name + ", your order for " + quantity + " " + productName +
                " has been placed.\nYour total is $" + totalPrice);
















    }
}
