package day08_PracticeTask;

public class GradeType {

    public static void main(String[] args) {

        byte gradeLevel = 15;

        boolean type1 = gradeLevel >= 1 && gradeLevel <= 5,
                type2 = gradeLevel >= 6 && gradeLevel <= 8,
                type3 = gradeLevel >= 9 && gradeLevel <= 12,
                type4 = gradeLevel >= 13 && gradeLevel <= 16,
                type5 = gradeLevel >= 17 && gradeLevel <= 18;

        if (type1) {

            System.out.println("Elemantary school");

        }
        if (type2) {

            System.out.println("Middle school");
        }
        if (type3) {

            System.out.println("High school");
        }
        if (type4) {

            System.out.println("College");
        }
        if (type5) {

            System.out.println("Grad school");
        }


    }
}
/*
2.  Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18

 */