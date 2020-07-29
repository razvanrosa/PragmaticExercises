package org.fasttrackit.chapter5Functions;

 /* Write a program that prompts for a first name, last name,
          employee ID, and ZIP code. Ensure that the input is valid
          according to these rules:

          The first name must be filled in.
          • The last name must be filled in.
          • The first and last names must be at least two characters
          long.
          • An employee ID is in the format AA-1234. So, two let-
          ters, a hyphen, and four numbers.
          • The ZIP code must be a number.
          Display appropriate error messages on incorrect data.
*/

import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String first = scanner.nextLine();
        validate("first name", first);
        System.out.println("Enter the last name:");
        String last = scanner.nextLine();
        validate("last name", last);
        System.out.println("Enter the ZIP code: ");
        String zip = scanner.nextLine();
        validate("ZIP code", zip);
        System.out.println("Enter an employee ID: ");
        String id = scanner.nextLine();
        validate("ID", id);
    }

    private static void validate(String type, String input) {
        if(input.equals("")){
            System.out.println("The " + type + " must be filled in.");
            return;
        }
        if(input.length() < 2){
            System.out.println(input + " is not a valid " + type+ ". It is too short.");
            return;
        }
        if (!input.matches("^[0-9]+$") && type.equals("ZIP code")){
            System.out.println("The ZIP code must be numeric.");
            return;
        }

        if (!input.matches("^[a-z]{2}-[0-9]{4}$") && type.equals("ID")){
            System.out.println(input + " is not a valid ID.");
            return;
        }

        System.out.println("There were no errors found.");

    }
}
