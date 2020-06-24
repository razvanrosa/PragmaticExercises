package org.fasttrackit.chapter3;

import java.util.Scanner;

/*Write a program that converts currency. Specifically, convert
        euros to U.S. dollars. Prompt for the amount of money in
        euros you have, and prompt for the current exchange rate
        of the euro. Print out the new amount in U.S. dollars.*/

public class Exercise11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double x = input.nextDouble();
        System.out.println("What is the exchange rate?");
        double y = input.nextDouble();

        System.out.println( x + " euros at an exchange rate of " + y + " is\n" +
                currencyConversion(x,y) +  " U.S. dollars.");

    }

    public static double currencyConversion(double x,double y){
        return Math.round((( x * 1.1232 )/ y) * 1000d) / 1000d;
    }
}
