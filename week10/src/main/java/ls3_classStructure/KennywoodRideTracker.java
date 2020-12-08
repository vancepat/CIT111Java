/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Random;

/**
 *
 * @author Pat
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 7, totalFailedRideAttempts = 0, totalSickRiders = 0;
    private static int thrillHeight = 31, themeHeight = 15;
    private static Random r = new Random();
    
    public static void main(String[] args){
    rideBlackWidow(totalRiders, thrillHeight);
    
    rideMerryGoRound(totalRiders, themeHeight);
    printRideStats();
}
    
    public static void rideBlackWidow(int riders, int avgHeight){
        //average height requirement is 30. It's arbitrary, ok?
        if(avgHeight >=30){
            System.out.println("Riding Black widow!");
            totalRiders+=riders;
            totalSickRiders+= r.nextInt(9);
            
        }else{
            totalFailedRideAttempts+=riders;
            System.out.println("OH NO, TOO SHORT, " + riders + " riders got turned awayyy");
        }
    }
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >=20){
            System.out.println("Riding Merry Go Round!");
            totalRiders+=riders;
            totalSickRiders+= r.nextInt(9);
            
        }else{
            totalFailedRideAttempts+=riders;
            System.out.println("OH NO, TOO SHORT, " + riders + " riders got turned awayyy");
        }
    }
    
    public static void printRideStats(){
        System.out.println("Printing rider statistics...");
        System.out.println("Total riders: "+ totalRiders);
        System.out.println("Total Sick riders: " + totalSickRiders);
        System.out.println("Total Failed Ride Attempts: "+ totalFailedRideAttempts);
    }
    
}
