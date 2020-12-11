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
public class Creature {
    public String name;
    public String species;
    private int biteSizePercent;
    int minSize;
            
            
            public int getMinSize(int size){
                return size;
            }
    
    public void eatDonut(SizedDonut donutToEat){
        System.out.println("Creature.eatDonut | Eating " + biteSizePercent + "% of " + donutToEat.name);
        
        if(donutToEat.sizeInmm < this.minSize){
   donutToEat.simulateEating(biteSizePercent);
   System.out.println(donutToEat.sizeInmm + " " + this.minSize );
   System.out.println("Creature.eatDonut | size < minSize");
        }else{
            System.out.println("Creature.eatDonut | YOUR DONUT TOO SMOL GET BIGGER DONUT");
        }
    }
    
    public int getBitSizeInPercent(){
        return biteSizePercent;
    }
    
    public void setBiteSizeInPercent(int biteSizeInPercent){
        if(biteSizeInPercent > 0){
            System.out.println("IN SETBITESIZEINPERCENT");
        this.biteSizePercent = biteSizeInPercent;
        this.minSize = biteSizeInPercent;
        System.out.println("This.minSize = "+this.minSize);
        
        } else{
            System.out.println("SizedDonut.setBiteSizeInPercent | CAN'T HAVE NEGATIVE");
        }
    }
    
    
}
