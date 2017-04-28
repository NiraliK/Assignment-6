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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner 
        Scanner input = new Scanner(System.in);

        //determine the number of people whoses height iwll be read 
        System.out.println("Enter in the number of people whose height will be read:");
        int number = input.nextInt();

        //user will enter in the heights 
        System.out.println("Enter in the heights:");

        // double array is used to create a stored list 
        //the list is the number of people 
        double[] height = new double[number];

        // create a for loop to indintify the and find the length of the heights
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextDouble();
        }

        //use a for loop to determine the sum 
        //first part: take all numbers and add 
        double sum = 0;
        //create a for loop for every number  
        for (int i = 0; i < height.length; i++) {
            //add to each other to find the sum 
            sum = sum + height[i];
        }

        // calculate the average by diving the sum by the number of people 
        double avg = sum / number;

        //round the average to two decimal points 
        DecimalFormat n = new DecimalFormat("###.#");

        //printout the output (average mark of the class)
        System.out.println("Therefore the height average is " + n.format(avg) + "cm.");

        //refer back to the heights 
        for (int i = 0; i < height.length; i++) {
            if (avg < height[i]) {
                //print out the heights over avergae
                System.out.println("The heights over the average are: " + height[i] + "cm.");
            }
        }

    }

}
