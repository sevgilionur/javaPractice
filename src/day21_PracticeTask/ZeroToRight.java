package day21_PracticeTask;

import java.util.Arrays;

public class ZeroToRight {

    public static void main(String[] args) {

        int[] arr1 = {1,5,0,2,0,3,0};

        int[] arr2 = new int[arr1.length];

        int i = 0;

        for (int each : arr1) {

            if(each != 0){

                arr2[i] = each;
                i++;
            }

        }
        System.out.println(Arrays.toString(arr2));




    }
}
