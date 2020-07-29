package org.fasttrackit.chapter4MakingDecisions;

/*Create a program that prompts for your weight, gender,
        number of drinks, the amount of alcohol by volume of the
        drinks consumed, and the amount of time since your last
        drink. Calculate your blood alcohol content (BAC) using this
        formula
        BAC = (A × 5.14 / W × r) − .015 × H
        where
        • A is total alcohol consumed, in ounces (oz).
        • W is body weight in pounds.
        • r is the alcohol distribution ratio:
        – 0.73 for men
        – 0.66 for women
        • H is number of hours since the last drink.
        Display whether or not it’s legal to drive by comparing the
        blood alcohol content to 0.08 .
        Constraint
        • Prevent the user from entering non-numeric values.*/

import java.util.Scanner;

public class Exercise17 {

     static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your weight: ");
        double w = input.nextDouble();
        System.out.println("Enter your gender (m/f): ");
        String g = input.next();
        System.out.println("Enter the number of drinks: ");
        int d = input.nextInt();
        System.out.println("Enter the volume of one drink: ");
        double v = input.nextDouble();
        System.out.println("Enter how manny hours since the last drink? ");
        int h = input.nextInt();

       double bloodAlchool = bloodAlcoholCalculator(w,g,d,v,h);

       if(bloodAlchool >= 0.08){
           System.out.println("Your BAC is " + bloodAlchool + "It is not legal for you to drive." );
       }else{
           System.out.println("Your BAC is " + bloodAlchool + "It is legal for you to drive." );
       }
    }

    public static double bloodAlcoholCalculator(double weight,String gender,int numberOfDrinks,double volume,int hours){

            double bac;
            double totalAlchool = numberOfDrinks * volume;

            if(gender.equals("m")){
                bac = (totalAlchool * 5.14 / weight * 0.73) - .015 * hours;
            }else{
                bac = (totalAlchool * 5.14 / weight * 0.66) - .015 * hours;
            }
            return bac;

    }
}
