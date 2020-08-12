package org.fasttrackit.chapter7DataStructure;

/*Create a Magic 8 Ball game that prompts for a question and
        then displays either “Yes,” “No,” “Maybe,” or “Ask again
        later.”
        Constraint
        • The value should be chosen randomly using a pseudo
        random number generator. Store the possible choices
        in a list and select one at random.*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise33 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What's your question?");
        magic8Ball();

    }

    public static void magic8Ball(){

        Random randNum = new Random();

       input.next();

        ArrayList<String> answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later");

        System.out.println(answers.get(randNum.nextInt(3)));

    }

}
