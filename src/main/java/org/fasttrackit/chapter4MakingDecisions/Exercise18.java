package org.fasttrackit.chapter4MakingDecisions;

/*Create a program that converts temperatures from Fahren-
        heit to Celsius or from Celsius to Fahrenheit. Prompt for the
        starting temperature. The program should prompt for the
        type of conversion and then perform the conversion.
        The formulas are
        C = (F − 32) × 5 / 9
        and
        F = (C × 9 / 5) + 32
        Constraints
        • Ensure that you allow upper or lowercase values for C
        and F .
        • Use as few output statements as possible and avoid
        repeating output strings.*/

import java.util.Scanner;

public class Exercise18 {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice:");
        String degrees = input.next();
        System.out.println("Enter temperatures: ");
        double temp  = input.nextDouble();


        if(degrees.toLowerCase().equals("c")){
           double c = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is : " + c);
        }else{
            double f = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is : " + f);
        }
    }
}
