package day38_PracticeTask.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" eats cat food");
    }
}
/*
1. Cat
        eat(): eats cat food

 */