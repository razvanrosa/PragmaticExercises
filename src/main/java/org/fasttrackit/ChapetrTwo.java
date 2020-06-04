package org.fasttrackit;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ChapetrTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Create a program that prompts for your name and prints
    a greeting using your name.*/

        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name + ", nice to meet you!");

           /*Create a program that prompts for an input string and dis-
    plays output that shows the input string and the number of
    characters the string contains.*/


        System.out.println("Enter a word!");
        String text = input.next();
        System.out.println("The text is: " + text +  " ,and it have a number of " + displayString(text) + " characters");
        //read the previous enter
        input.nextLine();

        /* Create a program that prompts for a quote and an author.
    Display the quotation and author*/



        System.out.println("Enter author name!");
        String author = input.nextLine();
        System.out.println("Enter quotation!");
        String quotation = input.nextLine();
        System.out.println(authorAndQuotation(author,quotation));

         /*Create a simple mad-lib program that prompts for a noun,
    a verb, an adverb, and an adjective and injects those into a
    story that you create.*/

        System.out.println("Enter an noun!");
        String noun = input.next();
        System.out.println("Enter an adverb!");
        String adverb = input.next();
        System.out.println("Enter an adjective!");
        String adjective = input.next();
        System.out.println("Enter an verb!");
        String verb = input.next();
        System.out.println(madLib(noun,adverb,adjective,verb));

        /*Write a program that prompts for two numbers. Print the
    sum, difference, product, and quotient of those numbers*/

        System.out.println("Enter first number!");
        double a = input.nextDouble();
        System.out.println("Enter second number!");
        double b = input.nextDouble();
        simplyMath(a,b);

        /*Create a program that determines how many years you have
    left until retirement and the year you can retire. It should
    prompt for your current age and the age you want to retire
    and display the output*/

        System.out.println("Enter the age when you want to retire.");
        int x = input.nextInt();
        System.out.println("Enter your current age.");
        int y = input.nextInt();
        retirementCalculator( x, y);
    }

    /*Create a program that prompts for an input string and dis-
    plays output that shows the input string and the number of
    characters the string contains.*/

    public static int displayString(String text){
        return text.length();
    }

   /* Create a program that prompts for a quote and an author.
    Display the quotation and author*/

    public static String authorAndQuotation(String author,String quotation){
        return author.concat(" says ").concat(quotation);
    }

    /*Create a simple mad-lib program that prompts for a noun,
    a verb, an adverb, and an adjective and injects those into a
    story that you create.*/

    public static String madLib(String noun,String adverb,String adjective,String verb){
        return "Are you ".concat(noun + " ").concat(verb + " ").concat(adjective + " ").concat(adverb + " ");
    }

    /*Write a program that prompts for two numbers. Print the
    sum, difference, product, and quotient of those numbers*/

    public static void simplyMath(double a,double b){
        System.out.println("Sum is: " + (a + b));
        System.out.println("Difference is: " + (a - b));
        System.out.println("Product is: " + (a * b));
        System.out.println("The result of division is: " + (a/b));
    }

    /*Create a program that determines how many years you have
    left until retirement and the year you can retire. It should
    prompt for your current age and the age you want to retire
    and display the output*/

    public static void retirementCalculator(int x,int y){
        LocalDateTime date = LocalDateTime.now();
        System.out.println("You have " + (x - y) + " years until you can retire.");
        System.out.println("It's " + date.toString()+ " you can retire in " + date.plusYears(x - y).toString());
    }


}
