package day27_PracticeTask;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        String str = "Java java";

        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            }
            if(Character.isLowerCase(each)){
                countLower++;
            }
        }

        boolean r = countLower==countUpper;
        System.out.println(r);
    }


}


/*
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true
 */