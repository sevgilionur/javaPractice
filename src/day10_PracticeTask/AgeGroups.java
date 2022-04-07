package day10_PracticeTask;

public class AgeGroups {

    public static void main(String[] args) {
        
        int n = 151;
        
        boolean validNumber = n >= 0 && n <= 150;
        
        String result = "";
        
        if(validNumber){
            
            if(n < 21){
                
                result = "Teenager";
            }else if (n < 55){
                
                result = "Adult";
            }else{
                
                result = "Senior";
            }
            
            
        }else{
            
            result = "Invalid";
        }

        System.out.println("result = " + result);
        
        
    }
}
/*
4. Create a class called AgeGroups, write a program that can define the 
age groups of a person
age groups are:
Teenager (< 21)
Adult   (>=21 && <55 )
Senior  ( >= 55 )
if age is negative or greater than 150, print invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT 
STATEMENT
 */