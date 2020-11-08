/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Pat
 */
public class Comparisons {
    public static void main(String[] args){
        int age=51, retirementAge=55;
        
        System.out.println("Is age old enough to be retired? " + (age>=retirementAge));
        if(age>=retirementAge){
            System.out.println("You're old, maybe take some pills");
        } else{
            System.out.println("A few good years left, I suppose");
        }
    }
}
