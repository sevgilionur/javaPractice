package day44_PracticeTask.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla",2020,30000,"White");

        Honda honda = new Honda("Civic",2019,20000,"Black");

        BMW bmw = new BMW("3.20i",2020,50000,"Gray");

        Audi audi = new Audi("S5",2018,30000,"Dark Blue");

        Mercedes mercedes = new Mercedes("E220",2022,80000,"Black");

        Tesla tesla = new Tesla("ModelS",2021,70000,"Black");

        Nio nio = new Nio("XR3",2020,80000,"Blue");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(nio);

        System.out.println("------------------------------------------");

        honda.start();
        honda.stop();

        mercedes.autoPark();

        tesla.selfDrive();
        tesla.autoPark();

        nio.selfDrive();
        nio.autoPark();









    }

}
