/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutland_refactored_and_feast;

/**
 *
 * @author Pat
 */
public class Pizza1 {
    public int percRemaining = 100;
    public String name;
    public boolean sauced;
    public boolean extraCheese;
    public String size;
    public int calsPerServing = 400;
    
    public void simulateEating(int percentEaten){
       // System.out.println("Inside simulateEating method..");
        percRemaining-= percentEaten;
    }
    
    public int getPercRemaining(){
       // System.out.println("Inside getPercRemaining method...");
        return percRemaining;
    }
    
}
