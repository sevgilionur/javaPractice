package day14_PracticeTask;

import java.util.Scanner;

public class EnterTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words");
        String word = scan.next();
        String word1 = scan.next();

        System.out.println(word.substring(1) + word1.substring(1));

        scan.close();




    }
}
/*
1. Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */