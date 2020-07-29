package org.fasttrackit.chapter5Functions;

/*
Create a program that compares two strings and determines
        if the two strings are anagrams. The program should prompt
        for both input strings and display the output as shown in
        the example that follows.
        Constraints
        • Implement the program using a function called isAna-
        gram , which takes in two words as its arguments and
        returns true or false . Invoke this function from your main
        program.
        • Check that both words are the same length.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercise24 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        String first = input.next();
        System.out.println("Enter the second string: ");
        String second = input.next();

        if(isAnagram(first,second)){
            System.out.println(first + " and " + second + " are anagrams.");
        }else{
            System.out.println("The strings you enter are not anagrams.");
        }

    }

    public static boolean isAnagram(String first,String second){
        if(first.length()!= second.length()){
            return false;
        }

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < first.length(); i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}

