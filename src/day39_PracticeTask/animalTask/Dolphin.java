package day39_PracticeTask.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public final void swim(){
        System.out.println(getName() + " is swimming");
    }
}
/*
3. Dolphin:
Extra methods:
swim()
 */