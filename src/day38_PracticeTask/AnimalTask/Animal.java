package day38_PracticeTask.AnimalTask;

public class Animal {
    private String name, breed, size, color;
    private int age;
    private char gender;

    public Animal(String name, String breed, String size, String color, int age, char gender) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null || name.isBlank() || name.isEmpty()){
            System.out.println("Name is not valid");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<= 0){
            System.out.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F') ){
            System.out.println("Invalid gender: " + gender );
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Animal:
Variables:
name, breed, age, gender, size, color
Add a constructor to set all the fields
methods:
eat()
toString()
 */