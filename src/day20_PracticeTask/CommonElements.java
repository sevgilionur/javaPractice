package day20_PracticeTask;

public class CommonElements {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};

        int[] result = new int[array1.length];

        for (int j = 0; j < array1.length; j++) {

            for (int i = 0; i < array2.length; i++) {

                if(array1[i] == array2[j] ){

                    System.out.print(array1[i] + " ");

                }
        }





        }





    }
}
/*
7. Write a program that can print out the common elements from two integer
array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
 */