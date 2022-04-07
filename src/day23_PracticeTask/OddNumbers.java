package day23_PracticeTask;

public class OddNumbers {

    public static void main(String[] args) {

        oddNumbers();


    }

    public static void oddNumbers(){

        for (int i = 1; i < 101; i++) {
            if(i%2 != 0){
                System.out.print(i + " ") ;
            }
        }

        System.out.println();
    }



}



/*
Tasks:
1. create a method that can print odd numbers between 1~100 in a
same line saperated by space
 */