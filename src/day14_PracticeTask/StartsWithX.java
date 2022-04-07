package day14_PracticeTask;


import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        String result = (word.startsWith("x"))? word.substring(1):word;

        System.out.println(result);


    }

}
/*
3. Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */