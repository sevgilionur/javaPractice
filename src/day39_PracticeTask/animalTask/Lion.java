package day39_PracticeTask.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting in the desert");
    }
}
/*
5. Create the following subclasses of WildAnimal and Override the
hunt method, and add any extra methods that are needed:

1. Lion
2. Tiger
3. Eagle
4. Bear
5. Python
6. Crocodile
 */