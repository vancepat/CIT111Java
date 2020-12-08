/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Random;
import java.math.BigInteger;

/**
 *
 * @author Pat
 */
public class SimpleMethod {
    
    public static void main(String[] args){
        System.out.println("This code is inside method: main");
        printStatement();
        
        System.out.println("...back in main, newly hydrated");
        System.out.println("WOAHAOHAOAHOHA HERE WE GO OUTSIDE OF MAIN AGINNNNN");
        printStatement();
       generateBigNumber();
    }
    public static void printStatement(){
        System.out.println("This code is being called from the printStatement method");
    }
    
    public static void generateBigNumber(){
        
 Random r = new Random();   
    BigInteger bigInt = new BigInteger(100, r);
    System.out.println("BIG INT COMIN AT YA, BOOM " + bigInt);
}
}
