/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;

/**
 *
 * @author Pat
 */
public class IntegerArray {
    
    
    public static void main(String[] args){
        int[] beakers = new int[]{13,20,3,15,13};
        int[] flasks = new int[]{250,100,190,150};
        
        analyzeAnyArray(beakers);
        analyzeAnyArray(flasks);
        getInput();
    }
    
    public static void analyzeAnyArray(int[] anInt){
        int sum = 0;
        for(int i=0; i< anInt.length; i++){
            System.out.println(anInt[i]);
            sum+=anInt[i];
        }
        System.out.println("SUM: "+sum);
        System.out.println("AVG: "+ (sum/anInt.length));
    }
    
    public static void getInput(){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the length of your array");
        int arrayLength = scan.nextInt();
        int[] userArray; 
        userArray = new int[arrayLength];
        
        for(int i=0; i<userArray.length;i++){
            System.out.println("Enter a number");
            userArray[i] = scan.nextInt();
            sum+= userArray[i];
        }
        
         for(int i=0; i<userArray.length;i++){
            System.out.println(userArray[i] + " ");
            
        }
        System.out.println("SUM: "+sum);
        System.out.println("AVG: "+ (sum/userArray.length));
        
    }
    
}
