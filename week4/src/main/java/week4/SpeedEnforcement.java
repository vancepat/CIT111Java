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
public class SpeedEnforcement {
    
    public static void main(String[] args){
        final double MIN_SPEED = 40, MAX_SPEED = 55;
        Scanner scan = new Scanner(System.in);
        double speed;
        System.out.println("Please enter the recorded speed in MPH:");
        speed = scan.nextDouble();
        
        if(speed < MIN_SPEED){
            System.out.println("Bump this person up to some speed, they are too slow");
        }else if (speed > MAX_SPEED){
            System.out.println("GIVE THEM A TICKET, THEY GOIN TOO FAST");
        }else{
            System.out.println("User is driving at an appropriate speed");
        }
        
        
    }
    
    
}
