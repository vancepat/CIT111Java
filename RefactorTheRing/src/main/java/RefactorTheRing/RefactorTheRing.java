/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefactorTheRing;

import java.util.Random;

/**
 * Refactoring practice: study the following code based on the film The Ring
 * and avoid repeating ANY lines of code that follow a similar pattern
 * by breaking those duplicated lines into their own method and writing
 * input and output parameters such that the same output can be generated
 * as shown in the un-refactored version below.
 * 
 * @author delores
 */
public class RefactorTheRing {
    static int numViewersSwallowedByRing = 0;
    // chop main up and call the new methods as needed
    public static void main(String[] args) {
        
        //I could make this an array to simplify but don't want to remember how arrays work until I get to it.
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        watchedTape(viewer1);
        copyCopy(viewer1,1);
         watchedTape(viewer2);
        copyCopy(viewer2,2);
         watchedTape(viewer3);
        copyCopy(viewer3,3);
         watchedTape(viewer4);
        copyCopy(viewer4,4);
         watchedTape(viewer5);
        copyCopy(viewer5,5);

        
        
        
        System.out.println("****************************************");
        
        
         
       
        
    } // close main
    
    public static void watchedTape(String viewer){
        System.out.println(viewer + " watched the tape; 7 days to live");
    }
    
    public static void copyCopy(String viewer, int num){
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        String yesNo;
        if(madeCopy) yesNo="Yes";else yesNo="No";
        
        System.out.println("Did Viewer " + num +" named " + viewer + " make a copy? " + yesNo);
        
        
        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
    }
    
} // close class