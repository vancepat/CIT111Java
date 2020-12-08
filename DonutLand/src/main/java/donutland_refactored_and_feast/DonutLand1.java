/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutland_refactored_and_feast;
import donutland.*;
import java.util.Random;
/**
 *
 * @author Pat
 */
public class DonutLand1 {
  
    public static void main(String[] args){
        
        
        Donut1 firstDonut = new Donut1();
        Donut1 secondDonut = new Donut1();
        firstDonut.name = "Schmlanda";
        secondDonut.name = "Howzit";
        
        
        printObjectData(firstDonut);
        printObjectData(secondDonut);
        printObjectData(firstDonut);
        printObjectData(secondDonut);        
       
        
      
      
    }
    
    public static void printObjectData(Donut1 yamyam){
        Random r = new Random();
        final int firstBiteSize = r.nextInt(101);
        System.out.println("When first created, " + yamyam.name + "'s Donut percent remaining is " + yamyam.getPercRemaining());
        yamyam.simulateEating(firstBiteSize);
         System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
        System.out.println("....................................................");
        
          System.out.println("After being eaten, the donut has a percent remaining of "+ yamyam.getPercRemaining());
    }
}
