/* 
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package cityofaaron;

import byui.cit260.cityofAaron.view.*;

import byui.cit260.cityofAaron.model.Game;
/**
 *
 * @author Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
public class CityOfAaron {
    
    private static Game theGame = null;

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
        
        
//        Player playerOne = new Player();
//        
//        playerOne.setName("Ted Tintstone");
//            
//        String name = playerOne.getName();
//       
//        String member1Name = TeamMember.Member1.getName();
//        String member2Name = TeamMember.Member2.getName();
//        String member3Name = TeamMember.Member3.getName();
//        
//        String member1Desc = TeamMember.Member1.getDescription();
//        String member2Desc = TeamMember.Member2.getDescription();
//        String member3Desc = TeamMember.Member3.getDescription();
//        
//         
//        System.out.println(name);
//        System.out.println(member1Name + ", " + member1Desc + ", " + member2Name + ", "  + member2Desc + ", and " + member3Name + ", " + member3Desc + ", are the coolest.");
//        
//        // Start Chuck Mikolyski
//        Location firstLocation = new Location();
//        firstLocation.setDescription("The Crop Fields");
//        firstLocation.setSymbol("|||");
//        String description = firstLocation.getDescription();
//        String symbol = firstLocation.getSymbol();
//        System.out.println("Location Description: " + description +  "\nLocation"
//        + " Symbol: " + symbol);
//        // End Chuck Mikolyski
//        
//        // Laura's code
//        ListItem item = new ListItem();
//        item.setItemName("bushels");
//        item.setItemNumber(0);
//        String itemName = item.getItemName();
//        int itemNumber = item.getItemNumber();
//        System.out.println("Item: " + itemName + " = " + itemNumber);
//        // End Laura's code
//        
//        // Start Jack's code
//        CropData firstCrop = new CropData();
//        
//        firstCrop.setAcresOwned(1);
//        firstCrop.setAcresPlanted(2);
//        firstCrop.setCropYield(3);
//        firstCrop.setEatenByRats(4);
//        firstCrop.setHarvest(5);
//        firstCrop.setHarvestAfterOffering(6);
//        firstCrop.setNewPeople(7);
//        firstCrop.setNumStarved(8);
//        firstCrop.setNumberWhoDied(9);
//        firstCrop.setOffering(10);
//        firstCrop.setOfferingBushels(11);
//        firstCrop.setPeopleFed(12);
//        firstCrop.setPopulation(13);
//        firstCrop.setYear(14);
//        firstCrop.setWheatForPeople(15);
//        firstCrop.setWheatInStore(16);
//        
//        int acresOwned = firstCrop.getAcresOwned();
//        int acresPlanted = firstCrop.getAcresPlanted();
//        int cropYield = firstCrop.getCropYield();
//        int eatenByRats = firstCrop.getEatenByRats();
//        int harvest = firstCrop.getHarvest();
//        int harvestAfterOffering = firstCrop.getHarvestAfterOffering();
//        int newPeople = firstCrop.getNewPeople();
//        int numStarved = firstCrop.getNumStarved();
//        int numDied = firstCrop.getNumberWhoDied();
//        int offering = firstCrop.getOffering();
//        int offeringBushels = firstCrop.getOfferingBushels();
//        int peopleFed = firstCrop.getPeopleFed();
//        int population = firstCrop.getPopulation();
//        int year = firstCrop.getYear();
//        int wheatForPeople = firstCrop.getWheatForPeople();
//        int wheatInStore = firstCrop.getWheatInStore();
//        
//        String testString = firstCrop.toString();
//        
//        System.out.println(testString);
//        // End Jack's code

    }
}
