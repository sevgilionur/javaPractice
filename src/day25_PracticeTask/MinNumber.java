package day25_PracticeTask;

import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        double[] arr = {1.2, 0.3, 5.1, 7.2};

        double minNumber = min(arr);

        System.out.println("minNumber = " + minNumber);



    }

    public static int min(int[] array){

        Arrays.sort(array);

        return array[0];

    }

    public static double min(double[] array){

        Arrays.sort(array);

        return array[0];

    }

    public static long min(long[] array){

        Arrays.sort(array);

        return array[0];

    }

    public static short min(short[] array){

        Arrays.sort(array);

        return array[0];

    }

    public static float min(float[] array){

        Arrays.sort(array);

        return array[0];

    }

    public static byte min(byte[] array){

        Arrays.sort(array);

        return array[0];

    }




}
/*
Task 3:
1. create a method that can return the min number from an integer
array
2. create a method that can return the min number from double array
3. create a method that can return the min number from long array
4. create a method that can return the min number from short array
5. create a method that can return the min number from float array
6. create a method that can return the min number from byte array

 */