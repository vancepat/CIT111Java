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
public class ForLoopIntro {
    
    public static void main(String[] args){
        int loopControl;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many loops fo you want in the for loop");
        loopControl = scan.nextInt();
        
        for(int i=0; i<=loopControl;i++){
            System.out.println("The value of i is: "+i);
        }
    }
    
}
