package org.fasttrackit.Chapter4MakingDecisions;
/*
Write a program that converts a number from 1 to 12 to the
        corresponding month. Prompt for a number and display the
        corresponding calendar month, with 1 being January and
        12 being December. For any value outside that range, display
        an appropriate error message.
        Constraints
        • Use a switch or case statement for this program.
        • Use a single output statement for this program.*/

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of the month: ");

            int number = input.nextInt();
            String month;

        switch (number) {
            case 1:  month = "January";
                break;
            case 2:  month = "February";
                break;
            case 3:  month = "March";
                break;
            case 4:  month = "April";
                break;
            case 5:  month = "May";
                break;
            case 6:  month = "June";
                break;
            case 7:  month = "July";
                break;
            case 8:  month = "August";
                break;
            case 9:  month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Invalid month";
                break;
        }
        System.out.println(month);
    }
}
