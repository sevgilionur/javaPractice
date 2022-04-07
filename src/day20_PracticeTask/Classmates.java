package day20_PracticeTask;

import java.util.Arrays;

public class Classmates {

    public static void main(String[] args) {

        String[] classmates = {"Jack A.", "John B.", "Jill C.", "Juliya D.", "Julee E.", "Jacob F.", "Janothon G.",
                "Jarry H.", "Jackson I.", "Jamelia J."};

        String initial = "";

        for (int i = 0; i < classmates.length; i++) {

             initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(classmates[i].indexOf(" ") + 1);

            System.out.println(initial);

        }





    }
}
/*
1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */