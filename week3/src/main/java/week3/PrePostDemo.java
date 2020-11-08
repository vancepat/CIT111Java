/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

class PrePostDemo {
    public static void main(String[] args){
        int i = 1;
        i++;
        // prints 2
        System.out.println(i);
        ++i;			   
        // prints 3
        System.out.println(i);
        // prints 4
        System.out.println(++i);
        // prints 4
        System.out.println(i++);
        // prints 5
        System.out.println(i);
    }
}