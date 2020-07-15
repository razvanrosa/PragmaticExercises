package org.fasttrackit.Chapter4MakingDecisions;

       /* Write a simple program to compute the tax on an order
                amount. The program should prompt for the order amount
                and the state. If the state is “WI,” then the order must be
                charged 5.5% tax. The program should display the subtotal,
                tax, and total for Wisconsin residents but display just the
                total for non-residents
                Constraints
                • Implement this program using only a simple if state-
                ment—don’t use an else clause.
                • Ensure that all money is rounded up to the nearest cent.
                • Use a single output statement at the end of the program
                to display the program results.*/

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        taxCalculator();

    }

    public static void taxCalculator(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the order amount");
        int amount = input.nextInt();
        System.out.println("What is the state?");
        String state = input.next();

        double total = amount;


        if(state.equals("wi")){
            total = amount + ((amount * 5.5) / 100);
            System.out.println("The subtotal is: " + amount + " \n The tax is: 5.5 $ " + " \n The total is: " + total);
            return;
        }

        System.out.println("The total is: " + total);

    }


}
