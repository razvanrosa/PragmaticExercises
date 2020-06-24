package org.fasttrackit.chapter3;

import java.util.Scanner;

/*Create a program that computes simple interest. Prompt for
        the principal amount, the rate as a percentage, and the time,
        and display the amount accrued (principal + interest).
        The formula for simple interest is A = P(1 + rt) , where P is
        the principal amount, r is the annual rate of interest, t is the
        number of years the amount is invested, and A is the amount
        at the end of the investment.*/

public class Exercise12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        int x = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        double y = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int z = input.nextInt();

        System.out.println("After " + z + " years at " + y +" % the investment will\n" +
                "be worth : " + (int)simpleInterest(x,y,z));

    }

    public static double simpleInterest(int x, double y,int z){
        return x *(y / 100) * z + x ;
    }
}
