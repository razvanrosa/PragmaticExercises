package org.fasttrackit.chapter6Reptition;

/*Write a quick calculator that prompts for the rate of return
        on an investment and calculates how many years it will take
        to double your investment.
        The formula is
        years = 72 / r
        where r is the stated rate of return.
        Constraints
• Don’t allow the user to enter 0.
• Don’t allow non-numeric values.
• Use a loop to trap bad input, so you can ensure that the
user enters valid values.*/

import java.util.Scanner;

public class Exercise29 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        quickCalc();
    }

    public static void quickCalc(){

        String userInput;
        boolean valid = true;

        do{
            System.out.println("What is the rate of return? ");
            userInput = input.next();
            valid = userInput.matches("^[1-9]") ;
            if(!valid){
                System.out.println("Sorry. That's not a valid input.");
            }

        }while (!valid);

        int rate = Integer.parseInt(userInput);
        int years = 72/ rate;
        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}

