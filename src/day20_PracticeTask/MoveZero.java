package day20_PracticeTask;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {

        int[] number = {10,0,5,0,1,0};

        int[] result = new int[number.length];

        int j = 0;

        for (int i = 0; i < number.length; i++) {

            if(number[i] != 0){

                result[j] = number[i];

                j++;
            }

        }

        System.out.println(Arrays.toString(result));





    }
}
/*
6. write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */