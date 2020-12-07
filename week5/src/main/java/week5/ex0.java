/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class ex0 {
    
    //I don't really know why I did this as a convoluted series of nested if's but to be honest I'm just going to leave it because
    //I understand while loops and this was more time than I'd like to have spent on one exercise; also it works so -shrug-
    public static void main(String[] args){
        int score=0; //'friend score'
        String answer;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Are you honest?");
        answer = scan.next();
        
        if(answer.equals("yes")){
            System.out.println("Can you keep a secret?");
            answer = scan.next();
            
            if(answer.equals("yes")){
                score+=100;
            } else{
                score -=100;
               
            }
            
        } else{
            score -=100;
            
        }
        
        if(score<0){
            System.out.println("Are you a positive person?");
            answer = scan.next();
            if(answer.equals("no")){
                score-=100;
                System.out.println("We can't be friends");
            }else{
                System.out.println("are you empathetic?");
                answer=scan.next();
                if(answer.equals("no")){
                    System.out.println("we can't be friends");
                }else{
                    System.out.println("Do you folow current affairs?");
                    answer=scan.next();
                    if(answer.equals("no")){
                        System.out.println("We can't be friends..");
                    }else{
                        System.out.println("We can be friends!");
                    }
                }
            }
            
        }else{
            System.out.println("Do you follow current affairs?");
            answer=scan.next();
            if(answer.equals("no")){
                System.out.println("We canna be frenz");
                
            }else{
                System.out.println("We can be friends!");
            }
        }
        }
        
        
    }

