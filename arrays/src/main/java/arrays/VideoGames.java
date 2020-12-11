/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Pat
 */
public class VideoGames {
    public static void main(String[] args){
        String[] games = new String[5];
        
        games[0] = "Shovel Knight";
        games[1] = "Wizards & Warriors";
        games[2] = "Kirby's Star Stacker";
        games[3] = "Skyrim";
        games[4] = "ToeJam & Earl";
        
        String retrievedGame = games[2];
        
        System.out.println("***Listing books***");
        for(int i=0; i<5; i++){
            System.out.println(games[i]);
        }
        System.out.println("Retrieving stored book*******");
        System.out.println(retrievedGame);
    }
    
    
}
