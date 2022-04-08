package day35_PracticeTask.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("Kent", 1,10,true),
                new Candy("Ülker",2,12,false),
                new Candy("Şölen",1,8,false),
                new Candy("Özler",2,5,true),
                new Candy("Dolca",5,15,true)
        ));

        for (Candy candy : candies) {
            System.out.println("Brand: " + candy.getBrand() + " price: " + candy.getPrice());
        }


    }

}
/*
1.2 Create a class named CandyFactory
Create an ArrayList of candies
Add five objects of candies
use for each loop to print the brand and price of each
candy
 */