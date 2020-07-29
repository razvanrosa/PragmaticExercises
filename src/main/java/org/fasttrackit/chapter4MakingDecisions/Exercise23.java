package org.fasttrackit.chapter4MakingDecisions;

/*Create a program that walks the user through troubleshoot-
        ing issues with a car.
        Constraint
        • Ask only questions that are relevant to the situation and
        to the previous answers. Don’t ask for all inputs at once.*/

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean answer = false;

        System.out.println("Is the car silent when you turn the key? y/n");
        String userAnswer = input.next();

        answer = userAnswer.equals("y");

        if(answer){
            System.out.println("Are the battery terminals corroded?");
            userAnswer = input.next();
            answer = userAnswer.equals("y");

            if(answer){
                System.out.println("Clean terminals and try starting again.");
            }else{
                System.out.println("Replace cables and try again.");
            }


        }else{
            System.out.println("Does the car make a clicking noise?");
            userAnswer = input.next();
            answer = userAnswer.equals("y");

            if(answer){
                System.out.println("Replace the battery");
            }else{
                System.out.println("Does the car crank up but fail to start?");
                userAnswer = input.next();
                answer = userAnswer.equals("y");

                if(answer){
                    System.out.println("Check spark plug connections.");
                }else{
                    System.out.println("Does the engine start and then die?");
                    userAnswer = input.next();
                    answer = userAnswer.equals("y");

                    if(answer){
                        System.out.println("Does your car have fuel injection?");
                        userAnswer = input.next();
                        answer = userAnswer.equals("y");

                        if(answer){
                            System.out.println("Get it in for service.");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    }
                }
            }
        }


    }
}
