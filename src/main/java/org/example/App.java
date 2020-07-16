package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        double daysElapsed;
        double casesForToday;
        double totalCases;
        double increaseInCases;



        Scanner objInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number of days elapsed since March 15");



        daysElapsed = objInput.nextDouble();  // Read user input
        increaseInCases=8*daysElapsed-300;
        System.out.printf("The rate of increase in cases for today is :" +Math.round(increaseInCases));
        System.out.println();

        casesForToday=4*Math.pow(daysElapsed,2) - 300*daysElapsed + 7115;

        System.out.println("The predicted number of cases for today are :" +Math.round(casesForToday));  // Output user input
        double y = daysElapsed-1;
        double z = 4*Math.pow(y,2) - 300*y + 7115;
        double x = casesForToday/z ;
        System.out.println("The predicted percent increase in cases from yesterday is :" + x + "%");
        System.out.println();

        totalCases=4*Math.pow(daysElapsed,3)/3-300*Math.pow(daysElapsed,2)/2 + 7115*daysElapsed;
        System.out.printf("The total predicted number of infected people till now are :" +Math.round(totalCases));







    }



}
