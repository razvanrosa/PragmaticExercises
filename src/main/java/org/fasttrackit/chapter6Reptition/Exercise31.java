package org.fasttrackit.chapter6Reptition;

/*Create a program that prompts for
        your age and your resting heart rate. Use the Karvonen for-
        mula to determine the target heart rate based on a range of
        intensities from 55% to 95%. Generate a table with the results
        as shown in the example output. The formula is
        TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        Constraints
        • Don’t hard-code the percentages. Use a loop to incre-
        ment the percentages from 55 to 95.
        • Ensure that the heart rate and age are entered as num-
        bers. Don’t allow the user to continue without entering
        valid inputs.
        • Display the results in a tabular format.*/

import java.util.Scanner;

public class Exercise31 {

    static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        restingHeartRate();
    }

    public static void restingHeartRate(){
            int a = 0;
            int b = 0;
        try {
            System.out.println("Enter your Resting pulse: ");
            a = input.nextInt();
            System.out.println("Enter your age: ");
            b = input.nextInt();
            if(b < 0 ){
                System.out.println("You are unborn yet dud!!! Try again next year! ");
            }
            if(b > 110){
                System.out.println("Sorry mate,you are death R.I.P !");
            }
        }catch (Exception e){
            System.out.println("Sorry. That's not a valid input.Try again: ");
            input.next();
            restingHeartRate();
        }

        int thr;

        System.out.println("Resting Pulse: " + a + " Age " + b);
        System.out.println("Intensity " + "|" + " Rate");
        System.out.println("-------------|--------");

        for(int i = 55; i <=95; i += 5){
           thr = (((220 - b) - a) * i ) /100 + a;
            System.out.println(i +"%" + " | " + thr + " bpm");
        }

    }
}
