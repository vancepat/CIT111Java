/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtothefuture;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class Car {
    public int year;
    public String makeModel;
    
    public boolean isEngineRunning;
    public double speed;
    public double gear;
    public String currentDate = "2020 corona";
    public String destinationDate ;
    Scanner scan = new Scanner(System.in);
    
    
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("Engine Started.");
    }
    
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("Engine stopped.");
    }
    
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    public double getCurrentSpeed(){
        return speed;
    }
    
    public double accelerate(int mphIncrease){
        speed += mphIncrease;
        setGear(speed);
                return speed;
    }
    
     public double decelerate(int mphDecrease){
         if(mphDecrease <= speed ){
        speed -= mphDecrease; setGear(speed);
                return speed;} else{
             System.out.println("SLOWING DOWN TOO MUCH");
             setGear(speed);
             return speed;
         }
    }
     
     public double setGear(double speedy){
         if(speedy<50) gear = 1;
         if(speedy>=50) gear = 2;
         return gear;
     }
    
     public void setDate(){
         System.out.println("Ener the destination date: ");
         this.destinationDate = scan.next();
     }
    
    
    
}
