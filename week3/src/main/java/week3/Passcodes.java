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
public class Passcodes {
    public static void main(String[] args){
        int correctPasscode=5934, attempt=1234;
        if(correctPasscode==attempt){
            System.out.println("Codes match! You're in");
        }else{
            System.out.println("Codes don't match--No soup for you!");
        }
    }
}
