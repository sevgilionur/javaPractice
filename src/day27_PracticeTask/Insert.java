package day27_PracticeTask;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

       arr = insert(arr,1,100);
        System.out.println(Arrays.toString(arr));



    }

    public static int[] insert(int[] array, int index, int element){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        //arr = {10, 20, 30, 40, 50}; //1
        int[] result = new int[array.length +1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i==index){
                result[j++]=element;
            }
            result[j] = array[i];
            j++;
        }
        return result;

    }

    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        //arr = {10, 20, 30, 40, 50}; //1
        double[] result = new double[array.length +1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i==index){
                result[j++]=element;
            }
            result[j] = array[i];
            j++;
        }
        return result;

    }

    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        //arr = {10, 20, 30, 40, 50}; //1
        char[] result = new char[array.length +1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i==index){
                result[j++]=element;
            }
            result[j] = array[i];
            j++;
        }
        return result;

    }

    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        //arr = {10, 20, 30, 40, 50}; //1
        String[] result = new String[array.length +1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i==index){
                result[j++]=element;
            }
            result[j++] = array[i];

        }
        return result;

    }






}
/*
Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}

 */