package day17_PracticeTask;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room? yes/no");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){

            System.out.println("Invalid answer. Please re-enter");
            answer = scan.next().toLowerCase();

        }

        int total = 0;
        String selection = "";

        if(answer.equals("yes")){
            System.out.println("Which type of room do you want?");
            selection = scan.nextLine();

            System.out.println("King Bed ==> 120$");
            System.out.println("Queen Bed ==> 100$");
            System.out.println("Single Bed ==> 80$");
            System.out.println("Enter a selection");
            selection = scan.nextLine();


            while(!(selection.equalsIgnoreCase("King Bed")|| selection.equalsIgnoreCase("Queen Bed") ||
                    selection.equalsIgnoreCase("Single Bed"))){

                System.out.println("Please enter valid selection");
                selection= scan.next();

            }
                if(selection.equalsIgnoreCase("King Bed")){
                    selection = "King Bed";
                    total = 120;
                }else if(selection.equalsIgnoreCase("Queen Bed")){
                    selection = "Queen Bed";
                    total = 100;
                }else{
                    selection = "Single Bed";
                    total = 80;
                }


            System.out.println("Your selection is " + selection  + ". Total price: " + total);


        }

        if(answer.equals("no")){

            System.out.println("Have a nice day");

        }

        scan.close();




    }
}
/*
5. Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */