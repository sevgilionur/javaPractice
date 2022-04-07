package day10_PracticeTask;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int n = 75;

        boolean passenger = n == 50 || n== 75 || n==100;

        String result = "";

        if(passenger){

            if(n == 50){

                result = "20 Crew, 30 Passengers";
            }else if (n == 75) {

                result = "25 Crew, 50 Passengers";

            }else{

                result = "30 Crew, 70 Passengers";
            }

        }else{

            result = "Not Valid";

        }

        System.out.println(result);




    }
}
/*
Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50  ====> 20 crew, 30 passengers
Total: 75  ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT



 */

