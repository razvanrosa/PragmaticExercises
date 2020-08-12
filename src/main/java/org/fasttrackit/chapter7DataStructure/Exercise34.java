package org.fasttrackit.chapter7DataStructure;

/*Create a small program that contains a list of employee
        names. Print out the list of names when the program runs
        the first time. Prompt for an employee name and remove
        that specific name from the list of names. Display the
        remaining employees, each on its own line.
        Constraint
        • Use an array or list to store the names.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise34 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        deleteEmployee();
    }

    public static void deleteEmployee(){
        String userChoice = "";

        ArrayList<String> employee = new ArrayList<>();
        employee.add("John Smith");
        employee.add("Jackie Jackson");
        employee.add("Chris Jones");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");

        System.out.println("There are " + employee.size() + " employees: " + employee);

        System.out.println("Enter an employee name to remove: ");
        try {
            userChoice = input.nextLine();
        }catch (Exception e ){
            System.out.println("You enter an invalid value.Try again");
            deleteEmployee();
        }
        for (int i = 0; i < employee.size(); i++)
            if (employee.get(i).equals(userChoice)) {
                employee.remove(i);
                break;
            }
        System.out.println("There are " + employee.size() + " employees" + employee);

    }
}
