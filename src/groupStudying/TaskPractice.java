package groupStudying;

public class TaskPractice {

    public static void main(String[] args) {

        String str = "onur";
        String reverse="";

        if(str.length()==5 ){
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);

            }
            System.out.println(reverse);

        }else if(str.length()>5){

            System.out.println("Too long!");

        }else{

            System.out.println("Too short!");
        }


    }

}
/*
1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.

2.Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple

3. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW

4. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true

5. Write a program that can print out the common elements from two
integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
 */