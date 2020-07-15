package org.fasttrackit.Chapter4MakingDecisions;

/*Write a program that asks the user for their age and compare
        it to the legal driving age of sixteen. If the user is sixteen or
        older, then the program should display “You are old enough
        to legally drive.” If the user is under sixteen, the program
        should display “You are not old enough to legally drive.”
        Constraints
        • Use a single output statement.
        • Use a ternary operator to write this program. If your
        language doesn’t support a ternary operator, use a reg-
        ular if/else statement, and still use a single output state-
        ment to display the message.*/

import java.util.Scanner;

public class Exercise16 {

    static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        legallyDrive();

    }

     static void legallyDrive() {

        int age = 0;
        System.out.println("Enter your age :");

        try {
            age = input.nextInt();
            System.out.println(age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

        } catch (Exception e) {
            input.next();
            System.out.println("You enter an invalid value.Try again.");
            legallyDrive();
        }
    }

}


