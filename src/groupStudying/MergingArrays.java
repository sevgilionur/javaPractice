package groupStudying;

import java.sql.Array;
import java.util.Arrays;

public class MergingArrays {

    public static void main(String[] args) {

       int[] arr1 = {30, 10, 20};
       int[] arr2 = {15, 40, 25, 35};
       int[]arr3 = {8, 9, 17, 5, 4, 1};

       int[] mergedArr= new int[arr1.length+arr2.length+arr3.length];

       int j= 0;

        for (int each : arr1) {
            mergedArr[j++] = each;
        }

        System.out.println(j);

        for (int each : arr2) {
            mergedArr[j++]=each;
        }

        for (int each : arr3) {
            mergedArr[j++]=each;
        }

        System.out.println(Arrays.toString(mergedArr));

        Arrays.sort(mergedArr);

        int[] reversedArr = new int[mergedArr.length];

        int k = 0;

        for (int i = reversedArr.length - 1; i >= 0; i--) {

            reversedArr[k++]= mergedArr[i];

        }

        System.out.println(Arrays.toString(reversedArr));
     }
}
/*
5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */