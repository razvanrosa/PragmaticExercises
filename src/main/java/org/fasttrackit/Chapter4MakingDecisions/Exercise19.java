package org.fasttrackit.Chapter4MakingDecisions;

/*You’ll often need to see if one value is within a certain range
        and alter the flow of a program as a result.
        Create a program to calculate the body mass index (BMI)
        for a person using the person’s height in inches and weight
        in pounds. The program should prompt the user for weight
        and height.
        Calculate the BMI by using the following formula:
        bmi = (weight / (height × height)) * 703
        If the BMI is between 18.5 and 25, display that the person is
        at a normal weight. If they are out of that range, tell them if
        they are underweight or overweight and tell them to consult
        their doctor.*/

import java.util.Scanner;

public class Exercise19 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double bmi = bmiCalculator();

        if(bmi <18.5){
            System.out.println(bmi +  " You are underweight. You should see your doctor!");
        }else if(bmi >25){
            System.out.println(bmi + " You are overweight. You should see your doctor!");
        }else{
            System.out.println(bmi + " You are within the ideal weight range.");
        }

    }

    public static double bmiCalculator(){
        double weight = 0.0;
        double height = 0.0;

        try {
            System.out.println("Enter your weight:");
            weight = input.nextDouble();
            System.out.println(("Enter your height:"));
            height = input.nextDouble();
            return (weight /(height * height)) * 703;
        }catch (Exception e){
            System.out.println("You entered invalid value.Try again: ");
            input.next();
            bmiCalculator();
            return 0.0;
        }

    }
}
