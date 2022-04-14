package day39_PracticeTask.animalTask;

public class Crocodile extends WildAnimal{

    public Crocodile(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts by his jaw");
    }
}
