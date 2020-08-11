package org.fasttrackit.chapter6Reptition;

/*Write a Guess the Number game that has three levels of
        difficulty. The first level of difficulty would be a number
        between 1 and 10. The second difficulty set would be
        between 1 and 100. The third difficulty set would be between
        1 and 1000.
        Constraints
        • Don’t allow any non-numeric data entry.
        • During the game, count non-numeric entries as wrong
        guesses.*/

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise32 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number.");
        System.out.println();
        guessTheNumber();
    }

    public static void guessTheNumber() {

        Random randNum = new Random();

        boolean play = true;
        int userChoice=0;
        int userNumber = 0;
        int count = 0;
        int num = 0;
        String rePlay;

        System.out.println("Pick a difficulty level: ");
        System.out.println("===============================");
        System.out.println("1) Easy, 2)Medium , or 3) Hard:");
        try {
            userChoice = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid input!Try again:");
            input.next();
            guessTheNumber();
        }

        switch (userChoice) {
            case 1:
                num = randNum.nextInt(10) + 1;
                System.out.println("Random number between 1 and 10 selected.\n" + "I have my number. What's your guess?");
                break;
            case 2:
                num = randNum.nextInt(100) + 1;
                System.out.println("Random number between 1 and 100 selected.\n" + "I have my number. What's your guess?");
                break;
            case 3:
                num = randNum.nextInt(1000) + 1;
                System.out.println("Random number between 1 and 1000 selected.\n" + "I have my number. What's your guess?");
                break;
        }

          while (userNumber != num) {
            try {
                userNumber = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid input!Try again:");
            }
            count = count + 1;

            if (userNumber == num) {
                System.out.println("You got it in: " + count + " guesses!");
            } else if (userNumber < num) {
                System.out.println("Too low. Guess again: ");
            } else if (userNumber > num)
                System.out.println("Too high. Guess again: ");

        }


        System.out.print("Do you want to play again? (y/n): ");
          input.nextLine();
          rePlay = input.nextLine();

        if (rePlay.equals("y")) {
            play = true;
            guessTheNumber();
        } else {
            play = false;
            System.out.println("Goodbye!");
        }
    }

}

