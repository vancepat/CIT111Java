/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Pat
 */
public class CreatureLand {
   
    public static void main(String[] args){
    
        System.out.println("Creatureland.main | creating a Creature");
        Creature penguin = new Creature();   
    penguin.name="Pablo";
    penguin.species="Emperor penguin";
   
    penguin.setBiteSizeInPercent(50);
    
    System.out.println("Creatureland.main | creating a SizedDonut");
    SizedDonut donutForPenguin = new SizedDonut();
    donutForPenguin.name = "Chloe";
    donutForPenguin.sizeInmm = 32;
    
    System.out.println("Creatureland.main | calling eatDonut");
    penguin.eatDonut(donutForPenguin);
    
    System.out.println("Creatureland.main | back after eating");
    
    
    }
    
    public static void displayCreatureState(Creature creatureToPrint){
        System.out.println("**Displaying Creature Stats**");
        System.out.println("Name: " + creatureToPrint.name);
        System.out.println("Species: " + creatureToPrint.species);
        System.out.println("Bite Size: "+ creatureToPrint.getBitSizeInPercent() + "% of a donut");
    }
}
