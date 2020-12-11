/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Pat
 */
public class SizedDonut {
    
    public String name;
            public int sizeInmm = 7;
            private int percRemaining = 100;
           
            
            
            
            
    public void simulateEating(int percentEaten){
        System.out.println("SizedDonut.simulateEating | eating passed in SizedDonut ");
        percRemaining -= percentEaten;
        System.out.println("SizedDonut.simulateEating | Perc Rem: " + percRemaining);
    }
    public int getPercRemaining(){
        return percRemaining;
    }
    
    
}
