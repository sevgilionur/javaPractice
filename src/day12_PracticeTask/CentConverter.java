package day12_PracticeTask;

import java.util.Scanner;

public class CentConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter cents");
        int currentCent =scan.nextInt();

        scan.close();

        int dollars = currentCent/100;
        int cent = currentCent%100;



        System.out.println(currentCent + " cents are equal to " + dollars + " dollars and " + cent + " cents");









    }
}
/*
3. Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */