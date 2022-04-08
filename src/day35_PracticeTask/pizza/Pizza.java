package day35_PracticeTask.pizza;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if( !(size.equalsIgnoreCase("Small") || !(size.equalsIgnoreCase("Medium") || !(size.equalsIgnoreCase("Large"))))){
            System.out.println("Invalid Size");
            System.exit(1);
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.out.println("Invalid numberOfCheeseTopping " + numberOfCheeseTopping);
            System.exit(1);
        }
        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if(numberOfPepperoniTopping < 0){
            System.out.println("Invalid numberOfPepperoniTopping " + numberOfPepperoniTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("Small") && numberOfPepperoniTopping <= 4) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("Medium") && numberOfPepperoniTopping <= 5){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("Large") && numberOfPepperoniTopping <= 6){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else{
            System.out.println("Invalid numberOfPepperoniTopping " + numberOfPepperoniTopping );
        }
    }

    public int calcCost(){
        int cost = 0;
        int costNumberOfTopping = 2;

        if(size.equalsIgnoreCase("small") ){
            cost = 10;
        }else if(size.equalsIgnoreCase("medium")){
            cost = 12;
        }else{
            cost = 14;
        }
        return costNumberOfTopping * (numberOfCheeseTopping + numberOfPepperoniTopping) + cost;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost= $" + calcCost() +
                '}';
    }
}
/*
5. Pizza Task:
5.1 Create class named Pizza:
private variables:
    size, numberOfCheeseTopping,numberOfPepperoniTopping
Encapsulate all the fields
Conditions:
size of the pizza can only be small, medium, large. case insensitive
Number of cheese topping can not be negative, the maximum number of cheese topping is:
    small: 3
    medium: 4
    large: 5
Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
    small: 4
    medium: 5
    large: 6
Add a constructor that allows user to set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcCost(): returns the totalCost of the pizza
toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
Pizza cost is determined by:
    S: $10 + $2 per topping
    M: $12 + $2 per topping
    L: $14 + $2 per topping
 */