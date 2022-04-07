package day16_PracticeTask;

public class DogAndCatSame {

    public static void main(String[] args) {

        String str = "CaT DOg Cat Dog";

        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i <= str.length()-3 ; i++) {

            String s = str.substring(i, i+3);

            if(s.equalsIgnoreCase("cat")){

                countCat++;
            }

            if(s.equalsIgnoreCase("dog")){

                countDog++;
            }

            }

            System.out.println((countCat==countDog)? "True" : "False");


        }


    }

/*
5. write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */