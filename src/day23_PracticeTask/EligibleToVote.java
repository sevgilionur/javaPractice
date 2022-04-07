package day23_PracticeTask;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(17,"Usa");

    }

    public static void eligibleToVote(int age, String citizenship){

        if(age >= 21 && citizenship.equalsIgnoreCase("USA")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }


    }
}
/*
4. create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
 */