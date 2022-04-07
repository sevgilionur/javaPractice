package day28_PracticeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));
        
        int minNumber = list.get(0);

        for (Integer each : list) {
            if(each < minNumber ){
                minNumber= each;
            }
        }

        System.out.println("minNumber = " + minNumber);
        
    }
}
/*
Write a program that can find the minimum number from an ArrayList of 
integers
Ex:
list = [1,2,3,4,5];
output:
1
 */