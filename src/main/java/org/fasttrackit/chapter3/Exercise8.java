package org.fasttrackit.chapter3;

/*  Write a program to evenly divide pizzas. Prompt for the
    number of people, the number of pizzas, and the number of
    slices per pizza. Ensure that the number of pieces comes out
    even. Display the number of pieces of pizza each person
    should get. If there are leftovers, show the number of leftover
    pieces.*/

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people");
        int x =  input.nextInt();
        System.out.println("How many pizzas do you have?");
        int y = input.nextInt();
        System.out.println("Enter the number of slices per pizza");
        int z = input.nextInt();

        evenlyDividePizzas(x,y,z);


    }

    public static void evenlyDividePizzas(int x, int y, int z){
        double slices = (y * z)/ x;
        int leftover = (y *z) % x;
        if(leftover == 0){
            System.out.println("Each person gets: " + slices + " pieces of pizza.\n" +
                    "There are 0 leftover pieces.");
        }else {
            System.out.println("Each person gets: " + slices + " pieces of pizza.\n" +
                    "There are: " + leftover +" leftover pieces.");
        }
    }

}
