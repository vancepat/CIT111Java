/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class EnoughGas {
    public static void main(String[] args){
        double tankGallons, milesToStation, mpg;
        Scanner scan = new Scanner(System.in);
        double milesAvailable;
        
        System.out.println("How many gallons of gas do you have left?");
        tankGallons = scan.nextDouble();
        
         System.out.println("How many miles to the station?");
        milesToStation = scan.nextDouble();
        
         System.out.println("How many miles to the gallon do you get?");
        mpg = scan.nextDouble();
        
        milesAvailable = mpg*tankGallons;
        double mileDiff = milesToStation - milesAvailable;
        double mpgRatio = milesToStation / mpg;
        
        if(mpg < 0 || milesToStation <0 || tankGallons < 0){
        System.out.println("Go home and redo your math, you can't have negative numbers here!");
    }else if(milesAvailable >= milesToStation){
        System.out.println("Good job, you'll make it!");
    }else if(milesAvailable < milesToStation){
        System.out.println("Sorry boss, you're not going to make it. You'll have " + mileDiff +" miles to go");
        System.out.println("If you were cool and got " + mpgRatio + " Miles Per Gallon");
    }
        
    }
    
    
}
