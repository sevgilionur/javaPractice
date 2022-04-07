package day13_PracticeTask;

import java.util.Scanner;

public class FirstLastCharSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        scan.close();

        char first =word.charAt(0);
        char last = word.charAt(word.length()-1);

        if (first == last){
            System.out.println("Same");

        }else{

            System.out.println("Different");
        }








    }
}
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */