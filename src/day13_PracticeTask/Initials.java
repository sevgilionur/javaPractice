package day13_PracticeTask;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        scan.close();

        char f = firstName.toUpperCase().charAt(0);
        char l = lastName.toUpperCase().charAt(0);

        System.out.println(f + "." + l);









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