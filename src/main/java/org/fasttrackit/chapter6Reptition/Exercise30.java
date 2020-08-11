package org.fasttrackit.chapter6Reptition;

/*Create a program that generates multiplication tables for
        the numbers 0 through 12.
        Constraint
        • Use a nested loop to complete this program.
        Challenges
        • Create a graphical program. Use a drop-down list to
        change the base number. Generate or update the table
        when the number is selected.
        • Generate a single multiplication table.*/

public class Exercise30 {

    public static void main(String[] args) {
        multiplicationTables();
    }

    public static void multiplicationTables(){

        for(int i = 0; i<=12; i++){
            for(int j = 0; j <=12; j++){
                System.out.print(j * i + " ");
            }
            System.out.println(" ");
        }
    }
}
