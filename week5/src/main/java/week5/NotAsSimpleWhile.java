/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Pat
 */
public class NotAsSimpleWhile {
    
    public static void main(String[] args){
        int numLoops = 1;
        
        while(numLoops < 11){
            System.out.println("I'm looping! " + numLoops);
            numLoops+=1;
        }
        System.out.println("..We are free of that terrible while loop");
    }
    
}
