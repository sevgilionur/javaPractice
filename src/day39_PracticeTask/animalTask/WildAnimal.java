package day39_PracticeTask.animalTask;

public class WildAnimal extends Animal{

    public final static boolean isWild = true;
    public final static boolean isFriendly= false;
    public final static boolean isPlayable= false;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
Variable:
isWild, isFriendly, isPlayable
Extra Methods:
hunt()
 */