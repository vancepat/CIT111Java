/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Pat
 */
public class SimpleWhile {
    
    public static void main(String[] args){
        int numLoops = 0;
        
        while(numLoops < 10){
            System.out.println("I'm looping! " + numLoops);
            numLoops+=1;
        }
    }
    
}
