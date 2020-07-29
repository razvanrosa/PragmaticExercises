package org.fasttrackit.chapter5Functions;

/*Create a program that determines the complexity of a given
        password based on these rules:
        • A very weak password contains only numbers and is
        fewer than eight characters.
        • A weak password contains only letters and is fewer than
        eight characters.
        • A strong password contains letters and at least one
        number and is at least eight characters.
        • A very strong password contains letters, numbers, and
        special characters and is at least eight characters.
        Constraints
        • Create a passwordValidator function that takes in the
        password as its argument and returns a value you can
        evaluate to determine the password strength. Do not
        have the function return a string—you may need to
        support multiple languages in the future.
        • Use a single output statement.*/

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercise25 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your password: ");
        String pass = input.next();

        passwordValidator(pass);

    }

    public static void passwordValidator(String pass) {
        System.out.println(pass.length());
        if (pass.matches("^[0-9]+$") && pass.length() < 8) {
            System.out.println("The password " + pass + " is a very weak password.");
        }else if (pass.matches("^(?=.*[a-zA-Z0-9])[a-zA-Z0-9!@#$%&*.]{7,}$i") && pass.length() > 8) {
            System.out.println("\"The password " + pass + " is a very strong password.\"");
        }else if (pass.matches("^[a-zA-Z]+$") && pass.length() < 8) {
            System.out.println("The password " + pass + " is a weak password.");
        }else if (pass.matches("\\S*(\\S*([a-zA-Z]\\S*[0-9])|([0-9]\\S*[a-zA-Z]))\\S*") && pass.length() > 8) {
            System.out.println("\"The password " + pass + " is a strong password.\"");
        }else{
            System.out.println("Try again");
        }
    }
}
