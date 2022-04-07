package day20_PracticeTask;

import java.util.Arrays;

public class ReverseIntegers {

    public static void main(String[] args) {

        int[] number = {1,2,3,4,5};

        int[] reversedArray = new int[number.length];


        for (int i = number.length - 1, j= 0; i >= 0; i--, j++) {

            reversedArray[j] = number[i];
        }
        System.out.println(Arrays.toString(reversedArray));




    }
}
/*
5.  Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */