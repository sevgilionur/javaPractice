package day25_PracticeTask;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        
        long[] arr1 = {11L,2L,29L,13L,41L};
        
        long maxNumber = max(arr1);

        System.out.println("maxNumber = " + maxNumber);

        
    }

    //1. create a method that can return the max number from an integer array
    public static int max(int[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }

    public static double max(double[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }

    public static long max(long[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }

    public static short max(short[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }

    public static float max(float[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }

    public static byte max(byte[] number){

        Arrays.sort(number);

        return number[number.length-1];

    }


}
/*
Task 2:
1. create a method that can return the max number from an integer
array
2. create a method that can return the max number from double array
3. create a method that can return the max number from long array
4. create a method that can return the max number from short array
5. create a method that can return the max number from float array
6. create a method that can return the max number from byte array
 */