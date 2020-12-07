package week4;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pat
 */
public class RideHeight {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final double MIN_HEIGHT_CM = 80;
        double userHeight;
        
        System.out.println("Enter your height in CM:");
        userHeight = scan.nextDouble();
        if(userHeight < MIN_HEIGHT_CM){
            System.out.println("you are too short, go ride the kiddie rides");
        }else{
            System.out.println("Good to go, have fun!");
        }
        
    }
    
}
