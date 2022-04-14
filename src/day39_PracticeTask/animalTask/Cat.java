package day39_PracticeTask.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public final void scratch(){
        System.out.println(getAge() + " is scratching");
    }

    public final void meow(){
        System.out.println(getName() + " is meowing");
    }

}
/*
2. Cat:
Extra methods:
scratch()
meow()
 */