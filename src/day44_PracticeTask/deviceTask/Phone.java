package day44_PracticeTask.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+ " calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+ " texting "+ phoneNumber);
    }

}
/*
2. Create a child abstract class of Device named Phone:
Extra Methods (none Abstract):
call(longphoneNum)
text(longphoneNum)
toString()
 */