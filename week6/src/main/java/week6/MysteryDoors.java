/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Pat
 */
public class MysteryDoors {

public static void main(String[] args){
    System.out.println("WELCOME TO MYYYYSTERY DOORS. WOW.");
    System.out.println("Let's use our imaginations, ASCII is tough");
    System.out.println("In front of you are three doors. Pick one, they all do different stuff. Enter 1, 2, or 3");
    
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    int age;
    switch(choice){
        case 1:
            door1();
        case 2:
            door2();
        case 3:
            System.out.println("OH BOY, YOU SELECTED DOOR # 3. ENTER YOUR AGE");
            age = scan.nextInt();
            door3(age);
        default:
            System.out.println("So..you can't follow rules, now ya done, son");
    }
}
    public static void door1(){
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("NOBODY REALLY KNOWS WHAT THIS NUMBER IS " + num);
    }
    public static void door2(){
        System.out.println("There's nothing behind door 2! THERE NEVER WAS");
    }
    public static void door3(int age){
        age*=200;
        System.out.println("You have travelled to the fuuuutureee and now you are ollllld, this ollllld: " + age);
    }
}


    
}
