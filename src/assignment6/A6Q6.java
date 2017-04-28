/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner created
        Scanner input = new Scanner(System.in);

        //determine the number of students who's marks are entered
        System.out.println("How many students are in the class?");
        int number = input.nextInt();

        // double array is used to create a stored list
        //the list is the number of students in the class
        double[] marks = new double[number];

        //user will enter in marks, one in each line
        System.out.println("*Only one mark can be entered in each line*");
        System.out.println("Enter in marks:");

        //For loop is created to go along with the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        //Another for loop created through the array
        for (int R = 0; R < marks.length; R++) {
            //For loop created to go through all numbers and then rerange them
            for (int i = R; i < marks.length; i++) {
                if (marks[R] > marks[i]) {
                    double num = marks[i];
                    marks[i] = marks[R];
                    marks[R] = num;
                }
            }
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

        //print out the lowest mark, get position at 0
        System.out.println("The lowest mark is: " + marks[0] + "%.");
        //print out highest mark, get position 1 position less then length of mark
        System.out.println("The hightest mark is: " + marks[marks.length - 1] + "%.");
        //print out the average mark
        System.out.println("The average mark is: " + n.format(avg) + "%.");
        //if class average if over 70, then good if not then bad 
        if (avg < 70) {
            System.out.println("YOU SHOULD BE WORRIED!");
        }
        if (avg >= 70) {
            System.out.println("GOOD JOB!");
        }
    }
}
