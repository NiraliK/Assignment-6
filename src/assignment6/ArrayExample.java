/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for user input  
        Scanner input = new Scanner(System.in);

        //create a list of 5 numbers 
        //double[]- meaning creating a double array 
        double[] marks = new double[5];

        //scan in some marks 
        System.out.println("Please enter in 5 marks:");

        //BAD WAY!!!!!!
        // put a number in the first position 
        //marks[0] = input.nextDouble();
        //put number in second position 
        //marks[1] = input.nextDouble();     
        //so on.....
        //marks[2] = input.nextDouble();
        //marks[3] = input.nextDouble();
        //marks[4] = input.nextDouble();
        //marks[6] = input.nextDouble();
        //BETTER WAY TO DO THIS!!! - FOR LOOPS!!
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //print out what the marks are 
        System.out.println("The marks are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //EXTRA- enchanced for loop 
        for (double num : marks) {
            System.out.println(num);
        }
        //sorting method 
        Arrays.sort(marks);

        //use a for loop to determine the sum 
        //first part: take all numbers and add 
        // start with an accumulator 
        double sum = 0;
        //for loop for every number 
        for (int i = 0; i < marks.length; i++) {
            //add whtever number i'm on to sum 
            sum = sum + marks[i];
        }

        System.out.println("The sum is " + sum);

        double avg = sum / marks.length;

        System.out.println("Therefore the class average is " + avg);

    }

}
