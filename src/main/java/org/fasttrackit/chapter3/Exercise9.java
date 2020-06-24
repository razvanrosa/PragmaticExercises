package org.fasttrackit.chapter3;

import java.util.Scanner;

/*Calculate gallons of paint needed to paint the ceiling of a
        room. Prompt for the length and width, and assume one
        gallon covers 350 square feet. Display the number of gallons
        needed to paint the ceiling as a whole number.*/

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the room in feet");
        int x = input.nextInt();
        System.out.println("Enter the width of the room in feet");
        int y = input.nextInt();

        gallonsNeeded(x, y);

    }

    public static void gallonsNeeded(int x, int y) {
        int area = x * y;
        int gallons = area / 350;
        if (area < 350) {
            System.out.println("you will need 1 gallon of paint.");
        } else {
            System.out.println("You will need " + gallons + " gallons of paint.");
        }

    }

}