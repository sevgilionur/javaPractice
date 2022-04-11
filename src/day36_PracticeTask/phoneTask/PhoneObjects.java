package day36_PracticeTask.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 13", "Medium","Black", 900);
        Samsung samsung = new Samsung("S20","Large", "White", 750);
        Nokia nokia = new Nokia("N100", "Small", "Blue", 200);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.faceTime(555500151);
        iphone.call(555123123);
        samsung.freeze();
        nokia.selfDefence();


    }
}
