package day24_PracticeTask;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        String str1 = "acb";
        String str2 = "bac";

        boolean result = isAnagram(str1,str2);

        System.out.println(result);



    }

    public static boolean isAnagram(String str1, String str2){

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);

    }






}
/*
2. create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise
returns false
Ex:
str1 = "cba"
str2 = "bac";
isAnagram(str1, str2) ====> true
 */