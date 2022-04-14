package day39_PracticeTask.animalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Şiva", "Pomeranian", "Small", "Yellow", 'F', 5);
        Cat cat = new Cat("Müezza", "Scottish", "Small", "Grey", 'F',1);
        Dolphin dolphin = new Dolphin("Doli", "Striped", "Large","Grey&White",'M',8);
        Parrot parrot = new Parrot("Pari", "Queen","Small", "Mixed",'M',4);

        Lion lion = new Lion("Lionell","Masai","Large", "Yellow", 'M',9);
        Tiger tiger = new Tiger("Timber","Bengal","Large","White",'F',7);
        Eagle eagle = new Eagle("Eager","Golden","Medium","Mixed",'M',5);
        Bear bear = new Bear("Teddy","Polar","Large","White",'F',11);
        Python python = new Python("Pythy","Pet Ball","Large","White",'M',4);
        Crocodile crocodile = new Crocodile("Croky","Nile","Large","Green",'M',7);


        ArrayList<FriendlyAnimal> friendlyAnimals = new ArrayList<>();
        friendlyAnimals.addAll(Arrays.asList(dog,cat,dolphin,parrot));

        ArrayList<WildAnimal> wildAnimals = new ArrayList<>();
        wildAnimals.addAll(Arrays.asList(lion,tiger,eagle,bear,python,crocodile));

        System.out.println(friendlyAnimals);

        System.out.println("---------------------------------------------------");

        System.out.println(wildAnimals);

        dog.bark();
        cat.meow();
        cat.scratch();
        dolphin.swim();
        parrot.sing();

        System.out.println("---------------------------------------------------");

        lion.hunt();
        tiger.hunt();
        eagle.hunt();
        bear.hunt();
        python.hunt();
        crocodile.hunt();

        System.out.println("---------------------------------------------------");

        System.out.println("Wild Animal is Wild: " + WildAnimal.isWild);
        System.out.println("Wild Animal is Playable: " +WildAnimal.isPlayable);


        System.out.println("---------------------------------------------------");


        System.out.println("Friendly Animal is friendly: " + FriendlyAnimal.isFriendly);
        System.out.println("Friendly Animal is playable: " + FriendlyAnimal.isPlayable);












    }
}
