/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author Pat
 */
public class ScopeBasics {
    private static String classScopedVar = "Class variable, all methods can access";
    
    public static void demonstrateScope(){
        System.out.println("Inside demonstrateScope");
        
        String localScope2 = "I'm local to demonstrateScope";
        
        //System.out.println(localScope1);
        //declared in Main
        
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
    classScopedVar = "I can be changed in any method";
    
    }
    public static void main(String[] args){
        System.out.println("Inside Main");
        String localScope1 = " I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
       
       //declared in demonstrateScope.
       //System.out.println(localScope2);
        
        demonstrateScope();
    }
    
}
