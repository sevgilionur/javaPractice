package day10_PracticeTask;

public class Grade {

    public static void main(String[] args) {
        
        char ch = 'E';
        
        String result = "";
        
        if(ch == 'A'|| ch == 'B'|| ch == 'C'|| ch == 'D'|| ch == 'F'){
            
            if (ch == 'A'){
                
                result = "Excellent";
                
            }else if(ch == 'B'){
                
                result = "Great";
                
            }else if (ch == 'C'){
                
                result = "Good";
            }else if (ch == 'D'){
                
                result = "Passed";
            }else{
                
                result = "Failed";
            }
            
        }else {
            
            result = "Invalid";
        }

        System.out.println("result = " + result);
    }


}
/*
3. Create a class called Grade, a char variable named grade is given. 
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT 
STATEMENT
 */