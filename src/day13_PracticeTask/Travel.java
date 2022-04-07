package day13_PracticeTask;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have valid passport?");
        String validPassport = scan.next().toLowerCase();


        if(validPassport.equals("yes")) {

            int priceTicket = 1000;

            scan.nextLine();

            System.out.println("Which country do you want to travel");
            String country = scan.nextLine().toLowerCase();

            System.out.println("How many bags you will take with you?");
            byte howManyBags = scan.nextByte();

            int bagsPrice = howManyBags * 50;

            System.out.println("how many people they will travel with?");
            short howManyPeople = scan.nextShort();

            int discount = (howManyPeople <= 3)? howManyPeople*100:0;


            scan.nextLine();

            System.out.println("Enter the name of the people you will travel with in one line, separating each name with a comma");
            String nameOfPeople = scan.nextLine();

            int totalCost = priceTicket + bagsPrice - discount;

            System.out.println("Your ticket is booked to " + country + " We have charged extra for the " +
                            howManyBags + " bags but you are traveling with " + howManyPeople + " people so we are giving a $" +
                            discount + " discount.Your total cost is " + totalCost);

        }else{



            System.out.println("When did your passport expire?");
            int expiredPassport = scan.nextInt();

            int baseRenewalPassport = 200;
            int eachYearRenewal = expiredPassport *75;
            int totalPricePassportRenewal = baseRenewalPassport + eachYearRenewal;


            System.out.println("Which country do you want to travel?");
            String country2 = scan.next();

            System.out.println("Are you going to travel next year? yes or no");
            String nextYear = scan.next().toLowerCase();


            if(nextYear.equals("yes")){

                totalPricePassportRenewal += 100;

            }else{

                totalPricePassportRenewal -= 50;

            }

            System.out.println("Looks like your password has been expired for " + expiredPassport + " years, but no worry" +
                    " we will get it ready for you to travel to " + country2 + ".Your total cost has come out to " + totalPricePassportRenewal);

        }scan.close();






    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate how
much the person will owe after everything.
Ask the user if they have a valid passport (yes or no)
If the user enters yes:
The base cost of the ticket
should be set to: 1000
Ask the user the country they to travel to
(String, multiple word)
Ask the user how many bags they will take
with them (byte)
> Each bag will add 50 to the cost
Ask the user how many people they will travel
with (short)
> For each person the cost is
reduced by 100. Up to a limit of 300.
Ask the user to Enter the name of the people
they will travel with in one line, separating each name with a comma
(String, multiple word)
Print: "Your ticket is booked to
$countryName. We have charged extra for the $numberOfBags bags but you are
traveling with $peopleYouTravelWith so we are giving a discount. Your
total cost is $costAmount"
If the user enters no:
The base cost of the passport
renewal is: 200
            Ask the user when their passport
expired(int)
                > Each year it was
expired adds 75 to the cost
Ask the user which country they plan to
travel
            Ask the user if they will be
traveling in the next year (String - yes or no)
                > If yes: add 100 to
the cost
                > If no: subtract 50
from the cost
Print: "Looks like your password has
been expired for $years, but not to worry we will get it ready for you to
travel to $allCountries. Your total cost has come out to $costAmount."
 */