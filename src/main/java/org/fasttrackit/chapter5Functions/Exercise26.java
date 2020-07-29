package org.fasttrackit.chapter5Functions;

/* Write a program that will help you determine how many
        months it will take to pay off a credit card balance. The
        program should ask the user to enter the balance of a credit
        card and the APR of the card. The program should then
        return the number of months needed.

        Constraints
        • Prompt for the card’s APR. Do the division internally.
        • Prompt for the APR as a percentage, not a decimal.
        • Use a function called calculateMonthsUntilPaidOff , which
        accepts the balance, the APR, and the monthly payment
        as its arguments and returns the number of months.
        Don’t access any of these values outside the function.
        • Round fractions of a cent up to the next cent.*/

import java.util.Scanner;

public class Exercise26 {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your balance? ");
        int balance = scanner.nextInt();
        System.out.println(balance);
        System.out.println("What is the APR on the card (as a percent)?");
        int apr = scanner.nextInt();
        System.out.println(apr);
        System.out.println(apr/ 365d);
        System.out.println(" What is the monthly payment you can make?");
        int monthlyPay = scanner.nextInt();
        System.out.println(monthlyPay);

        System.out.println("It will take you " +
                calculateMonthsUntilPaidOff(balance, apr/365d, monthlyPay) +
                " months to pay off this card.");
    }

    static double calculateMonthsUntilPaidOff(int balance, double apr, int monthlyPay){

        return 1/30d * (Math.log(Math.abs(1+(balance/monthlyPay)*(1-Math.pow(1+apr,30))))/Math.log(1+apr));
    }
}