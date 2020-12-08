/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Scanner;

/**
 *
 * @author Pat
 */
public class UnitConverter {

public static void main(String[] args){
double number;
Scanner scan = new Scanner(System.in);

System.out.println("Enter an arbitrary number!");
number = scan.nextDouble();

double number2 = arbitrariumizer(number);
System.out.println("After an arbitrary conversion, your number is now " + number2);

double number3 = arbit2(number);
System.out.println("Wow holy heck, after more magic math, your number is now" +number3);
}

public static double arbitrariumizer(double number){
    double output = number*number/654654*2+1.0-1.1;
    return output;
}
    
public static double arbit2(double number){
    double output = 389879847-number;
    return output;
}

}
