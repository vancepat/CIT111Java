/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PinkymonBattle;
import java.util.Random;
/**
 *
 * @author Pat
 */
public class Opponent {
    Random r = new Random();
    
    //get name, Pinkymon object, and set knockouts/fainted to 0
    public String[] names = new String[]{"Brick", "Mossy", "Lt Lightning", "Erick", "Toga","Sabretooth","Blane","Leonardo","Nerd"};
      public  String name = (names[r.nextInt(names.length)]);
    public Pinkymon  pMon = new Pinkymon();
      public int knockouts = 0;
    public int fainted = 0;
}
//I thought about just making the player and opponent both Player class, but this was more fun and allowed me to more easily generate a random name for the opponent. 