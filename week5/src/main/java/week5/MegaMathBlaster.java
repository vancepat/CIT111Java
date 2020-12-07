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
public class MegaMathBlaster {
    
    public static void main(String[] args){
        final int answer = 80;
        int attempts=0;
        final int maxAttempts=3;
        Scanner scan = new Scanner(System.in);
        int guess=0;
        
        while(attempts < maxAttempts){
            System.out.println("What is 9^2 - 4 * 7 / 28 * 1");
            guess=scan.nextInt();
            
            if(guess==answer){
                System.out.println("Good job.");
                break;
            }
            System.out.println("Try again, maybe use some paper and pencil");
            attempts+=1;
        }
        if(attempts==maxAttempts){
            System.out.println("So, you really can't do math, huh..");
            System.out.println("9^2 - 4 * 7 / 28 * 1 = ?");
            System.out.println("81 - 4 * 7 / 28 * 1 = ?");
            System.out.println("81 - 28 / 28 = ?");
            System.out.println("81 - 1 = ?");
            System.out.println("80");
        }
    }
    
    
}
