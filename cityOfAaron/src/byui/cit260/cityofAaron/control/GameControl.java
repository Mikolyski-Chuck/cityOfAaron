/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.cityofAaron.model.Game;
import byui.cit260.cityofAaron.model.CropData;
import byui.cit260.cityofAaron.model.ListItem;
import byui.cit260.cityofAaron.model.Map;
import byui.cit260.cityofAaron.model.Location;

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
    
    //The createCropDataObject method
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
    //The createAnimalList method
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
    
    //The createprovisionList method
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
    
        String farmland ="\n";
        //create a new Location object
        Location loc = new Location();
        //Set the description of the location
        loc.setDescription(farmland);
        loc.setSymbol("(i)(i)(i)");
        //set the location object in each cell of the array in it's column
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i,4,loc);
        }
        
        String forrest ="\n";
        String plains ="\n";
        String swamp ="\n";
        String River ="\n";
        
        theGame.setMap(theMap);
        
                
       
    }
    
   
    
}
