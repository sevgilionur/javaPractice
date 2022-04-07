package day13_PracticeTask;

import java.util.Scanner;

public class FirstLastChar {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        scan.close();

        char first =sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);

        System.out.println(first);
        System.out.println(last);





    }

}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */