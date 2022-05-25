package day15_PracticeTask;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String isPalindrome = scan.next();

        String str = "";

        for (int i = isPalindrome.length()-1; i >=0 ; i--) {

            char ch =isPalindrome.charAt(i);

            str += ch;
        }

            if(str.equalsIgnoreCase(isPalindrome)){

                System.out.println("True");
            }else{

                System.out.println("False");
            }

            scan.close();

    }
}
/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */