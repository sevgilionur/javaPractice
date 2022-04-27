package day44_PracticeTask.deviceTask;

public class ElectronicShop {

    public static void main(String[] args) {

        Samsung samsung = new Samsung("S20",700,"White","Large",true , false);

        Iphone iphone = new Iphone("13 Pro",900,"Black","Large",true, false);

        Laptop laptop= new Laptop("Apple","MacBook Pro",1200,"Gray","Large", true, true);

        Desktop desktop = new Desktop("HP","Pavilion",900,"Black","Medium", false, true);

        PersonalComputer personalComputer = new PersonalComputer("Apple","iMac Studio",1700, "Purple","Large", false,true);


        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(laptop);
        System.out.println(desktop);
        System.out.println(personalComputer);

        samsung.turnOn();
        samsung.turnOff();

        iphone.text(333245678);
        System.out.println(iphone.isHasBattery());









    }
}
