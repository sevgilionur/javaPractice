package day10_PracticeTask;

public class GradeLevel {

    public static void main(String[] args) {

        byte n = 6;

        String result = "";

        boolean gradeLevel = n >= 1 && n <= 18;

        if(gradeLevel){

            if(n <= 5){
                result = "Elementary School";

            }else if (n <= 8){

                result = "Middle School";
            }else if (n <= 12){

                result = "High School";
            }else if (n <= 16){

                result = "College";
            }else{

                result = "Grad School";
            }

        }else{
            result = "Invalid";
        }
        System.out.println(result);





    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */