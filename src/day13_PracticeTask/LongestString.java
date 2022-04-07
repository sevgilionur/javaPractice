package day13_PracticeTask;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings of text");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        scan.close();

        int length1 = str1.length();
        int length2 = str2.length();

        if(length1 > length2){

            System.out.println(str1);

        }else if(length2 > length1){

            System.out.println(str2);
        }else{
            System.out.println("Both have same length");
        }








    }
}
/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */