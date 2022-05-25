package day21_PracticeTask;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] num = {11,23,56,74,32,1,3,5};

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        int[] descendingOrder = new int[num.length];

        for (int i = num.length - 1, j=0; i >= 0; i--, j++) {

            descendingOrder[j]= num[i];
        }

        System.out.println(Arrays.toString(descendingOrder));












    }
}
/*
1. Write a program that sort the array of integer in descending
order
 */