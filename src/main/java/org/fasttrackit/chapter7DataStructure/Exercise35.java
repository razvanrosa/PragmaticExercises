package org.fasttrackit.chapter7DataStructure;

/*Create a program that picks a winner for a contest or prize
        drawing. Prompt for names of contestants until the user
        leaves the entry blank. Then randomly select a winner.
        Constraints
        • Use a loop to capture user input into an array.
        • Use a random number generator to pluck a value from
        the array.
        • Don’t include a blank entry in the array.
        • Some languages require that you define the length of
        the array ahead of time. You may need to find another
        data structure, like an ArrayList .*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise35 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        pickingAWinner();

    }

    public static void pickingAWinner(){

        Random randName = new Random();

        ArrayList<String> contestants = new ArrayList<>();
        String name = "";
        boolean done = false;
        do {
            System.out.println("Enter a name: ");
            name = input.nextLine();
             if(name.equals("")){
                 done = true;
             }else {
                 contestants.add(name);
             }

        }while(!done);

        System.out.println(contestants);

        System.out.println("The winner is... " + contestants.get(randName.nextInt(contestants.size())));
    }
}
