/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtothefuture;

/**
 *
 * @author Pat
 */
public class CarLand {
    public static void main(String[] args){
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        Car buick = new Car();
        buick.year = 1952;
        buick.makeModel = "1952 Buick Super";
        Car belAir = new Car();
        belAir.year = 1954;
        belAir.makeModel = "1954 Chevrolet Bel Air";
        
        deLorean.setDate();
        displayCarStats(deLorean);
deLorean.startEngine();
deLorean.accelerate(88);
deLorean.decelerate(0);

displayCarStats(deLorean);
deLorean.stopEngine();
displayCarStats(deLorean);

buick.setDate();
displayCarStats(buick);
buick.startEngine();
buick.accelerate(50);
deLorean.decelerate(100);

displayCarStats(buick);
buick.stopEngine();
displayCarStats(buick);

belAir.setDate();
displayCarStats(belAir);
belAir.startEngine();
belAir.accelerate(89);
belAir.decelerate(50);

displayCarStats(belAir);
belAir.stopEngine();
displayCarStats(belAir);

        
    }
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("***stats***");
        System.out.println(anyCarObject.year + "" + anyCarObject.makeModel);
        System.out.println("Engine Running?" + anyCarObject.checkEngineStatus());
        System.out.println("Current Speed " + anyCarObject.getCurrentSpeed());
        System.out.println("Current Gear " + anyCarObject.gear);
        if(anyCarObject.speed >= 88){
            anyCarObject.currentDate = anyCarObject.destinationDate;
        }
        System.out.println("In year..." + anyCarObject.currentDate);
        
    }
}
