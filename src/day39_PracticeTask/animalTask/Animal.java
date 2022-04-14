package day39_PracticeTask.animalTask;

public class Animal {

    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {
       setName(name);
       setBreed(breed);
       setSize(size);
       setColor(color);
       setGender(gender);
       setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()){
            System.out.println("Name can not be null");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null || breed.isEmpty() || breed.isBlank()){
            System.out.println("Invalid breed");
            System.exit(1);
        }
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
        if(color==null || color.isEmpty() || color.isBlank()){
            System.out.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender: " + gender );
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Animal Task:
1. Create a class named Animal:
variables:
name, breed, gender, age, size, color
Encapsulate all the fields
Add a constructor to set all the fields
Conditions:
1. name, breed and color can not be null (if obj == null means it's error)
2. name, breed and color can not be empty or can not be blank
3. gender should only be set to either 'M' or 'F'
4. age can not be set to negative
Methods:
eat()
drink()
sleep()
move()
toString()
 */