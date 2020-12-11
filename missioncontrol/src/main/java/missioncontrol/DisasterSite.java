// copied from the PDF, I didn't write this.
//AGAIN I DIDN'T WRITE THIS
 

package missioncontrol;

 import java.util.Random;

 /**
 * Class to model a disaster site in a rescue simulation package
 * @author Eric Darsow
 */
 public class DisasterSite {

 public int numTotalVictims;
 public int numRescuedVictims;

 final int MAX_VICTIMS = 100;

 /**
 * Constructor for the DiasterSite object-- this gets called when we
 * use the keyword: 'new' to create an instance of this object
 */
 public DisasterSite() {
 Random random = new Random();
 // load up the site with a random number of victims
 numTotalVictims = random.nextInt(MAX_VICTIMS + 1);
 numRescuedVictims = 0;
 } // close constructor

/**
 * Simulates a rescue of a number of victims from the DiasterSite
 * @param team a rescue team Object
 * @return the number of victims rescued
 */
public int makeRescueAttempt(RescueTeam team){
// calculate the remaining victims from the member variable values
int remainingVictims = numTotalVictims - numRescuedVictims;
int numRescued;
Random random = new Random();
// randomly choose a number of victims to rescue, with a max
// to rescue being the size of the rescue team (1 vicitm: 1 rescuer)
int couldBeRescued = random.nextInt(team.getTeamSize() + 1);
// check to make sure more victims were not rescued than existed on the site
if(couldBeRescued <= remainingVictims) {
numRescued = couldBeRescued;
} else {


// if the random number rescued is greater than victims remaining,
// just rescue the rest
numRescued = remainingVictims;
}
// adjust the total number of rescued victims based on this rescue attempt
numRescuedVictims = numRescuedVictims + 1;
// ship back the number that were rescued
return numRescued;
} // close method
/**
* Accessor method for our current victim count
* @return the number of victims remaining on site
*/
public int getCurrentVictimCount(){
return (numTotalVictims - numRescuedVictims);
} // close method
/**
* A method to develop! Create a site-wide event
*/
public void siteAccident(){
numTotalVictims = numTotalVictims + 0;
} // close method
} // close class
