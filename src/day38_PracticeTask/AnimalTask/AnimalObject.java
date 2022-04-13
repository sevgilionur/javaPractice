package day38_PracticeTask.AnimalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog = new Dog("Şiva", "Pomeranian","small","Yellow",5,'F');

        Cat cat = new Cat("Müezza", "Scottish", "medium","Gray",1,'F');

        Tiger tiger = new Tiger("Khalla","Bengal", "large","Yellow and White", 4,'M');

        dog.eat();
        cat.eat();
        tiger.eat();

    }
}
