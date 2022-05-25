package groupStudying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,21,3,23,34,76,54,43,3,2,12,3};

        Arrays.sort(arr);

        int max = arr[0];
        int min = arr[0];
        int sum= 0;

        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];

        }

        int j =0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reverse[j++]+=arr[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println("sum = " + sum);
        System.out.println("Average "+ sum/arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------------------------------------");

        int[] arr1 = {1,2,3,21,3,23,34,76,54,43,3,2,12,3};
        String[] names = {"Ali"};

        ArrayList<Integer> sorted = new ArrayList<>();

        for (int each : arr1) {
            sorted.add(each);
        }

        Collections.sort(sorted);

        System.out.println(sorted);

        System.out.println("-----------------------------------------------");

        int[] arr2=  {1,2,3,4,5};
        int[] arr3=  {4,5,6,7,8};

        String elements = "";
        String commonElements = "";

        for (int each : arr2) {
            elements+=" "+ each;
        }
        for (int each : arr3) {
            if(elements.contains(""+each)){
                commonElements+=" "+ each;
            }
        }

        System.out.println(commonElements);


    }
}
/*
5. Write a program that can print out the common elements from two
integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
 */
