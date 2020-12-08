/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mightwebefriends;
import java.util.Scanner; //need Scanner class for user input
/**
 *
 * @author Pat
 */
public class Main {
    
    public static void main(String[] args){
        int friendScore = 0; //basis for determination of friendship
        int loopCounter = 0; //initialization of loop letting it run up to the loopMax
        int loopMax = 6; //maximum number of times loop will run and ask questions. Actual loop may be less than 6 if their answers are bad
        Scanner scan = new Scanner(System.in); //for getting user input. 
        String answer = ""; //when user is asked a question, this will record their answer. Since we are looping linearly, I just have this coded to rewrite the answer as we go as opposed to having 6 variables.
        
        //questions to ask potential friend
        //array would be prettier but I don't remember array structure yet.
        String studyBuddy = "Would you be down to study together?";
        String weekendWarrior = "Are you free on the weekends?";
        String substanceAbuse = "Do you do drugs or alcohol?";
        String gamer = "How do ya feel bout them vidja games?";
        String workLifeBalance = "Do you work more than 40 hours a week?";
        String political = "Do you care about politics?";
        
        
        System.out.println("Welcome to the Friend Score Assessment Program™. Please answer all questions as yes or no");
        
        /* loop logic. Program will run loop and assess friend score as it runs. If at any point friend score is -20 or less,
        loop will break and determination will be made. Otherwise, loop will run 6 times and determination will be made after.
        */
        while(loopCounter < loopMax && friendScore > -20){ 
            if(loopCounter == 0){
               System.out.println(studyBuddy);
               answer = scan.next();
               if(answer.equals("yes")){
                   friendScore +=10;
               }else{
                   friendScore -=0; //in cases where friendscore -=0, it doesn't 'hurt' the potential friend that they don't answer yes
               }
                
            }else
             if(loopCounter == 1){
                System.out.println(weekendWarrior);
               answer = scan.next();
               if(answer.equals("yes")){
                   friendScore +=10;
               }else{
                   friendScore -=10; //I'm really only free on the weekends, so
               }
            }else
              if(loopCounter == 2){
                System.out.println(substanceAbuse);
               answer = scan.next();
               if(answer.equals("no")){
                   friendScore +=10;
               }else{
                   friendScore -=30; //pretty hard no for me on this one 
               }
            }else
               if(loopCounter == 3){
                System.out.println(gamer);
               answer = scan.next();
               if(answer.equals("yes")){
                   friendScore +=10;
               }else{
                   friendScore -=0; 
               }
            }else
                if(loopCounter == 4){
                System.out.println(workLifeBalance);
               answer = scan.next();
               if(answer.equals("no")){
                   friendScore +=10;
               }else{
                   friendScore -=10; //people who do this scare me, I guess 
               }
            }else
                 if(loopCounter == 5){
                System.out.println(political);
               answer = scan.next();
               if(answer.equals("no")){
                   friendScore +=10;
               }else{
                   friendScore -=0; 
               }
            }
            
            
            loopCounter++; //loop counter increases by one each loop iteration, which keeps loop going finitely and also triggers next question
        }
        
        //final logic to see if we can be friends or not
        if(friendScore >= 20){
            System.out.println("We could prob be friends, call me maybe");
        }else System.out.println("I think you should find other friends");
        
    }
    
}//really would have liked a switch statement as opposed to nested ifs, but I didn't want to get ahead and don't super remember how they work.
