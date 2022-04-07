package day11_PracticeTask;

public class NumberOfDaysWithNestedIf {

    public static void main(String[] args) {

        int number = 13;
        int year = 2001;

        if(number >= 1 && number <=12) {
            if(number == 2){
                if(year%4 == 0){
                    System.out.println("has 29 days");
                }else{
                    System.out.println("has 28 days");
                }

            }else if(number == 4 || number == 6 || number == 9 || number ==11){

                System.out.println("has 30 days");

            }else{

                System.out.println("has 31 days");
            }


        }else{
            System.out.println("Invalid");
        }




    }
}