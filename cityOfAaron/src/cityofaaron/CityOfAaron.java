/* 
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package cityofaaron;

import byui.cit260.cityofAaron.model.Player;
import byui.cit260.cityofAaron.model.TeamMember;
import byui.cit260.cityofAaron.model.Location;
import byui.cit260.cityofAaron.model.ListItem;
import byui.cit260.cityofAaron.model.CropData;
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
        
        // Laura's code
        ListItem item = new ListItem();
        item.setItemName("bushels");
        item.setItemNumber(0);
        String itemName = item.getItemName();
        int itemNumber = item.getItemNumber();
        System.out.println("Item: " + itemName + " = " + itemNumber);
        // End Laura's code
        
        // Start Jack's code
        CropData firstCrop = new CropData();
        
        firstCrop.setAcresOwned(1);
        firstCrop.setAcresPlanted(2);
        firstCrop.setCropYield(3);
        firstCrop.setEatenByRats(4);
        firstCrop.setHarvest(5);
        firstCrop.setHarvestAfterOffering(6);
        firstCrop.setNewPeople(7);
        firstCrop.setNumStarved(8);
        firstCrop.setNumberWhoDied(9);
        firstCrop.setOffering(10);
        firstCrop.setOfferingBushels(11);
        firstCrop.setPeopleFed(12);
        firstCrop.setPopulation(13);
        firstCrop.setYear(14);
        firstCrop.setWheatForPeople(15);
        firstCrop.setWheatInStore(16);
        
        int acresOwned = firstCrop.getAcresOwned();
        int acresPlanted = firstCrop.getAcresPlanted();
        int cropYield = firstCrop.getCropYield();
        int eatenByRats = firstCrop.getEatenByRats();
        int harvest = firstCrop.getHarvest();
        int harvestAfterOffering = firstCrop.getHarvestAfterOffering();
        int newPeople = firstCrop.getNewPeople();
        int numStarved = firstCrop.getNumStarved();
        int numDied = firstCrop.getNumberWhoDied();
        int offering = firstCrop.getOffering();
        int offeringBushels = firstCrop.getOfferingBushels();
        int peopleFed = firstCrop.getPeopleFed();
        int population = firstCrop.getPopulation();
        int year = firstCrop.getYear();
        int wheatForPeople = firstCrop.getWheatForPeople();
        int wheatInStore = firstCrop.getWheatInStore();
        
        System.out.println("\nJack's tests:");
        System.out.println("Should be 1: " + acresOwned);
        System.out.println("Should be 2: " + acresPlanted);
        System.out.println("Should be 3: " + cropYield);
        System.out.println("Should be 4: " + eatenByRats);
        System.out.println("Should be 5: " + harvest);
        System.out.println("Should be 6: " + harvestAfterOffering);
        System.out.println("Should be 7: " + newPeople);
        System.out.println("Should be 8: " + numStarved);
        System.out.println("Should be 9: " + numDied);
        System.out.println("Should be 10: " + offering);
        System.out.println("Should be 11: " + offeringBushels);
        System.out.println("Should be 12: " + peopleFed);
        System.out.println("Should be 13: " + population);
        System.out.println("Should be 14: " + year);
        System.out.println("Should be 15: " + wheatForPeople);
        System.out.println("Should be 16: " + wheatInStore);  
        System.out.println("End of Jack's tests.\n");
        // End Jack's code

    }
}
