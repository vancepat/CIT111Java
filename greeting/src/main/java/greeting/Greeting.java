/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting;

import java.util.Calendar;
/**
 *
 * @author Pat. This example of multiline commenting is already here, so here's my demonstration of this.
 */
public class Greeting {
    public static void main(String[] args){
        Calendar today = Calendar.getInstance(); // need java.util.Calendar to function
        today.set(Calendar.HOUR_OF_DAY, 0);
        System.out.println("Hello, my name is Patrick");
        System.out.println("Today's date and time are " + today.getTime());
    } //end of main
} //end of class

//refactored this code, yay not caring about whitespace. There's a typo on exercise 3.