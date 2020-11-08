/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class RoadTripSimulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String car, carName, destination;
        int totalMiles, odometer, passengers;
        double spendingMoney;
        boolean destinationReached = false;
        
        System.out.println("LET'S GET SOME INFORMATION");
        System.out.println("What kind of car do you drive?");
        car = scan.nextLine();
        System.out.println("Does your car have a name?");
        carName = scan.nextLine();
        System.out.println("How far is your destination?");
        totalMiles = Integer.parseInt(scan.nextLine());
        System.out.println("Where is your destination?");
        destination = scan.nextLine();
        System.out.println("What's your odometer read?");
        odometer = Integer.parseInt(scan.nextLine());
        System.out.println("Do you have any passengers?");
        passengers = Integer.parseInt(scan.nextLine());
        System.out.println("How much cash you bringing?");
        spendingMoney = Integer.parseInt(scan.nextLine());
        System.out.println("");
        System.out.println("");
        
        System.out.println("ROAD TRIP SIMULATOR, PAT STYLE");
        System.out.println("We're heading to " + destination + ", it's going to be a long trip of " + totalMiles + " miles");
        System.out.println("Riding strong in our baby " + carName + " the " + car);
        System.out.println("Our odometer is at " + odometer + " and will be at " + (odometer+totalMiles) + " when we're through");
        if(passengers==0){
            System.out.println("ridin' solo with " + spendingMoney + " Dolla bills yall");
        }else{
            System.out.println("ridin...bro-lo?" + spendingMoney + " Dolla bills yall");
        }
        
        System.out.println("\n okay, we're 500 miles in");
        if(totalMiles>=500){
            spendingMoney-=500/30*2.25; //making assumptions on mileage at 30mpg and 2.25 at gas price. It's a pandemic.
            totalMiles-=500;
        }else{
            totalMiles=0;
            destinationReached=true;
        }
        if(totalMiles>0){
            System.out.println("We have " + totalMiles+ " miles left, and have travelled 500");
        }
        if(destinationReached){
            System.out.println("Ya done, son! Spend your cash, enjoy your stay");
        }
        
       if(totalMiles>0){
           if(passengers<=2){
               System.out.println("WE PICKIN UP 2 HITCHHIKERS");
               passengers+=2;
           }
           
       }
       if(totalMiles>=500){
            spendingMoney-=500/30*2.25; //making assumptions on mileage at 30mpg and 2.25 at gas price. It's a pandemic.
            totalMiles-=500;
        }else{
            totalMiles=0;
            destinationReached=true;
        }
        if(totalMiles>0){
            System.out.println("We have " + totalMiles+ " miles left, and have travelled 1000");
        }
        if(totalMiles>0){
            spendingMoney-=totalMiles/30*2.25; //making assumptions on mileage at 30mpg and 2.25 at gas price. It's a pandemic.
            totalMiles=0;
            destinationReached=true;
        
        }
            System.out.println("We have  arrived");
        
        
        
    }
}
