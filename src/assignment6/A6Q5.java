
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner cretaed
        Scanner input = new Scanner(System.in);

        // Ask the user how many students are in the class to determine the array num
        System.out.println("How many student marks are there in the class?");

        // input into next int
        int marksNum = input.nextInt();

        // Array created using the number of students 
        double[] marks = new double[marksNum];

        // Ask the user to input the marks
        System.out.println("Please enter the student marks.");

        // For loop is created to go through the array  
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        //Another for loop created through the array 
        for (int i = 0; i < marks.length; i++) {
            //For loop created to go through all numbers 
            for (int R = 0; R < marks.length; R++) {
                double x = marks[i];
                double y = marks[R];
                //Sorting the numbers
                if (marks[i] < marks[R]) {
                    marks[i] = y;
                    marks[R] = x;
                }
            }
        }

        //Print out the marks in order from lowest to highest 
        System.out.println("The student marks from lowest to highest are: ");

        //for loop created to print in ascending order 
        for (int i = 0; i < marksNum; i++) {
            System.out.println(marks[i]);
        }

        // Calculating the medium by creating an if statement
        //medium is the lowest and highest mark divided by 2
        if (marks.length % 2 == 0) {
            // Calculates the median with even amount of marks
            int mid = marks.length / 2;
            int mid2 = mid - 1;
            double median = (marks[mid] + marks[mid2]) / 2;

            // Print out the median for even number
            System.out.println("The median of the student marks are: " + median + ".");
        } //Else if statement created if the numbers are odd
        else {
            // Calculates the median with odd amount of numbers
            int mid = marks.length / 2;
            double median = marks[mid];

            //Print out the medium for the odd number
            System.out.println("The median of the marks is " + median + ".");
        }
    }
}
