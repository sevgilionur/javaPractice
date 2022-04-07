package day23_PracticeTask;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        isEligibleToBuyAlcohol(18);


    }

    public static void isEligibleToBuyAlcohol(int age){

        String result = "";

        if(age < 0){
            result = "Invalid";

        }else{
            if (age >= 18){
                result = "Eligible";
            }else{
                result = "Not eligible";
            }
        }

        System.out.println(result);



    }
}
