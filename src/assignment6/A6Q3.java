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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);

        //Create an array named as "A" to store two elements 
        int[] A = new int[2];

        //ask the user to insert 2 numbers 
        System.out.println("Please enter in 2 numbers:");
        //create a for loop to go trough the array
        for (int i = 0; i < 2; i++) {
            A[i] = input.nextInt();
        }

        //check if the integer located in space 1 is larger then 1
        if (A[1] > A[0]) {
            //TRUE: the numbers have been entered in ascending order 
            //Space 0 will be output first then space 1 
            System.out.println("The integers in an ascending order are: " + A[0] + ", " + A[1] + ".");
            //FALSE: the second number will be printed out first then the first number
            System.out.println("The integers in ascending order are: " + A[1] + ", " + A[0] + '.');
        }
    }
}
