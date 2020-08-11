package org.fasttrackit.chapter6Reptition;

/*Write a program that prompts the user for five numbers and
        computes the total of the numbers.
        Constraints
        • The prompting must use repetition, such as a counted
        loop, not three separate prompts.
        • Create a flowchart before writing the program.*/

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise28 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("The total is: " + totalSum());

    }

    public static int totalSum(){
        int sum =0;
        for(int i =0; i<5; i++){
            System.out.println("Enter a number:");
            sum += input.nextInt();
        }
        return sum;
    }
}

