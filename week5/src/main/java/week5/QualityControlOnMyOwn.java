/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Pat
 */
public class QualityControlOnMyOwn {
    
    public static void main(String[] args){
        Random rand = new Random();
        int threshold = 70, quality, totalTests = 5, currentTest = 0, passFails=0,fails=0;
    Scanner scan = new Scanner(System.in);
        while(currentTest<totalTests){
            System.out.println("Unit quality:");
            quality=scan.nextInt();
            
            if(quality>=threshold){
                System.out.println("passes quality test");
                passFails+=1;
            }else{
                System.out.println("BELOW QUALITY STANDARDS");
                passFails+=1;
                fails+=1;
            }
            currentTest+=1;
            System.out.println("Total failures: "+ fails+" out of " +passFails+" units made.");
        }
    System.out.println("SUMMARY");
    System.out.println("Tested " + totalTests + " units");
    System.out.println("Failure Ratio:" + Double.valueOf(fails)/Double.valueOf(passFails)); //could have just initialized as doubles...
    
    
    }
    
}
