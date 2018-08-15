/*
 * The GameControl class file for the cityOfAaron project
 * Part of the Control layer
 * Class contains all calculations for managing the game
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 27, 2018
 */
package byui.cit260.cityofAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.cityofAaron.model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author laura
 */
public class GameControl {
    //size of the Locations array
    private static final int MAX_ROW= 5;
    private static final int MAX_COL= 5;
    
    //reference to a Game object
    private static Game theGame;
    
    public static void createNewGame(String pName){
    
    //Create the game object. Save it in the main driver file
    theGame = new Game();
    CityOfAaron.setTheGame(theGame);
    
    //Create the player object. Save it in the game object
    Player thePlayer = new Player();
    thePlayer.setName(pName);
    theGame.setThePlayer(thePlayer);
    
    //Create the CropData object
    createCropDataObject();
    //Create the list of animals
    createAnimalList();
    //Create the list of tools
    createToolList();
    //Create the list of provisions
    createProvisionList();
    //Creat the locations and the Map object
    createMap();
    
    }    
    
    
    // The getSavedGame method
    // Purpose: load a saved game from disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void getSavedGame(String filePath) {
        Game theGame = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setTheGame(theGame);
            System.out.println("\nGame loaded.");

        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved game file");
        }
    }
    
    // The saveGame method
    // Purpose: Save game to disk
    // Parameters: the game, the file path
    // Returns: none
    public static void saveGame(Game theGame, String filePath) {
        
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(theGame);
            System.out.println("\nGame saved.");

        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error writing the  game file");
        }
    }



    //The createCropDataObject() method
    //Purpose: sets the game CropData
    //Parameters: none
    //Return: none
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
                        
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000);
        
        
        theGame.setCropData(theCrops);
    
    }
    //The createAnimalList() method
    //Purpose: Sets the Animal List Array
    //Parameters: none
    //Return: none
    public static void createAnimalList()
    {
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("Chickens",20));
        animals.add(new ListItem("Cows",15));
        animals.add(new ListItem("Pigs",10));
        animals.add(new ListItem("Ducks",8));
        animals.add(new ListItem("Turkeys",5));
        
        theGame.setAnimals(animals);
        
        
    
    }
    
    //The createToolList method
    //Purpose: Sets the tool List Array
    //Parameters: none
    //Return: none
    public static void createToolList()
    {
        ArrayList<ListItem> tools = new ArrayList<>();
        
        tools.add(new ListItem("Hammer",8));
        tools.add(new ListItem("Saw",5));
        tools.add(new ListItem("Axe",10));
        tools.add(new ListItem("Hoe",20));
        tools.add(new ListItem("Plow",10));
        tools.add(new ListItem("Wheel Barrow",15));
        tools.add(new ListItem("Pitch Fork",8));
        
        theGame.setTools(tools);
    
    }
    
    //The createProvisionList method
    //Purpose: Sets the provision List Array
    //Parameters: none
    //Return: none
    public static void createProvisionList()
    {
        ArrayList<ListItem> provisions = new ArrayList<>();
        
        provisions.add(new ListItem("Flour",500));
        provisions.add(new ListItem("Corn",250));
        provisions.add(new ListItem("Hay",600));
        provisions.add(new ListItem("Rice",400));
        provisions.add(new ListItem("Grain Feed",700));
        provisions.add(new ListItem("Beans",500));
        
        theGame.setProvisions(provisions);
    
    }
    //The createMap method
    //Purpose: creates the location objects and the map
    //Parameters: none
    //Returns: none
    public static void createMap()
    {
        //create the Map object, it is 5x5
        //refer to the map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
    
        // Create the farmland variable to hold the description of farmland
        String farmland ="\nYou are at the farmland. Here is where the food" +
                          "for the city is grown.";
        
        //create a new Location object
        Location locFarmLand = new Location();
        
        //Set the description of the location
        locFarmLand.setDescription(farmland + "\nOne bushel of wheat can plant two acres "+
                                      "of farmland.");
        
        //Set the Symbol of the location
        locFarmLand.setSymbol("(i)(i)(i)");
        //set the location object in each cell of the array in it's column
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 3, locFarmLand);
        }
        
        // Create the forrest variable to hold the description of the forrest
        String forrest ="\nThis is the forrest. This is where meat is found.";
        
        //create a new Location object
        Location locForrest = new Location();
        
        //Set the description of the location
        locForrest.setDescription(forrest);
        
        //Set the Symbol of the location
        locForrest.setSymbol("TTT");
        //set the location object in each cell of the array in it's column
        for(int i = 0; i < 3; i++)
        {
            theMap.setLocation(i,4,locForrest);
        }
        
        theMap.setLocation(0, 1, locForrest);
        theMap.setLocation(1, 1, locForrest);
        
        // Create the plains variable to hold the description of the plains
        String plains ="\n You are at the plains. It is boring.";
        
        //create a new Location object
        Location locPlains = new Location();
        
        //Set the description of the location
        locPlains.setDescription(plains);
        
        //Set the Symbol of the location
        locPlains.setSymbol("---");
        //set the location object in each cell of the array in it's column
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 0, locPlains);
        }
        
        theMap.setLocation(4, 1, locPlains);
        
        // Create the swamp variable to hold the description of the swamp
        String swamp ="\n This is the swamp. It is worse than boring. Criminals "+
                       "are banished to the mosquito infested swamp.";
        
        //create a new Location object
        Location locSwamp = new Location();
        
        //Set the description of the location
        locSwamp.setDescription(swamp + "\nWicked city rulers have been sent to the swamp.");
        
        //Set the Symbol of the location
        locSwamp.setSymbol("000");
        //set the location object in each cell of the array in it's column
        
            theMap.setLocation(3, 4, locSwamp);
            theMap.setLocation(4, 4, locSwamp);
        
        // Create the river variable to hold the description of the river  
        String river ="\nThis is the river. It provides life and sustenance for"+
                      "the City of Aaron.";
        
        //create a new Location object
        Location locRiver = new Location();
        
        //Set the description of the location
        locRiver.setDescription(river);
        
        //Set the Symbol of the location
        locRiver.setSymbol("~~~");
        
        //set the location object in each cell of the array in it's column
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 2, locRiver);
        }
        
        // Create the city variable to hold the description of the city
        String city ="\nYou are at the City of Aaron. It is a great city full "+
                     "of happy people, as long as they are fed.";
        
        //create a new Location object
        Location locCity = new Location();
        
        //Set the description of the location
        locCity.setDescription(city + "\nEach person needs 10 bushels of wheat per "+
                                  "year to survive.");
        
        //Set the Symbol of the location
        locCity.setSymbol("AAA");
        
        theMap.setLocation(2, 1, locCity);
        theMap.setLocation(3, 1, locCity);
        
        
        theGame.setTheMap(theMap);
    }
}
