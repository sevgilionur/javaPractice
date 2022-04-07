package day15_PracticeTask;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.nextLine();

        String reverse = "";

        for (int i = str.length()-1; i >= 0  ; i--) {

            char chr = str.charAt(i);

            reverse += chr + "";

        }
        System.out.print(reverse);

scan.close();
    }
}
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */