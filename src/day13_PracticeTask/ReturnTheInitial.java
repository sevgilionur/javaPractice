package day13_PracticeTask;

import java.util.Locale;
import java.util.Scanner;

public class ReturnTheInitial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        scan.close();

        char chr1 = word.toUpperCase().charAt(0);
        char chr2 = word2.toUpperCase().charAt(0);

        System.out.println(chr1 + "." + chr2);




    }
}
/*
4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */