package day24_PracticeTask;

public class Reverse {

    public static void main(String[] args) {

        String str1 = "Java";

        str1 = reverse(str1);

        System.out.println(str1);



    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            char each = str.charAt(i);

            result += each;

        }

        return result;
    }


}
/*
3. create a method named reverse that passes one string parameter,
the method can return the reversed string
Ex:
str = "Java";
reverse(str) ==> avaJ
 */