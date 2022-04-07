package day11_PracticeTask;

public class CappucinoBuyer {

    public static void main(String[] args) {

        String size = "small";

        boolean validSize = size == "tall" || size == "grande"|| size == "venti";

        if(validSize){

            if(size == "tall"){

                System.out.println("tall: \n" + "price is $3.69\n" +
                        "90 calories");

            }else if (size == "grande"){

                System.out.println("grande :" + "\nprice is $3.99;\n" +
                        "120 calories");
            }else{

                System.out.println("venti:\n" +
                        "price is $4.29\n" +
                        "150 calories");
            }

        }else{

            System.out.println("Invalide size");
        }
        System.out.println("----------------------------------------------------------------");

        String size1 = "tall";

        switch(size1){

            case "tall":
                System.out.println(size1 + " : \n" + "price is $3.69\n" +
                        "90 calories" );
                break;

            case "grande":
                System.out.println("grande:\n" +
                        "price is $3.99;\n" +
                        "120 calories");
                break;

            case "venti":
                System.out.println("venti:\n" +
                        "price is $4.29\n" +
                        "150 calories");
                break;

            default:
                System.out.println("Invalid Size");

        }

        System.out.println("-------------------------------------------");

        String size2 = "venti";

        if(size2 == "grande" || size2 == "tall" || size2 =="venti"){

            switch (size2){
                case "tall":
                    System.out.println("tall:\n" +
                            "price is $3.69\n" +
                            "90 calories");
                    break;

                case "grande":
                    System.out.println("grande:\n" +
                            "price is $3.99;\n" +
                            "120 calories");
                    break;

                case "venti":
                    System.out.println("venti:\n" +
                            "price is $4.29\n" +
                            "150 calories");
                    break;
            }

        }else{

            System.out.println("Invalid");
        }






    }
}

/*
Tasks:
1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
*/