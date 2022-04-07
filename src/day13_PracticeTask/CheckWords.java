package day13_PracticeTask;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        System.out.println("Enter a word");
        String word2 = scan.next();
        System.out.println("Enter a word");
        String word3 = scan.next();

        scan.close();

        int length = word.length();
        int length2 = word2.length();
        int length3 = word3.length();

        String result = "";

        if(length == length2 && length2 == length3){

            result= "All words are same length";

        }else if(length == length2 || length == length3 || length2 == length3){

            result = "Not Same nor Different lengths";

        }else{

            result = "All different length";
        }

        System.out.println(result);








    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */