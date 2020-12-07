/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class WhileWithScanner {

public static void main(String[] args){
    
    int numLoops = 0;
    int loopControl;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many loops shall I print?");
    loopControl = scanner.nextInt();
    
    while (numLoops <= loopControl){
        System.out.println("The value of numLoops is: " + numLoops);
        numLoops+=1;
    }
    System.out.println("finally free");
}
    
}
