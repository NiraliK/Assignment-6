/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner 
        Scanner input = new Scanner(System.in);

        //determine the number of students who's marks are entered
        System.out.println("How many students are in the class?");
        int number = input.nextInt();

        //user will enter in marks
        System.out.println("Enter in marks:");

        // double array is used to create a stored list 
        //the list is the number of students in the class 
        double[] marks = new double[number];

        // create a for loop to indintify the and find the length of the marks
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //use a for loop to determine the sum 
        //first part: take all numbers and add 
        double sum = 0;
        //create a for loop for every number  
        for (int i = 0; i < marks.length; i++) {
            //add to each other to find the sum 
            sum = sum + marks[i];
        }

        // calculate the average by diving the sum by the number of students 
        double avg = sum / number;

        //round the average to two decimal points 
        DecimalFormat n = new DecimalFormat("###.##");

        //printout the output (average mark of the class)
        System.out.println("Therefore the class average is " + n.format(avg) + "%.");

    }

}
