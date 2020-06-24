package org.fasttrackit.chapter3;

import java.util.Scanner;

/*Write a program to compute the value of an investment
        compounded over time. The program should ask for the
        starting amount, the number of years to invest, the interest
        rate, and the number of periods per year to compound.*/

public class Exercise13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int a = input.nextInt();
        System.out.println("Enter the rate: ");
        double b = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int c = input.nextInt();
        System.out.println("Enter the number of times the interest is compounded per year?");
        int d = input.nextInt();

        System.out.println("$ " + a + " invested at " + b + "% for " + c + " years\n" +
                "compounded " + d + " times per year is $ " + compoundInterest(a,b,c,d));

    }

    public static double compoundInterest(int a , double b,int c,int d){
        System.out.println(b/d + 1);
        System.out.println(d*c);
        System.out.println((Math.pow((1 + ( b / d)),(d * c))));
        return a * (Math.pow((1 + ( b / d)),(d * c)));
    }
}
