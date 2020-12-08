/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;
/**
 *
 * @author Pat
 */
public class BasicSwitchWithCalls {
    
    public static void main(String[] args){
        int choice;
        Scanner scan = new Scanner(System.in);
        
                System.out.println("Enter a choice. 1-3. They all do stuff.");
                choice = scan.nextInt();
        switch(choice){
            case 1:
                printStatement();
                break;
            case 2:
                bigNum();
                break;
            case 3:
                System.out.println("Alright, jeesh, you're out, son.");
                break;
            default:
                System.out.println("Well, maybe next time enter a good number");
        }
    }
    public static void printStatement(){
        System.out.println("Good job, you entered 1, this is a special statement! <3");
    }
    public static void bigNum(){
        Random rand = new Random();
        BigInteger bigint = new BigInteger(1000, rand);
        System.out.println(bigint);
    }
}
