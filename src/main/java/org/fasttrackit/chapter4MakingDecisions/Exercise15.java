package org.fasttrackit.chapter4MakingDecisions;

/*Create a simple program that validates user login credentials.
        The program must prompt the user for a username and
        password. The program should compare the password given
        by the user to a known password. If the password matches,
        the program should display “Welcome!” If it doesn’t match,
        the program should display “I don’t know you.”
        Constraints
• Use an if/else statement for this problem.
• Make sure the program is case sensitive.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> users = new HashMap<>();

        users.put("Jhon", "abc$123");
        users.put("Mike" , "bcd1212@");
        users.put("Ana" , "ana34.");

        System.out.println("Enter your username :");
        String userName = input.nextLine();

        System.out.println("Enter your pass :");
        String pass = input.nextLine();

        if(users.get(userName).equals(pass)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }
    }

}
