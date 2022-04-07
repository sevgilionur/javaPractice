package day17_PracticeTask;

public class DivisionWithoutMathOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int result = 0;

        while (a >= b){

            a -= b;
            result++;

        }

        System.out.println("Result is: " + result + " with a remainder of " + a);



    }
}

/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */