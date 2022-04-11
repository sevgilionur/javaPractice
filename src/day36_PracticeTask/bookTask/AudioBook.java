package day36_PracticeTask.bookTask;

public class AudioBook extends Book{

    public String narrator;
    public double length;

    public AudioBook(String title, String type, String author, double price, String narrator, int length) {
        super(title, type, author, price);
        this.narrator= narrator;
        this.length = length;
    }

    public void listen(){
        System.out.println("I am listening an e-book from " + author +  " by " + narrator + " voice");
    }

    public String toString() {
        return "AudioBook{" +
                "narrator='" + narrator + '\'' +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*3. Book Task:
        3.1. create a class named Book:
        variables:
        title, type, author, price
        Methods:
        setInfo()
        toString()
        3.2 Create a sub class of Book named EBook:
        variables:
        title, type, author, price, size, pages
        Methods:
        setInfo()
        readBook()
        toString()
        3.3 Create a sub class of Book named AudioBook:
        variables:
        title, type, author, price, length,
        narrator
        Methods:
        setInfo()
        listen()
        toString()

 */