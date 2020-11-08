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
public class OperatorsChallenge {
    public static void main(String[] args){
        int a=100, b=2000, r=b/a, mod=b%a;
        double d = 10.5, rd=mod*d;
        String line1 = "Go Ask Alice", line2 = "I think she'll know";
        System.out.println("The value of R is b / a, or " + r);
        System.out.println("b%a is: " + mod);
        System.out.println("rd is mod*d, which is: " + rd);
        a+=5;
        System.out.println("Computing b mod a into rd.....");
        rd=b%a;
        System.out.println("rd: "+rd);
        System.out.println(line1+" "+line2);
        System.out.println(line2+" "+line1);
        
        
    }
}
