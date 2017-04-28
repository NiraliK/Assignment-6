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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a boolean array 
        boolean[] pNumbers = new boolean[1001];

        //create a loop to go through the array 
        for (int i = 0; i < 1001; i++) {
            pNumbers[i] = true;
        }

        //loop through numbers in array
        //if the loop if true the multiples are found 
        for (int m1 = 2; m1 < 1001; m1++) {
            if (pNumbers[m1] == true) {

                //loops through numbers starting from 2 and multiplies them 
                for (int m2 = 2; m2 < 1001; m2++) {
                    int m3 = m1 * m2;

                    //The other numbers are elminated from the array 
                    if (m3 < 1001) {
                        pNumbers[m3] = false;
                    }

                }

            }

        }
        //The prime numbers are output
        System.out.println("The prime numbers are:");
        for (int multiple = 2; multiple < 1001; multiple++) {
            if (pNumbers[multiple] == true) {
                System.out.println(multiple + "");
            }

        }
    }
}
