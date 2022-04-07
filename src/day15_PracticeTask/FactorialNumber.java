package day15_PracticeTask;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        int factory= 1;

            if(number < 1){

                System.out.println("Enter a valid number");
            }else{
                for (int i = number ; i >=1; i--){

                    factory *= i;
                }
                System.out.println(factory);
            }

scan.close();





    }
}
/*

4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */