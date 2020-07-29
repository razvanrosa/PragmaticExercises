package org.fasttrackit.chapter4MakingDecisions;

/*Write a program that asks for three numbers. Check first to
        see that all numbers are different. If they’re not different,
        then exit the program. Otherwise, display the largest number
        of the three.
        Constraint
        • Write the algorithm manually. Don’t use a built-in
        function for finding the largest number in a list.*/

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter third number: ");
        int c = input.nextInt();

        if(a == b && b == c && a == c){
            System.out.println();
        }
        if(a > b && a > c){
            System.out.println("The largest number is: " + a );
        }else if(b > a && b > c){
            System.out.println("The largest number is: " + b );
        }else if (c > a && c >b ){
            System.out.println("The largest number is: " + c );
        }

    }
}
