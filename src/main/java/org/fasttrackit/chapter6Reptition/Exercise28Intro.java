package org.fasttrackit.chapter6Reptition;

/*We had to prompt for a number greater than
        100. We ended the program if we didn’t get the input we
        wanted. But we could use repetition to keep asking, and we
        can use a flowchart to represent that logic:*/

import java.util.Scanner;

public class Exercise28Intro {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        userChoice();
    }

    public static void userChoice() {

        int userNr = 0;
        System.out.println("Enter a number grater then 100: ");

        try {
            userNr = input.nextInt();
            if (userNr > 100) {
                System.out.println("Thank you !");
            }else{
                userChoice();
            }
            }catch(Exception e){
                input.next();
                userChoice();
            }
        }
    }


