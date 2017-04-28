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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cretae a scanner 
        Scanner input = new Scanner(System.in);

        //new array crreated, storing 10 marks
        int[] marks = new int[10];

        //Ask user to insert 10 marks 
        System.out.println("Please enter in 10 marks: ");

        //For loop is created to go along with the array 
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }

        //Another for loop created through the array 
        for (int i = 0; i < 10; i++) {
            //For loop created to go through all numbers 10 times and then rerange them 
            for (int R = 0; R < 10; R++) {
                int x = marks[i];
                int y = marks[R];
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
        //print out the marks 
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }
}
