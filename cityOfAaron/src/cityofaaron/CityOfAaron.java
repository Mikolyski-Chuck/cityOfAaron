/* 
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package cityofaaron;

import byui.cit260.cityofAaron.model.Player;
import byui.cit260.cityofAaron.model.TeamMember;
import byui.cit260.cityofAaron.model.Location;
/**
 *
 * @author Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Ted Tintstone");
            
        String name = playerOne.getName();
//        
        String member1Name = TeamMember.Member1.getName();
        String member2Name = TeamMember.Member2.getName();
        String member3Name = TeamMember.Member3.getName();
        
        String member1Desc = TeamMember.Member1.getDescription();
        String member2Desc = TeamMember.Member2.getDescription();
        String member3Desc = TeamMember.Member3.getDescription();
        
         
        System.out.println(name);
        System.out.println(member1Name + ", " + member1Desc + ", " + member2Name + ", "  + member2Desc + ", and " + member3Name + ", " + member3Desc + ", are the coolest.");
        
        // Start Chuck Mikolyski
        Location firstLocation = new Location();
        firstLocation.setDescription("The Crop Fields");
        firstLocation.setSymbol("|||");
        String description = firstLocation.getDescription();
        String symbol = firstLocation.getSymbol();
        System.out.println("Location Description: " + description +  "\nLocation"
        + " Symbol: " + symbol);
        // End Chuck Mikolyski
    }
}
