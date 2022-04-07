package day22_PracticeTask;

public class ReverseTwoDimensionalArray {

    public static void main(String[] args) {

        int[][] arr1 = { {1,2,3}, {4,5,6}};


        for (int a = arr1.length - 1; a >= 0; a--) {

            for (int e = arr1[a].length - 1; e >= 0; e--) {

                System.out.println(arr1[a][e] + "");

                }
            System.out.println();
            }
        }








    }


/*
1. Write a program that can reverse a two dimensional array (return new
array)
Ex:
array = { {1,2,3}, {4,5,6}};
output:
reverse = { {6,5,4}, {3,2,1},};
 */