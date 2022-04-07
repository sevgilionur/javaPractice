package day20_PracticeTask;

public class ReverseClassmates {

    public static void main(String[] args) {

        String[] classmates = {"Ali", "Ahmet", "Hakan", "Gökhan", "Necip", "Güngör", "Yalçın", "Özgür", "Veli", "Yasin"};


        for (int j = 0; j < classmates.length; j++) {

            String name = classmates[j];

            String reverse = "";

            for (int i = name.length()-1; i >= 0; i--) {

                reverse+= name.charAt(i);

            }
            System.out.println(reverse);
        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
 */