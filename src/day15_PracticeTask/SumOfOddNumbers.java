package day15_PracticeTask;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 100 ; i++) {

            if(i%2 != 0){

                sum += i;
            }

        }
        System.out.println(sum);




    }
}
/*
2. Write a program that can return the sum of odd numbers between 1
to 100
 */