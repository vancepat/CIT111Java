/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class RetirementAge {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        while(true){
            System.out.println("Enter your age to see if you can retire: ");
            age = scan.nextInt();
            if(age<=0){
                System.out.println("You're either wrong, haven't been born, or are trying to quit, and you know what? Ya done, son.");
                        break;
            }else if(age > 65 ){ //65.5 is a bit arbitrary if we're dealing with an int
                System.out.println("Wahoo! Grab the newspaper and something stronger than a martini!");
                
            } else{
                System.out.println("Sorry, one more year of work for you");
            }
        }
    }
    
    
}
