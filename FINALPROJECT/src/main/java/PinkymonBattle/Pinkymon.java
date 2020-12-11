/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PinkymonBattle;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Pat
 */
public class Pinkymon {
    Random r = new Random();
   private  String[] names = new String[]{"Onionturtle","Ivysoar","Venusoar","Charwomander","Charmylemon","Charzinardizardin","Squirt","Mediumsquirt","BIG BLAST BLUE BOI","Caterpiller but a monster","Some kinda green coccoonmon","Freebutter","Party stick","Yello head","Big DB","Birb","BirbAdult","Superbirb","Lil rat","DJ RATMAN","Sparrow","Yet Another Bird","Purple rope","BigRope","Pikachu","Old Pikachu","Lilslash","Slashslash","Nidor","Nidorr","Queennidor","Nidora","Nidora2","Kingnidor","Puffy","Mythical Puffy","Fox","Naruto Fox","Angrypuff","Tuffpuff","Zorbat","Gold-encrusted bat","Radish","Sadradish","Badradish","Plant","P L A N T","Lil poison","Sleepytimes","Floor pup","3 floor pup","That cat with them log arms","Coolcat","Crazyduck","Crazierduck","Monkey","Fight Monkey","Fire Dog","BIG FIRE DOG","Tadpole","Swirlywhirl","Angrywhirl","Brains","Bigbrain","Shazam","Chopman","Chokeman","UNDISPUTED WWF TITLE BELT CHAMPION 1996","Bells","Almost a pear","Victorybells","Tentacles","Cruel Tentacles","Punchyrock","Gravel","Formed Gravel","My Little Ponyta","Firehorse","Slowwwwwwwwww","Bro","Magnint","Triple Magnint","Farfetched","Australia birb","Angry Australia birb","Seal","Musical Seal","Grimy","Mud","Shell","Shell2.0","GHOST","GHOOOOOST","GHOOOOOOOOST","Onyx","Drowzy","Hypnotizer","Mr.Krabs","King Krab","Battery","BOOMBATTERY","Egg","Eggtertaker","Cube one","Sad pokemon who wears their parent's skull","Hit Lee","Hitm Chan","Lick","Coughing","Wheezing","Rhino","Rhydo","Egg Throw Pinkmon","Vines","GhengisKhan","Horsey","Seydra","Goldy","Sea king, king of the seas","Yustar","Me-star","Loud Mouth","Scythe","Weirdo","Elektrik","Magma","Pincer","Taurus","Fishy","Fishy's dad","Sea Creature","Magic Anything Shapes","Evolver","FROST FOX","ELECTRIC FOX","Mozilla FireFox","Shapes","Fossil","Fossil's Revenge","Shelleyes","Brownscythe","Pterodactyl","ZZZZZZZZZZZZZZZZZZ","LEGENDARY ICE BIRB","LEGENDARY ZAP BIRD","LEGENDARY FIREBIRD","Cute water worm","Dragonnn","Big Dragonnn","Last Boss","Last boss' dad?"};
    //Just a heads up I copied this list from  gist.github.com/octalmage/6936761 and modified the names, typing out 151 names sounded hard enough. Modification alone took like 30 minutes soooo
 
   //set starting values for Pinkymon name/hp, and set the pmon to being alive by default         
   public  String name = (names[r.nextInt(names.length)]);
   public  int hp = r.nextInt(50)+ 20;
   public int str = r.nextInt(7) + 3;
   public  boolean isDead = false;
  
   
   
    
    
   
    
    
    
   
        }
   
//Pinkymon class will reinstantiate each time a Pinkymon is knocked out, see Battle class