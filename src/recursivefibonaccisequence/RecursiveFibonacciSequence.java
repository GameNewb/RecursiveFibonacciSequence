/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefibonaccisequence;

/**
 *
 * @author Kyle
 */

import java.util.Scanner;

public class RecursiveFibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number for fibonacci: ");
        int n = input.nextInt();
        
        System.out.println("\nThe nth fibonacci number is: " + fibonacciSequence(n));
    }
    
    public static int fibonacciSequence(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else 
        {
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }
    }
}
