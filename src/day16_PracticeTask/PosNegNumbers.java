package day16_PracticeTask;

import java.util.Scanner;

public class PosNegNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int posNumbers = 0;
        int negNumbers = 0;

        for (int i = 0; i <5 ; i++) {

            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number > 0){

                posNumbers += 1;

            }if(number < 0){

                negNumbers += 1;
            }

        }

        System.out.println(posNumbers + " pos numbers and " + negNumbers + " neg numbers");


scan.close();



    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */