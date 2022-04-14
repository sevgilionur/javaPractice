package day39_PracticeTask.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public final void fly(){
        System.out.println(getAge() + " is flying");
    }

    public final void sing(){
        System.out.println(getName() + " is singing");
    }
}
/*
4. Parrot:
Extra methods:
fly()
sing()
 */