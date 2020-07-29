package org.fasttrackit.chapter4MakingDecisions;

/*Create a tax calculator that handles multiple states and
        multiple counties within each state. The program prompts
        the user for the order amount and the state where the order
        will be shipped.
        For Wisconsin residents, prompt for the county of residence.
        • For Eau Claire county residents, add an additional 0.005
        tax.
        • For Dunn county residents, add an additional 0.004 tax.
        Illinois residents must be charged 8% sales tax with no
        additional county-level charge. All other states are not
        charged tax. The program then displays the tax and the total
        for Wisconsin and Illinois residents but just the total for
        everyone else.
        Constraints
• Ensure that all money is rounded up to the nearest cent.
• Use a single output statement at the end of the program
to display the program results.*/

import java.util.Scanner;

public class Exercise20 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the order amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter the state where the order will be shipped: ");
        String state = input.next();

        double total;

        if(state.equals("Wisconsin")) {

            System.out.println("Enter the county of residence.");
            input.nextLine();
            String county = input.nextLine();

            if (county.equals("Eau Claire")) {
                total = amount + 0.50 + 0.005;
                System.out.println("The tax is: $0.50\n" + "The additional tax is: 0.005\n" + "The total is: " + total);
            }else if (county.equals("Dunn")){
                total = amount + 0.50 +0.004;
                System.out.println("The tax is: $0.50\n" + "The additional tax is: 0.004\n" + "The total is: " + total );
            }else{
                total = amount + 0.50;
                System.out.println("The tax is: $0.50\n" + "The total is: " + total);
            }
        }

        if (state.equals("Illinois")){
            double total1 = ((amount * 8) / 100) + amount;
            System.out.println("The tax is: 8%\n" + "The total is: " + total1);
        }

        if(!state.equals("Wisconsin") && !state.equals("Illinois")){
            System.out.println("The total is:" + amount);
        }
    }
}
