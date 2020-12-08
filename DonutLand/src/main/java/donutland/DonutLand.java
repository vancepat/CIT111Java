/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutland;
import java.util.Random;
/**
 *
 * @author Pat
 */
public class DonutLand {
  
    public static void main(String[] args){
        Random r = new Random();
        final int firstBiteSize = r.nextInt(101);
        
        Donut firstDonut = new Donut();
        
        firstDonut.name = "Schmlanda";
        
        System.out.println("When first created, " + firstDonut.name + "'s Donut percent remaining is " + firstDonut.getPercRemaining());
        printDivider();
        
        System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
        
        firstDonut.simulateEating(firstBiteSize);
        System.out.println("After being eaten, the donut has a percent remaining of "+ firstDonut.getPercRemaining());
    }
    
    public static void printDivider(){
        System.out.println("....................................................");
    }
}
