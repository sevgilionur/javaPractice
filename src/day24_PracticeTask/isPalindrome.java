package day24_PracticeTask;

public class isPalindrome {

    public static void main(String[] args) {

        String str = "level";

        boolean result = isPalindrome(str);

        System.out.println(result);


    }

    public static boolean isPalindrome(String str){

        String result = Reverse.reverse(str);

        return result.equalsIgnoreCase(str);


    }

}
/*
4. By using the reverse method above to create another method named
isPalindrome  that passes a String parameter, the method returns true if
the string is palindrome, otherwise returns false
Ex:
str = "Level"
isPalindrome(str) ===> true
 */