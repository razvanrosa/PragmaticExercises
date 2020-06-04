package org.fasttrackit;

import java.util.Scanner;

public class ChapterOne {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double bill;
        double tipPercentage;

        System.out.println("Enter bill cost");
        bill =input.nextDouble();
        System.out.println("Enter tip percentage");
        tipPercentage = input.nextDouble();
        double tip = billAndTip(bill,tipPercentage);
        System.out.println( "The tip is: " + tip);
        System.out.println("Total cost is : " + (tip + bill));


    }

    /*Create a simple tip calculator. The program should prompt
    for a bill amount and a tip rate. The program must compute
    the tip and then display both the tip and the total amount of
    the bill.*/

        public static double billAndTip( double bill, double tipProcentage){
            return  (bill * tipProcentage)/100;
        }

}
