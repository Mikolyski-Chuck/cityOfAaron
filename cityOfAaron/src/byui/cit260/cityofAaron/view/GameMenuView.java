/*
 * The GameMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the game menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 27, 2018
 */
package byui.cit260.cityofAaron.view;


import cityofaaron.CityOfAaron;
import byui.cit260.cityofAaron.model.*;


/**
 *
 * @author Jack McBride
 */
public class GameMenuView extends MenuView {
    
    // The GameMenuView constructor
    // Purpose: Initialize the game menu data
    // Parameters: none
    // Returns: none
    // =======================================================
    
       
    public GameMenuView()
    {
        super("\n" + 
                "**************************\n" +
                "* GAME MENU *\n" +
                "**************************\n" +
                " 1 - View the map\n" +
                " 2 - View/Print a list\n" +
                " 3 - Move to a new location\n" +
                " 4 - Manage the Crops\n" +
                " 5 - Return to the Main Menu\n", 5);                
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call viewMap()
                viewMap();
                break;
            case 2: // if the option is 2, call viewList()
                viewList();
                break;
            case 3: // if the option is 3, call moveToNewLocation()
                moveToNewLocation();
                break;
            case 4: // if the option is 4, call manageCrops()
                manageCrops();
                break;
            case 5: // if the option is 5, return to main menu    
        }
    }
    
    //Start Chuck Mikolyski
    // The viewMap method
    // Purpose: Displays the map
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewMap()
    {
        //get a reference to the game
        Game theGame = CityOfAaron.getTheGame();
        
        //get the map
        Map map = theGame.getTheMap();
        
        //declare a variable to hold the value of the map symbols
        String symbol;
        
        //declare a variable to hold the value of the map rows.
        String row = "";
        
        //display the map explanation
        System.out.println("\nThis is the city of Aaron map." +
                           "\n--- is the symbol for the plains." +
                           "\nTTT is the symbol for the forrests." +
                           "\n~~~ is the symbol for the river." +
                           "\nAAA is the symbol for the city." +
                           "\n(i)(i)(i) is the symbol for the farmland." +
                           "\n000 is the symbol for the swamps.\n" +
                           "\n \n                  Map\n" +
                           "\n      0     1     2        3        4 ");
                           
                           
        // start the for loop for the rows
        for ( int i = 0; i < 5; i++){
            
            
                //loop through the row's columns and get the symbols 
                for ( int j = 0; j < 5; j++){
                    Location loc = map.getLocation(i, j);
                    
                    //get the location symbols
                    symbol = " | " + loc.getSymbol();
                    
                    //fill the row with the symbols
                    row = row + symbol;
                }
                
                //display the row
                    System.out.println(i + " " + row + " |");
                row = "";
            
            }
            
            
           
    }
    //End Chuck Mikolyski
    
    
    // The viewList method
    // Purpose: Provides the user with a set list of options
    // Parameters: none
    // Returns: none
    //========================================================
    public void viewList()
    {
        viewListHelp list= new viewListHelp();
        list.displayMenu();
        
        //System.out.println("\nView/Print List menu option selected");
    }

    // The moveToNewLocation method
    // Purpose: Moves user to a new location
    // Parameters: none
    // Returns: none
    // =======================================================
    public void moveToNewLocation()
    {
       System.out.println("\nMove to a new Location menu option selected");
       
    }
    
    // The manageCrops method
    // Purpose: Takes the user through the manage Crops steps
    // Parameters: none
    // Returns: none
    // =======================================================
    public void manageCrops()
    {
        //System.out.println("\nManage crops menu option selected");
        CropView.runCropsView();
    }
  
}
