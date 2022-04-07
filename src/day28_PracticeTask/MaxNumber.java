package day28_PracticeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        int maxNumber = list.get(0);

        for (Integer each : list) {

            if(each>maxNumber){

                maxNumber= each;
            }
        }

        System.out.println(maxNumber);

    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
5
 */