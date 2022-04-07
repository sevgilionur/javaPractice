package day12_PracticeTask;

import java.util.Scanner;

public class MileConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Mile");

        double mile = scan.nextDouble();

        scan.close();


        System.out.println(mile + " miles equal to " + (mile*1.609) + " kilometres");










    }
}
