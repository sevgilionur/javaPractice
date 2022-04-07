package day15_PracticeTask;

import java.util.Scanner;

public class CalculateTheSumOfAllNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double num = scan.nextDouble();

        String result = "";
        int sum = 0;

        if(num < 0){

            result = "Enter a valid number";

        }else{

            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            result = "sum: " + sum;
        }

        System.out.println(result);

scan.close();
    }
}
/*
3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
 */