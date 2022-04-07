package day09_PracticeTask;

public class NumberToWord {

    public static void main(String[] args) {

        int num = 10;

        String result = "";

        if(num >= 0 && num <= 9){

            if(num == 0){

                result = "Zero";

            }else if(num == 1){

                result = "One";

            }else if(num == 2){

                result = "Two";
            }else if (num == 3){

                result = "Three";
            }else if (num == 4){

                result = "Four";
            }else if (num == 5){

                result = "Five";
            }else if (num == 6){

                result = "Six";

            }else if (num == 7){

                result = "Seven";
            }else if(num == 8){

                result = "Eight";
            }else{

                result = "Nine";
            }




        }else{

            result = "Invalid number";
        }

        System.out.println(result);



    }

}
/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */