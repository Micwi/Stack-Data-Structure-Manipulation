/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg4;
import java.util.*;

/**
 *
 * @author louiejr.
 */
public class Challenge extends CSCI260Assignment4 {
    public void challenge_4(){
        Scanner keyboard = new Scanner(System.in);
        Stack TheStack = new Stack();
        
        double C = 0;
        double D = 0;
        
        System.out.println("Enter a value for the 401k: ");
        int A = keyboard.nextInt();
        
        System.out.println("Enter an interest rate you wish to earn: ");
        double B = keyboard.nextDouble();
        C = (A * B);
        
        for(int i = 1; i <= 30; i++){
            D = (D + C);
            TheStack.push(D);
           
        }
        System.out.println("The Stack values are: " + TheStack);
        System.out.println("The total value is: " + D);
    }
}
