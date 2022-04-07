package day21_PracticeTask;

public class EvenOddNumber {

    public static void main(String[] args) {

        int[] number = {21,30,55,87,89,23,10,12};

        int countOdd = 0;
        int countEven = 0;

        for (int each : number) {

            if(each%2 == 0){

                countOdd++;
            }else{

                countEven++;
            }

        }
        System.out.println("Even numbers: " + countEven );
        System.out.println("Odd numbers: " + countOdd);



    }
}
/*
2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */