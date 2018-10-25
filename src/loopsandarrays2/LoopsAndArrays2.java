/*
 * Evan Robertson
 * October 25th 2018
 * User inputs names and gets an output of the 2nd, 3rd and 4th names
 */

package loopsandarrays2;

import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class LoopsAndArrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        //Declare array
        String [ ] friends = new String [5];
        
        //Ask user to input names
        System.out.println("Enter the names of five friends:");
        
        //Loop to create variables for each friend
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //Output declared variables to user
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]);
        
    }
    
}
