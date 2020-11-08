/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;


class ArithmeticDemo {

    public static void main (String[] args) {

        int result = 11 + 22;
        // result is now 33
        System.out.println("11 + 22 = " + result);
        int original_result = result;

        result = result - 10;
        // result is now 23
        System.out.println(original_result + " - 10 = " + result);
        original_result = result;

        result = result * 4;
        // result is now 92
        System.out.println(original_result + " * 4 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 46
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 81;
        // result is now 127
        System.out.println(original_result + " + 81 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 1
        System.out.println(original_result + " % 7 = " + result);
    }
}