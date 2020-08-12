package org.fasttrackit.chapter7DataStructure;

/*
Write a program that prompts for response times from a
        website in milliseconds. It should keep asking for values
        until the user enters “done.”
        The program should print the average time (mean), the
        minimum time, the maximum time, and the standard devi-
        ation.
        To compute the average (mean)
        1.
        2.
        Compute the sum of all values.
        Divide the sum by the number of values.
        To compute the standard deviation
        1.
        Calculate the difference from the mean for each number
        and square it.
        2 Compute the mean of the squared values.
        3 Take the square root of the mean.
        Constraints
        • Use loops and arrays to perform the input and mathe-
        matical operations.
        • Be sure to exclude the “done” entry from the array of
inputs.
• Be sure to properly convert numeric values to strings.
• Keep the input separate from the processing and the
output.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise36 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        responseTime();
    }

    public static void responseTime(){

        ArrayList<Integer> times = new ArrayList<>();

        Integer number = 0;
        boolean done = false;

        do {
            System.out.println("Enter a number: ");
            try{
                number = input.nextInt();
            }catch (InputMismatchException e){
                if (input.nextLine().equals("done")){
                    done = true;
                    number = null;
                }
            }

            if (number != null) {
                times.add(number);
            }


        }while(!done);

        System.out.println(times);
        Object[] timesArray = times.toArray();
        Arrays.sort(timesArray);

        int sum =0;
        for(int i = 0;i< timesArray.length;i++){
            sum = sum + (int)timesArray[i];
        }
        int[] difArray = new int[timesArray.length];

        int timesMean = sum/ timesArray.length;
        for(int i=0;i< timesArray.length;i++){
            difArray[i] = (int) Math.pow((timesMean - ((Integer) timesArray[i]).intValue()),2);
        }
        double sum2 = 0;
        for(int i = 0;i < difArray.length; i++){
            sum2 = sum2 + difArray[i];
        }

        System.out.println("The average is: " + sum / timesArray.length);
        System.out.println("The minimum is: " + timesArray[0]);
        System.out.println("The maximum is: " + timesArray[timesArray.length-1]);
        System.out.println("The standard deviation is: " + Math.sqrt(sum2/ difArray.length));


    }
}
