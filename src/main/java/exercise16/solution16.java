/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * A simple program that will produce one output, if the user is of legal age to drive or not. 
 */

package exercise16;
import java.util.*;

public class solution16 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in); //object to read user input

        int age;
        System.out.print("What is your age? ");
        age=s.nextInt(); //user inputs age

        if(age>=16){ //greater than or equal to condition for the statement
            System.out.println("You are legally old enough to drive. "); //true condition
        }else{ //if the condition is not met, print the other statement
            System.out.println("You are not legally old enough to drive. "); //false condition
        }
    }
}
