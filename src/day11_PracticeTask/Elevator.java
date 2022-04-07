package day11_PracticeTask;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 4;

        boolean validNumber = floorNum == 1 || floorNum == 2 || floorNum == 3;

        String result = "";

        if(validNumber){

            if(floorNum == 1){

                result = "Floor 1 \n" +
                        "selected. Companies: Lobby, Verizon, Starbucks";
            }else if(floorNum == 2){

                result = "Floor 2 \n" +
                        "selected. Companies: Cybertek, NASA, Intelsat\"";
            }else{

                result = "Floor 3 \n" +
                        "selected. Companies: Lyft, BofA, Stake house";
            }



        }else{
            System.out.println("Invalid floor - 6");

        }

        System.out.println(result);



    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed

 */