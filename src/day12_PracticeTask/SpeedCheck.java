package day12_PracticeTask;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speedLimit = 90;

        System.out.println("What is your speed now?");
        int speed = scan.nextInt();


        scan.close();

        if(speed>speedLimit){

            System.err.println("You are driving " + (speed-speedLimit) + " kmh over the speed limit please slow down");
        }else{

            System.out.println("You are a good citizen. Thanks.");
        }













    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!
 */