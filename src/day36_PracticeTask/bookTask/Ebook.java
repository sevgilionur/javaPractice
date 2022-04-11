package day36_PracticeTask.bookTask;

public class Ebook extends Book{

    public String size;
    public int pages;

    public Ebook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }

    public void readBook(){
        System.out.println("I am reading a book from"  + author );
    }
}
/*
3. Book Task:
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