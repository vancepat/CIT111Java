/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PinkymonBattle;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Pat
 */
public class Battle {
       
        public static Random r = new Random();
    
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

    Player challenger = new Player(); //initialize player/user
    Opponent opponent = new Opponent(); //initialize cpu opponent
    
    //get information from user about their name 
    System.out.println("Welcome, Pinkymon trainer! Enter your name! ");
    challenger.name = scan.next();
    System.out.println("Ahhh, " + challenger.name + ", We've heard of you!");
    
    //call information about first Pinkymon
    System.out.println("Your starting Pinkymon is: " + challenger.pMon.name + "  HP " + challenger.pMon.hp + "  STR " + challenger.pMon.str);
    
    System.out.println("\nYour opponent today will be..... " + opponent.name + "\n");
   
    //main battle loop, runs until one of the players has 6 fainted Pinkymon
    while(challenger.fainted < 6 && opponent.fainted < 6){
        
        //TODAY I LEARNED JAVA DOESN'T SUPPORT NESTED METHODS AND THAT SUPER SUCKS
        battleChallengerTurn(challenger, opponent);
          
        if(opponent.pMon.hp <=0){
            challenger.knockouts+=1;
        checkOFainted(opponent);
        } else{
            battleOpponentTurn(challenger, opponent);
        }
        
        if(challenger.pMon.hp <=0){
            checkCFainted(challenger);
            opponent.knockouts+=1;
        }
        
    }
    
    //check win conditions
    if(challenger.fainted < 6){
        System.out.println("YOU WIN, GOOD JOB!");
        System.out.println(challenger.fainted + " of your Pinkymon fainted.. go to a Pinkycenter");
    
    }else {
        System.out.println("Better luck next time! You knocked out " + opponent.fainted + " of your opponent's Pinkymon before losing");
    }
    }
    
    //one turn of the battle, challenger attacks with pinkymon
    public static void battleChallengerTurn(Player challenger, Opponent opponent){
        int damage = 0;
        System.out.println(challenger.pMon.name + " attacks!");
        damage = challenger.pMon.str + r.nextInt(7);
        opponent.pMon.hp -= damage;
        System.out.println(damage + " damage!\n");       
    }

    //one turn of the battle, opponent attacks with pinkymon
public static void battleOpponentTurn(Player challenger, Opponent opponent){
 int damage = 0;
 System.out.println(opponent.pMon.name + " attacks!");
        damage = challenger.pMon.str + r.nextInt(7);
        challenger.pMon.hp -= damage;
        System.out.println(damage + " damage!\n");  
}
    
    //if the opponent's pMon has fainted, generate a new one
    public static void checkOFainted(Opponent opponent){
        if(opponent.pMon.hp <= 0){
            System.out.println(opponent.pMon.name + " has fainted! Switching Pinkymon...");
            opponent.fainted+=1;
            opponent.pMon = new Pinkymon();
            System.out.println(opponent.name + " chose " + opponent.pMon.name + "!\n");
        }
    }
    //if the challenger's pMon has fainted, generate a new one
    public static void checkCFainted(Player challenger){
        if(challenger.pMon.hp <= 0){
            System.out.println(challenger.pMon.name + " has fainted! Switching Pinkymon...");
            challenger.fainted+=1;
            challenger.pMon = new Pinkymon();
            System.out.println(challenger.name + " chose " + challenger.pMon.name + "!\n");
        }
    }
}//close class

//technically this fight is a bit biased toward the player, since they always attack first. I could fix this with some random number generators, but I kind of liked giving the player a leg up. 