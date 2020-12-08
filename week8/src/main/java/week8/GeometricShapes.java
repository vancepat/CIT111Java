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
public class GeometricShapes {
    
    public static void main(String[] args){
        double cSide, cyRadius, cyHeight, tSide1, tSide2, tHeight;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the side length of the cube to calculate its volume: ");
        cSide = scan.nextDouble();
        double cubeVol = cube(cSide);
        System.out.println("The volume of the cube is: " + cubeVol);
        
        
        System.out.println("Enter the cylinder radius:");
        cyRadius = scan.nextDouble();
        System.out.println("Enter the cylinder height:");
        cyHeight = scan.nextDouble();
        double cylVol = cylinder(cyRadius,cyHeight);
        System.out.println("The volume of the cylinder is: "+ cylVol);
        
        System.out.println("Enter trap side 1:");
        tSide1 = scan.nextDouble();
        System.out.println("Enter trap side 2:");
        tSide2 = scan.nextDouble();
        System.out.println("Enter trap height:");
        tHeight = scan.nextDouble();
        double tVol = trapezoid(tSide1,tSide2,tHeight);
        System.out.println("The area of the trap is: "+ tVol);                                        
        
    }
    
    public static double cube(double length){
        double volume = length*length*length;
        return volume;
    }
    
    public static double cylinder(double radius, double height){
        final double PI = 3.14159;
        double volume = 2*PI*radius*height+2*PI*radius*radius;
        return volume;
    }
    
    public static double trapezoid(double side1, double side2, double height){
        double area = (side1+side2)/2*height;
        return area;
    }
    
    
}
