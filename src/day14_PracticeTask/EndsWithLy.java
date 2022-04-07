package day14_PracticeTask;

import java.util.Scanner;

public class EndsWithLy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        String wordLy = (word.endsWith("ly"))? "really???" : "never mind";

        System.out.println(wordLy);

        scan.close();

    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */