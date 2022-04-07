package day27_PracticeTask;

public class Retrieve {

    public static void main(String[] args) {

        String str = "I love java programming at EU8!";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);

            if(Character.isLetter(each)){
                letters += each;
            }
            if(Character.isDigit(each)){
                digits+= each;
            }if(!Character.isLetterOrDigit(each)){
                specialChars+= each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }







}
/*
Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";
 */