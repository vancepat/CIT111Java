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
public class Feast {
  
    public static void main(String[] args){
        
        
        Donut1 firstDonut = new Donut1();
        Donut1 secondDonut = new Donut1();
        firstDonut.name = "Schmlanda";
        Pasta1 firstPasta = new Pasta1();
        firstPasta.name = "Riga Tony";
        Pizza1 firstPizza = new Pizza1();
        firstPizza.name = "BigCheez";
        
        
        printDonut(firstDonut);
        printPasta(firstPasta);
        printPizza(firstPizza);
               
       int totalCals=firstDonut.calsPerServing + firstPizza.calsPerServing + firstPasta.calsPerServing;
       System.out.println("Lotta cals there boyo...you've eaten "+ totalCals + " Calories");
        
      
      
    }
    
    public static void printDonut( Donut1 yamyam){
        Random r = new Random();
        final int firstBiteSize = r.nextInt(101);
        System.out.println("When first created, " + yamyam.name + "'s Donut percent remaining is " + yamyam.getPercRemaining());
        yamyam.simulateEating(firstBiteSize);
         System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
        
        
          System.out.println("After being eaten, the donut has a percent remaining of "+ yamyam.getPercRemaining());
          System.out.println("....................................................");
    }
     public static void printPasta( Pasta1 yamyam){
        Random r = new Random();
        final int firstBiteSize = r.nextInt(101);
        System.out.println("When first created, " + yamyam.name + "'s Pasta percent remaining is " + yamyam.getPercRemaining());
        yamyam.simulateEating(firstBiteSize);
         System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
       
        
          System.out.println("After being eaten, the pasta has a percent remaining of "+ yamyam.getPercRemaining());
           System.out.println("....................................................");
    }
      public static void printPizza( Pizza1 yamyam){
        Random r = new Random();
        final int firstBiteSize = r.nextInt(101);
        System.out.println("When first created, " + yamyam.name + "'s Pizza percent remaining is " + yamyam.getPercRemaining());
        yamyam.simulateEating(firstBiteSize);
         System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
      
        
          System.out.println("After being eaten, the pizza has a percent remaining of "+ yamyam.getPercRemaining());
            System.out.println("....................................................");
    }
}
