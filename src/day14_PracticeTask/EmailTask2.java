package day14_PracticeTask;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your e-mail address");
        String emailAddress = scan.nextLine();

        String firstName = emailAddress.substring(0, emailAddress.indexOf("_"));
        String lastName = emailAddress.substring(emailAddress.indexOf("_") + 1, emailAddress.indexOf("@"));
        String domain = emailAddress.substring(emailAddress.indexOf("@")+1, emailAddress.indexOf("."));

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
        System.out.println(lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
        System.out.println(domain.substring(0,1).toUpperCase() + domain.substring(1).toLowerCase());





    }
}
/*
9. Create a class called EmailTask2.
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
 */