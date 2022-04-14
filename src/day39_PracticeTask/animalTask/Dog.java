package day39_PracticeTask.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public final void bark(){
        System.out.println(getName() + " is barking");
    }
}
/*
4. Create the following sub classes of FriendlyAnimal and Override
the eat method
1. Dog:
Extra methods:
bark()
 */