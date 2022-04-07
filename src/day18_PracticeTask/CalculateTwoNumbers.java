package day18_PracticeTask;

import java.util.Scanner;

public class CalculateTwoNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter second number");
            int num2 = scan.nextInt();

            System.out.println("Enter a math operator");
            char chr = scan.next().charAt(0);

            while (!(chr == '+' || chr == '-' || chr == '/' || chr == '*')) {

                System.err.println("Invalid Operator.Please re-enter");
                chr = scan.next().charAt(0);
            }

            if (chr == '+') {
                System.out.println(num1 + num2);
            } else if (chr == '-') {
                System.out.println(num1 - num2);
            } else if (chr == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("Do you want to continue? yes/no");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {

                System.err.println("Invalid Entry.Please re-enter");
                a = scan.next().toLowerCase();

            }

            if (a.equals("no")) {

                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }


        }
        scan.close();


    }

}
/*
3. Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry

 */