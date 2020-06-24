package org.fasttrackit.chapter3;

import java.util.Scanner;

   /*Create a program that calculates the area of a room. Prompt
the user for the length and width of the room in feet. Then
display the area in both square feet and square meters.*/

public class Exercise7 {

    static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the room in feet");
        double x = input.nextDouble();
        System.out.println("Enter the width of the room in feet");
        double y = input.nextDouble();
        System.out.println("The room area is: " + roomArea(x,y) + " square feet.");
        System.out.println("The room area is: " + conversionFeetMeeter(x,y) + " square meter.");

    }

    public static double roomArea(double x,double y){
        return x * y;
    }

    public static double conversionFeetMeeter(double x, double y){
        return roomArea(x,y) * CONVERSION_FACTOR;
    }
}
