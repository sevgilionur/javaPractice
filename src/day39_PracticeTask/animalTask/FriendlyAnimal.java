package day39_PracticeTask.animalTask;

public class FriendlyAnimal extends Animal{

    public final static boolean isWild = false;
    public final static boolean isFriendly= true;
    public final static boolean isPlayable= true;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void play(){
        System.out.println("You can play with " + getName());
    }

    public void pet(){
        System.out.println("You can pet " + getName());
    }
}
/*
2. Create a subclass of Animal named FriendlyAnimal:
Variable:
isWild
isFriendly
isPlayable
Extra methods:
play()
pet()
 */