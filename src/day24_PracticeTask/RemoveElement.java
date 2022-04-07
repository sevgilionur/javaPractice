package day24_PracticeTask;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int[] result = removeElement(array,1);

        System.out.println(Arrays.toString(result));
    }

    public static int[] removeElement(int[] array, int index){

        if(index<0 || index>array.length-1){
            System.out.println("Invalid Index Number");
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }else{
                result[j++] = array[i];
            }
        }
        return result;
    }



}
/*
10. create a method named removeElement that passes one integer
array and one integer, the method removes the integer index from the
integer array and returns the new array
Ex:
array = {10, 20, 30, 40, 50, 60}
index = 2
removeElement(array, index) ==== {10,
20, 40, 50, 60}
 */